package com.ksr.ifelse;

import java.util.Scanner;

public class AddNum
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String input; 
        String FinalInput="";
        int sum=0;
        System.out.println("Enter text (Type 'q' to Terminate program ):");

        while (true) 
        {
            input = scanner.nextLine(); 

            if (input.equalsIgnoreCase("q"))
            {
            	System.out.println("Input: "+(FinalInput+input));
            	 System.out.println("Final Sum: " + sum);
                System.out.println("Program Terminated.");
                break;
            }
        
            for(char ch:input.toCharArray())
        {
        	if(Character.isDigit(ch))
        	{
        		sum=sum+ch-'0';
        	}
        	
        }
        FinalInput+=input;
        System.out.println("Current sum: "+sum +"\n (Enter 'q' to stop)");
    }
        scanner.close();
    }
}

