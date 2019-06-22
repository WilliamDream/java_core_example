package com.william.javacore.thread.base;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException{
		final Thread thread2 = new Thread(new Runnable()
        {
           public void run()
           {
              System.out.println("Second task completed");
           }
        });
	      Thread thread1 = new Thread(new Runnable()
	         {
	            public void run(){
	               System.out.println("First task started");
	               System.out.println("Sleeping for 2 seconds");
	               try
	               {
	                  Thread.sleep(2000);
	               } catch (InterruptedException e)
	               {
	                  e.printStackTrace();
	               }
//	               try {
//	            	   thread2.join();
//				   } catch (InterruptedException e) {
//					   e.printStackTrace();
//				   }
	               System.out.println("First task completed");
	            }
	         });
	      
	      thread1.start(); // Line 15
	      thread2.join(); // Line 16
	      thread2.start();
	   }
	
}
