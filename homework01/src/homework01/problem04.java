package homework01;
import java.util.Scanner;

public class problem04 {
	static int getInput(char a, Scanner sc){
		int number;
		System.out.println("Enter integer number to be converted to hex "+a+":");
		while (!sc.hasNextInt()) {
			System.out.println("That's not a number!");
			sc.next(); 
		}
		number = sc.nextInt();  
		return number;
	};
	static String getHex(int a)
	{
		switch(a){
		case(1):return "1";
		case(2):return "2";
		case(3):return "3";
		case(4):return "4";
		case(5):return "5";
		case(6):return "6";
		case(7):return "7";
		case(8):return "8";
		case(9):return "9";
		case(10):return "A";
		case(11):return "B";
		case(12):return "C";
		case(13):return "D";
		case(14):return "E";
		case(15):return "F";
		};
		return	"";	

	}
	public static void main(String[] args) {
		int num, c, b;
		String d;
		String reversedHex = ""; 
		Scanner sc = new Scanner(System.in);
		num = getInput('N',sc);
		do
		{
			b = num%16;
			c=num/16;
			d = getHex(b);
			reversedHex = d.concat(reversedHex);
			num=c;
		}while (c!=0);
		System.out.println(reversedHex);	
	}
}

