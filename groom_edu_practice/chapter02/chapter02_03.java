import java.util.Scanner;  
// Scanner를 사용할때는 import
import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		
		
		
		
		int a,b;
		int result;
		
		Scanner s=new Scanner(System.in);
        //s에  Scanner를 할당하는 방식
		System.out.print("첫번째 계산할 값을 입력하세요 ===>");
		a=s.nextInt();
		System.out.print("두번째 계산할 값을 입력하세요 ===>");
		b=s.nextInt();
		
		
		
		result=a+b;
		System.out.println(a+"+"+b+"="+result);
		
		result=a-b;
		System.out.println(a+"-"+b+"="+result);
		
		result=a*b;
		System.out.println(a+"*"+b+"="+result);
		
		result=a/b;
		System.out.println(a+"/"+b+"="+result);
		
		
		s.close();
	}
}