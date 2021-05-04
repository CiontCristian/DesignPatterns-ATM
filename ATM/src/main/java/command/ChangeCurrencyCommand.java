package command;

import strategy.Context;
import strategy.StrategyDollar;
import strategy.StrategyEuro;
import strategy.StrategyRon;

import java.util.Scanner;

public class ChangeCurrencyCommand extends Command{
    public ChangeCurrencyCommand(String key, String action) {
        super(key, action);
    }

    private void printMenu(){
        System.out.println("Available currencies: EUR, RON, DOLLAR");
    }

    @Override
    public void execute() {
        printMenu();
        Scanner scanner = new Scanner(System.in);
        String currency = scanner.nextLine();
        Context context = new Context();
        try{
            switch (currency) {
                case "EUR":
                    context.setStrategy(new StrategyEuro());
                    break;
                case "DOLLAR":
                    context.setStrategy(new StrategyDollar());
                    break;
                case "RON":
                    context.setStrategy(new StrategyRon());
                    break;
                case "EXIT":
                    return;
                default:
                    throw new RuntimeException("Invalid Currency!");
            }
            context.convert();
        }catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }
    }
}
