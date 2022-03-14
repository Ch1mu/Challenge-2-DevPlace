package classes;

import java.util.Random;

public class Password {
private int length = 8;
private String password ="";
Random rnd = new Random();
public Password(String password)
{
	this.password = password;
	length = password.length();
}
public Password(int length)
{
	this.length = length;
	for (int i = 0; i<length; i++)
	{
		password+= rnd.nextInt(); //it generates a random numerical password with the specified length
	}
}

public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public String getPassword() {
	return password;
}

public boolean isStrong()
{
	int upperCase = 0;
	int lowerCase = 0;
	int number = 0;
	
	for (int i = 0; i<length; i++)
	{
		if(Character.isUpperCase(password.charAt(i)))
		{
			upperCase++;
		}
		else if(Character.isLowerCase(password.charAt(i)))
		{
			lowerCase++;
		}
		else if (password.charAt(i)>= 48 && password.charAt(i) <= 57) //I compare characters with ASCII table
				number++;
	}
	
	if(number >3 && upperCase>2 && lowerCase >1 )
		return true;
	else
		return false;
}
}
