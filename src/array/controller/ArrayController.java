package array.controller;

import array.model.Cookie;

public class ArrayController
{
	private int [][] randomNumbers;
	private Cookie [][] cookieTypes;
	private String [][] cookieNames;
	
	
	public ArrayController()
	{
		randomNumbers = new int [5][3];
		cookieTypes = new Cookie [6][4];
		cookieNames = new String [4][4];
	}

	
	public int[][] getRandomNumbers()
	{
		return randomNumbers;
	}


	public Cookie[][] getCookieTypes()
	{
		return cookieTypes;
	}


	public String[][] getCookieNames()
	{
		return cookieNames;
	}


	public void setRandomNumbers(int[][] randomNumbers)
	{
		this.randomNumbers = randomNumbers;
	}


	public void setCookieTypes(Cookie[][] cookiesTypes)
	{
		this.cookieTypes = cookieTypes;
	}


	public void setCookieNames(String[][] cookieNames)
	{
		this.cookieNames = cookieNames;
	}


	public void start()
	{
		
	}
	
}
