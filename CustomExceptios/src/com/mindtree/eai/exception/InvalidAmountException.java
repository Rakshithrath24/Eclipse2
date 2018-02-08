package com.mindtree.eai.exception;

public class InvalidAmountException extends RuntimeException
{
	public InvalidAmountException()
	{
		super();
		System.out.println("Invalid Amount!");
	}
}

