//Employee Class
import com.person.Person;
import com.address.Address;
public class employee extends Person {
	static String name;
	static String employeeNo;
	public employee(String employeeNo) {
		super(name);
		employee.employeeNo = employeeNo;
	}
	public static void main(String[] args) {
		Person Person = new Person("Sean Roberts");
		Address Address = new Address("123 myStreet Canada");
		employee employee = new employee("19824");
		System.out.println("Your name is: "+ Person.getName());
		System.out.println("Your Address is: "+ Address.getAddress());
		System.out.println("Your Employee Number is: "+ employee.getemployeeNo());
	}
	public String getemployeeNo() {
		return employeeNo;
	}
}