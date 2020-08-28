/*
Nick Hutson
Programming Fundamentals
*/

import java.util.Scanner;

public class Test {
    
	public static void main(String[] args) {
        
    	String command;
        String value;
        int num;
        
        System.out.println("Programming Fundamentals\nNAME: Nick Hutson\nPROGRAMMING ASSIGNMENT 4 - SET\n");

        System.out.println("Enter the commands add, del, exists or quit at the prompt\n");
        
        Scanner keyboard = new Scanner(System.in);
        
        Set mySet = new Set();
        
        do {
            
        	System.out.print("Enter command: ");
            
            //User input command
            
            switch (command = keyboard.next()) {
            }
            
            if (command.equals("quit"))
                break;
            
            value = keyboard.nextLine().trim();
            
            try {
                num = Integer.parseInt(value);
            } 
            	catch (NumberFormatException e) {
                
            		System.out.println("Error in command");
                
            	continue; //continue back into loop
            }
            
            if ("add".equals(command)) {
                
            	if (mySet.add(num)) {

                    System.out.println(mySet.toString());
                    
                } 
            	
            	else {
                    
            		System.out.println("duplicate " + num);
                }

            } else if ("del".equals(command)) {
                
            	if (!mySet.delete(num)) {
                
            		System.out.println(num + " not in set");
                } 
            	
            	else {

                    System.out.println(mySet.toString());
                }

            } else if ("exists".equals(command)) {
                
            	if (!mySet.exists(num)) {
                    
            		System.out.println("false");
                } 
            	
            	else {
                    
            		System.out.println("true");
                }

            } else {
                
            	System.out.println("Invalid command");

            }
            
        } while (true);
    }
}