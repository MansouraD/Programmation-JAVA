public class Distance {

	public static void main(String[] args) {
		Scanner donnee = new Scanner(System.in);
		System.out.println("Merci de saisir l'abcisse du point A :");
		float X1 = donnee.nextFloat();
		System.out.println("Merci de saisir l'ordonnee du point A :");
		float Y1 = donnee.nextFloat();
		System.out.println("Merci de saisir l'abcisse du point B :");
		float X2 = donnee.nextFloat();
		System.out.println("Merci de saisir l'ordonnee du point B :");
		float Y2 = donnee.nextFloat();
		float D = (float) Math.sqrt(X1-X2)*2+(Y1-Y2)*2;
		System.out.println("La distance entre les points A et B est de : " + D);
		
	}

}
