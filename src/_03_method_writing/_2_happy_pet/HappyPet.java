package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {

	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLvel=0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet=JOptionPane.showInputDialog("What kind of pet would you like to buy?A dog or cat or fish");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!

		// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
		//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
		//    Make sure to customize the title and question too.
		while(happinessLvel<11   ) {
			int task = JOptionPane.showOptionDialog(null, "Would you like to do with your pet", "Pet care", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed your pet", "Take your pet for a walk","don't do anything" }, null);
			System.out.println(task);

			// 6. Use user input to call the appropriate method created in step 5 below.
			if(task==0){
				feedPet(pet);
			}
			if(task==1) {
				walkPet(pet);
			}
			if(task==2) {
				doNothing(pet);
			}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			


			// 5. Create methods to handle each of your user selections.
			//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
			//    and INCREMENT the pet's happiness Level.
			//	
		}
		JOptionPane.showMessageDialog(null,"You broke the happiness level,you love your pet!!");
	}

	static void feedPet(String petType) {
		JOptionPane.showMessageDialog(null,"You have earned 2/10 points for your pet's happiness level");
		happinessLvel=happinessLvel+2;
		if(petType.equals("cat")) {
			JOptionPane.showMessageDialog(null,"Your cat purrs when you feem him/her");
		}
		if(petType.equals("dog")) {
			JOptionPane.showMessageDialog(null,"Your dog stops barking when fed");
		}
		if(petType.equals("fish")) {
			JOptionPane.showMessageDialog(null,"Your fish blows bubbles when fed");
		}
	}
	static void walkPet(String PetType) {
		JOptionPane.showMessageDialog(null,"You have earned 3/10 points for your pet's happiness level");
		happinessLvel=happinessLvel+3;
		if(PetType.equals("dog")) {
			JOptionPane.showMessageDialog(null,"Your dog smiles when walked");
		}
		if(PetType.equals("cat")) {
			JOptionPane.showMessageDialog(null,"Your cat meows when walked");
		}
		if(PetType.equals("fish")) {
			JOptionPane.showMessageDialog(null,"Your fish stays still when you carry their tank while walking" );
		}
	}
	static void doNothing(String y) {
		JOptionPane.showMessageDialog(null,"You have lost 2 points for your pet's happiness level");
		happinessLvel=happinessLvel-2;
		if(y.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your cat hides when you do nothing");
		}
		if(y.equals("dog")) {
			JOptionPane.showMessageDialog(null,"Your dog barks when you do nothing");
		}
		if(y.equals("fish")) {
			JOptionPane.showMessageDialog(null,"Your fish plays dead when you do nothing");
		}
	}






}