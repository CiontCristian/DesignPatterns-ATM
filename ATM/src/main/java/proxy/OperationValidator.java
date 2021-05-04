package proxy;

import facade.OperationManager;
import singleton.Logger;

public class OperationValidator implements Validator{
    private final OperationManager operationManager = new OperationManager();

    @Override
    public void validateRetrievalOperation(Integer amount) {
        System.out.println("Valid Retrieval Operation");
        Logger.log("Valid Retrieval Operation");
        operationManager.executeRetrieval(amount);
    }

    @Override
    public void validateDepositOperation(Integer amount) {
        System.out.println("Valid Deposit Operation");
        Logger.log("Valid Deposit Operation");
        operationManager.executeDeposit(amount);
    }

    @Override
    public void validateVisualizationOperation() {
        System.out.println("Valid Visualization Operation");
        Logger.log("Valid Visualization Operation");
        operationManager.executeVisualize(null);
    }
}
