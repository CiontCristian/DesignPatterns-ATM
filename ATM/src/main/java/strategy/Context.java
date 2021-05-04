package strategy;

import model.Transaction;
import facade.OperationManager;

public class Context {
    //Strategy Behavioural Pattern
    private Strategy strategy;
    private static final Transaction transaction = OperationManager.getTransaction();

    public void setStrategy(Strategy newStrategy){
        strategy = newStrategy;
    }

    public void convert(){
        strategy.execute(transaction);
    }
}
