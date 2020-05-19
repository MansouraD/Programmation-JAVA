public class cercle {

	public static void main(String[] args) {
		Scanner donnee = new Scanner(System.in);
		System.out.println("Merci de saisir le rayon du cercle :");
		float rayon = donnee.nextFloat();
		float Pi = (float) (4*Math.atan(1));
		float surface = rayon*rayon*Pi;
		float perimetre = rayon*Pi*2;
		System.out.println("la surface est de : " + surface);
		System.out.println("le périmétre est de : " + perimetre);
	}

}
