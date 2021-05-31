public class deadlock
{
    public static void main(String[] args)
    {
        final String str1="String message 1";
        final String str2="String message 2";
       
        Thread th1 = new Thread()
        {
            public void run()
            {
                synchronized (str1)
                {
                    System.out.println("Thread 1: locked String 1");
                    try
                    {
                        Thread.sleep(5000);
                    }
                    catch (Exception e) {}
                   
                    synchronized (str2)
                    {
                        System.out.println("Thread 1: locked String 2");
                    }
                }
            }
        };
 
        Thread th2 = new Thread()
        {
            public void run()
            {
                synchronized (str2)
                {
                    System.out.println("Thread 2: locked String 2");
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch (Exception e) {}
               
                    synchronized (str1)
                    {
                        System.out.println("Thread 2: locked String 1");
                    }
                }
            }
        };
        th1.start();
        th2.start();
    }
}