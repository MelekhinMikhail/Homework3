public class Task7 {
    public static void main(String[] args) {
        int total = 7000;
        int firstPlan = total / 250;
        int secondPlan = total / 500;
        int thirdPlan = (total / ((250 + 500) / 2)) + 1;
        System.out.println(firstPlan);
        System.out.println(secondPlan);
        System.out.println(thirdPlan);
    }
}
