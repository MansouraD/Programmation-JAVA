public class Annee_bissextile {

	public static void main(String[] args) {
		Scanner donnee = new Scanner(System.in); 
		System.out.println("Merci d'entrer une date : Le jour, le mois, puis l'année.");
		int J = donnee.nextInt();
		int M = donnee.nextInt();
		int N = donnee.nextInt();
		if(((J==29)&&(M==2))||(N%4==0)&&(N%100!=0)&&(N%100==0)) {System.out.println("L'année est bissextile");}
		else {System.out.println("L'année n'est pas bissextile");}
		
		
		
	}

}
