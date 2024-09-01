import java.util.*;
class invalid extends Exception
{
public invalid(String s)
{
super(s);
}
}

public class rough
{
  static void validate(int n)throws invalid
  {
  if(n<18)
  {
      throw new invalid("age requirement not met");
  }
  else
    System.out.println("eligible to vote");

  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    try
    {
      	
    	System.out.println("Enter age");
    	int n=sc.nextInt();
    	validate(n);
    }
    catch(invalid e)
    {
      System.out.println("caught the exception");
      System.out.println("exception occured:"+e);
		
    }
    finally
    {
      System.out.println("SUCCESS!");
    }
  }
}
    