package setBit;

import java.util.Scanner;

public class Bits {
	
		       
		    public static int bitsnumber(int num1)
		    {
		        if(num1==0)
		            return 1;
		        int rrr =  2 * bitsnumber(num1-1);
		        return rrr;
		    }
		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		 if(a==b)
	        {
	            System.out.println(bitsnumber(a));
	        }
	        else
	        System.out.println(bitsnumber(a)+bitsnumber(b));
	    }
		
	}


