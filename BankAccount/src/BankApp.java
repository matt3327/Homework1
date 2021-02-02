public class BankApp{
	public static void main(String[] args) {
		BankUtils util = new BankUtils(5);
		
		util.newCustomer(new BankAccount(101, "Veena", 1000));
		util.newCustomer(new BankAccount(102, "Smith", 2000));
		
		BankAccount modifyCustomer = new BankAccount(102,"Ram", 5000);
		util.modifyCustomer(102, modifyCustomer);
		
		
	}
}
