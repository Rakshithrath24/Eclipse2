package ThreadDemos;
public class Demo extends Thread
{
	public static void main(String[] args)
	{
		//Thread t= Thread.currentThread();
		//t.setPriority(5);
		ChildThread ch = new ChildThread();
		Thread t1 = new Thread(ch);
		t1.start();
		//t1.setPriority(5);
		for(int i=2;i<=100;i=i+2)
		{
			System.out.println(i+" is Even");
			try
        	{
        		Thread.sleep(200);
        	}
        	catch(Exception e)
        	{
        		
        	}
		}
		
	}
}
class ChildThread extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1;i<=100;i=i+2)
        {
        	System.out.println(i+" is Odd");
        	try
        	{
        		Thread.sleep(200);
        	}
        	catch(Exception e)
        	{
        		
        	}
        }
	}
}

	


