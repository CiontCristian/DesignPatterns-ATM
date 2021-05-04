package facade;

import model.Transaction;
import singleton.Logger;

public class Retrieve implements Operation{
    @Override
    public void execute(Transaction transaction, Integer amount) {
        transaction.setSold(transaction.getSold() - amount);
        System.out.println(transaction.getHolder() + " retrieved "+ amount + transaction.getCurrency());
        Logger.log(transaction.getHolder() + " retrieved "+ amount + transaction.getCurrency());
    }
}
