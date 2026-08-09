public class leap_year {

    String year (int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
             return "Leap year";
        }
        else{
            return "Not a leap year";
        }
    }
    public static void main(String[] args) {
        leap_year yr = new leap_year();
        System.out.println(yr.year(2024));
    }
}