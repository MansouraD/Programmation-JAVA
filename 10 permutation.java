public class Permutation {

	public static void main(String[] args) {
		Scanner donnee = new Scanner(System.in); 
		System.out.println("Merci d'entrer Trois nombres ");
		int A = donnee.nextInt();
		int B = donnee.nextInt();
		int C = donnee.nextInt();
		if (A>B) { int N=A; A=B; B=N;}
		if (A>C) {int N=A; A=C; C=N;}
		if (B>C) {int N=B; B=C; C=N;}
		System.out.println( A +" "+ B+ " "+ C);
		
		
	}

}
