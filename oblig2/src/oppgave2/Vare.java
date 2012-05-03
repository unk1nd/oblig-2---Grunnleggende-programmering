package oppgave2;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Vare {

	private String vNavn , vEnhet;
	private double vPris;
	private int vAntall;
	
	public Vare(String varenavn, String vareenhet, double varepris, int vareantall)
    {
		vNavn = varenavn;
		vEnhet = vareenhet;
		vPris = varepris;
		vAntall = vareantall;
    }

	// hent navn
	public String hentvNavn()
	{
		return vNavn;
	}
	
	// hent enhet
	public String hentvEnhet()
	{
		return vEnhet;
	}
    
	// hent pris
	public Double hentvpris()
	{
		return vPris;
	}
	
	// hent Antall
	public double hentvAntall()
	{
		return vAntall;
	}
	
	// oppgradere navn
	public void settNavn(String nyttNavn)
	{
		vNavn = nyttNavn;
	}

	// oppgradere enhet
	public void settEnhet(String nyEnhet)
	{
		vEnhet = nyEnhet;
	}
   
	// oppgradere pris
	public void settPris(double nyPris)
	{
		vPris = nyPris;
	}
   
	// oppgradere antall
	public void settAntall(int nyAntall)
	{
		vAntall = nyAntall;
	}
   
	public void vareInn()
	{
		// S¿keren for tastetrykk 
		Scanner scan = new Scanner (System.in);
		String pynt = "________________________\n";
		
		// Sp¿ring
		System.out.println("\nHva heter den nye varen?");
		vNavn = scan.nextLine();
		System.out.println("Hvordan enhet har " + vNavn + "?");
		vEnhet = scan.nextLine();
		System.out.println("Hvor mange " + vEnhet + " skal du ha?");
		vAntall = scan.nextInt();
		System.out.println("Pris per " + vEnhet + " (eks 2.90)?");
		vPris = scan.nextDouble();
		System.out.println("\n"+ pynt +"-- Vare " + vNavn + " lagt til --\n" + pynt);
		
	}
	
	// toString utskriften 
    public String toString()
    {
    	// runde av til 2 desimaler
    	DecimalFormat valuta = new DecimalFormat("#0.00");
    	
    	// legger sammen pris og antall
    	double leggsammen = (vPris*vAntall);
    	
    	// print ut resultatet
    	String resultat = "\t" + vNavn + "\t\t x " + vAntall + "\t\tper " + vEnhet  + "\t\t" + valuta.format(vPris) +",-" + "\n\t\t\t\t\t\t\t\t\t" + valuta.format(leggsammen) ;
    	return resultat;
    }
}
