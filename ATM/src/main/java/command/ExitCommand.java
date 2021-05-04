package command;

public class ExitCommand extends Command{

    public ExitCommand(String key, String action) {
        super(key, action);
    }

    @Override
    public void execute() {
        System.out.println(getAction());
        System.exit(0);
    }
}
