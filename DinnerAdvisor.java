public class DinnerAdvisor {

    void getAdvice(double moneyBeforeSalary, int daysBeforeSalary) {
        if (moneyBeforeSalary < 3000) {
            System.out.println("Today it's better to eat at home. Save money, and you'll make it to payday!");
        } else if (moneyBeforeSalary < 10000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Okay, it's time to go to McDonald's!");
            } else {
                System.out.println("Today it's better to eat at home. Save money, and you'll make it to payday!");
            }
        } else if (moneyBeforeSalary < 30000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Not bad! Buy some dollars and go have dinner at a nice place. :)");
            } else {
                System.out.println("Okay, it's time to go to McDonald's!");
            }
        } else {
            if (daysBeforeSalary < 10) {
                System.out.println("Great! Order some crabs!");
            } else {
                System.out.println("Not bad! Buy some dollars and go have dinner at a nice place. :)");
            }
        }
    }
}
