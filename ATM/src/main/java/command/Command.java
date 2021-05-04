package command;

import lombok.Data;

@Data
public abstract class Command {
    //Command Behavioural Pattern
    private String key;
    private String action;

    public Command(String key, String action) {
        this.key = key;
        this.action = action;
    }

    public abstract void execute();
}
