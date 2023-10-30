package proekt12;

import java.util.Scanner;

public class Zadaca_niza {

	public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);

	        System.out.print("Vnesi golemina na niza (N): ");
	        int N = input.nextInt();

	        int[] niza = new int[N];

	        System.out.println("Vnesi elementi na niza:");

	        for (int i = 0; i < N; i++) {
	            niza[i] = input.nextInt();
	        }

	        int suma = presmetajSumaNaNeparni(niza);

	        System.out.println("Sumata na parni broevi vo niza e: " + suma);
	    }

	    public static int presmetajSumaNaNeparni(int[] niza) {
	        int suma = 0;

	        for (int broj : niza) {
	            if (broj % 2 == 0) {
	                suma += broj;
	            }
	        }

	        return suma;
	    }


	}
