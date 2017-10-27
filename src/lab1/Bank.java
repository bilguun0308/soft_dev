package lab1;
import java.util.ArrayList;

public class Bank {
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	private String name;
	public Bank(String ner){
		name = ner;
	}
	public void AddCustomer(Customer a){
		customers.add(a);
	}
}
