/*Write a program to find the perimeter of a circle,
  triangle, and rectangle.
 */
public class Q7 {
public static void main(String[] args) {
	circlePeri();
	rectanglePeri();
	triangle();
}

public static void circlePeri() {
	Console.writeLine("Enter radious of circle here");
	double r= Double.parseDouble(Console.readLine());
	
	double p= 2*3.14*r;
	System.out.println("perimeter of circle is "+p);
}

public static void rectanglePeri() {
	Console.writeLine("Enter length of rectangle here");
	double l= Double.parseDouble(Console.readLine());
	
	Console.writeLine("Enter width here");
	double w= Double.parseDouble(Console.readLine());
	
	double p1= 2*(l+w);
	System.out.println("perimeter of circle is "+p1);
}

public static void triangle() {
	Console.writeLine("Enter length a  of triangle here");
	double a= Double.parseDouble(Console.readLine());
	
	Console.writeLine("Enter length b here");
	double b= Double.parseDouble(Console.readLine());
	
	Console.writeLine("Enter length cd here");
	double c= Double.parseDouble(Console.readLine());
	
	double p2= a+b+c;
	System.out.println("perimeter of circle is "+p2);
}

}
