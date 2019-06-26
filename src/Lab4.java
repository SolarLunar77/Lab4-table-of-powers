import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userContinue;
		
		
		do {
			
			System.out.println("Learn your squares and cubes!\n");	
			
			System.out.println("Enter an integer: ");	
			int userInput = scan.nextInt();

			
			if (userInput <= 0) {
				System.out.println("Error: Looking for a number greater than 0.");
			}
			
				System.out.print("Number\t" + "\tSquared\t" + "\tCubed");
				System.out.print("\n-------\t" + "\t-------\t" + "\t------"); 
				System.out.println("\n-------\t" + "\t--------\t" + "------"); 
			
				
			for (int i = 1; i <= userInput; i++) { 	
				System.out.print(i+"\t\t");
				System.out.print(i * i + "\t\t"); //Squared
				System.out.print(i * i * i); //Cubed
				System.out.println();

			}
			
			System.out.println("\nWould you like to continue? (y/n)");
			userContinue = scan.next();
		} while (userContinue.equals("y"));
		
			
		
		scan.close();	
	}
	
	

	public boolean nearHundred(int n) {
		  return ((Math.abs(100-n)<=10) || (Math.abs(200-n)<=10));
		}

	
}
