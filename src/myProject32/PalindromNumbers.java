package myProject32;
import java.util.Scanner;

public class PalindromNumbers {
	 
	
 static boolean isPalindrom(int number) {
		int temp=number,lastNumber,reverseNumber=0;
		while(temp!=0) {
			lastNumber=temp%10;
			reverseNumber=(reverseNumber*10)+lastNumber;
			temp/=10;
		}
		if(number==reverseNumber) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[]args) {
		 Scanner input=new Scanner(System.in);
	System.out.print("Please enter a number you want to check whether is palindrome :");
	int number=input.nextInt();
	if(isPalindrom(number)==true) {
		System.out.println(number+" is a palindrome number!");
	}
	else {
		System.out.println(number+" is not a palindrome number!");
	}
		
		
		
	}

}
