import java.util.Scanner;

public class App {

	public static boolean isFull(int[][] a) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}


	public static void main(String[] args) {

		Check ch = new Check();
		Display dis = new Display();
		Tutorial tutrl = new Tutorial();
		Input inp = new Input();
		Update up = new Update();
		Random rad = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("TIC TAC TOE");
		System.out.println("===========");
		System.out.println("");
		int[][] a = new int[3][3];

		tutrl.tutorial();

		System.out.println("\n\nLET'S PLAY");
		System.out.println("==========");

		int x;
		do {
			System.out.println("Choose the mode of play");
			System.out.println("=======================");
			System.out.println("1.Single Player\n2.Multiplayer");
			x = sc.nextInt();
		} while (x != 1 && x != 2);
		sc.nextLine();

		int p = 1;
		while (!isFull(a) && ch.check(a) == 0) {
			int[] i = null;
			do {
				if (x == 2) {
					i = inp.input(p);
				}
				else{
					if (p == 1) {
						i = inp.input(p);
					}
					else {
						i = rad.random();
						if(up.updatePossible(a, i[0], i[1])) {
							System.out.println("\nPlayer O : " +i[0] +"," +i[1]);
						}
					}
				}
			} while (!up.updatePossible(a, i[0], i[1]));
			if (p == 1) {
				a[i[0] - 1][i[1] - 1] = 1;
				p = 2;
			} else {
				a[i[0] - 1][i[1] - 1] = 2;
				p = 1;
			}
			dis.display(a);
		}
		if (ch.check(a) == 1) {
			System.out.println("\nPlayer 1 is the WINNER");
		} else if (ch.check(a) == 2) {
			System.out.println("\nPlayer 2 is the WINNER");
		} else {
			System.out.println("\nMATCH DRAW");
		}
		sc.close();
	}

}
