import java.util.Scanner;

public class ForLoopChallenges
	{
	public static void main(String[] args) 
		 {
//			 challenge1();
//			 challenge2();
//			 challenge3();
//			 challenge4();
//			 challenge5();
//			 challenge6();
//			 challenge7();		
			 bonusChallenge();
			 }
		
	public static void challenge1()
	{
		 //donuts
		for(int i = 1; i <=5; i++)
			{
				System.out.println("I love donuts!");
			}
		
	}
		//1-5
	public static void challenge2()
	{
		System.out.println();
		for(int i = 1; i<=5; i++)
			{
				System.out.println(i);
			}
		System.out.println();
	}

		//5-1
	public static void challenge3()
	{
		for(int i = 5; i>=1; i--)
			{
			System.out.println(i);
			}
		System.out.println();
	}

	public static void challenge4()
	{
		//multiples of 5 + adding them together
		int total = 0;
		for(int i = 5; i<=100; i+= 5)
			{
				System.out.println(i);	
				total += i;
			}
		System.out.println("The total of those numbers is " + total);
	}
	public static void challenge5()
	{
		 //lower and upperbound
		 Scanner userIntInput = new Scanner(System.in);
		 System.out.println("Give me a low number!");
		 int num1 = userIntInput.nextInt();
		 System.out.println("Give me a high number!");
		 int num2 = userIntInput.nextInt();
		 int total1 = 0;
		 for(int i = num1; i<= num2; i++)
			 {
				 total1 += i; 
			 }
		 System.out.println("The total of all those numbers is " + total1);
		 
	}
	public static void challenge6()
	{
		 //#6rectangle code
		 System.out.println("*********");
		 for(int i = 0; i<= 9; i++)
			 {
				 System.out.println("*       *");
			 }
		 System.out.println("*********");
	} 
	public static void challenge7()
	{
		 //bonus code
		 for(int i =((5*3) - 5); i<= ((11*7) - 27); i+=((5*3) - 5))
			 {
				 System.out.println(i);
			 }
		 System.out.println("\"dog\"");
		 System.out.println("\\\\");
	} 
	public static void bonusChallenge()
	{
		Scanner userStringInput = new Scanner(System.in);
		System.out.println("Give me two words separated by a space!");
		String sentence = userStringInput.nextLine();
		sentence = sentence.toLowerCase();
		int location = sentence.indexOf(" ");
		sentence = sentence.replace(" " ,"" );
		System.out.println(sentence.substring(0, location) + sentence.substring(location, location + 1).toUpperCase() + sentence.substring(location + 1));
	}
		
			}

