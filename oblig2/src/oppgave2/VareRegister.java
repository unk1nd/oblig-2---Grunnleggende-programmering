package oppgave2;
import java.text.DecimalFormat;


public class VareRegister {
   

	public static void main(String[] args)
    {
		
		// runde av til 2 desimaler
        DecimalFormat valuta = new DecimalFormat("#0.00");
        
        // varer
        Vare vare1, vare2, vare3;
        vare1 = new Vare("Melk", "L" ,8.90,3);
        vare2 = new Vare("Egg","stk",1.50,6);
        vare3 = new Vare("Bacon","kg",59.0,1);
        
        // legge sammen totalsummen
        double vare1sum = (vare1.hentvpris()*vare1.hentvAntall());
        double vare2sum = (vare2.hentvpris()*vare2.hentvAntall());
        double vare3sum = (vare3.hentvpris()*vare3.hentvAntall());
        double total = (vare1sum + vare2sum + vare3sum);
        
        // Pynt til utskrift i console
        String info = "\tProdukt\t\tAntall\t\tEnhet\t\tPris\t\tSum";
        String header = "                  \t\t          Rema 1000                                  \n";
        String pynt = "_____________________________________________________________________________________";
        String topp = pynt + "\n" + header + pynt + "\n" + info + "\n" + pynt + "\n" ;
        
        // Printer varene ut til console
        System.out.println(topp);
        System.out.println(vare1);
        System.out.println(vare2);
        System.out.println(vare3);
        System.out.println(pynt);
        System.out.println("\t\t\t\t\t\t\t\tTotal:\t" + valuta.format(total) + ",-");
        System.out.println(pynt);

       
        // Leser inn 3 nye vareverdier
        vare1.vareInn();
        vare2.vareInn();
        vare3.vareInn();
        
        // Regner totalsummen summen av 3 nye varer 
        vare1sum = (vare1.hentvpris()*vare1.hentvAntall());
        vare2sum = (vare2.hentvpris()*vare2.hentvAntall());
        vare3sum = (vare3.hentvpris()*vare3.hentvAntall());
        total = (vare1sum + vare2sum + vare3sum);
        
        // Printer toString ut til console
        System.out.println(topp);
    	System.out.println(vare1.toString());
    	System.out.println(vare2.toString());
    	System.out.println(vare3.toString());
    	System.out.println(pynt);
    	System.out.println("\t\t\t\t\t\t\t\tTotal:\t" + valuta.format(total) + ",-");
    	System.out.println(pynt);
        
    }
}

