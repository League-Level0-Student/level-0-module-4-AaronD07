import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String grade = JOptionPane.showInputDialog("What was your test score?");
	double score = Double.parseDouble(grade);
	if (score>90.0) {
		JOptionPane.showMessageDialog(null, "Wow, you must have studied really hard!");
		
	}
	if (score<90.0) {
		JOptionPane.showMessageDialog(null, "That's sad. :(");
	}
}
}
