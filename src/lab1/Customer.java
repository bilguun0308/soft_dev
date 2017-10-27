package lab1;
import java.util.ArrayList;
public class Customer {
	private String name;
	private int CustomerNumber,pin;
	private ArrayList <Account> accounts = new ArrayList<Account>();
	public Customer(int balance, int pincode,String ner,int customerNum){
		name = ner;
		CustomerNumber = customerNum;
		pin = pincode;
		accounts.add(new Account(balance));
	}
	public Account getAccount(int a){
		for(Account obj:accounts){
		    if(obj.getAccount() == a)return obj;
		 }
		return null;
	}
}
