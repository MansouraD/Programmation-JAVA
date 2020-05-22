public class Nombre_Secret {

	public static void main(String[] args) {
		Scanner donnee = new Scanner(System.in); 
		System.out.println("Joueur 1 : Merci d'entrer un nombre entier");
		int u1 = donnee.nextInt();
		System.out.println("Joueur 2 : quel nombre entier le joueur 1 a t-il entrer?");
		int u2 = donnee.nextInt();
	
		while (u1!=u2) {
			   if(u1>u2) {
				System.out.println("Trop petit!");}
			   else {
				System.out.println("Trop grand!");}
				int k = donnee.nextInt(); u2=k;
		}
	}

}
