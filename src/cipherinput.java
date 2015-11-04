import java.util.Scanner;
public class cipherinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input text to encrypt");
		String input = sc.nextLine().toUpperCase();
		System.out.println(input);
		String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int length = input.length();
		String output = "";
		int location = 0;
		System.out.println("Enter movement amount");
		int adjust = sc.nextInt();
		for(int i=1; i<=length; i++){
			char temp = input.charAt(i - 1);
			location = code.indexOf(temp) + 2;
			output = code.substring(location + adjust - 1, location + adjust);
			System.out.print(output);
			//test of git pls ignore
			
			
			
		}
	}

}
