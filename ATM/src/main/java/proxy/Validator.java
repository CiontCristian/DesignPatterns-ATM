package proxy;

public interface Validator {
    void validateRetrievalOperation(Integer amount);
    void validateDepositOperation(Integer amount);
    void validateVisualizationOperation();
}
