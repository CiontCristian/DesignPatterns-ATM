package strategy;

import model.Transaction;
import singleton.Logger;

public class StrategyRon implements Strategy{
    @Override
    public void execute(Transaction transaction) {
        if(transaction.getCurrency().equals("EUR")){
            transaction.setSold((int) (transaction.getSold() * 4.98));
        }
        else{
            transaction.setSold((int) (transaction.getSold() * 4.18));
        }
        transaction.setCurrency("RON");
        System.out.println(transaction.getHolder() + " changed the currency to ron");
        Logger.log(transaction.getHolder() + " changed the currency to ron");
    }
}
