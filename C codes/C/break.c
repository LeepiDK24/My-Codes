#include<stdio.h> 
int main() 
{ 
 int n,t,i;
 printf("Enter n \n");
 scanf("%d",&n);
 for(i=n;i>1;i--)
 {
if(n%i==0) {
     t=i;
     break;
 } 
 printf("%d",t);
 }
}
