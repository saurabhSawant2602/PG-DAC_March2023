package clonePerson;



class Address implements Cloneable {
	String street;
	String city;
	String state;

	public Address(String street, String city, String state) {

		this.street = street;
		this.city = city;
		this.state = state;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	

}


public class Person implements Cloneable {
	String name;
	Address address;

	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	protected Object clone() {
		try {
			Person person = (Person) super.clone();
			person.address = (Address) this.address.clone();
			return person;

		} catch (CloneNotSupportedException e) {
			System.out.print(e);

		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
  //-------main method -----------------
	public static void main(String[] args) {
		Person person = new Person("Saurabh", new Address("Apta road", "Panvel", "Maharashtra"));
		Person person1 = (Person) person.clone();
		person1.address.city= "Kharghar";
	    System.out.println(person);
	    System.out.println(person1);
	}
}
