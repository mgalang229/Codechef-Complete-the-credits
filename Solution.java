import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x = fs.nextInt();
			if (x > 65) {
				System.out.println("Overload");
			} else if (x < 35) {
				System.out.println("Underload");
			} else {
				System.out.println("Normal");
			}
		}
		fs.close();
	}
}
