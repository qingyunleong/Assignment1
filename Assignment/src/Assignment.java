import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		System.out.println("Details of Customer");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Name : " + name);
		
		System.out.print("Enter your IC: ");
		String ic = input.nextLine();
		System.out.println("IC number : " + ic);
		
		System.out.print("Enter your gender: ");
		String str = input.next();
		char gender = str.charAt(0);
		System.out.println("Gender : " + gender);
		
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		System.out.println("Age : " + age);
		
		System.out.print("Enter Your Home : ");
		String home = input.next();
		System.out.println("Home " + home);

		System.out.println();
		System.out.println("Welcome to Leong's shop! We have the following items for sale:");
		System.out.println("Types of Motorcycle");

		double a = 3377;
		System.out.println("Modenas KRISS 110 : RM" + a );
		double b = 4227;
		System.out.println("CMC ARIO 110 : RM" + b);
		double c = 5200;
		System.out.println("Demak MV 135 : RM5" + c );
		double d = 3978;
		System.out.println("SM Sport 110R : RM" + d );
		
		System.out.println();
		System.out.println("How many Modenas KRISS 110 do you want?");
		int numbera = input.nextInt();
		
		System.out.println();
		System.out.println("How many CMC ARIO 110 do you want?");
		int numberb = input.nextInt();
		
		System.out.println();
		System.out.println("How many Demak MV 135 do you want?");
		int numberc = input.nextInt();
		
		System.out.println();
		System.out.println("How many SM Sport 110R5 do you want?");
		int numberd = input.nextInt();
		
		System.out.println();
		double atotal = numbera * a;
		double btotal = numberb * b;
		double ctotal = numberc * c;
		double dtotal = numberd * d;
		
		double alltotal = atotal + btotal + ctotal + dtotal;
		System.out.println("Your total is : RM" + alltotal);
		
		System.out.println();
		System.out.println("THANK YOU! PLEASE COME AGAIN!");
	}

}
