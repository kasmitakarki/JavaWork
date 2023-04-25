/*gram that converts pounds into kg. The program prompts 
the user to enter a number of pounds, converts it to kg
 and displays the result [1 pound is 0.454 kg].*/




public class Q6 {
public static void main(String[] args) {
	
	
	Console.writeLine("Enter pound value here: ");
	double p= Double.parseDouble(Console.readLine());
	
	double k= p*  0.45359237;
	System.out.println(p +"pound is "+ k+ "kg.");
	
	
}



}




