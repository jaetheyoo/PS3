/**
 * @author Jae
 * Account class
 * Attributes: int id, double balance, double annualInterestRate, Date dateCreated
 * Getters and setters for each id, balance, and annualInterestRate
 * method withdraw: tries to take out a amount from balance, throws InsufficentFundsException if the amount exceeds balance
 * deposit: adds an amount to balance
 */

import java.util.Date;


public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	Account() {
		
	}
	
	public String getDate() {
		dateCreated = new Date();
		return dateCreated.toString();
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	
	public Date dateCreated() {
		return this.dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return this.annualInterestRate/12;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException {
		if (balance >= amount) {
			balance = balance - amount;
		}
		else {
			double FundsReq = amount - balance;
			throw new InsufficientFundsException(FundsReq);
		}
	}
	
	public void deposit(double amount) {
		this.balance = balance + amount;
	}
	
}
