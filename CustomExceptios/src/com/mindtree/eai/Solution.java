package com.mindtree.eai;

import com.mindtree.eai.exception.InvalidAmountException;
import com.mindtree.eai.exception.InvalidPinException;

public class Solution
{
	private double bal;
	public void setBal(double amt) throws InvalidAmountException
	{
		if(amt>0)
		{
			bal=bal+amt;
		}
		else
		{
			InvalidAmountException ie = new InvalidAmountException();
			throw ie;
		}
	}
	public double getBal(int pin) throws InvalidPinException
	{
		if(pin==1234)
		{
			return bal;
		}
		else
		{
			InvalidPinException ie = new InvalidPinException();
			throw ie;
		}
	}
}
