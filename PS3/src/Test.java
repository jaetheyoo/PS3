public class Test {
	public static void main(String[] args) {
		
		int id = 1122;
		double Balance = 100;
		double annualInterestRate = 4.5;
		
		Account account = new Account(id, Balance);
		account.setAnnualInterestRate(annualInterestRate);
		
		try {
			account.withdraw(2500);
		} 
		catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Insufficient Funds. You require $" + e.getFundsReq());
		}
		
		account.deposit(3000);
		
		System.out.print("Balance is $");
		System.out.println(account.getBalance());
		System.out.print("Monthly Interest Rate is ");
		System.out.print(account.getMonthlyInterestRate());
		System.out.println(" percent");
		System.out.print("Date is ");
		System.out.println(account.getDate());
		
		
	}
}
