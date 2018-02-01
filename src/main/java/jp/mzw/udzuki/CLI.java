package jp.mzw.udzuki;

import jp.mzw.udzuki.command.HelpCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Command Line Interface
 *
 * @author Yuta Maezawa
 */
public class CLI {

    /** Logger */
    private static final Logger LOGGER = LoggerFactory.getLogger(CLI.class);

    /**
     * Main method for instantiating Udzuki
     *
     * @param args is arguments to instantiate Udzuki
     */
    public static void main(String[] args) {
        if (args.length < 1) { // illegal usage
            new HelpCommand().run();
            return;
        }

        String command = args[0];
        LOGGER.info("Start: {}", command);
        if ("".equals(command)) {

        } else {
            new HelpCommand().run(Arrays.copyOfRange(args, 1, args.length));
        }
        LOGGER.info("Finished: {}", command);
    }

}
