package oppgave1;

import java.util.Scanner;

public class Student
{
	
	
	public String navn;
	public int snitt;
	public int test1, test2, test3;
	
	
	
	public Student(String studentnavn)
	{
	   navn = studentnavn;
	   
	}
	
	public void resultatInn()
	{
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Skriv inn " + navn + "s resultat for test 1:");
		test1 = scan.nextInt();
		System.out.println("Skriv inn " + navn + "s resultat for test 2:");
		test2 = scan.nextInt();
		System.out.println("Skriv inn " + navn + "s resultat for test 3:");
		test3 = scan.nextInt();
		
	}
	
	
	public int finnSnitt()
	{ 

		return ((test1 + test2 + test3)/3);
		
	}
	

	public String finnNavn()
	{
		
		return navn;
		
		
	}
	
	public String toString()
	{
		
		return "\nNavn: " + navn + "\tTest 1:\t" + test1 + "\tTest 2:\t" + test2 + "\tTest 3:\t" + test3 + "\tSnitt: " + finnSnitt();
		
	}
	
}

