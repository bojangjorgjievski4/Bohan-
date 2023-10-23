package triagolnikdomasna;

import java.util.Scanner;

public class triagolnikdomasna {
	
	public static void main(String[] args) {
		double a, b, c;
		Scanner tastatura = new Scanner(System.in);
		System.out.println("Vnesi ja prvata strana");
		a = tastatura.nextDouble();
		System.out.println("Vnesi ja vtorata strana");
		b = tastatura.nextDouble();
		System.out.println("Vnesi ja tretata strana");
		c = tastatura.nextDouble();
		if(a+c>b && a+b>c && b+c>a) {
			System.out.println("se formira triagolnik");}
		else {
			System.out.println("ne se formira triagoonik");
			System.exit(0);
		}
			if(c*c==a*a+b*b)
				System.out.println("triagolnikot e pravoagolen");
			else if (c*c>a*a+b*b)
				System.out.println("triagolnikot e ostroagolen");
			else 
				System.out.println("triagolnikot e tapoagolen");
	}
	}
	


