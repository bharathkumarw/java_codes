import java.util.*;
int num=0,i,j;
float rem;
public class NPB6{
public static void main(String args[]){
Scanner sc=new Scanner;
System.out.println("enter the number");
int i=sc.nextInt();
for(j=0;j<i;j++){
rem=i%10;
num=num+rem;
i=i/10;
}
System.out.println("the resultant sum is:"num);
}
}

