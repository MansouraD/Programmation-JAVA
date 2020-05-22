public class PPCM {

	public static void main(String[] args) {
		Scanner donnee = new Scanner(System.in); 
		System.out.println("Merci d'entrer deux nombres entiers :");
		int A = donnee.nextInt(); int B = donnee.nextInt();
		int x = A; int y = B;
		while (A!=B) {
			if (A>B) {A=A-B;}
			else {B=B-A;}
			}
		int ppcm = (x*y)/A;
		System.out.println("Le PPCM est de : "+ppcm);

		
	}

}
