public class FinancialForecasting {
    public static double predictFutureValue(double currentValue,
                                            double growthRate,
                                            int years) {

       
        if (years == 0) {
            return currentValue;
        }

        return predictFutureValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1
        );
    }

    public static void main(String[] args) {

        double presentValue = 10000.0;
        double growthRate = 0.10; // 10%
        int years = 5;

        double futureValue = predictFutureValue(
                presentValue,
                growthRate,
                years
        );

        System.out.println("Financial Forecasting");
        System.out.println("---------------------");
        System.out.println("Present Value : ₹" + presentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.printf("Future Value  : ₹%.2f%n", futureValue);

        System.out.println("\nTime Complexity : O(n)");
        System.out.println("Space Complexity: O(n)");
    }
}
