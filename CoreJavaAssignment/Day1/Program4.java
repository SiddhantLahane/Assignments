package in.acts.cdac;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		switch(number) {
		
		case 1:
			System.out.println("first day is Sunday");
			break;
			
		case 2:
			System.out.println("second day is Monday");
			break;
			
		case 3:
			System.out.println("Third day is Tuesday");
			break;
			
		case 4:
			System.out.println("Fourth day is Wednesday");
			break;
			
		case 5:
			System.out.println("Fifth day is Thursday");
			break;
			
		case 6:
			System.out.println("Sixth day is Friday");
			break;
			
		case 7:
			System.out.println("Seventh day is Saturday");
			break;
			
		default :
			System.out.println("invalid input");
		
		}
		
sc.close();
	}

}
