import javax.swing.JOptionPane;

public class ChooseYourStory {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "There is a new family in your town, little do they know they are living in a haunted house.");
	
int FirstDay = JOptionPane.showOptionDialog(null, "It is the first day of...", "First Day", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] {"School", "Robotics", "Soccer" }, null);

if (FirstDay == 0) {
	JOptionPane.showMessageDialog(null, "It is the first day of school, the new kid Daniel is in your advisory.");
	JOptionPane.showMessageDialog(null, "Later that day, Daniel invites you along with some other friends to his house. When you get to his house, Daniel's mom opens the door, 'Hi, you must be Jack, come inside, Daniel will be down in a moment.'");
	int Noise = JOptionPane.showOptionDialog(null, "While you are waiting, you hear an eerie noise from the room across the hall", "Noise", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] {"Open the door", "Pretend like you didn't hear anything", "Tell Daniel's mom" }, null);
	if (Noise == 0) {
		JOptionPane.showMessageDialog(null, "BAT'S FLY OUT OF THE DOOR.");
		JOptionPane.showMessageDialog(null, "A large figures stabs you, your body has never been found.");
	
	}
	else if (Noise == 1) {
		JOptionPane.showMessageDialog(null, "Someone grabs you from behind when you are not looking, your body has never been found.");
	}
	else if (Noise == 2) {
		JOptionPane.showMessageDialog(null, "You cannot find Daniel or his mom.");
		JOptionPane.showMessageDialog(null, "Suddenly, someone grabs you from behind when you are not looking, your body has never been found.");
	}
}
else if (FirstDay == 1) {
	JOptionPane.showMessageDialog(null, "it is the first day of Robotics camp, the new kid Daniel is also doing it.");
	JOptionPane.showMessageDialog(null, "Later that day, Daniel invites you along with some other friends to his house. When you get to his house, Daniel's mom opens the door, 'Hi, you must be Jack, come inside, Daniel will be down in a moment.'");
	int Noise = JOptionPane.showOptionDialog(null, "While you are waiting, you hear an eerie noise from the room across the hall", "Noise", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] {"Open the door", "Pretend like you didn't hear anything", "Tell Daniel's mom" }, null);
	if (Noise == 0) {
		JOptionPane.showMessageDialog(null, "BAT'S FLY OUT OF THE DOOR.");
		JOptionPane.showMessageDialog(null, "A large figures stabs you, your body has never been found.");
	}
	else if (Noise == 1) {
		JOptionPane.showMessageDialog(null, "Someone grabs you from behind when you are not looking, your body has never been found.");
	}
	else if (Noise == 2) {
		JOptionPane.showMessageDialog(null, "You cannot find Daniel or his mom.");
		JOptionPane.showMessageDialog(null, "Suddenly, someone grabs you from behind when you are not looking, your body has never been found.");
	}
}
else if (FirstDay == 2) {
	JOptionPane.showMessageDialog(null, "It is the first day of soccer practice, the new kid Daniel is also at practice.");
	JOptionPane.showMessageDialog(null, "Later that day, Daniel invites you along with some other friends to his house. When you get to his house, Daniel's mom opens the door, 'Hi, you must be Jack, come inside, Daniel will be down in a moment.'");
	int Noise = JOptionPane.showOptionDialog(null, "While you are waiting, you hear an eerie noise from the room across the hall", "Noise", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] {"Open the door", "Pretend like you didn't hear anything", "Tell Daniel's mom" }, null);
	if (Noise == 0) {
		JOptionPane.showMessageDialog(null, "BAT'S FLY OUT OF THE DOOR.");
		JOptionPane.showMessageDialog(null, "A large figures stabs you, your body has never been found.");
	}
	else if (Noise == 1) {
		JOptionPane.showMessageDialog(null, "Someone grabs you from behind when you are not looking, your body has never been found.");
	}
	else if (Noise == 2) {
		JOptionPane.showMessageDialog(null, "You cannot find Daniel or his mom.");
		JOptionPane.showMessageDialog(null, "Suddenly, someone grabs you from behind when you are not looking, your body has never been found.");
	}
}

}
}