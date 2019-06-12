package Util;

import java.io.File;
import java.io.IOException;

public class xlfilepath {
	 public static void main(String[] args) 
	    { 
	        // check if length of args array is 
	        // greater than 0 
			printTerminalValueSwitch("-p");
			printTerminalValueSwitch("-d");
			printTerminalValueSwitch("null");
 
	        if (args.length > 0) 
	        { 
	            System.out.println("The command line"+ 
	                               " arguments are:"); 
	  
	            // iterating the args array and printing 
	            // the command line arguments 
	            try{
                    String s = args[0];
                    System.out.println("First argument "+s);
                    String s1 = args[1];
                    System.out.println("Second argument "+s1);
                    String s2 = args[2];
                    System.out.println("third argument "+s2);
                    String s3 = args[3];
                    System.out.println("fourth argument "+s3);
                    
                }
            catch (ArrayIndexOutOfBoundsException e) 
                {
     	         System.err.println(e);
                }
	            /*for (String val:args) 
	                System.out.println(val);*/ 
	        } 
	        else
	            System.out.println("No command line "+ 
	                               "arguments found."); 
	   
	    
	    }
	 private static void printTerminalvalueif(String data) {
			if (data.equals("-p")) {
				System.out.println(s1);
			} else if (data.equals("-d")) {
				System.out.println(s3);
			} else {
				System.out.println("INVALID value");
			}
		}
	 
	 
	 
	 
	private static void printTerminalValueSwitch(String data) {
		// TODO Auto-generated method stub
		switch (data) {
		case "-p":
			System.out.println(s1);
			break;
		case "-d":
			System.out.println(s3);
			break;
		default:
			System.out.println("INVALID Data");
		}
	}

	} 
	 
	 
	 
	 
	 
	 
	 
	

