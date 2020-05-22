public class Division_Successive {

	public static void main(String[] args) {
		Scanner donnee = new Scanner(System.in); 
		System.out.println("Merci d'entrer le dividende suivi du diviseur :");
		int D = donnee.nextInt(); int Di = donnee.nextInt();
		int i =0;
		while(D>=Di) {i=i+1; D=D-Di; 
		
	    }
		System.out.println("le résultat de la division est : "+i);
	
		
}
}
		
