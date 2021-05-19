import java.util.*;
import java.lang.*;


class Main
{
    public static double M_E = 2.71828182845904523536;
    public static double M_PI = 3.141592654;
      static long FactLeng(long n)
    {
        if (n < 0){
            return 0;
        }
 
       if (n <= 1){
            return 1;
       }
        double x = (n * Math.log10(n / M_E) +
                    Math.log10(2 * M_PI * n) /
                    2.0);
 
        return (long)Math.floor(x) + 1;
    }
 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
			long n=sc.nextLong();
			long ans=FactLeng(n);
			System.out.println(ans);
		}
	}
}
