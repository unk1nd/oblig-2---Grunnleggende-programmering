package oppgave1;




public class Resultat
{
    public static void main(String [] args)
    {
    	
    	
        Student student1 = new Student ("Mia");
        Student student2 = new Student ("Fredrik");
    
        
        student1.resultatInn();
        System.out.println(student1.toString() + "\n");
        
        student2.resultatInn();
        System.out.println(student2.toString() + "\n");
        
        
        
    }
}
