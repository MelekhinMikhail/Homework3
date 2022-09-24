public class Task3 {
    public static void main(String[] args) {
        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        short totalLists = 480;
        int onePersonList = totalLists / (ludmila + anna + ekaterina);
        System.out.println("На каждого ученика расчитано " + onePersonList + " листов бумаги");
    }
}
