package by.epam.training.module9;

import java.util.Random;

public class Student {
	
	private int grade; // поле экземпляра класса
	
	public Student() {
		//System.out.println("Constructor Fraction()");
		this.grade = 0;
		
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
		}
	
	public int getGrade() {
		return grade;
	}
	
	/*public int[] grades(int[] mass) {
		Random random1 = new Random();
		int length = random1.nextInt(10);
		System.out.println("length " + length);	
		
		Student[] mas = new Student[length];
		
		
		Random random2 = new Random();
		for(int i = 0; i<mas.length; i++) {
			
			mas[i] = new Student();
			
			mas[i].setGrade(random2.nextInt(10));
			//System.out.println("grade " + random2.nextInt(10));	
		}
		
		for(int i = 0; i<mas.length; i++) {
			System.out.println("grade " + mas[i].getGrade());
			//mas[i].print();
		}
	return mass;
	}*/
	
}
