public class puissance1 {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);  
		System.out.println("Merci d'entrer un réel : ");
		float N = entree.nextFloat();
		System.out.println("Merci d'entrer un entier : ");
		int X = entree.nextInt();
		float P = (float) Math.pow(N, X); 
		System.out.println( N + " à la puissance " + X + " = " + P);
	}

}
