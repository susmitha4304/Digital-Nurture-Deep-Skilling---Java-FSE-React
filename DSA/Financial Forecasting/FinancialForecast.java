public class FinancialForecast {

    public static double predictFutureValue(double currentValue,
                                            double growthRate,
                                            int years) {

        // Base case
        if (years == 0) {
            return currentValue;
        }

        // Recursive case
        return predictFutureValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1
        );
    }

    public static void main(String[] args) {

        double presentValue = 10000;
        double growthRate = 0.08; // 8%
        int years = 5;

        double futureValue =
                predictFutureValue(presentValue, growthRate, years);

        System.out.printf(
                "Predicted Future Value after %d years: %.2f",
                years, futureValue
        );
    }
}
