#include <stdio.h>

int main(void) {
	// your code here
	 long n,i,b;
	 int c;
    while(1){
     c=0;
        scanf("%lld",&n);
        if(n==-1){
         break;
        }
        for(i=1;i<100000;i++){
         b=3*i*i-3*i+1;
            if(b==n){
             c=1;
                break;
   }
     }
     if(c==1)
         printf("Y\n");
        else if(c==0)
         printf("N\n");
 }
	return 0;
}
