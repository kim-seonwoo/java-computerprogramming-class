
import java.util.Scanner;
import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		
		int a,b,c,d;
		int result;
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("첫 번째 값을 입력하세요:");		
		a=s.nextInt();
		System.out.print("두 번째 값을 입력하세요:");		
		
		b=s.nextInt();
		System.out.print("세 번째 값을 입력하세요:");		
		
		c=s.nextInt();
		System.out.print("네 번째 값을 입력하세요:");		
		
		d=s.nextInt();
		
		result=a+b+c+d;
		System.out.println("합:"+result);
		
		
		result=a-b-c-d;
		System.out.println("차:"+result);


		s.close();
		
		
		
		
		
		
	}
}