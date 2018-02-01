package jp.mzw.udzuki.command;

public interface ICommand {

    /**
     * Get command name
     *
     * @return identifier of this command
     */
    String getCommandName();

    /**
     * Run corresponding process
     *
     * @param args are arguments for this command
     */
    void run(final String... args);

}
