package seedu.modtracker;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Main entry-point for the java.seedu.modtracker application.
 */
public class ModTracker {
    private Ui ui;
    private ModuleList modList;
    private Storage storage;

    public static void main(String[] args) {
        new ModTracker().run();
    }

    public ModTracker() {
        ui = new Ui();
        modList = new ModuleList();
        storage = new Storage("data/modtracker.txt");
    }

    /**
     * Runs the program until termination.
     */
    public void run() {
        String name = startAndGetName();
        loadData();
        runCommandLoopUntilExitCommand(name);
    }

    /**
     * Starts the program, prints the welcome message and name-enter prompt.
     *
     * @return name of user
     */
    public String startAndGetName() {
        ui.printWelcomeScreen();
        return ui.printNamePrompt();
    }

    /**
     * Reads the user command until the user enters the exit command and terminates the program.
     *
     * @param name name of user
     */
    public void runCommandLoopUntilExitCommand(String name) {
        Parser parser = new Parser();
        while (!parser.isExit()) {
            String input = ui.readCommand();
            parser.parse(input, modList, name, storage, false);
        }
    }

    private void loadData() {
        try {
            Parser parser = new Parser();
            Scanner reader = storage.getReader();
            while (reader.hasNext()) {
                String input = reader.nextLine();
                parser.parse(input, modList, "", storage, true);
            }
        } catch (FileNotFoundException e) {
            ui.printErrorMessage(e.getMessage());
        }
    }

}
