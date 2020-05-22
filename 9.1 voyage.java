public class voyage1 {

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
		if (Ma<Md){ int Hv = (Ha-Hd-1); int Mv = (Ma+60-Md);
		System.out.println("La durée du vol est de : " + Hv + "H et " + Mv + "Min");
		}
		else {
			int Hv = (Ha-Hd); int Mv = (Ma-Md); 
			System.out.println("La durée du vol est de : " + Hv + "H et " + Mv + "Min");
			
		}
		
 }
}
