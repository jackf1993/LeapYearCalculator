import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Year to check if it is a leap year: ");
        int year = in.nextInt();
        System.out.print("Enter Month number to check how any days it has at that year: ");
        int month = in.nextInt();
        int day = 0;
        boolean validYear = isLeapYear(year);

        if(validYear) {
            day = numOfDaysInMonth(month, year);
            System.out.println(year + " is a leap year," + " and month "
                    + month + " has " + day + " days.");
        }
        if(!validYear){
            day = numOfDaysInMonth(month, year);
            System.out.println(year + " is NOT leap year," + " and month "
                    + month + " has " + day + " days.");
        }
    }

    public static boolean isLeapYear(int year){
        if(year <1 || year > 9999){
            System.out.println("Use range of 1-9999");
            return false;
        }
        if((year % 4 == 0 && year % 100 !=0) || year % 400 ==0){
            return true;
        }
        return false;
    }

    public static int numOfDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year <1 || year > 9999) {
            System.out.println("Enter valid month (1-12) or year (1-9999)");
            return -1;
        }
        if(isLeapYear(year)) {
            switch (month) {
                case 1:
                    return 31;
                case 2:
                    return 29;
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 29;
                case 7:
                    return 31;
                case 8:
                    return 30;
                case 9:
                    return 31;
                case 10:
                    return 29;
                case 11:
                    return 31;
                case 12:
                    return 30;
                default:
                    break;
            }
        }
        else{
            switch (month) {
                case 1:
                    return 31;
                case 2:
                    return 28;
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 29;
                case 7:
                    return 31;
                case 8:
                    return 30;
                case 9:
                    return 31;
                case 10:
                    return 29;
                case 11:
                    return 31;
                case 12:
                    return 30;
                default:
                    break;
            }
        }
        return -1;
    }
}
