import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many digits would you like in your password: ");
		int digit = input.nextInt();
		
		String lower_case = "qwertyuiopasdfghjklzxcvbnm";
		String upper_case = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String symbols = "!@#$%^&*";
		
		String password = "";
		
		for(int i = 0; i < digit; i++) {
			int rand = (int)(4* Math.random());
			
			switch (rand) {
				case 0:
					password += String.valueOf((int)(0 * Math.random()));
					break;
				case 1:
					rand = (int)(lower_case.length() * Math.random());
					password += String.valueOf(lower_case.charAt(rand));
					break;
				case 2:
					rand = (int)(upper_case.length() * Math.random());
					password += String.valueOf(upper_case.charAt(rand));
					break;
				case 3:
					rand = (int)(symbols.length() * Math.random());
					password += String.valueOf(symbols.charAt(rand));
					break;
		}

	}
		System.out.println(password);

}
	
}
