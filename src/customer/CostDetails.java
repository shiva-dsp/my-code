package customer;

import java.util.Scanner;

public class CostDetails {
public static void main(String[] args) {
	System.out.println("Cost  details");
	Scanner input = new Scanner(System.in);
	int [] cost = new int[3];
	for (int j=0; j<3;j++) {
		 System.out.println("cosmetic products price is" + (j+1));
		 cost[j] = input.nextInt();
		 
	}
}

