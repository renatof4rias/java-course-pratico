package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nota P1 ");
		int p1 = sc.nextInt();

		System.out.print("Nota P2 ");
		int p2 = sc.nextInt();

		System.out.print("Nota P3 ");
		int p3 = sc.nextInt();

		if (p1 > p2 && p1 > p3) {
			System.out.println(p1);
		} else if (p2 > p3) {
			System.out.println(p2);
		} else {
			System.out.println(p3);
		}

		sc.close();
	}
}