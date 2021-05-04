package facade;

import model.Transaction;
import singleton.Logger;

public class Visualize implements Operation{
    @Override
    public void execute(Transaction transaction, Integer amount) {
        System.out.println(transaction.getHolder() + " has a current sold of "+ transaction.getSold() + transaction.getCurrency());
        Logger.log(transaction.getHolder() + " has a current sold of "+ transaction.getSold() + transaction.getCurrency());
    }
}
