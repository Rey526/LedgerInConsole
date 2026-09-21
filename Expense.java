package ledgerPackage;

public class Expense extends Transaction{
    public Expense(double amount, String description, String category, String date) {
        super(amount, description, category, date);
    }

    @Override
    public String getType() { return "Expense"; }

    @Override
    public double getSignedAmount() {
        return -getAmount();
    }
}
