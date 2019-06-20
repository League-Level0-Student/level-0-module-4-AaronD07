import javax.swing.JOptionPane;

public class HappyPet {
	static boolean hasPlayedCatch = false;
	static boolean hasEaten = false;
	static boolean isGroomed = false;
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	static int happinessLevel = 0;
	static // this will be used to store the happiness of your pet
	String pet;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
pet = JOptionPane.showInputDialog("What pet would you like to buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int x=0; happinessLevel<11; x++) {
			
		
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy

			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Task", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Play Catch", "Feed", "Groom" }, null);
			if (task == 0) {
				Catch1();
			}
			else if (task == 1) {
				Feed1();
				
			}
			else if (task == 2) {
				groom1();
				
			}
		}
	}
		
			static // 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	void Catch1() {
		
		if (hasPlayedCatch) {
			JOptionPane.showMessageDialog(null, "Your "+ pet +" is tired");
		happinessLevel = happinessLevel-1;
	}
		else {
			JOptionPane.showMessageDialog(null, "Your " + pet + " had a good time");
			happinessLevel = happinessLevel+3;
			hasPlayedCatch = true;
		}
		}
	

	static void Feed1() {
		if (hasEaten) {
		JOptionPane.showMessageDialog(null, "Your " + pet + " is full");
		happinessLevel =happinessLevel -1;
		
	}
		else {
			JOptionPane.showMessageDialog(null, "Your "+ pet + " is starving");
			happinessLevel =happinessLevel +2;
			hasEaten = true;
		}
	}
	
	static void groom1() {
		if (isGroomed) {
		JOptionPane.showMessageDialog(null, "Your " + pet + "'s hair is perfect");
		happinessLevel = happinessLevel -1;
	}
		else {
			JOptionPane.showMessageDialog(null, "Get A Hair Stylist!");
			happinessLevel = happinessLevel +5;
		isGroomed = true;
		}
		
				
	}
}
	
