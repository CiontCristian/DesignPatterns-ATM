package facade;

import model.Transaction;

public interface Operation {
    void execute(Transaction transaction, Integer amount);
}
