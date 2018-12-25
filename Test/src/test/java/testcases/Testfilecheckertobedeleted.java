package testcases;

import java.util.Scanner;

public class Testfilecheckertobedeleted{
		public static void main(String[] args){
			System.out.println("Enter a numbet till what u want to print: ");
			Scanner s = new Scanner(System.in);
			long n = s.nextLong();
			long a=0,b=1,c;
			System.out.println(a);
			System.out.println(b);
			c = a + b;
			System.out.println(c);
			while(c<=n){
			a = b;
			b = c;
			c = a + b;
			System.out.println(c);
			}			
		}
		
}
