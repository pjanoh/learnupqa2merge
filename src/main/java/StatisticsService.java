public class StatisticsService {

    public int sum(int[] salaries) {
        int sum = 0;
        for (int salary : salaries) {
            sum += salary;
        }
        return sum;
    }

    public int max(String[] texts) {       // "24 5 6 77"
        int max = 0;

        for (String text : texts) { // "24 5 6 77"
            String[] parts = text.split(" ");   // ["24", "5", "6", "77"]
            for (String part : parts) {
                int x = Integer.parseInt(part); // "24" -> 24
                if (x > max) {
                    max = x;
                }
            }
        }

        return max;
    }
}
