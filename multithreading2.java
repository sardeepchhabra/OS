class Mythread extends Thread 
{ 
    public void run() 
    { 
        try
        { 
		for(int i=0;i<10;i++) 
            System.out.println ("Thread " + 
                  Thread.currentThread().getId() + 
                  " is running"); 
        } 
        catch (Exception e) 
        { 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
class multithreading 
{ 
    public static void main(String[] args) throws InterruptedException
    {  
            Mythread t1 = new Mythread(); 
            
	    Mythread t2=new Mythread();

    	    Mythread t3=new Mythread();  
		
		t1.start();
		t1.join();		
		t2.start();

        for (int i=0; i<5; i++) 
        { 
             
            t1.yield(); 
  
            System.out.println(Thread.currentThread().getName() 
                                + " in control"); 
        } 
		t3.start();
		t3.sleep(100);

		
    } 
} 