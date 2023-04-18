package clone.student;

public class Student implements Cloneable {
	private int id;
	private String name;
	private Date addmissionDate;

	
	
	@Override
	protected Object clone(){
		// TODO Auto-generated method stub
		try {
		    Student student =(Student) super.clone();
		    student.addmissionDate= (Date) this.addmissionDate.clone();
		    return student;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Student(int id, String name, Date addmissionDate) {
		super();
		this.id = id;
		this.name = name;
		this.addmissionDate = addmissionDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAddmissionDate() {
		return addmissionDate;
	}

	public void setAddmissionDate(Date addmissionDate) {
		this.addmissionDate = addmissionDate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addmissionDate=" + addmissionDate + "]";
	}
	
	
	
	public static void main(String[] args) {
		Student s= new Student(123,"Saurabh", new Date(15,04,2023) );
		Student s3=  (Student)s.clone();
		System.out.println(s); 
		s3.addmissionDate.day=13;
		System.out.println(s3); 
		
	}

}
