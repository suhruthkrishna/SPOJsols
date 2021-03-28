import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		while(true){
		double T = sc.nextDouble();
		if(T == 0.0){break;}
		double sol = 0.5;
		int n = 1;
		while(sol < T){
			n++;
			sol+= 1.0/(n+1);
		}
		System.out.println(n + " card(s)");

		}
	}
}
