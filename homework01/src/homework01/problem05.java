package homework01;

import java.util.*;

public class problem05 {
	static int hexToDecimal(char a){
		switch(a){
		case('1'):return 1;
		case('2'):return 2;
		case('3'):return 3;
		case('4'):return 4;
		case('5'):return 5;
		case('6'):return 6;
		case('7'):return 7;
		case('8'):return 8;
		case('9'):return 9;
		case('A'):return 10;
		case('B'):return 11;
		case('C'):return 12;
		case('D'):return 13;
		case('E'):return 14;
		case('F'):return 15;
		};
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hexidecimal number:");
		String hex1 = sc.nextLine();
		String hex= hex1.toUpperCase();
		sc.close();
		long num=0;
		int br=0, lenght=hex.length();
		//System.out.println(lenght);
		char hexChars [] =new char [lenght];
		hex.getChars(0, lenght, hexChars, 0);
		//System.out.println(hexChars);
		for(int i=0; i<lenght;i++){
			int res=hexToDecimal(hexChars[i]);
			if(res==-1){System.out.println(hex1+" is not a hexidecimal!");break;}
			num= (long) ((long)num+res*Math.pow(16, lenght-i-1));
			br++;
		};
		if (br==lenght)System.out.println(num);
	}

}
