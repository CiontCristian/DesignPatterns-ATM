package strategy;

import model.Transaction;
import singleton.Logger;

public class StrategyEuro implements Strategy{

    @Override
    public void execute(Transaction transaction) {
        if(transaction.getCurrency().equals("RON")){
            transaction.setSold((int) (transaction.getSold() / 4.98));
        }
        else{
            transaction.setSold((int) (transaction.getSold() / 1.18));
        }
        transaction.setCurrency("EURO");

        System.out.println(transaction.getHolder() + " changed the currency to euro");
        Logger.log(transaction.getHolder() + " changed the currency to euro");
    }
}
