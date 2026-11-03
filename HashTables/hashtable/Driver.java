package hashtable;

public class Driver {

	public static void main(String[] args) {
		HashTable table = new HashTable(20);
		table.put("firstname", "Joe");
		table.put("email","jsmith@mail.com");
		table.put("address", "102 Main Street");
		table.put("phone", "788-7880");
		
		table.show();

	}

}
