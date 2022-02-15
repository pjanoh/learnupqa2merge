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

    public int maxGap(int[] temps) {
        int maxGap = 0;
        for (int i = 0; i < temps.length - 1; i++) {
            int firstTemp = temps[i];
            int secondTemp = temps[i + 1];
            int gap = Math.abs(firstTemp - secondTemp);
            if (gap > maxGap) {
                maxGap = gap;
            }
        }
        return maxGap;
    }
}
