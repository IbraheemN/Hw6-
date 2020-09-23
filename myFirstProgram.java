import java.util.Scanner; 

public class myFirstProgram {

	public static void main(String[] args) { 
		 
		Scanner scanner = new Scanner(System.in); 
		String input = scanner.next(); 
		scanner.close();
		
		System.out.println("My favorite programming language is " + input); 
	} 
}
