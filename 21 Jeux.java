public class Jeux {

	public static void main(String[] args) {
		Scanner donnee = new Scanner(System.in); 
		System.out.println("Joueur 1 : Merci d'entrer un nombre entier");
		int u1 = donnee.nextInt();
		System.out.println("Joueur 2 : quel nombre entier le joueur 1 a t-il entrer?");
		int u2 = donnee.nextInt();
		int i = 1 ; 
	
		while (u1!=u2) {
			   if(u1>u2) {
				System.out.println("Trop petit! Retentez votre chance :");}
			   else {
				System.out.println("Trop grand! Retentez votre chance :");}
				int k = donnee.nextInt(); u2=k; i=i+1;
		}
		System.out.println("Vous avez trouvé! le score est de "+i);
		

}}
