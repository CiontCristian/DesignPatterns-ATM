package command;

import proxy.ProxyOperationValidator;

import java.util.Scanner;

public class AtmActionsCommand extends Command{
    public AtmActionsCommand(String key, String action) {
        super(key, action);
    }

    private void printMenu(){
        System.out.println("1.Visualize sold");
        System.out.println("2.Retrieve sold");
        System.out.println("3.Deposit sold");
        System.out.println("0.Exit");
    }

    @Override
    public void execute() {
        ProxyOperationValidator proxyManager = new ProxyOperationValidator();
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int amount;
        int cmd = scanner.nextInt();
        do{
            switch (cmd){
                case 1:
                    proxyManager.validateVisualizationOperation();
                    break;
                case 2:
                    System.out.println("Amount: ");
                    amount = scanner.nextInt();
                    proxyManager.validateRetrievalOperation(amount);
                    break;
                case 3:
                    System.out.println("Amount: ");
                    amount = scanner.nextInt();
                    proxyManager.validateDepositOperation(amount);
                    break;
                default:
                    return;
            }
            System.out.print("> ");
            cmd = scanner.nextInt();
        } while (cmd != 0);

    }
}
