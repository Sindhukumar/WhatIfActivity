import java.util.Scanner;

public class WhatIfActivity {

	public static void main(String[] args) {
		int cusID;
		String cusName, taxCode;
		double amount, tAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer ID: ");
		cusID = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Name: ");
		cusName = sc.nextLine();
		System.out.println("Enter sales amount: ");
		amount = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Tax code: ");
		taxCode = sc.nextLine();
		if (taxCode.equalsIgnoreCase("NRM"))
			tAmount = amount * 1.06;
		if (taxCode.equalsIgnoreCase("BIZ"))
			tAmount = amount * 1.045;
		else
			tAmount = amount;
		System.out.println("Customer ID: " + cusID + "\n" + "Customer Name:" + cusName + "\n" + "Sales Amount: $"
				+ amount + "\n" + "Tax Code: " + taxCode + "\n" + "Total Amount Due: $" + tAmount);
	}

}
