package jp.mzw.udzuki;

/**
 * Command Line Interface
 *
 * @author Yuta Maezawa
 */
public class CLI {

    /**
     * Main method for instantiating Udzuki
     *
     * @param args is arguments to instantiate Udzuki
     */
    public static void main(String[] args) {
        if (args.length < 1) { // illegal usage
            help();
            return;
        }

    }

    /**
     * Show usage
     */
    private static void help() {
        System.out.println("$ java -jar -cp=<class-path> jp.mzw.udzuki.CLI <comment> <arguments...>");
    }

}
