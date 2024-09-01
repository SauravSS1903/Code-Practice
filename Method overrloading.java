import java.util.*;
class CalcArea
{
	void area(double r)
	{
		System.out.println("Area of circle="+3.14*r*r);
	}
  	void area(float length,float breadth)
    {
		System.out.println("Area of rectangle="+length*breadth);	
    }
  	void area(double a,double b,double c)
    {
      double s,h;
      s=(a+b+c)/2;
      h=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println("Area of triangle="+h);
    } 
}
class methodOver
{
  public static void main(String[] args)
  {
    float length,breadth;
    double r;
    double a,b,c;
    CalcArea ar=new CalcArea();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter radius of the circle:");
    r=sc.nextDouble();
    ar.area(r);
    System.out.println("Enter length and breadth of the rectangle:");
    length=sc.nextFloat();
    breadth=sc.nextFloat();
    ar.area(length,breadth);
    System.out.println("Enter values for a,b,c of the triangle(HERON'S FORMULA):");
    a=sc.nextDouble();
    b=sc.nextDouble();
    c=sc.nextDouble();
    ar.area(a,b,c);
  }
}