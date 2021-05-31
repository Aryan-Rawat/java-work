public class thread extends Thread  
{    
    public void run()  
    {    
        System.out.println("running");    
    }    
    public static void main(String args[])  
    {    
        
        thread t1=new thread();    
        thread t2=new thread();  
        thread t3=new thread();

        t1.setPriority(4);  
        t2.setPriority(7);  
        t3.setPriority(1);

        System.out.println("Priority of thread t1 is: " + t1.getPriority());   
        System.out.println("Priority of thread t2 is: " + t2.getPriority()); 
        System.out.println("Priority of thread t3 is: " + t3.getPriority());
        t1.start();  
        t2.start();
        t3.start();

    }  
}  