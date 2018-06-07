package session2;

import java.util.Scanner;

public class lab1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("pls enter a number=");
		int num=scanner.nextInt();
		System.out.println("you entered ="+num);
		String bin="";
		int n=0;
		
		
		while(num>0) {
			n=num%2;
			bin=bin+""+n; //Concatenating
			
			num=num/2;
		}
       
        String reverse = "";
        
        
        for(int i = bin.length() - 1; i >= 0; i--)
        {
            reverse = reverse + bin.charAt(i);
        }
        
        System.out.println("binary ="+reverse);
        
        System.out.println("string length "+reverse.length());
        
       int counter=0;
       int flag = 0;
      
        for(int i=1;i<reverse.length();i++) {
        	if(reverse.charAt(i)==1 && counter<2 ) {
        		
        		 flag=i-flag;
        		 counter++;
        		
        	}
        	
        }
        
        System.out.println(flag);
	}

}
