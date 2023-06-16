public class EnumPrac1{
    public enum Days_of_weeks {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THRUSDAY,
        FRIDAY,
        SATURDAY
    }
    public static void main(String args[]){
        Days_of_weeks today = Days_of_weeks.MONDAY;
        System.out.println("Today is "+ today);
    }
}