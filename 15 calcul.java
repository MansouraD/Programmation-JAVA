public class calcul {

	public static void main(String[] args ) {
		Scanner donnee = new Scanner(System.in); 
		System.out.println("Merci d'entrer un nombre : ");
		int N = donnee.nextInt();
		int S = 0; float M=0;
		for(int i=1; i<=N; i++) {
			S=S+i;}
		System.out.println("La somme de 1 à "+N+" est de : "+S);
		for(int i=1; i<=N; i++) {
				M =S/N;}
		System.out.println("La moyenne de 1 à "+N+" est de : "+ M);
		
		
	

	}

}
