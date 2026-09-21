package ledgerPackage;

public class Income extends Transaction{
    public Income(double amount, String description, String category, String date) {
        super(amount, description, category, date);
    }

    @Override
    public String getType() { return "Income"; }

    @Override
    public double getSignedAmount() {
        return getAmount();
    }
}


