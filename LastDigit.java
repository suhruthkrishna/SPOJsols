import java.util.*;
import java.lang.*;
import java.lang.Math.*;
import java.math.*;


class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc= new Scanner(System.in);
    for(int T = sc.nextInt();T>0;T-- ){

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(LastDigit(a,b));

    }
}

public static int LastDigit(int a, int b) {
    int k,f=1;
    if(b==0)
        return 1;
    else {
        k =b%4;
        if(k==0)
            b=4;
        else
            b=k;
        for(int i=0;i<b;i++)
            f=f*a;

        return(f%10);
    }
}
}
