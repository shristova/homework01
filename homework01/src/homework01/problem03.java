package homework01;
public class problem03 {
	static boolean chechPrime(int n){
		if (n<=2) return true;
		long i, roundSqrt;
		double sqrtN = Math.sqrt(n);
		roundSqrt = Math.round(sqrtN);
		for (i=2; i<=roundSqrt; i++){
			if (n%i==0)return false;

		}
		return true;
	};
	public static void main(String[] args) {
		int  i;
		for (i = 1;i<1000; i++){
			if(chechPrime(i))System.out.println(i+"; ");

		};
	}

}
