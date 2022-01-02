package a;

public class Office {

	public static void main(String[] args) {
		 Manager manager = new Manager("Ron", 30, "94465", "India", 75000.5, "IT", "Robotics");
		 manager.display();
		 manager.printSalary();
			
			Officer officer = new Officer("Jose", 19, "94465", "India", 7125000.55, "CS", "IoT");
			officer.display();
			officer.printSalary();
	}
}

class Employee {
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    private double salary;

    Employee(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary " + salary);
    }
}

class Officer extends Employee{
	private String department;
    private String specialization;

    Officer(String name, int age, String phoneNumber,
                    String address, double salary, String department, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
        this.specialization = specialization;
    }
    public void display() {
    	System.out.println();
    	System.out.println("---Officer---");
    	System.out.println("Name : " + name);
    	System.out.println("Age : " + age);
        System.out.println("department : " + department);
        System.out.println("specialization : " + specialization);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Address : " + address);
    }
}

class Manager extends Employee{
    private String department;
    private String specialization;

    Manager(String name, int age, String phoneNumber,
                    String address, double salary, String department, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
        this.specialization = specialization;
    }
    public void display() {
    	System.out.println();
    	System.out.println("---Manager---");
    	System.out.println("Name : " + name);
    	System.out.println("Age : " + age);
        System.out.println("department : " + department);
        System.out.println("specialization : " + specialization);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Address : " + address);
        
    }
}

