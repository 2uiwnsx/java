/*		
	▶ 중간 파이프
	
		▷ filter(Predicate) : 주어진 조건을 만족하는 요소들로 구성된 새로운 스트림을 반환한다.
		▷ distinct() : 중복된 요소들을 제거한 새로운 스트림을 반환한다.
		▷ map(Function) : 각 요소에 주어진 변환 작업을 적용한 새로운 스트림을 반환한다.
		▷ sorted(Comparator) : 요소들을 주어진 기준으로 정렬한 새로운 스트림을 반환한다.
				
	▶ 최종 파이프
			
		▷ forEach() : 각 요소를 순회한다.
		▷ count() : 요소의 개수를 반환한다.
		▷ allMatch() : 모든 요소가 주어진 조건을 만족하는지 확인한 결과를 반환한다.
		▷ anyMatch() : 주어진 조건을 만족하는 요소가 한 개 이상인지 확인한 결과를 반환한다.
		▷ noneMatch() : 모든 요소가 주어진 조건을 만족하지 않는지 확인한 결과를 반환한다.
		▷ max() : 최대 요소를 반환한다.
		▷ min() : 최소 요소를 반환한다.
		▷ sum() : 요소들의 합을 반환한다.
		▷ average() : 요소들의 평균을 반환한다.
*/

package com.test.java.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;
import com.test.java.collection.Student;

public class Ex73_Stream {
	
	public static void main(String[] args) {

		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		// m7();
		// m8();
		// m9();
		// m10();
		
	}

	private static void m10() {
		
		System.out.println(Data.getIntList().stream().count());
		System.out.println(Data.getIntList().stream().max((a, b) -> (a - b)).get());
		System.out.println(Data.getIntList().stream().min((a, b) -> (a - b)).get());
		System.out.println(Data.getIntList().stream().mapToInt(n -> n).sum());
		System.out.println(Data.getIntList().stream().mapToInt(n -> n).average().getAsDouble());
		
	}

	private static void m9() {
		
		int[] nums = {1, 2, 3, 4, 5};
		
		boolean result = true;
		
		for (int n : nums) {
			
			if (n % 2 == 1) {
				
				result = false;
				
				break;
				
			}
			
		}
		
		if (result) {
			
			System.out.println("모든 요소가 짝수입니다.");
			
		} else {
			
			System.out.println("홀수인 요소가 포함되어 있습니다.");
			
		}
		
		System.out.println();
		
		System.out.println(Arrays.stream(nums).allMatch(n -> (n % 2 == 0)));
		System.out.println(Arrays.stream(nums).anyMatch(n -> (n % 2 == 0)));
		System.out.println(Arrays.stream(nums).noneMatch(n -> (n % 2 == 0)));
		
	}

	private static void m8() {

		Data.getIntList(10).stream()
			.sorted((a, b) -> (b - a))
			.forEach(n -> System.out.println(n));
		
	}

	private static void m7() {

		List<String> list = Data.getStringList(10);
		
		System.out.println(list);
		
		System.out.println();
		
		list.stream()
			.filter(word -> (word.length() <= 3))
			.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		list.stream()
			.map(word -> word.length())
			.forEach(num -> System.out.println(num));
		
		System.out.println();
		
		String[] names = {"홍길동", "아무개", "이순신", "권율", "강감찬", "연개소문", "홍길동", "이순신", "남궁장군", "연개소문"};
		
		Arrays.stream(names)
			.map(name -> name.substring(1))
			.forEach(name -> System.out.println(name));
		
		System.out.println();
		
		List<Student> slist = new ArrayList<Student>();
		
		slist.add(new Student("가가가", 100, 90, 80));
		slist.add(new Student("나나나", 77, 88, 99));
		slist.add(new Student("다다다", 60, 50, 40));
		slist.add(new Student("라라라", 82, 67, 91));
		slist.add(new Student("마마마", 67, 88, 68));
		
		slist.stream()
			.map(s -> {
				
				if ((s.getKor() + s.getMath() + s.getEng()) >= 180) {
					
					return (s.getName() + ": 합격");
					
				} else {
					
					return (s.getName() + ": 불합격");
					
				}
				
			})
			.forEach(result -> System.out.println(result));
		
		System.out.println();
		
		slist.stream()
			.map(s -> {
				
				if ((s.getKor() + s.getMath() + s.getEng()) >= 180) {
					
					Result r = new Result();
					
					r.setName(s.getName());
					r.setResult("합격");
					
					return r;
					
				} else {
					
					Result r = new Result();
					
					r.setName(s.getName());
					r.setResult("불합격");
					
					return r;
					
				}
				
			})
			.forEach(r -> {
				
				System.out.println(r.getName() + ": " + r.getResult());
				
			});
		
	}

	private static void m6() {
		
		List<Integer> list = Data.getIntList();
		
		System.out.println(list.size());
		
		Set<Integer> set1 = new HashSet<Integer>();
		
		for (int n : list) {
			
			set1.add(n);
			
		}
		
		System.out.println(set1.size());
		
		Set<Integer> set2 = new HashSet<Integer>(list);
		
		System.out.println(set2.size());
		
		System.out.println(list.stream().distinct().count());
		
		System.out.println();
		
		String[] names = {"홍길동", "아무개", "이순신", "권율", "강감찬", "연개소문", "홍길동", "이순신", "남궁장군", "연개소문"};
		
		Arrays.stream(names)
			.distinct()
			.filter(name -> (name.length() == 3))
			.forEach(name -> System.out.println(name));
		
		System.out.println();
		
		List<Cup> clist = new ArrayList<Cup>();
		
		clist.add(new Cup(Cup.BLACK, 200));
		clist.add(new Cup(Cup.BLUE, 300));
		clist.add(new Cup(Cup.RED, 400));
		clist.add(new Cup(Cup.WHITE, 500));
		clist.add(new Cup(Cup.YELLOW, 600));
		clist.add(new Cup(Cup.BLACK, 700));
		clist.add(new Cup(Cup.BLUE, 800));
		clist.add(new Cup(Cup.RED, 900));
		clist.add(new Cup(Cup.WHITE, 500));
		clist.add(new Cup(Cup.YELLOW, 600));

		clist.stream()
			.distinct()
			.forEach(cup -> System.out.println(cup));
		
	}

	private static void m5() {

		List<Integer> list = Data.getIntList(20);
		
		System.out.println(list);
		
		System.out.println();
		
		for (int n : list) {
			
			if (n % 2 == 0) {
				
				System.out.printf("%-4d", n);
				
			}
			
		}
		
		System.out.println();
		
		list.stream().forEach(num -> {
			
			if (num % 2 == 0) {
				
				System.out.printf("%-4d", num);
				
			}
			
		});
		
		System.out.println();
		
		list.stream().filter(num -> (num % 2 == 0)).forEach(num -> {
			
			System.out.printf("%-4d", num);
			
		});
		
		System.out.println();
		System.out.println();
		
		Data.getStringList().stream()
			.filter(word -> (word.length() >= 5))
			.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		Data.getUserList().stream()
			.filter(user -> (user.getGender() == 1))
			.filter(user -> (user.getHeight() >= 180))
			.filter(user -> (user.getWeight() >= 70))
			.forEach(user -> System.out.println(user));
		
	}

	private static void m4() {

		int[] nums1 = {10, 20, 30};
		
		Arrays.stream(nums1).forEach(num -> System.out.println(num));
		
		System.out.println();
		
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		
		nums2.stream().forEach(num -> System.out.println(num));
		
		System.out.println();
		
		IntStream.range(1, 10).forEach(num -> System.out.println(num));
		
		System.out.println();
		
		try {
			
			Path path = Paths.get(".\\data\\number.txt");
			
			Files.lines(path).forEach(line -> System.out.println(line));
			
			System.out.println();

			Path dir = Paths.get("C:\\class\\dev\\eclipse");
			
			Files.list(dir).forEach(d -> {
				
				System.out.println(d.getFileName());
				System.out.println(d.toFile().isFile());
				
				System.out.println();
				
			});
			
		} catch (Exception e) {
			
			System.out.println("at Ex73_Stream.m4");
			
			e.printStackTrace();
			
		}
		
	}

	private static void m3() {
		
		Data.getIntList().stream().forEach(num -> System.out.printf("%d ", num));
			
		System.out.println();
		System.out.println();
		
		Data.getUserList().stream().forEach(user -> {
		
			System.out.println("[회원정보]");
			System.out.println("이름: " + user.getName());
			System.out.println("나이: " + user.getAge());
			System.out.println("성별: " + user.getGender());
			
			System.out.println();
		
		});
		
		Data.getItemList().stream().forEach(item -> {
		
			System.out.println(item.getName());
			System.out.println(item.getColor());
			
			System.out.println();
		
		});
		
	}

	private static void m2() {

		List<String> list = Data.getStringList(10);
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		
		System.out.println();
		
		for (String word : list) {
			
			System.out.println(word);
			
		}
		
		System.out.println();
		
		Iterator<String> iter =  list.iterator();
		
		while (iter.hasNext()) {
			
			System.out.println(iter.next());
			
		}
		
		System.out.println();

		Stream<String> stream = list.stream();
		
		Consumer<String> c1 = str -> System.out.println(str);
		
		stream.forEach(c1);
		
		System.out.println();
		
		list.stream().forEach(str -> System.out.println(str));
		
	}

	private static void m1() {

		int[] nums1 = Data.getIntArray();
		
		System.out.println(Arrays.toString(nums1));
		System.out.println(nums1.length);
		
		System.out.println();
		
		int[] nums2 = Data.getIntArray(5);
		
		System.out.println(Arrays.toString(nums2));
		
		System.out.println();
		
		List<Integer> nums3 = Data.getIntList();

		System.out.println(nums3.size());
		
		System.out.println();
		
		List<Integer> nums4 = Data.getIntList(5);
		
		System.out.println(nums4);
		
		System.out.println();
		
		String[] txt = Data.getStringArray();
		
		System.out.println(Arrays.toString(txt));
		
		System.out.println();
		
		Item[] item = Data.getItemArray();
		
		System.out.println(Arrays.toString(item));
		
		System.out.println();
		
		User[] list = Data.getUserArray();
		
		System.out.println(Arrays.toString(list));

	}

}

class Cup {
	
	public final static int BLACK = 1;
	public final static int WHITE = 2;
	public final static int RED = 3;
	public final static int YELLOW = 4;
	public final static int BLUE = 5;
	private int color;
	private int size;

	public Cup(int color, int size) {
		
		this.color = color;
		this.size = size;
		
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		
		return "Cup [color=" + color + ", size=" + size + "]";
		
	}
	
	@Override
	public int hashCode() {
		
		return String.valueOf((this.color + this.size)).hashCode();
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return (this.hashCode() == obj.hashCode());
		
	}
	
}

class Result {
	
	private String name;
	private String result;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
}
