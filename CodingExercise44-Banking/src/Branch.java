import java.util.ArrayList;


public class Branch {
	private String name;
	private ArrayList<Customer> customers;

	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<Customer>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Customer> getCustomers() {
		return  customers;
	}

	public boolean newCustomer(String customerName, double transaction) {
		Customer customer = findCustomer(customerName);
		if(customer==null) {
			customers.add(new Customer(customerName,transaction));
			return true;
		}
		return false;
	}

	public boolean addCustomerTransaction(String customerName, double transaction) {
		Customer customer = findCustomer(customerName);
		if(customer!=null) {
			customer.addTransaction(transaction);
			return true;
		}
		return false;
	}

	// return null if customerName doesn't exist
	// return a customer if customerName exists
	private Customer findCustomer(String customerName) {
		for(int i = 0; i < customers.size(); i++) {
			Customer checkedCustomer = customers.get(i);
			if(checkedCustomer.getName().equals(customerName)) {
				return checkedCustomer;
			}
		}
		return null;
	}
}
