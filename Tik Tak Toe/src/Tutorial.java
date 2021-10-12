import java.util.Scanner;

public class Tutorial {
	
	public void tutorial() {
		Display dis = new Display();
		Scanner sc = new Scanner(System.in);
		System.out.println("TUTORIAL");
		System.out.println("========\n");
		System.out.println("\t  Column");
		System.out.println("\t     |");
		System.out.println("\t     v");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("   ");
				if(i==0 && j==2) {
					System.out.print("  <-- Row");
				}
				if(j!=2) {
					System.out.print(" | ");
				}
			}

			if(i!=2) {
				System.out.println("\n----|-----|----");				
			}
		}
		System.out.println("\n\nEnter the Position: HINT(Row, Column)");
		System.out.println("1,2\n");
		int[][] a = new int[3][3];
		a[0][1]=1;
		dis.display(a);
		sc.close();
	}

}
