import java.util.Scanner;

public class Function {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Runner run = new Runner(200);
		
		boolean quit = false;
		int choice = 0;
	
		while(!quit) {
			menu();
			System.out.println("Select a Choice");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch(choice) {
			
			case 1:
				dollarToEuro();
				break;
			
			case 2:
				dollarToYen(run);
				break;
			case 3: 
				quit = true;
				break;
			case 4:
				System.out.println("AINT NO HELP MY G, ON YOUR OWN!");
			}
		}
		
	}
	
	public static void menu() {
		System.out.println("\nChoose Which Currency You Would Like To Convert To");
		System.out.println("1. Dollar to Euro.");
		System.out.println("2. Dollar to Yen.");
		System.out.println("3. Quit.");
		System.out.println("4. HELP \n");
	
	}
	
	
	
	public static void dollarToYen(Runner dollar) {
		double rate = 1.79;
		double sum;
		sum = (dollar.getDollar() *rate);
		
		System.out.println("Dollar: " + dollar.getDollar());
		System.out.println("Yen Conversion Total: " + sum);
		System.out.println("Change: " + (sum - dollar.getDollar()) + "\n");
	}
	
	public static void dollarToEuro() {
		
		int amount = 0;
		System.out.println("Enter amount of Dollars to convert to Euros");
		amount = scanner.nextInt();
		double rate = 0.80;
		double sum;
		sum = (amount *rate);
		System.out.println("Dollar: " + amount);
		System.out.println("Euro Conversion Total: " + sum);
		if(rate<1) {
			System.out.println("Change: " + (sum - amount));

		}
		else 		System.out.println("Change: " + (sum - amount));
		
	}
	
	public static void dollarToEuro(Runner dollar) {
		double rate = 0.80;
		double sum;
		sum = (dollar.getDollar() *rate);
		System.out.println("Dollar: " + dollar.getDollar());
		System.out.println("Euro Conversion Total: " + sum);

		if(rate<1) {
			System.out.println("Change: -" + (sum - dollar.getDollar()));

		}
		else 		System.out.println("Change: " + (sum - dollar.getDollar()));

	}
	

}
