package com.mindtree.eai;

public class Sample 
{
	private static String name = "OUTER CLASS";
	Sample()
	{
		Thread t1 = new InnerSample();
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public class InnerSample extends Thread
	{
		public void run() 
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Inner Class");
				try
				{
					Thread.sleep(200);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		public String printName()
		{
			return name;
		}
	}

}
