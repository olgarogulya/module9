package by.epam.training.module9;

import java.util.Random;

//9_1
//определить класс "Дробь" в виде пары m/n. Объявить массив из k дробей, ввести/вывести значения для массива дробей.

public class Module9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fraction[] mas = new Fraction[5];
		
		/*mas[0] = new Fraction(1, 8);
		mas[0] = new Fraction(23, 56);
		mas[0] = new Fraction(12, 16);
		mas[0] = new Fraction(25, 33);
		mas[0] = new Fraction(14, 85);*/
		
		Random rand = new Random();
		for(int i = 0; i<mas.length; i++) {
			mas[i] = new Fraction();
			
			mas[i].setNumerator(rand.nextInt(100));
			mas[i].setDenominator(rand.nextInt(100));
		}
		
		for(int i = 0; i<mas.length; i++) {
			System.out.print("[" + mas[i].getNumerator() + "/" + mas[i].getDenominator() + "]");
			//mas[i].print();
		}
		
		/*Fraction fr1 = new Fraction(3, 8);
		Fraction fr2 = new Fraction(1, 2);
		
		fr2 = fr1.add(fr2);
		
		fr1.print();
		fr2.print();
		
		fr2.sokr();
		fr2.print();*/
		
	}

}
