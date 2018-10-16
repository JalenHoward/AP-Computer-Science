import java.util.Scanner;
public class Program {
	
		public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double BePrepared;
		double NextBest;
		System.out.print(" Number of Copies of Be Prepared - ");
		BePrepared = key.nextInt();
		System.out.print("Number of Copies of Next Best - ");
		NextBest = key.nextInt();
		
		if (BePrepared + NextBest >= 12) {
			
			double c;
			c = BePrepared + NextBest;
			double d = c*14.00;
			System.out.println("Total - $"+d );
			
			
		}
		
		else if (BePrepared + NextBest >= 3) {
			double c;
			c = BePrepared + NextBest;
			double d = c*15.95;
			System.out.println("Total - $"+d );
		}
		else if (BePrepared + NextBest == 2) {
			
			if (BePrepared == 1 && NextBest == 1) {
				System.out.println("Total - $37.95");
			}
			else if (BePrepared == 2 && NextBest == 0) {
				double c;
				double e = BePrepared*18.95;
				System.out.println("Total - $"+e );
			}
			else if (BePrepared == 0 && NextBest == 2) {
				double c;
				double e = NextBest*21.95;
				System.out.println("Total - $"+e );
			}
		
		}
		else if (BePrepared == 1 && NextBest == 0) {
			System.out.println("Total - $18.95");
		}
		else {
			System.out.println("Total - $21.95");
		}
		

	}
}