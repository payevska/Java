public class Percentage {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double percentage = 17;
        double moon = percentage * earthWeight / 100;

        return moon;
    }
}