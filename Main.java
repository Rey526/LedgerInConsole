package ledgerPackage;

import java.util.Scanner;

public class Main {
    private static Expense promptForExpense(Scanner scanner) {
        System.out.print("Enter amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        System.out.println("date example: 2026-09-15");
        System.out.print("Enter date: ");
        String date = scanner.nextLine();

        return new Expense(amount, description, category, date);
    }

    private static Income promptForIncome(Scanner scanner) {
        System.out.print("Enter amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        System.out.println("date example: 2026-09-15");
        System.out.print("Enter date: ");
        String date = scanner.nextLine();

        return new Income(amount,description,category,date);
    }

    static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker(100);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // TODO: print the menu options
            System.out.println("1. Add Expense");
            System.out.println("2. Add Income");
            System.out.println("3. List All Transactions");
            System.out.println("4. View Net Total");
            System.out.println("5. View Total by Category");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // TODO: figure out why this line is needed (hint: nextInt() vs nextLine())

            switch (choice) {
                case 1:
                    // TODO: prompt for amount, description, category, date
                    Expense expense = promptForExpense(scanner);
                    tracker.add(expense);
                    break;
                case 2:
                    // TODO: same as above but create an Income
                    Income income = promptForIncome(scanner);
                    tracker.add(income);
                    break;
                case 3:
                    tracker.listAll();
                    break;
                case 4:
                    // TODO: print tracker.getMonthlyTotal()
                    System.out.println(tracker.getMonthlyTotal());
                    break;
                case 5:
                    // TODO: prompt for a category string, print tracker.getTotalByCategory(category)
                    System.out.print("Enter Category: ");
                    String byCategory = scanner.nextLine();
                    System.out.println(tracker.getTotalByCategory(byCategory));
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }

        scanner.close();

    }
}
