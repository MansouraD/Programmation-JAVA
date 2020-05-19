public class Division {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);  
		System.out.println("Merci d'entrer la valeur de a : ");
		int a = entree.nextInt();
		System.out.println("Merci d'entrer la valeur de b : ");
		int b = entree.nextInt();
		int quotient = a/b;
		int reste = a%b;
		float ratio = (float)a/(float)b;
		System.out.println("Le quotient est : " + quotient);
		System.out.println("Le reste est : " + reste);
		System.out.println("Le quotient est : " + ratio);
	}

}
