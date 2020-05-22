public class PGCD {

	public static void main(String[] args) {
		Scanner donnee = new Scanner(System.in); 
		System.out.println("Merci d'entrer deux nombres entiers :");
		int A = donnee.nextInt(); int B = donnee.nextInt();
		while (A!=B) {
			if (A>B) {A=A-B;}
			else {B=B-A;}
			}
		System.out.println("Le PGCD est de : "+A);

	}

}
