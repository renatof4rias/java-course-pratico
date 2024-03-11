package Seção_3_MissãoDominar;

import java.util.Scanner;

public class DoubleNumber2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor qualquer -> ");
		double value = sc.nextDouble();

		var result = (value > 0.0) ? "POSITIVO" : (value < 0.0) ? "NEGATIVO" : "ZERO";

		System.out.println(result);

		sc.close();
	}
}