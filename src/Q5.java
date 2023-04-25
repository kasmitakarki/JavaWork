//Write a program to calculate Simple Interest input by the user. Simple Interest = P*T*R/100


import java.util.Scanner;

public class Q5 {
public static void main(String[] args) {
	areaTriangle();
	areaRectangle();
	areaTriangle();
}

public static String readLine() {
	Scanner sc= new Scanner(System.in);
	return sc.nextLine();
}


public static void areaCirle() {
	final double pi= 3.14;
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter radious of circle here");
	double r= sc.nextDouble();
	double areac=pi*r*r;
	
	System.out.println("area of circle is: "+areac);
	sc.close();
}

public static void areaRectangle() {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter length of rectangle here");
	double l= sc.nextDouble();
	
	System.out.println("enter width here");
	double w= sc.nextDouble();
	
	double arear=l*w;
	
	System.out.println("area of rectangle is: "+arear);
	sc.close();
}


public static void areaTriangle() {
	System.out.println("Enter height of triangle here: ");
	double h= Double.parseDouble(readLine());
	
	System.out.println("Enter base here: ");
	double b= Double.parseDouble(readLine());
	
	double areat= (h*b)/2;
	System.out.println("area of traingle is: "+areat);
	
}






}
