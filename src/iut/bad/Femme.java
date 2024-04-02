package iut.bad;

public class Femme extends Humain{
    	public Femme(String nom, String prenom, int age) {
    		super(nom,prenom,age);
    	}
	
	//@Override
    	//public String toString() {
        //	return "Femme: " + super.toString();
    	//}

	public static void main(String[] args) {
        	Homme homme = new Homme("Alexander", "Stewart", 28);
        	Femme femme = new Femme("Anne", "Marie", 27);

        	// Déclarer que l'un est ami de l'autre
        	femme.ami(homme);
    	}

}