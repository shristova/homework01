package homework01;
import java.util.*;

public class problem02 {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);	
		System.out.println("Enter integer value for a:");
		int inputA = sc.nextInt();	
		System.out.println("Enter integer value for b:");
		int inputB = sc.nextInt();
		System.out.println("Enter integer value for c:");
		int inputC = sc.nextInt();
		sc.close();
		System.out.println("The solution of "+inputA+"X^2+"+inputB+"X+"+inputC+"=0 is:");
		double des;
		des = (double)(inputB*inputB-4*inputA*inputC);
	
		if(des<0){System.out.println("Discriminant is negative, there are no real roots");}
		else
			if(des==0){
				double x = (-1)*inputB/2*inputA;
				System.out.println("Discriminant is zero, then there is exactly one real root X=" +x);}
			else{
					double x1, x2, sqrtRes;
					sqrtRes = Math.sqrt(des);
					x1 =(double)((-1)*inputB+ sqrtRes)/(2*inputA);
					x2 =(double)((-1)*inputB - sqrtRes)/(2*inputA);
					System.out.println("Discriminant is positive, then there are two distinct roots: \nX1 = "+x1+"\n"+"X2= "+x2);
				}
			}
}
		

