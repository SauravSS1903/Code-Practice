import java.util.*;
class quicksort
{
public static void quicksort(String A[],int first,int last)
{
  if(first<last)
  {
  int q=partition(A,first,last);
  quicksort(A,first,q-1);
  quicksort(A,q+1,last);
  }
}
  
public static int partition(String A[],int first,int last)
{
  String x=A[last];
  int i=first-1;
  for(int j=first;j<last;j++)
  {
	if(A[j].compareTo(x)<=0)
    {
      i=i+1;
      String temp=A[i];
      A[i]=A[j];
      A[j]=temp;
    }
  }
   String temp=A[i+1];
    A[i+1]=A[last];
    A[last]=temp;
    return i+1;
   }
  
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no of words");
    int n=sc.nextInt();
    sc.nextLine();
    String A[]=new String[n];
    System.out.println("Enter the names");
    for(int i=0;i<n;i++)
      A[i]=sc.nextLine();
    quicksort(A,0,n-1);
    for(int i=0;i<n;i++)
      System.out.println(A[i]);
    
    }
}
