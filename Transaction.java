package ledgerPackage;

public abstract class Transaction {
    private double amount;
    private String description;
    private String category;
    private String date; // keep it simple: "2026-09-15" as a String for now

    public Transaction(double amount, String description, String category, String date) {
        this.amount = amount;
        this.description = description;
        this.category = category;
        this.date = date;
    }

    // getters for all fields — write these yourself
    public double getAmount(){
        return amount;
    }

    public String getDescription(){
        return description;
    }

    public String getCategory(){
        return category;
    }

    public String getDate(){
        return date;
    }

    public abstract String getType(); // "Expense" or "Income"
    public abstract double getSignedAmount(); // Expense: negative, Income: positive

    @Override
    public String toString() {
        //format like "[Expense] Food - 250.0 (2026-09-15)"
        return String.format("[%s] %s - %.2f (%s)",getType(),getCategory(),getAmount(),getDate());
    }
}
