import java.util.Scanner;

public class Q4 {
	public static void main (String[] args) {
		simpleIntrest();
		
		
		
	}
	
public static void simpleIntrest() {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter principal here: ");
	int p= sc.nextInt();
	
	System.out.println("Enter time here: ");
	int t= sc.nextInt();
	
	System.out.println("Enter rate here: ");
	int r= sc.nextInt();
	
	int si= p*t*r/100;
	System.out.println("simple intrest is : "+si);
	sc.close();
}
	
}
