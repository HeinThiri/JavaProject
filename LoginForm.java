import java.util.Scanner;

public class LoginForm {

	public static void main(String[] args) {
		String username = "Admin";
		String password = "123";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		String inputUsername = sc.next();
		System.out.print("Ente password: ");
		String inputPassword = sc.next();

		boolean temp = false;
		while(temp != true) {
			if(username.equals(inputUsername) && password.equals(inputPassword)) {
				System.out.println();
				System.out.println("--------------------------------------");
				System.out.println("===>>       Login Successful!    <<===");
				System.out.println("--------------------------------------");
				
				temp = true;
				/// Scanner close ///
				sc.close();
				
			}else {
				System.out.println();
				System.out.println("--------------------------------------");
				System.out.println("xxx>>           Try Again!       <<xxx");
				System.out.println("--------------------------------------");
				temp = false;
				
				System.out.println();
				System.out.print("Enter username: ");
				inputUsername = sc.next();
				System.out.print("Ente password: ");
				inputPassword = sc.next();
			}
		}
	}

}
