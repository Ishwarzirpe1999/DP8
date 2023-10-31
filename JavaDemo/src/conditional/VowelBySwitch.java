//vowels or consonants by using switch
package conditional;

import java.util.Scanner;

public class VowelBySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the character");
		
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
		case'A':
		case'E':
		case'I':
		case'O':
		case'U':System.out.println("It is a vowel");
		break;
		
		default:System.out.println("It is a consonant");
		}
	}

}
