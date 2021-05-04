package strategy;

import model.Transaction;

public interface Strategy {
    void execute(Transaction transaction);
}
