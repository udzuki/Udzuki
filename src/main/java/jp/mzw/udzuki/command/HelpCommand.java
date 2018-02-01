package jp.mzw.udzuki.command;

public class HelpCommand implements ICommand {

    public String getCommandName() {
        return "help";
    }

    public void run(final String... args) {
        System.out.println("$ java -jar -cp=<class-path> jp.mzw.udzuki.CLI <comment> <arguments...>");
    }

}
