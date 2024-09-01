import java.util.*;
class Factorial 
{
  int fact(int n)
  {
	int result;
    if(n==1)
       return 1;
    result=n*fact(n-1);
    return result;
  }
}
class Recursion  
{
  public static void main(String args[]) 
  {
    int n,s;
    Factorial f=new Factorial();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    n=sc.nextInt();
    s=f.fact(n);
    System.out.println("Factorial of "+n+" is "+s);
  }
}

