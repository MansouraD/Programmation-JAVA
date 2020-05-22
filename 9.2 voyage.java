public class voyage2 {

	public static void main(String[] args) {
		Scanner donnee = new Scanner(System.in);  
		System.out.println("Entrer l'heure de depart : ");
		int Hd = donnee.nextInt();
		System.out.println("Entrer la minute de depart : ");
		int Md = donnee.nextInt();
		System.out.println("Entrer l'heure d'arrivée : ");
		int Ha = donnee.nextInt();
		System.out.println("Entrer la minute d'arrivée : ");
		int Ma = donnee.nextInt();
		int Hv = (23-Hd+Ha); int Mv = (59-Md+Ma);
		System.out.println("La durée du vol est de : " + Hv + "H et " + Mv + "Min");

	}

}
