package proxy;

import model.Transaction;
import facade.OperationManager;
import singleton.Logger;

public class ProxyOperationValidator implements Validator{
    private static final Transaction transaction = OperationManager.getTransaction();
    private final OperationValidator operationValidator = new OperationValidator();


    @Override
    public void validateRetrievalOperation(Integer amount) {
        if(amount > transaction.getSold()){
            System.out.println(transaction.getHolder() + " tried to retrieve more money than the available sold!");
            Logger.log(transaction.getHolder() + " tried to retrieve more money than the available sold!");
            return;
        }

        operationValidator.validateRetrievalOperation(amount);

    }

    @Override
    public void validateDepositOperation(Integer amount) {
        if(amount < 0){
            System.out.println(transaction.getHolder() + " tried to deposit a negative amount of money!");
            Logger.log(transaction.getHolder() + " tried to deposit a negative amount of money!");
            return;
        }

        operationValidator.validateDepositOperation(amount);
    }

    @Override
    public void validateVisualizationOperation() {
        operationValidator.validateVisualizationOperation();
    }
}
