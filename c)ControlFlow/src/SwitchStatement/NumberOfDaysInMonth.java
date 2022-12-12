package SwitchStatement;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2001));
        
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
        else if(month < 1 || month > 9999){
            daysInMonth = -1;
        }
        else{
            daysInMonth = switch(month){
                case 1 -> 31;
                case 2 -> {
                    if(leapYear){
                        yield 29;
                    }
                    yield 28;
                }
                case 3 -> 31;
                case 4 -> 30;
                case 5 -> 31;
                case 6 -> 30;
                case 7 -> 31;
                case 8 -> 31;
                case 9 -> 30;
                case 10 -> 31;
                case 11 -> 30;
                case 12 -> 31;
                default -> throw new IllegalArgumentException("Unexpected value: " + month);
            };
        }
        return daysInMonth;
    }


}
