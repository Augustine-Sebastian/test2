import java.util.Scanner;
import abc.negative_exception;
public class pgm20
{
public static void main(String[] args)
{
double sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("count ofnumbers");
int N=sc.nextInt();
int[] numbers=new int[N];
for(int i=0;i<N;i++)
{
System.out.println("enter the number");
numbers[i]=sc.nextInt();
}
for(int i=0;i<N;i++)
{
	try
	{
		if(numbers[i]>=0)
		{
			sum+=numbers[i];
		}
		else
		{
			throw new negative_exception("negative number:" +numbers[i]);
			
		}
		}
		catch(negative_exception e)
		{
			System.out.println(e.getMessag());
}
}
double avg=sum/N;
System.out.println("Average of positive number="+avg);
}
}
