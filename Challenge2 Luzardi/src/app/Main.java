package app;



import java.util.Scanner;

import classes.Password;

public class Main {

	public static void main(String[] args) {
		
		//1
program();
		


	}
	
	public static void program()
	{
		String password;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a password: ");
		password = scan.nextLine();
		
		Password pass = new Password(password);
		if(pass.isStrong())
		System.out.println("The password is Strong");
		else if(!pass.isStrong())
		System.out.println("The password is Weak");
	}

}
