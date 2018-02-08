package com.mindtree.eai;

public class Sample2 
{
	public Sample2()
	{
		Thread t2=new Thread(new Runnable()
		//Runnable r1=new Runnable()
		//Thread t2 = new Thread()
		{
			public void run()
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("Anonymous Class");
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
		});
		//Thread t2=new Thread(r1);
		t2.start();
		try
		{
			t2.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
