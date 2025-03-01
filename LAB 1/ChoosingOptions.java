import javax.swing.JOptionPane;

public class ChoosingOptions{
    public static void main(String[] args) {
        String[] options = {"I do", "I don't"};
        int option = JOptionPane.showOptionDialog(null, "Do you want to change the first class ticket?"
        , "Confirm", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
        null, options, options[0]);
        JOptionPane.showMessageDialog(null, "You 've choosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}