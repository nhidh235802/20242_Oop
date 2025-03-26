import javax.swing.JOptionPane;
//test git
public class Bai2_2_6 {
    public static void main(String[] args) {
        String[] options = {"PT bac nhat 1 an", "PT bac nhat 2 an", "PT bac hai 1 an"};
        int choice = JOptionPane.showOptionDialog(null, "Chon loai PT can giai:", "Lua chon", 
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        options, options[0]);

        switch (choice) {
            case 0:
                Gptbac11an();
                break;
            case 1:
                Gptbac12an();
                break;
            case 2:
                Gptbac21an();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Lua chon khong hop le.\n");
        }

        System.exit(0);
    }

    private static void Gptbac11an(){
        String strA = JOptionPane.showInputDialog(null,
        "Nhap he so a: ",
        "Nhap he so cua x", JOptionPane.INFORMATION_MESSAGE);
        String strB = JOptionPane.showInputDialog(null,
        "Nhap he so b: ",
        "Nhap he so tu do", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);

        if(a != 0) {
            double x = -b/a;
            JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem: x = " + x);
        } else {
            if(b != 0) {
                JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem\n");
            } else {
                JOptionPane.showMessageDialog(null, "Phuong trinh vo so nghiem\n");
            }
        }
    }

    private static void Gptbac12an(){
        String strA11 = JOptionPane.showInputDialog("Enter a11:");
        String strA12 = JOptionPane.showInputDialog("Enter a12:");
        String strA21 = JOptionPane.showInputDialog("Enter a21:");
        String strA22 = JOptionPane.showInputDialog("Enter a22:");
        String strB1 = JOptionPane.showInputDialog("Enter b1:");
        String strB2 = JOptionPane.showInputDialog("Enter b2:");

        double a11 = Double.parseDouble(strA11);
        double a12 = Double.parseDouble(strA12);
        double a21 = Double.parseDouble(strA21);
        double a22 = Double.parseDouble(strA22);
        double b1 = Double.parseDouble(strB1);
        double b2 = Double.parseDouble(strB2);

        double D = a11 * a22 - a12 * a21;
        if (D != 0) {
            double x1 = (b1 * a22 - b2 * a12) / D;
            double x2 = (a11 * b2 - a21 * b1) / D;
            JOptionPane.showMessageDialog(null, "Unique solution: x1 = " + x1 + ", x2 = " + x2);
        } else {
            if (a11 * b2 == a12 * b1 && a21 * b2 == a22 * b1) {
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solution.");
            }
        }
    }

    private static void Gptbac21an(){
        String strA = JOptionPane.showInputDialog(null,
        "Nhap he so a: ",
        "Nhap he so cua x^2", JOptionPane.INFORMATION_MESSAGE);
        String strB = JOptionPane.showInputDialog(null,
        "Nhap he so b: ",
        "Nhap he so cua x", JOptionPane.INFORMATION_MESSAGE);
        String strC = JOptionPane.showInputDialog(null,
        "Nhap he so c: ",
        "Nhap he so tu do", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);

        if(a == 0) {
            JOptionPane.showMessageDialog(null, "Day khong phai phuong trinh bac hai\n");
        } else {
            double delta = b*b - 4*a*c;

            if(delta < 0){
                JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem.\n");
            } else {
                if(delta == 0) {
                    double x = -b/ (2*a);
                    JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem kep: x = " + x);
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2*a);
                    double x2 = (-b - Math.sqrt(delta)) / (2*a);
                    JOptionPane.showMessageDialog(null, "Phuong trinh co hai nghiem phan biet:\n"
                    + "x1 = " + x1 + "\n"
                    + "x2 = " + x2 + "\n");
                }
            }
        }
    }
}