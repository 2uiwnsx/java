package com.test.java.obj;

public class Ex41_Class {
	
	public static void main(String[] args) {
		
		PencilCase pcase = new PencilCase();
		
		pcase.setColor("노랑");
		
		for (int i = 0; i < 5; i++) {
			
			Pencil p = new Pencil();
			
			p.setHardness("B");
			p.setColor("파랑");
			
			pcase.add(p);
			
		}
		
		System.out.println(pcase.info());
		
		Pencil p = pcase.get(2);
		
		System.out.println(pcase.info());

	}

}
