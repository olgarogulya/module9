package by.epam.training.module9;

import java.util.Random;

//9_2
//Оценки, полученные студентами в сессию, являются атрибутами класса Student. Определить:
//а) средний балл учебной группы (использовать класс Group);
//б) средний балл каждого студента;
//в) число отличников;
//г) количество студентов, имеющих "2".

public class Module9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// mas[][] = mas.grades(mas);

		Random random1 = new Random();
		int grades = 7 + random1.nextInt(1); 
		System.out.println("amount of grades " + grades);
		int students = 7;
		System.out.println("amount of students " + students);
		Student[][] mas = new Student[students][grades];

		Random random2 = new Random();
		for (int j = 0; j < 7; j++) {
			for (int i = 0; i < mas.length; i++) {
				mas[j][i] = new Student();
				mas[j][i].setGrade((2 + random2.nextInt(4)));
				// System.out.println("grade " + random2.nextInt(10));
			}
		}
		for (int j = 0; j < students; j++) {
			for (int i = 0; i < mas.length; i++) {
				// System.out.println("grade[" + j + "]" + "[" + i + "] " +
				// mas[j][i].getGrade());
			}
		}

		// srednii ball uchebnoi gruppi
		int sumgradestotal = 0;
		for (int j = 0; j < students; j++) {
			for (int i = 0; i < mas.length; i++) {
				// System.out.println("grade[" + j + "]" + "[" + i + "] " +
				// mas[j][i].getGrade());

				sumgradestotal = sumgradestotal + mas[j][i].getGrade();
				// System.out.println("sumgradestotal1 " + sumgradestotal);
			}
		}
		// System.out.println("sumgradestotal " + sumgradestotal);
		double avgradetotal = (double) sumgradestotal / (double) (students + grades);
		System.out.println("srednii ball uchebnoi gruppi " + avgradetotal);

		// srednii ball studenta
		int sumgradesstudent = 0;
		for (int j = 0; j < students; j++) {
			for (int i = 0; i < mas.length; i++) {
				// System.out.println("grade[" + j + "]" + "[" + i + "] " +
				// mas[j][i].getGrade());

				sumgradesstudent = sumgradesstudent + mas[j][i].getGrade();
				// System.out.println("sumgradesstudent1 " + sumgradesstudent);
			}
			// System.out.println("sumgradesstudent"+ j + "=" + sumgradesstudent);
			double avgradesstudent = (double) sumgradesstudent / (double) grades;
			System.out.println("srednii ball studenta" + (j + 1) + " = " + avgradesstudent);

			if (avgradesstudent > 4.5) {
				System.out.println("Student" + (j + 1) + " - otlicnik");
			}
			sumgradesstudent = 0;

		}

		// u kakogo studenta dvoika
		int dvoika = 0;
		for (int j = 0; j < students; j++) {
			for (int i = 0; i < mas.length; i++) {
				if (mas[j][i].getGrade() == 2) {
					dvoika = dvoika + 1;
					// System.out.println("dvoika " + dvoika);
				}
			}
			if (dvoika > 0) {
				System.out.println("U studenta" + (j + 1) + " est 2 balla");
			}
		}
	}
}
