package start;

import java.util.Scanner;

public class AC2NOTAFINAL {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double ac1, ac2, ag, af, total; //total e a nota final.

		System.out.println("Por favor, insira a sua nota da avaliação AC1:"); // AC1 VALE 1,5 DO TOTAL
		ac1 = ler.nextDouble();

		System.out.println("Por favor, insira a sua nota da avaliação AC2:"); // AC2 VALE 3 DO TOTAL
		ac2 = ler.nextDouble();

		System.out.println("Por favor, insira a sua nota da avaliação AG:"); // AG VALE 1 DO TOTAL
		ag = ler.nextDouble();

		System.out.println("Por favor, insira a sua nota da avaliação AF:"); // VALE 4.5 DO TOTAL
		af = ler.nextDouble();
		ler.close(); // economia de memoria

		ac1 = ac1 * 0.15;
		ac2 = ac2 * 0.30;
		ag = ag * 0.10;
		af = af * 0.45;

		total = ac1 + ac2 + ag + af;

		if (total >= 5) {

			System.out.printf("Sua nota final é: %f\nVocê foi aprovado!", total); // se for aprovado.
		} else {
			System.out.printf("Sua nota final é: %f\nVocê foi reprovado!", total); // se não.
		}

	}

}
