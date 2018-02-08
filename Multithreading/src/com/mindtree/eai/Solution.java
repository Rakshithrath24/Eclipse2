package com.mindtree.eai;

import com.mindtree.eai.Sample.InnerSample;

public class Solution 
{
	public static void main(String[] args) 
	{
		new Sample2();
		Sample s1 =new Sample();
		InnerSample s2 = s1.new InnerSample();
		System.out.println(s2.printName());
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
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

}
