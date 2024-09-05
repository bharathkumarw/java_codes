import java.util.Scanner;

public class NBP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] marks = new int[5];
        System.out.println("enter numbers");

        for(i=0;i<5;i++){
                marks[i]=scanner.nextInt();
        }
        int pcount=0;
        int ncount=0;
        for(i=0;i<5;i++){
          if(marks[i]>=0){
              Pcount=pcount+1;
           }
          else{
              ncount=ncount+1;
          }
        }
        System.out.println("the no of positive numbers are:"+pcount);
        System.out.println("the no of negative numbers are:"+ncount);
}
}



