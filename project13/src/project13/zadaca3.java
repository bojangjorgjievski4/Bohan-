package project13;



import java.util.Scanner;



public class zadaca3 {



public static void main(String[] args) {


// ZADACA BR. 3 //


int x,y,z;

Scanner tastatura = new Scanner(System.in);

System.out.println("Vnesi vrednost za X: ");

x=tastatura.nextInt();

System.out.println("Vnesi vrednost za Y: ");

y=tastatura.nextInt();

System.out.println("Vnesi vrednost za Z: ");

z=tastatura.nextInt();

if(x>y || z>y)

{

System.out.println("1");

}

else

{

System.out.println("2");

}

if(Math.abs(x-y)>=z)

if(x>y)

{

System.out.println("3");

}

else

{

System.out.println("4");

}

else

{

System.out.println("5");

}




}



}