/* Write a program to accept the roll, name,and nationality of
  the person and display those values in good format*/


public class Q13 {
	public static void main(String[] args) {
		Console.writeLine("Enter roll here: ");
		double roll= Double.parseDouble(Console.readLine());
		
		
		
		Console.writeLine("Enter name here: ");
		String name= Console.readLine();
		
		
		
		Console.writeLine("Enter nationality here: ");
		String nationality= Console.readLine();
		
		
		System.out.println(roll);
		System.out.println(name);
		System.out.println(nationality);
	}
}
