import java.util.Random;
import java.util.Scanner;

public class Loan {
	public static void main(String[] args) {
		String name;
		String dateOfBirth;
		Double creditScore;
		Double incomeAvarage;
		Double taxableIncome;
		Double loanAmount;
		
		//loanApproval Customer = new loanApproval();
		Scanner user = new Scanner(System.in);
		System.out.println("Enter name");
		name = user.nextLine();
		System.out.println("Enter Date of Birth");
		dateOfBirth = user.nextLine();
		System.out.println("Enter credit score");
		creditScore = user.nextDouble();
		System.out.println("Enter 3 month's average income");
		incomeAvarage = user.nextDouble();
		System.out.println("Enter last year's reported taxable income");
		taxableIncome = user.nextDouble();
		System.out.println("Enter the amount of loan you are applying for");
		loanAmount  = user.nextDouble();
		
		Random random = new Random();
		
		int a  = random.nextInt(90) + 10;
		String initials = name.substring(0, 2).toUpperCase();
		int s = random.nextInt (900) + 100;
		String userID = a +  initials + s;
		
		System.out.println("Your loanID is: " + userID);
		
		System.out.println("Your loan is " + decision(creditScore, loanAmount, taxableIncome, incomeAvarage));
		
}
		
		public static String decision(Double creditScore, Double loanAmount, Double taxableIncome, Double incomeAvarage) {

			String Denied = "";
			String Approved = "Approved. \nYour mortgage value is " + loanAmount;
			if(creditScore <= 600 ) {
				return Denied = "Denied because your credit score is lower than 600.";
				}
			else if (incomeAvarage < 12000){
				return Denied = "Denied becuase your income is less than $12,000.";
			}
			
			else if(loanAmount > taxableIncome * 5) {
				return Denied = "Denied becuase the loan amount needed \nis higher than five times your last year's income.";
				}
			
			return Approved;
			
			}
			
		
	
		

	}
	

