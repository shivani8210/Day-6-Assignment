package com.shi;

public class CLA {

	public static void main(String[] args) {
		
		if (args.length == 1) {
			
			String s0 = args[0];
			
			int i0 = Integer.parseInt(s0); 
			
		    int f = 1;
		        
		    for(int x=1;x<=i0;x++) {
		    	
		        f=f*x;
		        
		    }
		    
		    System.out.println(f);
		    
		}
		
		else if(args.length==2) {
			
			String s0 = args[0];
			
		    String s1 = args[1];
		    

		    int i0 = Integer.parseInt(s0);
		    
		    int i1 = Integer.parseInt(s1);
		    
		    int result = Math.abs(i0-i1);
		    
		        
		    int f = 1;
		        
		    for(int x=1;x<=result;x++) {
		    	
		        f=f*x;
		        	
		    }
		    
		    System.out.println(f);
		}
	  
		else {
			
		  System.out.println("Error");
		  
		}
      
	}
	
}