public class prix {

	public static void main(String[] args) {
		Scanner donnee = new Scanner(System.in); 
		int S = 0; int l = 1;
		System.out.println("Merci d'entrer les prix des l'articles");
		while(l!=0) {
			int p = donnee.nextInt(); l=p;
			S=S+p; }
		System.out.println("La somme est de : "+S);

	}

}
