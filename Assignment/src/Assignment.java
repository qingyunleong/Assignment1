import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Details of Customer");

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

		System.out.println();
		System.out.println("Welcome to Leong's shop! We have the following items for sale:");
		System.out.println("Types of Motorcycle");

		double a = 3377;
		System.out.println("1. Modenas KRISS 110 : RM" + a );
		double b = 4227;
		System.out.println("2. CMC ARIO 110 : RM" + b);
		double c = 5200;
		System.out.println("3. Demak MV 135 : RM" + c );
		double d = 3978;
		System.out.println("4. SM Sport 110R : RM" + d );
		
		System.out.println();
		System.out.println("How much Modenas KRISS 110 that u want to buy?");
		int numa = input.nextInt();
		
		System.out.println();
		System.out.println("How much CMC ARIO 110 that u want to buy?");
		int numb = input.nextInt();
		
		System.out.println();
		System.out.println("How much Demak MV 135 that u want to buy?");
		int numc = input.nextInt();
		
		System.out.println();
		System.out.println("How much SM Sport 110R that u want to buy?");
		int numd = input.nextInt();
		
		int totala = 3377 * numa;
		int totalb = 4227 * numb;
		int totalc = 5200 * numc;
		int totald = 3978 * numd;
		
		System.out.println();
		int total = totala + totalb + totalc + totald;
		System.out.println("Your total is: RM" + total);
		
		double discount, net;

		if (total > 4501)    
			discount = total * 0.08;

		else if (total >= 4001 && total <= 4500)
			discount = total * 0.07;        

		else if (total >= 3501 && total <= 4000)
			discount = total * 0.06;

		else if (total >= 3000 && total <= 3500)
			discount = total * 0.05;

		else
			discount = 0;
		
		System.out.printf("Discount = RM %.2f%n", discount );
		net = total - discount;
		System.out.printf("The net total price = RM %.2f%n", net);

		System.out.println();
		System.out.println("THANK YOU! PLEASE COME AGAIN!");
	}

}
