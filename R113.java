import java.util.Scanner;

public class R113 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the amount of money in the bank account: ");
		double money = in.nextDouble();
		System.out.println("Please enter the montly interest: ");
		double interest = in.nextDouble();
		System.out.println("Please enter the montly withdrawn amount: ");
		double withdrawn = in.nextDouble();
		
		if (withdrawn > money) {
			System.out.println("The withdrawn amount exceeds the account amount.The amount that can be withdrawn could be up to " + money + " dollars." );
		}
		if(withdrawn == money) {
			if (interest*money >= withdrawn) {
				System.out.println("This account will not be depleted.");
			}
			else {
			System.out.println("This bank account will be depleted after two months.At the end of the first month what is left of the money would be " + money*interest);
		}
		}
		if (money > withdrawn) {
			int months = 0;
			
			if( money*interest > withdrawn) {
				System.out.println("This account will not be depleted with the current interest and monthly withdrawn amount.");
			}
			else {
			while (money > 0) {
				money = money + interest * money - withdrawn;
				months ++;
				System.out.println(money);
			}
			System.out.println("The account will be depleted after " + months / 12 + " year " + months % 12 + " months.");
			}
			
		}
		
	}

}
