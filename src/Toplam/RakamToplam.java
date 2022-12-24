package Toplam;

import java.util.Scanner;

public class RakamToplam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Sayi giriniz:");
		int sayi = scan.nextInt();

		int toplam = 0;	

		do {

		
		toplam += sayi %10;
			 sayi /=10;
			 System.out.println("sayi: "+ sayi);

		} while (sayi > 0);

		System.out.println("Rakamlari Toplami: " + toplam);

	}

}
