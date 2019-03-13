import java.util.Scanner;

public class UnicodeCalculator {
	public static void main(String args[]) {

		char c = 'a';
		int a = 0;
		int str1Int = 0;
		int str2Int = 0;
		String str1, str2;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter First String: ");
		str1 = scan.nextLine();
		System.out.print("Enter Second String: ");
		str2 = scan.nextLine();
		
		for (int i = 0; i < str1.length(); i++) {
			c = str1.charAt(i);
			a = (int) c;
			str1Int += a;
			System.out.println(c + ": " + a);
		}
		for (int i = 0; i < str2.length(); i++) {
			c = str2.charAt(i);
			a = (int) c;
			str2Int += a;
			System.out.println(c + ": " + a);
		}
		System.out.println("Difference (as absolute value): " + Math.abs(str1Int-str2Int));

		scan.close();
	}

}