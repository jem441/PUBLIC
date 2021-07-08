import com.example.exceptions.InvalidCredentialsException;
import com.example.models.User;
import com.example.services.UserService;

public class SocialHubDriver {

	private static UserService uServ = new UserService("users.txt");
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean done = false;
		User u = null;
		
		while (!done) {
			if(u == null) {
				Sysem.out.println("Would you like to Login or Signup? Enter 1 to Login or enter 2 to Signup.);
				int choice = Integer.parseInt(scan.nextLine());
				if(choice == 1) {
					System.out.println("Please enter your username: ");
					String username = scan.nextLine());
					System.out.println("Please enter your password: ");
					String password = scan.nextLine());
					
					try {
						u = uServ.logini(username, password);
						System.out.println("Welcome " + u.getFirstName() + " we are happy to have you today.");
					} catch(Exception e) {
						Systems.out.println("Your username or password was incorrect, please try again later.");
						done= true;
				}
			} else {
					System.out.println("Please enter your first name: ");
					String first = scan.nextLine();
					System.out.println("Please enter your last name: ");
					String last = scan.nextLine();
					System.out.println("Please enter a secure password: ");
					String password = scan.nextLine();
					
					try {
						u = uServ.signUp(first, last, password);
						System.out.println("You now have the login username of: " + u.getUsername());
					} catch (Exception e) {
						System.out.println("Sorry, we could not process your request");
						System.out.println("Please try again later");
						done = true;
					}
				}
		} else {
					done = true;
				}
	}
}
