package ledgerPackage;

public class ExpenseTracker {
    private Transaction[] transactions;
    private int count;

    public ExpenseTracker(int capacity) {
        transactions = new Transaction[capacity];
        count = 0;
    }

    public void add(Transaction t) {

       transactions[count] = t;
       count++;

    }

    public void listAll() {

        for(int i = 0; i < count; i++){
            System.out.println(transactions[i]);
        }
    }

    public double getMonthlyTotal() {
        double totalNet = 0;
        for (int i = 0; i < count; i++){
            totalNet += transactions[i].getSignedAmount();
        }
        return totalNet;
    }

    public double getTotalByCategory(String category) {
        double total = 0;
        for(int i = 0; i < count; i++){
            if (transactions[i].getCategory().equals(category)){
                total += transactions[i].getSignedAmount();
            }
        }
        return total;
    }
}
