package command;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    private final Map<String, Command> commands = new HashMap<>();

    public View(){
        commands.put("0", new ExitCommand("0", "Exit"));
        commands.put("1", new AtmActionsCommand("1", "Perform an ATM operation"));
        commands.put("2", new ChangeCurrencyCommand("2", "Change account currency"));
    }

    private void printMenu(){
        commands.forEach(
                (s, command) -> System.out.println(s + " " + command.getAction())
        );
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            System.out.println("Input the option: ");
            String key = scanner.nextLine();
            Command com = commands.get(key);
            if (com == null){
                System.out.println("Invalid Option");
                continue;
            }
            try {
                com.execute();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
