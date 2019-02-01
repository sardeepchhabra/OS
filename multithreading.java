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
    public static void main(String[] args) 
    {  
            Mythread t1 = new Mythread(); 
            
	    Mythread t2=new Mythread();

    	    Mythread t3=new Mythread();  
		
		t1.start();		
		t2.start();
		t3.start();
    } 
} 