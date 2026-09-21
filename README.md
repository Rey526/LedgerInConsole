# LedgerInConsole

A console-based expense tracker built in Java, using an object-oriented design with polymorphism to calculate net totals — expenses and income are separate classes 
that each know how to contribute to the balance, so the tracking logic never needs to check which type it's dealing with.

## Features
- Add expense or income transactions (amount, description, category, date)
- List all transactions
- View net total (income minus expenses)
- View total by category

## How it's built
- `Transaction` — abstract base class holding shared fields (amount, description, category, date)
- `Expense` / `Income` — subclasses that override `getSignedAmount()` to return the amount as negative or positive, so totals can be summed without any if/else type-checking
- `ExpenseTracker` — manager class storing transactions in an array, with methods to add, list, and aggregate
- `Main` — Scanner-driven console menu for interacting with the tracker

## How to run
1. Clone the repo
2. Compile: `javac src/ledgerPackage/*.java -d out`
3. Run: `java -cp out ledgerPackage.Main`

## Future Improvements
- Replace the `Transaction[]` array with an `ArrayList<Transaction>` to remove the fixed-capacity limit
- Add input validation (currently invalid input like non-numeric amounts will crash the program)
- Persist data with a database (e.g. MySQL) instead of losing all transactions on exit
- Rebuild as a web app (Spring Boot backend + simple frontend) to support multiple users and remote access
- Add user accounts, so each user has their own set of transactions
