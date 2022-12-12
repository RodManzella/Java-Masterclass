package SwitchStatement;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        
        
    }

    public static boolean isLeapYear(int year){
        boolean isLeap = false;
        if(year >= 1 && year <= 9999){
            if(year % 400 == 0){
                isLeap = true;
            }
        }
        return isLeap;
    }

    public static int getDaysInMonth(int month, int year){
        int daysInMonth;
        boolean leapYear = isLeapYear(year);

        if(month < 1 || month > 12){
            daysInMonth = -1;
        }
        else if(daysInMonth){
            
        }
    }


}
