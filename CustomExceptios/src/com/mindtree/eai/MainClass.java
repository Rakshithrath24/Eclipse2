package com.mindtree.eai;

public class MainClass 
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		try
		{
			s.setBal(500);
			//s.setBal(-2000);
			System.out.println(s.getBal(1234));
			System.out.println(s.getBal(1243));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
