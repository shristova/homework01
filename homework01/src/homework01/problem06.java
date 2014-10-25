package homework01;

import java.util.Scanner;

public class problem06 {
	static int getInput(char a, Scanner sc){
		int number;

		System.out.println("Enter limit for Fibonacci sequence"+a+":");
		while (!sc.hasNextInt()) {
			System.out.println("That's not a number!");
			sc.next(); 
		}
		number = sc.nextInt();  
		return number;

	};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = getInput('n', sc);
		sc.close();
		int intArr[] = new int [n+1];
		if(n>2)
		{
			intArr[0] = 1;
			intArr[1] = 1;
			System.out.println(intArr[0]+"; ");
			System.out.println(intArr[1]+"; ");
			int fib;
			for (int i=1; i<n-1; i++)
			{
				fib = intArr[i]+intArr[i-1];
				intArr[i+1] = fib;
				System.out.println(intArr[i+1]+"; ");
			}

		}else {

			for(int i=0; i<n; i++){System.out.println(1+"; ");}
		}

	}

}
