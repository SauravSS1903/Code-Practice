import java.util.*;
class Secondsmallest 
{
  public static void main(String args[]) 
  {
    int a[]=new int[30];
    int n,small,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of the array:");
    n=sc.nextInt();
    System.out.println("Enter elements of the array:");
    for(int i=0;i<n;i++)
    {
	a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n-1-i;j++)
      {
        if(a[j]>a[j+1])
        {
          temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
    System.out.println("Second smallest element of the array:"+a[1]);    
  }
}