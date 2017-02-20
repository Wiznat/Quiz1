import java.util.Scanner;
public class passerRating {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("How many passing attempts did the player have?");
		double ATT = scan.nextInt();
		System.out.println("How many passes did the player complete?");
		double COMP = scan.nextDouble();
		System.out.println("How many passing yards did the player have?");
		double YDS = scan.nextDouble();
		System.out.println("How many touchdown passes did the player have?");
		double TD = scan.nextInt();
		System.out.println("How many interceptions did the player throw?");
		double INT = scan.nextInt();
		
		double a = ((COMP/ATT) - 0.3) * 5.0 ;
		if (a > 2.375){
			a = 2.375;
		}
		if (a < 0){
			a = 0;
		}
		
		double b = ((YDS/ATT)-3.0) *.25;
		if(b > 2.375){
			b = 2.375;
		}
		if(b < 0){
			b = 0;
		}
		
		double c = (TD/ATT) *20.0 ;
		if(c > 2.375){
			c = 2.375;
		}
		if(c < 0){
			c = 0;
		}
		
		double d = 2.375 -((INT/ATT) *25.0);
		if(d < 0){
			d = 0;
		}
		
		double score = ((a + b + c + d)/6.0) * 100.0;
		System.out.printf("The Qb's passer rating is %.1f",score);
	}

	

}
