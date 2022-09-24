public class Task5 {
    public static void main(String[] args) {
        byte totalJars = 120;
        byte whiteJarsOnOneClass = 2;
        byte brownJarsOnOneClass = 4;
        int totalJarsOnOneClass = whiteJarsOnOneClass + brownJarsOnOneClass;
        int totalWhiteJars = (totalJars / totalJarsOnOneClass) * whiteJarsOnOneClass;
        int totalBrownJars = (totalJars / totalJarsOnOneClass) * brownJarsOnOneClass;
        System.out.println("Для ремонта школы было куплено " + totalWhiteJars + " банок белой краски и " + totalBrownJars + " банок коричневой краски.");
    }
}
