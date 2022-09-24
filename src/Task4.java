public class Task4 {
    public static void main(String[] args) {
        byte productivityPerTwoMinutes = 16;
        int productivityPerOneMinute = productivityPerTwoMinutes / 2;
        int productivityPerTwentyMinutes = 20 * productivityPerOneMinute;
        int productivityPerDay = 1440 * productivityPerOneMinute;
        int productivityPerThreeDays = 4320 * productivityPerOneMinute;
        int productivityPerMonth = 43200 * productivityPerOneMinute;
        System.out.println("За 20 минут машина произвела бутылок: " + productivityPerTwentyMinutes + " штук");
        System.out.println("За сутки машина произвела бутылок: " + productivityPerDay + " штук");
        System.out.println("За 3 дня машина произвела бутылок: " + productivityPerThreeDays + " штук");
        System.out.println("За месяц машина произвела бутылок: " + productivityPerMonth + " штук");
    }
}
