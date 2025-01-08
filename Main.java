import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you have left until your salary?");
        double moneyBeforeSalary = scanner.nextDouble();
        System.out.println("How many days until your salary?");
        int daysBeforeSalary = scanner.nextInt();
        
        Converter converter = new Converter(78.5, 88.7, 0.75);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
        ExpensesManager expensesManager = new ExpensesManager();
        
        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Your savings: " + moneyBeforeSalary + " RUB");
                System.out.println("Which currency do you want to convert to? Available options: 1 - USD, 2 - EUR, 3 - JPY.");
                int currency = scanner.nextInt();
                converter.convert(moneyBeforeSalary, currency);
            } else if (command == 2) {
                dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
            } else if (command == 3) {
                System.out.println("For which day do you want to enter an expense: 1-Monday, 2-Tuesday, 3-Wednesday, 4-Thursday, 5-Friday, 6-Saturday, 7-Sunday?");
                int day = scanner.nextInt();
                System.out.println("Enter the amount of the expense:");
                double expense = scanner.nextDouble();
                
                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, expense, day);
            } else if (command == 4) {
                expensesManager.printAllExpenses();
            } else if (command == 5) {
                System.out.println("The largest amount of expenses this week was " + expensesManager.findMaxExpense() + " RUB.");
            } else if (command == 0) {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Sorry, that command is not available yet.");
            }
        }
    }
    
    public static void printMenu() {
        System.out.println("What would you like to do? ");
        System.out.println("1 - Convert currency");
        System.out.println("2 - Get advice");
        System.out.println("3 - Enter an expense");
        System.out.println("4 - Show expenses for the week");
        System.out.println("5 - Show the largest amount of expenses for the week");
        System.out.println("0 - Exit");
    }
}
