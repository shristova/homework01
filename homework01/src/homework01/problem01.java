package homework01;
import java.util.*;
public class problem01 {

	public static void main(String[] args) {
		Random rand = new Random();
		int dice1, dice2;
		dice1 = rand.nextInt(6) + 1;
		dice2 = rand.nextInt(6) + 1;
		if (dice1==dice2)System.out.println("Congrats! You hawe even!");
		System.out.println("You have:"+ dice1+" and "+dice2);
		System.out.println("Sum:"+ (dice1+dice2));
	}

}
