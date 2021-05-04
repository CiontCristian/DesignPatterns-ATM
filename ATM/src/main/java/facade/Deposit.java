package facade;

import model.Transaction;
import singleton.Logger;

public class Deposit implements Operation{
    @Override
    public void execute(Transaction transaction, Integer amount) {
        transaction.setSold(transaction.getSold() + amount);
        System.out.println(transaction.getHolder() + " deposited "+ amount + transaction.getCurrency());
        Logger.log(transaction.getHolder() + " deposited "+ amount + transaction.getCurrency());
    }
}
