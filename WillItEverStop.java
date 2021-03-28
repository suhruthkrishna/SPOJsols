import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		if((t&(t-1))==0)
        System.out.println("TAK");
    	else
        System.out.println("NIE");
	}
}
