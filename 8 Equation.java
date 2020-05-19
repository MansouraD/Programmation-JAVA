public class equation {

	public static void main(String[] args) {
		Scanner donnee = new Scanner(System.in);
		System.out.println("Merci de saisir la valeur de a :");
		float A = donnee.nextFloat();
		System.out.println("Merci de saisir la valeur de b :");
		float B = donnee.nextFloat();
		System.out.println("Merci de saisir la valeur de c :");
		float C = donnee.nextFloat();
		float D = (B*B)-(4*A*C);
		if (D==0) { float x0 = -B/(2*A); 
			System.out.println("La solution est : " + x0);}
		if(D>0) { float x1 = -B-(float)Math.sqrt(D)/(2*A);  
				 float	x2 = -B+(float)Math.sqrt(D)/(2*A);
				 System.out.println("La solution est : " + x1 + " et " + x2); }
		if (D<0) { System.out.println(" Pas de solution ");}
		
		
		}
		
}
