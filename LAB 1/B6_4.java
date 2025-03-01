import java.util.Scanner;

public class B6_4 {
    
    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    private static int getDaysInMonth(String monthInput, int year) {
        int month = 0;

        switch (monthInput) {
            case "January": case "Jan": case "Jan.": case "1": month = 1; break;
            case "February": case "Feb": case "Feb.": case "2": month = 2; break;
            case "March": case "Mar": case "Mar.": case "3": month = 3; break;
            case "April": case "Apr": case "Apr.": case "4": month = 4; break;
            case "May": case "May." : case "5": month = 5; break;
            case "June": case "Jun": case "Jun.": case "6": month = 6; break;
            case "July": case "Jul": case "Jul.": case "7": month = 7; break;
            case "August": case "Aug": case "Aug.": case "8": month = 8; break;
            case "September": case "Sep": case "Sep.": case "9": month = 9; break;
            case "October": case "Oct": case "Oct.": case "10": month = 10; break;
            case "November": case "Nov": case "Nov.": case "11": month = 11; break;
            case "December": case "Dec": case "Dec.": case "12": month = 12; break;
            default: return -1; 
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year;

        while(true){
        System.out.print("Nhap thang: ");
        monthInput = scanner.nextLine().trim();

        System.out.print("Nhap nam: ");
        year = scanner.nextInt();
        scanner.nextLine(); 

        int days = getDaysInMonth(monthInput, year);
        if (days == -1) {
            System.out.println("Nhap sai.");
        } else {
            System.out.println("So ngay: " + days);
            break;
        }
    }
    }
}
