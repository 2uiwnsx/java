/*
	▶ 표준 API에서 제공하는 함수형 인터페이스
				
		▷ Consumer 인터페이스 ➜ 매개변수 O, 반환값 X
					
			◆ Consumer<T>
			◆ BiConsumer<T, U>
			◆ IntConsumer
						
		▷ Supplier 인터페이스 ➜ 매개변수 X, 반환값 O
					
			◆ Supplier<T>
			◆ IntSupplier
					
		▷ Function 인터페이스 ➜ 매개변수 O, 반환값 O
					
			◆ Function<T, R>
			◆ BiFunction<T, U, R>
			◆ DoubleToIntFunction
					
		▷ Operator 인터페이스 ➜ 매개변수 O, 반환값 O
				
			◆ UnaryOperator<T>
			◆ BinaryOperator<T>
	
		▷ Predicate 인터페이스 ➜ 매개변수 O, 반환값 O
					
			◆ Predicate<T>
			◆ BiPredicate<T, U>
*/

package com.test.java.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Ex72_Lambda {
	
	public static void main(String[] args) {

		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		
	}

	private static void m6() {
		
		Student st = new Student("홍길동", 100, 90, 80);
		
		Consumer<Student> c1 = s -> System.out.println("이름: " + s.getName());
		Consumer<Student> c2 = s -> System.out.println("총점: " + s.getTotal());
		Consumer<Student> c3 = s -> System.out.println("평균: " + (s.getTotal() / 3.0));
		
		test(st, c1, c2, c3);

		System.out.println();
		
		Consumer<Student> c4 = c1.andThen(c2).andThen(c3);
		
		c4.accept(st);
		
		System.out.println();
		
		Function<Integer, Boolean> f1 = num -> (num > 0);
		
		System.out.println(f1.apply(-10));
		
		Function<Boolean, String> f2 = flag -> (flag ? "성공" : "실패");
		
		System.out.println(f2.apply(true));
		
		Function<Integer, String> f3 = f1.andThen(f2);
		
		System.out.println(f3.apply(10));
		
		System.out.println();
		
		Function<Integer, String> f4 = num -> ((num > 0) ? "참" : "거짓");
		Function<String, Integer> f5 = str -> str.length();
		Function<Integer, Integer> f6 = f4.andThen(f5);
		
		System.out.println(f6.apply(10));
		
		Function<Integer, Integer> f7 = f5.compose(f4);
		
		System.out.println(f7.apply(-10));
		
		System.out.println();
		
		Predicate<Integer> p1 = num -> (num % 2 == 0);
		Predicate<Integer> p2 = num -> (num % 3 == 0);
		
		int a = 10;

		System.out.println(p1.test(a));
		System.out.println(p2.test(a));

		Predicate<Integer> p3 = p1.and(p2);
		
		System.out.println(p3.test(a));
		
		Predicate<Integer> p4 = p1.or(p2);
		
		System.out.println(p4.test(a));
		
		Predicate<Integer> p5 = p1.negate();
		
		System.out.println(p5.test(a));
		
	}

	private static void test(Student st, Consumer<Student> c1, Consumer<Student> c2, Consumer<Student> c3) {
		
		c1.accept(st);
		c2.accept(st);
		c3.accept(st);
		
	}

	private static void m5() {

		Predicate<Integer> p = num -> (num > 0);
		
		System.out.println(p.test(10));
		
		BiPredicate<Integer, Integer> bp = (a, b) -> (a > b);
		
		System.out.println(bp.test(10, 20));
		
	}

	private static void m4() {
		
		UnaryOperator<Integer> uo = num -> (num * num);
		
		System.out.println(uo.apply(10));
		
		BinaryOperator<Integer> bo = (a, b) -> a + b;
		
		System.out.println(bo.apply(10, 20));
		
	}

	private static void m3() {
		
		Function<Integer, Boolean> f1 = num -> (num > 0);
		
		System.out.println(f1.apply(10));
		
		Function<String, Integer> f2 = str -> str.length();
		
		System.out.println(f2.apply("홍길동"));
		
		Function<Student, Boolean> f3 = s -> ((s.getTotal() >= 180) ? true : false);
		
		if (f3.apply(new Student("홍길동", 80, 75, 90))) {
			
			System.out.println("합격");
			
		} else {
			
			System.out.println("불합격");
			
		}
		
		BiFunction<Integer, Integer, Integer> bf = (a, b) -> (a + b);
		
		System.out.println(bf.apply(10, 20));
		
		DoubleToIntFunction i4 = num -> (int)num;
		
		System.out.println(i4.applyAsInt(3.14));
		
	}

	private static void m2() {
		
		Supplier<Integer> s1 = () -> 100;
		
		System.out.println(s1.get());
		
		Supplier<Double> s2 = () -> Math.random();
		
		System.out.println(s2.get());
		
		Supplier<String> s3 = () -> "홍길동";
		
		System.out.println(s3.get());
		
		Supplier<Student> s4 = () -> new Student("홍길동", 100, 90, 80);
		
		System.out.print(s4.get());
		
		IntSupplier i5 = () -> 200;
		
		System.out.println(i5.getAsInt());
		
	}

	private static void m1() {
		
		MyConsumer m1 = num -> System.out.println(num * num);
		
		m1.test(10);
		
		Consumer<Integer> c1 = num -> System.out.println(num * num);
		
		c1.accept(5);
		
		Consumer<String> c2 = str -> System.out.println(str.length());
		
		c2.accept("홍길동");
		
		System.out.println();
		
		Consumer<Integer> c3 = count -> {
			
			for (int i = 0; i < count; i++) {
				
				System.out.println(i);
				
			}
			
		};
		
		c3.accept(5);
		
		System.out.println();
		
		Consumer<Student> c4 = s -> {
			
			System.out.println("이름: " + s.getName());
			System.out.println("국어: " + s.getKor());
			System.out.println("수학: " + s.getMath());
			System.out.println("영어: " + s.getEng());
			System.out.println("총점: " + s.getTotal());
			
		};
		
		c4.accept(new Student("홍길동", 100, 90, 80));
		
		System.out.println();
		
		BiConsumer<String, Integer> bc = (name, age) -> System.out.printf("이름: %s, 나이: %d세\n", name, age);
		
		bc.accept("홍길동", 20);
		
		System.out.println();
		
		IntConsumer ic = num -> System.out.println(num * num);
		
		ic.accept(10);
		
	}

}

@FunctionalInterface
interface MyConsumer {
	
	void test(int num);
	
}

@FunctionalInterface
interface Test1 {
	
	void aaa();
	
}

interface Test2 {
	
	public final int b = 10;
	public static final int c = 20;
	
	public static void bbb() {
		
	}
	
	default void ccc() {
		
	}
	
}
