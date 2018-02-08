package com.mindtree.eai.exception;

public class InvalidPinException extends RuntimeException
{
	public InvalidPinException()
	{
		super();
		System.out.println("Invalid Pin");
	}
}
