import java.util.Scanner;

public class Input {

	public int[] input(int player) {

		Scanner sc = new Scanner(System.in);
		String s;
		String[] p;
		int[] a = new int[2];
		do {
			if (player == 1) {
				System.out.print("\nPlayer X : ");
			} else {
				System.out.print("\nPlayer O : ");
			}
			s = sc.nextLine();
			p = s.split(",");
			if (p.length == 2) {
				a[0] = Integer.parseInt(p[0]);
				a[1] = Integer.parseInt(p[1]);
			}
		} while (p.length != 2 || !((a[0] > 0 && a[0] < 4) && (a[1] > 0 && a[1] < 4)));
		sc.close();
		return a;
	}

}
