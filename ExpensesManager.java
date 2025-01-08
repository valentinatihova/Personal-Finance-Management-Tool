public class ExpensesManager {
    double[] expenses;

    ExpensesManager() {
        expenses = new double[7];
    }

    public double saveExpense(double moneyBeforeSalary, double expense, int day) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses[day - 1] = expenses[day - 1] + expense;
        System.out.println("Value saved! Your current balance in rubles: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("You have very little left in your account. You should start saving!");
        }
        return moneyBeforeSalary;
    }

    public void printAllExpenses() {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("Day " + (i + 1) + ". Spent " + expenses[i] + " rubles");
        }
    }

    public double findMaxExpense() {
        double maxExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        return maxExpense;
    }
}