public class somme {

	public static void main(String[] args) {
		Scanner donnee = new Scanner(System.in);
		int Somme = 0;
		System.out.println("Merci de saisir 5 nombres entiers : ");
		for (int i=1; i<=5; i++) {
		int Valeur = donnee.nextInt();
		Somme = Somme + Valeur; 
		}
		System.out.println("la somme est nombres est de : " + Somme); 
	}
}
