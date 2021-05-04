package strategy;

import model.Transaction;
import singleton.Logger;

public class StrategyDollar implements Strategy{
    @Override
    public void execute(Transaction transaction) {
        if(transaction.getCurrency().equals("RON")){
            transaction.setSold((int) (transaction.getSold() * 4.18));
        }
        else{
            transaction.setSold((int) (transaction.getSold() * 1.18));
        }
        transaction.setCurrency("DOLLAR");

        System.out.println(transaction.getHolder() + " changed the currency to dollar");
        Logger.log(transaction.getHolder() + " changed the currency to dollar");
    }
}
