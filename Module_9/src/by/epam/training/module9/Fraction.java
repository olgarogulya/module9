package by.epam.training.module9;

public class Fraction {

//состояние
	private int numerator; // поле экземпляра класса
	private int denominator;

//поведение
	public Fraction() {
		//System.out.println("Constructor Fraction()");
		this.numerator = 0;
		this.denominator = 1;
	}

	public Fraction(int numerator, int denominator) {
		//System.out.println("Constructor Fraction(int num, int den)");
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
		}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public Fraction addNumber(int value) {
		int newNum;
		int newDen;

		newNum = this.numerator + this.denominator * value;
		newDen = this.denominator;

		Fraction newFr = new Fraction(newNum, newDen);

		return newFr;
	}

	public Fraction add(Fraction fr) {
		int newNum;
		int newDen;

		newDen = this.denominator * fr.denominator;
		newNum = this.numerator * fr.denominator + this.denominator * fr.numerator;

		Fraction newFr = new Fraction(newNum, newDen);
		newFr.sokr();
		return newFr;
	}

	public void sokr() { // сокращение дроби
		int min;

		if (numerator < denominator) {
			min = numerator;
		} else {
			min = denominator;
		}
		
		while(!((numerator % min == 0) && (denominator % min == 0))) { //!false = true !true = false
			min = min - 1;
		}
		
		numerator = numerator / min;
		denominator = denominator / min;
	}

	public void print() {
		System.out.println(this.numerator + "/" + this.denominator);
	}

}
