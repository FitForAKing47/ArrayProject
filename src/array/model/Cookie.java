package array.model;

public class Cookie
{
	private int cookies;
	private Boolean taste;
	private int rating;
	
	public void cookie(int cookies, boolean taste, int rating)
	{
		this.cookies = cookies;
		this.taste = taste;
		this.rating = rating;
	}
	public int getCookies()
	{
		return cookies;
	}
	public void setCookies(int cookies)
	{
		this.cookies = cookies;
	}
	public Boolean getTaste()
	{
		return taste;
	}
	public void setTaste(Boolean taste)
	{
		this.taste = taste;
	}
	public int getRating()
	{
		return rating;
	}
	public void setRating(int rating)
	{
		this.rating = rating;
	}
}
