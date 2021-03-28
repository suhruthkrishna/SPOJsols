import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc = new Scanner(System.in);
		while(true){
    		int n = sc.nextInt();
    		if(n==0)
    		    break;
    		int a[]=new int[n+1];
    		for(int i=1;i<=n;i++){
    		   a[i]=sc.nextInt();
    		}
    		a[0] = 0;
    	    int b[] = new int[a.length];
    	    for(int i=1;i<=n;i++)
    	    {
    	        b[a[i]] = i;
    	    }
    	    b[0] = 0;



    	    if(Arrays.equals(a,b)){
    	        System.out.println("ambiguous");
    	    }

    	    else{
    	        System.out.println("not ambiguous");

    	    }
		}
	}
}
