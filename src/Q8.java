
public class Q8 {
public static void main(String[] args) {
	
	final double pi= 3.14;
	Console.writeLine("Enter radious of cylinder here: ");
	double r= Double.parseDouble(Console.readLine());
	
	Console.writeLine("Enter length of cylinder here: ");
	double l= Double.parseDouble(Console.readLine());
	
	double v = pi*r*r*l;
	System.out.println("volume is "+v);
	
}
}
