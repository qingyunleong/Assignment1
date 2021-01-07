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
		System.out.println("SM Sport 110R : RM" + d );

		int items, number_of_purchased, quantity;
		double price, amount;
		double total = 0;
        
		System.out.println();
		System.out.print("Enter a number of motorcycle will be purchased : ");
		number_of_purchased = input.nextInt();
		System.out.println();
        
		for (items=1; items<=number_of_purchased; items++)
		{
			System.out.println("Types of motorcycle : NO" + items);
            
			System.out.print("Enter quantity = ");
			quantity = input.nextInt();
            
			System.out.print("Enter price = RM");
			price = input.nextDouble();

			amount = quantity * price;
			System.out.printf("The amount is RM %.2f%n ", amount);
			System.out.println();
	            
			total += amount;
		}

		double discount, net;
		System.out.printf("The total price of those motorcycle is RM %.2f%n", total);
	        
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
