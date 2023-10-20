package project4;

import java.util.Scanner;

public class Zadacazaperimetarnakrug {


	public class Krug {

		public static void main(String[] args) {
			double P, L, r;
			double pi=3.14;
			System.out.println("[ Zadaca za presmetka na perimetar i plostina na krug vo cm ]");
			java.util.Scanner tastatura = new Scanner(System.in);
			System.out.print("| Vnesete radius na krugot : ");
			r=tastatura.nextDouble();
			L=2*r*pi; // Perimetar formula //
			P=r*r*pi; // Plostina formula //
			System.out.println("|Perimetarot na krugot iznesuva: "+L+"cm");
			System.out.println("|Plostinata na krugot iznesuva: "+P+"cm2");
		}

	}

