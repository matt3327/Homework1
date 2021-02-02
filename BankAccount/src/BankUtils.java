public class BankUtils {
	private BankAccount[] arr;
	
	public BankUtils(int size) {
		arr = new BankAccount[size];
	}
	
	public boolean newCustomer(BankAccount ba) {
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ba;
				return true;
			}
		}
		return false;
	}
	
	public boolean modifyCustomer(int accNo, BankAccount acc) {
		for(int i=0; i< arr.length; i++) {
			if(arr[i].getAccNo() == accNo) {//looking to see if account num matches
				arr[i] = acc;// if it does match then its true
				return true;
			}
		}
		return false;
	
	}
	
	public boolean removeCustomer(int accNo, BankAccount acc) {
		for(int i=0; i< arr.length; i++) {
			if(arr[i].getAccNo() == accNo) {//looking to see if account num matches
				arr[i] = null;// if it does match then its true
				return true;
			}
		}
		return false;
	
	}
	
	public boolean printCust(int accNo, BankAccount acc) {
		for(int i=0; i < arr.length; i++) {
			if(arr[i].getAccNo() == accNo)
					
			return true;
		}
		return false;
	}
	
	public boolean printAllCust(){
		for(int i=0; i < arr.length;i++) {
			if(arr[i] != null) {	
			return true;
			}
		}
		return false;
	}
}
