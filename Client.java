
public abstract class Client implements Accountable {
String name;
String IBAN;
double credit;

public Client()
	{
	
	}
public Client(String name, String iBAN) {
	super();
	this.name = name;
	this.IBAN = iBAN;
}
@Override
public void ATMWithdraw(String IBAN, int desiredsum) {
	var MAX_WITHDRAW_SUM=50000;
	if(desiredsum<MAX_WITHDRAW_SUM)
	{
		this.credit+=desiredsum;
		System.out.print("The account with IBAN "+IBAN+" has withdrawed the asked sum.");
	}
}
@Override
public void infoCredit()
{
	System.out.print("The client "+this.name+" has the account with IBAN "+this.IBAN+" and has a credit of "+this.credit);
}
}
