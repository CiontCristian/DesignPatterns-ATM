package facade;

import model.Transaction;
import singleton.Logger;

public class OperationManager {
    //Facade Structural Pattern
    public static Transaction transaction;
    private final Operation visualize;
    private final Operation deposit;
    private final Operation retrieve;

    public OperationManager() {
        this.visualize = new Visualize();
        this.deposit = new Deposit();
        this.retrieve = new Retrieve();
    }

    public void executeVisualize(Integer amount){
        visualize.execute(getTransaction(), amount);
        System.out.println("User "+transaction.getHolder() + " performed a sold visualization.");
        Logger.log("User "+transaction.getHolder() + " performed a sold visualization.");
    }

    public void executeDeposit(Integer amount){
        deposit.execute(getTransaction(), amount);
        System.out.println("User "+transaction.getHolder() + " performed a sold deposit.");
        Logger.log("User "+transaction.getHolder() + " performed a sold deposit.");
    }

    public void executeRetrieval(Integer amount){
        retrieve.execute(getTransaction(), amount);
        System.out.println("User "+transaction.getHolder() + " performed a sold retrieval.");
        Logger.log("User "+transaction.getHolder() + " performed a sold retrieval.");
    }

    public static Transaction getTransaction(){
        if(transaction == null){
            transaction = Transaction.builder().holder("Cristi")
            .sold(200)
            .currency("EUR")
            .build();
        }
        return transaction;
    }
}
