public class ClassAverage {

 // Version 3: array of scores
    public static double calculateClassAverage(double[] scores) {
        double sum = 0;

        for (double s : scores) {
            sum += s;
        }

        return sum / scores.length;
    }
}
