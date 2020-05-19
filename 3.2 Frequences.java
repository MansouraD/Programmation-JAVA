public class frequeces {

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
		System.out.println("Merci d'entrer 1 si vous voulez la résistance en série et 2 si vous voulez la résistance en parralèle : ");
		int i = entree.nextInt();
			if (i==1) {
				System.out.println("La résistance en série est de : " + RS);
			}
			if (i==2) { 
				System.out.println("La résistance parralèle est de : " + RP);
			}
			while (i!=1 & i!=2) {
				System.out.println("Merci d'entrer 1 si vous voulez la résistance en série et 2 si vous voulez la résistance en parralèle : ");
				int i1 = entree.nextInt();
					if (i1==1) {
						System.out.println("La résistance en série est de : " + RS);
					}
					if (i1==2) { 
						System.out.println("La résistance parralèle est de : " + RP);	
					}
			}
		
	}

}
