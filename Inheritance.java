import java.util.*;
class Employee
{
    int age;
    long phno,salary;
    String name,address;
    String officer="employee";
void add()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("********DETAILS*********");
    System.out.println("Enter name of the"+officer+":");
    name=sc.nextLine();
    System.out.println("Enter address of the"+officer+":");
    address=sc.nextLine();
    System.out.println("Enter age of the"+officer+":");
    age=Integer.parseInt(sc.nextLine());
    System.out.println("Enter phone number of the"+officer+":");
    phno=Long.parseLong(sc.nextLine());
    System.out.println("Enter salary of the"+officer+":");
    salary=Long.parseLong(sc.nextLine());
}
void print()
{
    System.out.println("Name of the"+officer+":"+name);
    System.out.println("Address of the"+officer+":"+address);
    System.out.println("Age of the"+officer+":"+age);
    System.out.println("Phone number of the"+officer+":"+phno);
    System.out.println("Salary of the"+officer+":"+salary);
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
        System.out.println("Enter total no. of managers:");
        int m=Integer.parseInt(sc.nextLine());
        System.out.println("Enter total no. of officers:");
        int e=Integer.parseInt(sc.nextLine());
        for(int i=0;i<m;i++)
        {
            a.officer="manager";
            a.add();
            System.out.println("Enter designation of the manager:");
            c.dsg=sc.nextLine();
        }
        for(int i=0;i<e;i++)
        {
            a.officer="employee";
            a.add();
            System.out.println("Enter specialization of the officer:");
            b.spl=sc.nextLine();
        }
        System.out.println("************DETAILS OF THE MANAGER****************");
        for(int i=0;i<m;i++)
        {
            a.officer="manager";
            a.print();
            System.out.println("Designation of the manager:"+c.dsg);
        }
        System.out.println("************DETAILS OF THE OFFICER****************");
        for(int i=0;i<e;i++)
        {
            a.officer="employee";
            a.print();
            System.out.println("Specialization of the officer:"+b.spl);
        }
    }
}

