package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		 int num1=0,num2=1,num3,count=5;  
		 System.out.print(num1+" "+num2);//printing 0 and 1  
		  
		 for(int i=0;i<=count;++i)//loop starts from 2 because 0 and 1 are already printed  
		 {  
			 num3=num1+num2;  
			 System.out.print(" "+num3);  
			 num1=num2;  
			 num2=num3;  
		 } 
	}
}
