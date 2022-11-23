

/*ROLLNUMBER:19R21A0436
Developing the employee details Application*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
class Employeedetails {
	
	private int id;
	private String name;
	private long Mobilenumber;
	private String email;
	private String Gender;
	private String address;
            private double salary;
            private String dob;
            private String doj;
	
	public int getId()
      {
        return id;
      }

    public String getName() 
     {
        return name;
     }

    public long getMobilenumber() 
    {
        return Mobilenumber;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getGender() 
    {
        return Gender;
    }

    public String getAddress()
    {
        return address;
    }

    public double getSalary() 
    {
        return salary;
    }

    public String getDob() 
    {
        return dob;
    }

    public String getDoj()
    {
        return doj;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setMobilenumber(long Mobilenumber)
    {
        this.Mobilenumber = Mobilenumber;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setGender(String Gender)
    {
        this.Gender = Gender;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void setDob(String dob)
    {
        this.dob = dob;
    }

    public void setDoj(String doj)
    {
        this.doj = doj;
    }
	
   public String toString() {
		return "Employee [id="+ id +", name=" + name + ",Mobilenumber =" + Mobilenumber + ", email=" + email
				+ ", Gender=" + Gender + ", address=" + address + ", salary=" + salary + ", dob=" + dob + ", doj=" + doj + ", + "]";
	}
	public Employee(int id, String name, long Mobilenumber, String email, String Gender, String address, double salary, String dob, String doj) {
        this.id = id;
        this.name = name;
        this.Mobilenumber = Mobilenumber;
        this.email = email;
        this.Gender = Gender;
        this.address = address;
        this.salary = salary;
        this.dob = dob;
        this.doj = doj;    
	}
}


 class EmployeeDetails {
	
	HashSet<Employee> empset=new HashSet<Employee>();
	Employee emp1=new Employee(101, "riya", 779489976, "riya@gmail.com", "female", "hyderabad", 25000.0, "22/08/2002", "26/9/2022");
	Employee emp2=new Employee(102, "reena", 854476900, "reena@gmail.com","female", "hyderabad", 50000.0, "25/08/1999", "27/6/2022");
	Employee emp3=new Employee(103, "deepa", 778998990, "deepa@gmail.com","male", "Delhi", 90000.0, "18/09/1998", "6/03/2020");
	Employee emp4=new Employee(104, "Aditya", 779087909, "Aditya@gmail.com", "male", "hyderabad",  80000.0, "12/09/1997", "8/03/2021");
	
	Scanner sc=new Scanner(System.in);
	boolean flag=false;
	int id;
	 String name;
	 long Mobilenumber;
	 String email;
	 String Gender;
	 String address;
            double salary;
            String dob;
           String doj;
	public EmployeeDetails() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		
	}
	public void viewallemployees() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
	}
	public void viewemployee(){
		System.out.println("Enter id: ");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				flag=true;
			}
			
		}
		if(!flag) {
			System.out.println("Employee with this id is not present");
		}
	}
	public void updatemployee() {
		System.out.println("Enter id: ");
		id=sc.nextInt();
		boolean flag=false;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter name: ");
				name=sc.next();
                          System.out.println("Enter Mobilenumber: ");
                          Mobilenumber=sc.nextLong();
				System.out.println("Enter email: ");
				email=sc.next();
				System.out.println("Enter Gender: ");
				Gender=sc.next();
				System.out.println("Enter address: ");
				address=sc.next();
				System.out.println("Enter new Salary");
				salary=sc.nextDouble();
				System.out.println("Enter Dob: ");
				dob=sc.next();
                                               System.out.println("Enter Doj: ");
				doj=sc.next();
				emp.setName(name);
				emp.setMobilenumber(Mobilenumber);
				emp.setEmail(email);
				emp.setGender(Gender);
				emp.setAddress(address);
                                               emp.setSalary(salary);
				emp.setDob(dob);
				emp.setDoj(doj);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Employee details updated successfully !!");
		}
	}
	public void deletemployee() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean flag=false;
	      Employee empdelete=null;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
                        
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("Employee is not present");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully");
		}
	}
	public void addemployee() {
		             System.out.println("Enter name: ");
				name=sc.next();
                          System.out.println("Enter Mobilenumber: ");
                          Mobilenumber=sc.nextLong();
				System.out.println("Enter email: ");
				email=sc.next();
				System.out.println("Enter Gender: ");
				Gender=sc.next();
				System.out.println("Enter address: ");
				address=sc.next();
				System.out.println("Enter new Salary");
				salary=sc.nextDouble();
				System.out.println("Enter Dob: ");
				dob=sc.next();
                                               System.out.println("Enter Doj: ");
				doj=sc.next();
		Employee emp=new Employee(id, name, Mobilenumber, email, Gender, address, salary, dob, doj);
		
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employee details added successfully");
	}
}


public class Main {
	EmployeeDetails ob=new EmployeeDetails();
	static boolean S = true;
	public static void choices() {
        System.out.println("Employee details Entry ");
        System.out.println("1. Add Employee details");
        System.out.println("2.View Employee details");
        System.out.println("3.Update Employee details");
        System.out.println("4. Delete Employeeetails");
        System.out.println("5.View All Employee details");
        System.out.println("6. Exit ");
    }
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeDetails ob=new EmployeeDetails();
		
		do {
			choices();
			System.out.println("Enter your Choice");
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Add Employee details");
				ob.addemployee();
				break;
			case 2:
				System.out.println("View Employee details");
				ob.viewemployee();
				break;
			case 3:
				System.out.println("Update Employee details");
				ob.updatemployee();
				break;
			case 4:
				System.out.println("Delete Employee details");
				ob.deletemployee();
				break;
			case 5:
				System.out.println("view All Employee details");
				ob.viewallemployees();
				break;
			case 6:
				System.out.println("Thank you!");
				System.exit(0);
				
			default:
				System.out.println("Please enter number between 1 to 6");
				break;
			
			
			}
			
		}while(S);
		
			}
		
}
