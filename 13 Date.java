public class Date {

	public static void main(String[] args) {
		Scanner donnee = new Scanner(System.in); 
		System.out.println("Merci d'entrer une date : Le jour, le mois, puis l'année.");
		int J = donnee.nextInt();
		int M = donnee.nextInt();
		int N = donnee.nextInt();
		if ((N>=1000)&&(N<9999)) {
			if((J<=31)&&((M==1)||(M==3)||(M==5)||(M==7)||(M==8)||(M==10)||(M==12))) {
				System.out.println(J+"/"+M+ "/" +N+" est une date valide");}
			else if ((J<=30)&&((M==4)||(M==6)||(M==9)||(M==11))) {
				System.out.println(J+"/"+M+ "/" +N+" est une date valide");}
			else if ((J<=29)&&(M==2)) {System.out.println(J+"/"+M+ "/" +N+" est une date valide");}
			}
		else {{System.out.println(J+"/"+M+ "/" +N+" n'est pas une date valide");}
		}
		}
	}
