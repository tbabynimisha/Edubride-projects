package basicPrograms;
import java.util.Scanner;

public class Bank1
{

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your 'Name' and 'Customerid' to access your account");
		String name=s.nextLine();
		String customerid=s.nextLine();
		BankAccount obj1=new BankAccount(name,customerid);
		obj1.menu();
	}
}
class BankAccount
{
	Double bal;
	double prevTrans;
	String customerName;
	String customerId;
	
	BankAccount(String customerName,String customerId)
	{
		this.customerName= customerName;
		this.customerId=customerId;
	}
	
	void deposit(double amount)
	{
		if(amount!=0)
		{
			bal+=amount;
			prevTrans=amount;
		}
	}
	void withdraw(double amt)
	{
		if(amt!=0 && bal>=amt)
		{
			bal-=amt;
			prevTrans=-amt;
		}
		else if(bal<amt)
		{
			System.out.println("Bank balance insufficient");
		}
	}
	void getPreviousTrans()
	{
		if(prevTrans>0)
		{
			System.out.println("Deposited:"+prevTrans);
		}
		else if(prevTrans<0)
		{
			System.out.println("Withdrawn: "+Math.abs(prevTrans));
			
		}
		else
		{
			System.out.println("No transaction occured");
		}
	}
		void menu()
		{
			char option;
			Scanner s=new Scanner(System.in);
			System.out.println("Welcome "+customerName);
			System.out.println("Your ID:"+ customerId);
			System.out.println("\n");
			System.out.println("a Check Balance");
			System.out.println("b Deposit Amount");
			System.out.println("c Withdraw Amount");
			System.out.println("d Previous Trnasaction");
			System.out.println("e Exit");
			
			do
			{
				System.out.println("****************************");
				System.out.println("Choose an option");
				option=s.next().charAt(0);
				System.out.println("\n");
				
				switch (option)
				{
				case 'a':
				System.out.println("................................");
				System.out.println("Balance ="+bal);
				System.out.println("............................");
				System.out.println("\n");
				break;
				case 'b':
				System.out.println(".................................");
				System.out.println("Deposit=+");
				System.out.println("..................................");
				double amt=s.nextDouble();
				deposit(amt);
				System.out.println("\n");
				break;
				case 'c':
				System.out.println("....................................");
				System.out.println("Withdraw amount");
				System.out.println(".....................................");
				double amtW=s.nextDouble();
				withdraw(amtW);
				System.out.println("\n");
				break;
				case 'd':
				System.out.println("......................................");
				System.out.println("Previous Transaction");
				getPreviousTrans();
				System.out.println("....................................");
				System.out.println("\n");
				break;
				
				case 'e':
				System.out.println(".......................................");
				break;
				default:
					System.out.println("Choose a correct option");
				     break;
				}
			}
			while(option!='e');
			System.out.println("Thankyou for using our bank server");
				
				
				
				}
}
		
		
		
		
		
		
		
		
		
			
			
			
		
		

	


