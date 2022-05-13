package com.tns.di;

public class Student {

private MathCheat chit;
	

	public void setChit(MathCheat chit) //Using setters
	{
		this.chit = chit;
	}

	void cheating()
	{
		chit.mathcheat();//Some other class
	}
	
}
