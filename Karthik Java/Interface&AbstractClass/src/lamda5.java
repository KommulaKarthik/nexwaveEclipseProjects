
class ThreadTask implements Runnable  {

   @Override
   public void run( ) {	   	  
	   for(int i=1;i<=5;i++) {
		   System.out.println(i);
	   }
   }        
}

public class lamda5 {
	
	public static void main(String[  ] args) {
	        	    	  		 
	    Thread myThread = new Thread(new ThreadTask());	    
	    myThread.start();	 	    
	    
	    System.out.println("In main thread");
	}				
}
