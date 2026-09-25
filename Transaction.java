package ledgerPackage;

public abstract class Transaction {
    private double amount;
    private String description;
    private String category;
    private String date; 

    public Transaction(double amount, String description, String category, String date) {
        this.amount = amount;
        this.description = description;
        this.category = category;
        this.date = date;
    }

  
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

    public abstract String getType();
    public abstract double getSignedAmount();

    @Override
    public String toString() {
        return String.format("[%s] %s - %.2f (%s)",getType(),getCategory(),getAmount(),getDate());
    }
}
