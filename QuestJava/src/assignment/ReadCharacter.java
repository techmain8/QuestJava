package assignment;

import java.util.Scanner;

public class ReadCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter the Character To Find What Is It:");
		ch = sc.next().charAt(0);
		
		sc.close();
		//solution 1 with switch case
		/*
		switch(ch) {
		case 'A' :case 'U' :case 'V' :case 'W' :case 'X' :case 'Y' :case 'Z' :case 'B' :
		case 'C' :case 'D' :case 'E' :case 'F' :case 'G' :case 'H' :case 'I' :case 'J' :case 'K' :case 'L' :case 'M' :	
		case 'N' :case 'O' :case 'P' :case 'Q' :case 'R' :case 'S' :
		case 'T' :System.out.println("The Entered Character is UPPERCASE ALPHABET");
							break;
		case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case'0':
		case '9': System.out.println("The Entered Character is NUMBER:");
							break;
		case 'a' :case 'u' :case 'v' :case 'w' :case 'x' :case 'y' :case 'z' :case 'b' :
		case 'c' :case 'd' :case 'e' :case 'f' :case 'g' :case 'h' :case 'i' :case 'j' :case 'k' :case 'l' :case 'm' :	
		case 'n' :case 'o' :case 'p' :case 'q' :case 'r' :case 's' :
		case 't' :System.out.println("The Entered Character is LOWERCASE ALPHABET");	
							break;
		case '!':case '@' :case '$' :case '#' :case '%' :case '^' :case '&' :case '*' :case '(' :
		case ')' :case '-' :case '+' :case '=' :case '_' :case '`' :case '~' :case '?' :
		case '[':case ']':case '{':
		case '}': System.out.println("The Entered Character is SYMBOL or SPECIAL CHARACTER:");
		}
		*/
		//solution 2
		// A - Z	a-z		0 - 9  ASCII	-> A - 65 n Z - 90		a - 97 and z - 122		0 - 48    9 - 57
	
		if(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122)
			System.out.println("Letter");
		else if(ch >= 48 && ch <= 57)
			System.out.println("Digit");
		else
			System.out.println("Special Character");
		
	}

}
