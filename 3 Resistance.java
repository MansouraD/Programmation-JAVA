public class Resistances {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);  
		System.out.println("Merci d'entrer la résistance R1 : ");
		float R1 = entree.nextFloat();
		System.out.println("Merci d'entrer la résistance R2 : ");
		float R2 = entree.nextFloat();
		System.out.println("Merci d'entrer la résistance R3 : ");
		float R3 = entree.nextFloat();
		float RS = R1+R2+R3;
		float RP = (R1*R2*R3)/(R1*R2+R2*R3+R1*R3);
		System.out.println("La résistance en série est de : " + RS);
		System.out.println("La résistance parralèle est de : " + RP);
	}

}
