import java.util.Scanner;
import Collection.*;
import UserDatabase.*;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		users user1 = new users("JohnSmith", "erf234");
		users user2 = new users("RJReynolds", "rtw212");
		users user3 = new users("PaulJohnson", "gdw321");
		users user4 = new users("MikePaterson", "fqt231");
		
		
		System.out.println("Please enter your username");
		Scanner usernameInput = new Scanner(System.in);
		String userInput = usernameInput.nextLine();
		System.out.println("Please enter your password");
		Scanner passwordInput = new Scanner(System.in);
		String passInput = passwordInput.nextLine();
	
		if (userInput.equals(user1.username)&&passInput.equals(user1.password)) {
			System.out.println("Success.");
		}
			
		else if (userInput.equals(user2.username)&&passInput.equals(user2.password)) {
				System.out.println("Success.");
			}
			
		else if (userInput.equals(user3.username)&&passInput.equals(user3.password)) {
					System.out.println("Success.");
				}
			
		else if (userInput.equals(user4.username)&&passInput.equals(user4.password)) {
							System.out.println("Success.");
					}
					else {
						System.out.println("Error.");
						System.exit(0);
					}

					
		
		System.out.println("Please enter the genre of a book. The available genres are fiction and non-fiction.");
		Scanner genreInput = new Scanner(System.in);
		String input = genreInput.nextLine();
		String fiction = "fiction";
		String nonfiction = "non-fiction";
		if (input.equals(fiction)) {
			bookscollection bookA = new bookscollection("Harry Potter", "JK Rowling", "Fiction");
			System.out.println(bookA.toString());
			bookscollection bookB = new bookscollection("The Great Gatsby", "Scott Fitzgerald", "Fiction");
			System.out.println(bookB.toString());
			bookscollection bookC = new bookscollection("To Kill a Mockingbird", "Harper Lee", "Fiction");
			System.out.println(bookC.toString());
		}
		else  if(input.equals(nonfiction)) {
			bookscollection bookD = new bookscollection("7 Habits of Highly Effective People", "Stephen Covey", "Non-fiction");
			System.out.println(bookD.toString());
			bookscollection bookE = new bookscollection("Unsolved", "James Paterson", "Non-fiction");
			System.out.println(bookE.toString());
			bookscollection bookF = new bookscollection("Outliers", "Malcom Gladwell", "Non-fiction");
			System.out.println(bookF.toString());
		}
		else {
			System.out.println("Error.");
			System.exit(0);
		}
				
		
		System.out.println("Please enter the library you would like to pick up the book from. The available locations are LibraryA and LibraryB");;
		Scanner selectInput = new Scanner(System.in);
		String inputB = selectInput.nextLine();
		String LibraryA = "LibraryA";
		String LibraryB = "LibraryB";
		if (inputB.equals(LibraryA)) {
			System.out.println("Harry Potter: 2 Copies Available\nThe Great Gatsby: 5 Copies Available\nUnsolved: 1 Copy Available\nOutliers: 4 Copies Available" );		
			
			System.out.println("Please enter the title of the book you are interested in");
			Scanner bookChoice = new Scanner(System.in);
			String inputC = bookChoice.nextLine();
			System.out.println("You have selected " + inputC + " at " + inputB);
			System.out.println("Thank you for using our system!");
		
		}else if(inputB.equals(LibraryB)) {
			System.out.println("The Great Gatsby: 3 Copies Available\nTo kill a MockingBird: 4 Copies Available\n7 Habits of Highly Effective People: 6 Copies Available\nUnsolved: 2 Copies Available\nOutliers: 5 Copies Available");
		
			System.out.println("Please enter the title of the book you are interested in");
			Scanner bookChoice = new Scanner(System.in);
			String inputC = bookChoice.nextLine();
			System.out.println("You have selected " + inputC + " at " + inputB);
			System.out.println("Thank you for using our system!");	
				
		}
		else {
			System.out.println("Error.");
	
		}
		
	
		
		}
	
	}
	
