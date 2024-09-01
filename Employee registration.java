import java.util.*;
class Employee
{
    int age;
    long phno,salary;
    String name,address;
  	Employee z[];
  	Employee x[];
    String officer="employee";
    int employee=3;
  	int manager=3; 

void addofficer()
{
    Scanner sc=new Scanner(System.in);
  	for(int i=0;i<employee;i++)
    {
    System.out.println("********DETAILS*********");
    System.out.println("Enter name of the"+officer+":");
    z[i].name=sc.nextLine();
    System.out.println("Enter address of the"+officer+":");
    z[i].address=sc.nextLine();
    System.out.println("Enter age of the"+officer+":");
    z[i].age=Integer.parseInt(sc.nextLine());
    System.out.println("Enter phone number of the"+officer+":");
    z[i].phno=Long.parseLong(sc.nextLine());
    System.out.println("Enter salary of the"+officer+":");
    z[i].salary=Long.parseLong(sc.nextLine());
    }
}
void addmanager()
{
  	Scanner sc=new Scanner(System.in);
  	for(int i=0;i<manager;i++)
    {
    System.out.println("********DETAILS*********");
    System.out.println("Enter name of the"+officer+":");
    x[i].name=sc.nextLine();
    System.out.println("Enter address of the"+officer+":");
    x[i].address=sc.nextLine();
    System.out.println("Enter age of the"+officer+":");
    x[i].age=Integer.parseInt(sc.nextLine());
    System.out.println("Enter phone number of the"+officer+":");
    x[i].phno=Long.parseLong(sc.nextLine());
    System.out.println("Enter salary of the"+officer+":");
    x[i].salary=Long.parseLong(sc.nextLine());
    }
}
void printofficer()
{
  	for(int i=0;i<employee;i++)
    {
    System.out.println("Name of the"+officer+":"+z[i].name);
    System.out.println("Address of the"+officer+":"+z[i].address);
    System.out.println("Age of the"+officer+":"+z[i].age);
    System.out.println("Phone number of the"+officer+":"+z[i].phno);
    System.out.println("Salary of the"+officer+":"+z[i].salary);
    }
}
void printmanager()
{
  	for(int i=0;i<manager;i++)
    {
    System.out.println("Name of the"+officer+":"+x[i].name);
    System.out.println("Address of the"+officer+":"+x[i].address);
    System.out.println("Age of the"+officer+":"+x[i].age);
    System.out.println("Phone number of the"+officer+":"+x[i].phno);
    System.out.println("Salary of the"+officer+":"+x[i].salary);
    }
}
}
class Officer extends Employee
{
    String spl;
}
class Manager extends Employee
{
    String dsg;
}

class Inheritance
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        Employee a=new Employee();
        Officer b=new Officer();
        Manager c=new Manager();
        //int z[]=new int[30];
      	Employee d[]=new Employee[30];
        System.out.println("Enter total no. of managers:");
        int m=Integer.parseInt(sc.nextLine());
        System.out.println("Enter total no. of officers:");
        int e=Integer.parseInt(sc.nextLine());
        a.manager=m;
        a.officer="manager";
        a.addmanager();
        System.out.println("Enter designation of the manager:");
        c.dsg=sc.nextLine();
      	a.employee=e;
        a.officer="employee";
        a.addofficer();
        System.out.println("Enter specialization of the officer:");
        b.spl=sc.nextLine();
        System.out.println("************DETAILS OF THE MANAGER****************");
       	a.employee=m;
      	a.officer="manager";
        a.printmanager();
        System.out.println("Designation of the manager:"+c.dsg);
        System.out.println("************DETAILS OF THE OFFICER****************");
        a.employee=e;
  		a.officer="employee";
        a.printofficer();
        System.out.println("Specialization of the officer:"+b.spl);
        }
    }
