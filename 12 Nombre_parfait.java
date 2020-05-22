public class Nombre_Parfait {

	public static void main(String[] args) {
		Scanner donnee = new Scanner(System.in); 
		System.out.println("Merci d'entrer un nombre");
		int N = donnee.nextInt();
		int S=0;
		for (int i=1; i<=N/2; i++) {
			int R=N%i; 
				if (R==0) {
					S=S+i;}}
				
		if (S==N) {System.out.println(N + " est un nombre parfait");}
		else { System.out.println(N + " n'est pas un nombre parfait");}			
	}

}
