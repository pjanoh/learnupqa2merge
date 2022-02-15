public class StatisticsService {

    public int sum(int[] salaries) {
        int sum = 0;
        for (int salary : salaries) {
            sum += salary;
        }
        return sum;
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
