import java.util.Scanner;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		int firstPage, secondPage, thirdPage;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
		System.out
		.println("You are in a creepy house! Would you like to go \"kitchen\" or into the \"upstairs\"?");
		System.out.print("Choose 1 for kitchen and 2 for upstairs:");

		// first page reading
		firstPage = keyboard.nextInt();


		//first scenario
		// first page---> if kitchen
		if (firstPage == 1) {
			System.out
			.print("There is a long countertop with dirty dishes everywhere. ");
			System.out
			.print("Off to one side there is, as you'd expect, a refrigerator. ");
			System.out
			.println("You may open the \"refrigerator\" or look in a \"cabinet\".");
			System.out.print("Choose 1 for refrigerator and 2 for cabinet:");

			// second page reading
			secondPage = keyboard.nextInt();

			// second page---> if refrigerator
			if (secondPage == 1) {
				System.out
				.print("Inside the refrigerator you see food and stuff. It looks pretty nasty. ");
				System.out.println("Would you like to eat some of the food?");
				System.out.print("Choose 1 for \"yes\" and 2 for \"no\"");

				// third page reading
				thirdPage = keyboard.nextInt();

				// if yes
				if (thirdPage == 1) {
					System.out.println("Bon apetite!");

					// if no
				} else if (thirdPage == 2) {
					System.out.println("You die of starvation... eventually.");
				}else{
					System.out.println("You entered an invalid choice.");
				}

				//second page---> if cabinet
			} else if (secondPage == 2) {

				System.out
				.print("Inside the cabinet you see cloths and stuff. It looks there are some fancy dresses. ");
				System.out.println("Would you like to take alook at them?");
				System.out.print("Choose 1 for \"yes\" and 2 for \"no\"");

				// third page reading
				thirdPage = keyboard.nextInt();

				// if yes
				if (thirdPage == 1) {
					System.out.println("Here you go!");

					// if no
				} else if (thirdPage == 2) {
					System.out
					.println("Well, then I guess you'll never know what was in there.");
				}else{
					System.out.println("You entered an invalid choice.");
				}
			}else{
				System.out.println("You entered an invalid choice.");
			}

			//second scenario
			//first page---> if upstairs
		} else if (firstPage == 2) {

			System.out
			.print("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\". ");
			System.out
			.println("There is also a \"bathroom\" off the hallway. Where would you like to go?");
			System.out.print("Choose 1 for bedroom and 2 for bathroom:");

			// second page reading
			secondPage = keyboard.nextInt();

			// second page---> if bedroom
			if (secondPage == 1) {
				System.out
				.print("You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. ");
				System.out
				.println("In the back of the room, the closet door is ajar. Would you like to open the door?");
				System.out.print("Choose 1 for \"yes\" and 2 for \"no\"");

				// third page reading
				thirdPage = keyboard.nextInt();

				//third page---> if yes
				if (thirdPage == 1) {
					System.out.println("Well, please come in!");

					//third page---> if no
				} else if (thirdPage == 2) {
					System.out
					.println("Well, then I guess you'll never know what was in there.");
				}else{
					System.out.println("You entered an invalid choice.");
				}

				//second page---> if bathroom
			} else if (secondPage == 2) {

				System.out
				.print("Inside the bathroom there is a shower and a jacuzzi. ");
				System.out.println("Would you like to take a look at them?");
				System.out.print("Choose 1 for \"yes\" and 2 for \"no\"");

				// third page reading
				thirdPage = keyboard.nextInt();

				//third page---> if yes
				if (thirdPage == 1) {
					System.out.println("Here you go!");

					//third page---> if no
				} else if (thirdPage == 2) {
					System.out
					.println("Well, then I guess you'll never know what was in there.");
				}else{
					System.out.println("You entered an invalid choice.");
				}

			}else{
				System.out.println("You entered an invalid choice.");
			}

		}else{
			System.out.println("You entered an invalid choice.");
		}



		System.out
		.println("Thanks for playing, I'm tired of making nested if statements.");
		keyboard.close();
	}
}
