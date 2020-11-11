
import javax.swing.JOptionPane;

public class AddGame
{

    public static void main(String[] args)
    {
        int input;
        input = Integer.parseInt(JOptionPane.showInputDialog("How many addition problems would you like to do? "));
        int numofprobs;
        numofprobs = input;
        int answer;
        int x = 0;
        int correct = 0;

        while (x < numofprobs)
        {
            int num;
            num = (int) (Math.random() * 41 + 10); // numbers ranging from 10-50, inclusive
            
            int num2;
            num2 = (int) (Math.random() * 41 + 10);
            answer = Integer.parseInt(JOptionPane.showInputDialog(num + " + " + num2));
            x++;
            
            if (answer == num + num2)
            {
            	// if the user gets the correct answer
                JOptionPane.showMessageDialog(null, "That's correct! The amount of problems you have correct are: " + correct + " out of " + numofprobs
                );
                correct++; // keeps track of the amount of correctly answered questions
            } else
            {
            	// if user entered the wrong answer, tell them and show them the correct answer
                JOptionPane.showMessageDialog(null, "That's incorrect. \n \nThe correct answer is: " + (num + num2)
                        + "\nThe amount of problems you have correct are: " + correct + " out of " + numofprobs);
            }
            

        }
        JOptionPane.showMessageDialog(null, "Thanks for playing!");
        System.exit(0); // program closes after user has hit okay
    }

}


