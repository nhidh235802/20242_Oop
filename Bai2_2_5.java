import javax.swing.JOptionPane;
public class Bai2_2_5 {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "Ket qua:\n";
        strNum1 = JOptionPane.showInputDialog(null,
        "Please input the first numbers: ",
        "Input the first number: ",
        JOptionPane.QUESTION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null,
        "Please inut the second number: ",
        "Input the second number: ",
        JOptionPane.QUESTION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = 0;
        
        strNotification += "Tong hai so: " + sum + "\n"
                        + "Hieu hai so: " + difference + "\n"
                        + "Tich hai so: " + product + "\n";
        if (num2 ==0) {
            strNotification += "Khong the chia cho 0.";
        }else {
            quotient = num1 / num2;
            strNotification += "Thuong hai so: " + quotient + "\n";
        }

        JOptionPane.showMessageDialog(null, strNotification,
        "Show result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}