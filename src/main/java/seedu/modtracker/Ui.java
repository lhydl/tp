package seedu.modtracker;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Text UI of the program.
 */
public class Ui {
    private static final Scanner in = new Scanner(System.in);
    private static final String INVALID_MODULE = "The module code should have 2 - 3 characters, followed by "
            + "4 digits, followed by an optional character without any spacing.";
    private static final String INVALID_MODULETYPE = ", with the module code having 2 - 3 characters, followed by "
            + "4 digits, followed by an optional character without any spacing.";
    private static final String MODULETYPE_EXAMPLE = "The accepted module code is of the following forms: CG1111, "
            + "CS2113T, GER1000, GES1000T.";
    private static final String ERROR_ADDMOD = "Please type addmod <module code>";
    private static final String ERROR_DELETEMOD = "Please type deletemod <module code>";
    private static final String ERROR_ADDEXP = "Please type addexp <module code> <expected workload>";
    private static final String ERROR_DELETEEXP = "Please type deleteexp <module code>";
    private static final String ERROR_DELETE_TIME = "Please type deletetime <module code> <week number>";
    private static final String ERROR_DELETE_TIME_MISS = "an existing module code";
    private static final String ERROR_WEEK_NUM = "week number as a whole number between 1 and 13.";
    private static final String ERROR_EXP = " with expected workload being a number between 1 and 24 "
            + "with a maximum of 1 decimal place.";
    private static final String ERROR_WEEK = "The week number should be between 1 and 13.";
    private static final String ERROR_ALPHABET_WEEK = "The week input should be a valid positive number.";
    private static final String NO_EXPECTED_WORKLOAD = "There is no input in the expected workload.";
    private static final String NO_ACTUAL_TIME = "There is no input in the actual time.";
    private static final String INVALID_EXP_HOURS = "Please input a number between 1 and 24 for the "
            + "expected workload with a maximum of 1 decimal place.";
    public static final String INVALID_COMMAND = "OOPS!!! I'm sorry, but I don't know what that means :-(";
    public static final String ENTER_HELP = "Enter <help> for a quick view of available commands.";
    public static final String HELP_LIST = "Available Commands:\n"
            + "1. addmod <module code>\n"
            + "   example: addmod CS2113T\n"
            + "2. addexp <module code> <expected workload>\n"
            + "   example: addexp CS2113T 5\n"
            + "3. addtime <module code> <actual time spent> <week number>\n"
            + "   example: addtime CS2113T 2 1\n"
            + "4. list <week number>\n"
            + "   example: list 2\n"
            + "5. deletemod <module code>\n"
            + "   example: deletemod CS2113T\n"
            + "6. deleteexp <module code>\n"
            + "   example: deleteexp CS2113T\n"
            + "7. minustime <module code> <time> <week number>\n"
            + "   example: minustime CS2113T 2 1\n"
            + "8. edittime <module code> <actual time spent> <week number>\n"
            + "   example: edittime CS2113T 8 1\n"
            + "9. deletetime <module code> <week number>\n"
            + "   example: deletetime CS2113T 1\n"
            + "10.analyse <week number>\n"
            + "   example: analyse 1\n"
            + "11.addtask <module code> <task description>\n"
            + "   example: addtask CS2113T revise for exam\n"
            + "12.deletetask <task number>\n"
            + "   example: deletetask 1\n"
            + "13.done <task number>\n"
            + "   example: done 1\n"
            + "14.listtask\n"
            + "15.open\n"
            + "16.exit\n"
            + "17.clear\n"
            + "18.reset\n";
    public static final String LOGO = "|\\\\        /|         |======            ||\n"
            + "||\\\\      / |  __   __|  ||  __  ___ ___ ||    ___   ____\n"
            + "|| \\\\    /  |//  \\//  |  ||//  \\/  |/    ||// / _ \\ //   \\\n"
            + "||  \\\\  /   |||   ||  |  |||   ||  ||    ||\\\\ | __/ ||\n"
            + "||   \\\\/    |\\\\__/\\\\__|  |||   \\\\__|\\___ || \\\\\\___| ||\n"
            + "******************************************************\n";
    public static final String BYE_LOGO = "_______    _______\n"
            + "||   \\\\\\  //||\n"
            + "||___//\\\\// ||___\n"
            + "||   \\\\ ||  ||\n"
            + "||___// ||  ||____\n";
    public static final String CONFIRMATION = "yes";
    public static final String WRONG_FORMAT = "Oops!!! Wrong format entered.";

    /**
     * Reads input entered by the user.
     *
     * @return input entered by the user
     */
    public String readCommand() {
        return in.nextLine();
    }

    /**
     * Prints the invalid command line.
     */
    public void printInvalidCommand() {
        System.out.println(INVALID_COMMAND);
        System.out.println(ENTER_HELP + System.lineSeparator());
    }

    /**
     * Prints the welcome screen when the program starts.
     */
    public void printWelcomeScreen() {
        System.out.println("Hello from" + System.lineSeparator() + LOGO);
        System.out.println("Full user guide available at: https://ay2021s1-cs2113t-f12-4.github.io/tp/UserGuide.html");
        System.out.println(ENTER_HELP + System.lineSeparator());
    }

    /**
     * Prompts the user to enter his/her name.
     */
    public String printNamePrompt() {
        System.out.println("What is your name?");
        String name = in.nextLine();
        if (name.isEmpty()) {
            printInvalidCommand();
            name = printNamePrompt();
        }
        return name;
    }

    /**
     * Greets the user by his/ her name.
     */
    public void printGreeting(String name) {
        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("What can I do for you?" + System.lineSeparator());
    }

    /**
     * Prints the exit line when user entered "bye".
     */
    public void printExitScreen(String name) {
        System.out.println("All changes saved.");
        System.out.println(BYE_LOGO);
        System.out.println("Bye " + name + ". Hope to see you again soon!" + System.lineSeparator());
    }

    /**
     * Prints all the module information in a table.
     *
     * @param modList list of modules.
     * @param week    specified week number.
     */
    public void printTable(ModuleList modList, int week) {
        ModView view = new ModView();
        view.printAllModuleInformation(modList, week);
    }

    /**
     * Prints all available commands.
     */
    public void printHelpList() {
        System.out.println(HELP_LIST);
    }

    /**
     * Prints the message when module type is invalid.
     */
    public void printInvalidModuleType(boolean toPrint) {
        if (toPrint) {
            System.out.println(INVALID_MODULETYPE);
            System.out.println(MODULETYPE_EXAMPLE + System.lineSeparator());
        }
    }

    public void printInvalidModule(boolean toPrint) {
        if (toPrint) {
            System.out.println(INVALID_MODULE);
            System.out.println(MODULETYPE_EXAMPLE + System.lineSeparator());
        }
    }

    /**
     * Prints the message when module does not exist.
     */
    public void printNotExist(String moduleCode, boolean toPrint) {
        if (toPrint) {
            System.out.println(moduleCode + " does not exist." + System.lineSeparator());
        }
    }

    /**
     * Prints the message when module exists.
     */
    public void printExist(String moduleCode, boolean toPrint) {
        if (toPrint) {
            System.out.println(moduleCode + " already exists." + System.lineSeparator());
        }
    }

    /**
     * Prints empty line.
     */
    public void printEmptyline(boolean toPrint) {
        if (toPrint) {
            System.out.println(System.lineSeparator());
        }
    }

    /**
     * Prints the message when addmod command is wrong.
     */
    public void printAddModError(boolean toPrint) {
        if (toPrint) {
            System.out.print(ERROR_ADDMOD);
        }
    }

    /**
     * Prints the message when deletemod command is wrong.
     */
    public void printDeleteModError(boolean toPrint) {
        if (toPrint) {
            System.out.print(ERROR_DELETEMOD);

        }
    }

    /**
     * Prints the message when addexp command is wrong.
     */
    public void printAddExpError(boolean toPrint) {
        if (toPrint) {
            System.out.print(ERROR_ADDEXP);
        }
    }

    /**
     * Prints the message when deleteexp command is wrong.
     */
    public void printDeleteExpError(boolean toPrint) {
        if (toPrint) {
            System.out.print(ERROR_DELETEEXP);
        }
    }

    /**
     * Prints the message when deletetime command has non existing module.
     */
    public void printDeleteTimeNotExist(boolean toPrint) {
        if (toPrint) {
            System.out.println(ERROR_DELETE_TIME + " with " + ERROR_DELETE_TIME_MISS + " and " + ERROR_WEEK_NUM);
        }
    }

    /**
     * Prints the message when deletetime command is wrong.
     */
    public void printDeleteTimeError(boolean toPrint) {
        if (toPrint) {
            System.out.print(ERROR_DELETE_TIME);
        }
    }

    /**
     * Prints the message when expected workload has no input.
     */
    public void printEmptyExp(boolean toPrint) {
        if (toPrint) {
            System.out.println(NO_EXPECTED_WORKLOAD + System.lineSeparator());
        }
    }

    /**
     * Prints the message when actual time has no input.
     */
    public void printEmptyActual(boolean toPrint) {
        if (toPrint) {
            System.out.println(NO_ACTUAL_TIME + System.lineSeparator());
        }
    }

    /**
     * Prints the message when addexp command throws Number Format Exception.
     */
    public void printAddExpNfe(boolean toPrint) {
        if (toPrint) {
            System.out.println(ERROR_ADDEXP + ERROR_EXP + System.lineSeparator());
        }
    }

    /**
     * Prints the message when module is deleted.
     */
    public void printDelete(String moduleCode, boolean toPrint) {
        if (toPrint) {
            System.out.println(moduleCode + " is removed.");
            System.out.println("All tasks under " + moduleCode + " are deleted." + System.lineSeparator());
        }
    }

    /**
     * Prints the message when expected workload has more than 1 decimal place.
     */
    public void printInvalidExpString(boolean toPrint) {
        if (toPrint) {
            System.out.println(ERROR_ADDEXP + ERROR_EXP + System.lineSeparator());
        }
    }

    /**
     * Prints the message when expected workload is invalid.
     */
    public void printInvalidExpTime(boolean toPrint) {
        if (toPrint) {
            System.out.println(INVALID_EXP_HOURS + System.lineSeparator());
        }
    }

    /**
     * Prints the message when expected workload of module is deleted.
     */
    public void printDeleteExp(String moduleCode, boolean toPrint) {
        if (toPrint) {
            System.out.println("Expected Workload of " + moduleCode + " is removed." + System.lineSeparator());
        }
    }

    /**
     * Prints the message when module is added to modList.
     */
    public void printAdd(Module moduleDetail, boolean toPrint) {
        if (toPrint) {
            System.out.println(moduleDetail + " is added." + System.lineSeparator());
        }
    }

    /**
     * Prints the message when actual time of module of the particular week is removed .
     */
    public void removeActualTime(String modCode, String week, boolean toPrint) {
        if (toPrint) {
            System.out.println("Actual time of " + modCode + " of week " + week + " is removed.");
            System.out.println();
        }
    }

    /**
     * Prints the message when there is no change in expected workload.
     */
    public void printExpAlreadyUpdated(double expectedTime, boolean toPrint) {
        if (toPrint) {
            System.out.print("The expected workload is already " + expectedTime + "h.");
            System.out.println(System.lineSeparator());
        }
    }

    /**
     * Prints the message when expected workload is updated.
     */
    public void printExpUpdated(String modCode, double exp, boolean toPrint) {
        if (toPrint) {
            System.out.print("Expected workload of " + modCode + " is changed to " + exp + "h.");
            System.out.println(System.lineSeparator());
        }
    }

    /**
     * Prints the message when the week number is not valid.
     */
    public void printWeekError(boolean toPrint) {
        if (toPrint) {
            System.out.println(ERROR_WEEK + System.lineSeparator());
        }
    }

    /**
     * Prints the message when the week number is an alphabet instead of integer.
     */
    public void printWeekAlphabetError(boolean toPrint) {
        if (toPrint) {
            System.out.println(ERROR_ALPHABET_WEEK + System.lineSeparator());
        }
    }

    /**
     * Prints the analysis of actual time spent.
     *
     * @param modList module list
     * @param week    week number
     */
    public void printBreakDownAnalysis(ModuleList modList, int week) {
        ViewTimeBreakdownAnalysis breakDown = new ViewTimeBreakdownAnalysis();
        breakDown.printTimeBreakDownAndAnalysis(modList, week);
    }

    /**
     * Prints the task added line when the user added a task to the task list.
     *
     * @param list task list
     */
    public void printTaskIsAdded(TaskList list, String modCode) {
        ArrayList<Task> tasks = list.getTaskData();
        System.out.println("Got it. I've added this task under " + modCode + ":");
        System.out.println(tasks.get(tasks.size() - 1));
    }

    /**
     * Prints the number of tasks stored in the task list.
     *
     * @param list task list
     */
    public void printNumberOfTasks(TaskList list) {
        ArrayList<Task> tasks = list.getTaskData();
        if (tasks.size() == 1) {
            System.out.println("Now you have 1 task in the list." + System.lineSeparator());
        } else if (tasks.size() > 1) {
            System.out.println("Now you have " + tasks.size() + " tasks in the list." + System.lineSeparator());
        } else {
            System.out.println("You currently have no task :-)" + System.lineSeparator());
        }
    }

    /**
     * Prints invalid task number when task number entered does not exist.
     *
     * @param list task list
     */
    public void printInvalidTaskNumber(TaskList list) {
        ArrayList<Task> tasks = list.getTaskData();
        System.out.println("Invalid task number.");
        System.out.println("Enter a task number from 1 to " + tasks.size() + "." + System.lineSeparator());
    }

    /**
     * Prints invalid time when time entered is invalid.
     */
    public void printInvalidTime() {
        System.out.println("Please enter a valid time.");
    }

    /**
     * Prints output when addtime feature is used.
     *
     * @param hours  hours input by user
     * @param module module code input by user
     */
    public void printHoursAdded(double hours, String module) {
        if (hours > 1) {
            System.out.println(hours + " hours have been added to " + module + ".");
        } else {
            System.out.println(hours + " hour has been added to " + module + ".");
        }
    }

    /**
     * Prints output when minustime feature is used.
     *
     * @param hours  hours input by user
     * @param module module code input by user
     */
    public void printHoursMinus(double hours, String module) {
        if (hours > 1) {
            System.out.println(hours + " hours have been removed from " + module + ".");
        } else {
            System.out.println(hours + " hour has been removed from " + module + ".");
        }
    }

    /**
     * Prints output when edittime feature is used.
     *
     * @param hours  hours input by user
     * @param module module code input by user
     */
    public void printHoursEditted(double hours, String module) {
        if (hours > 1) {
            System.out.println(hours + " hours is the new actual workload for the module " + module + ".");
        } else {
            System.out.println(hours + " hour is the new actual workload for the module " + module + ".");
        }
    }

    /**
     * Prints summary when edittime, addtime or minustime feature is used.
     *
     * @param hours hours input by user
     * @param week  module code input by user
     */
    public void printHoursSummary(double hours, String week) {

        System.out.println(hours + " hours have been spent on this module in week " + week + "."
                + System.lineSeparator());
    }

    /**
     * Prints the error message when the user wants to add time which totals to more than 99 hours.
     */
    public void printHoursExceed() {
        System.out.println("Total workload cannot be more than 99 hours.");
    }

    /**
     * Prints the error message when the user inputs a number out of the valid range.
     */
    public void printTimeOutOfRangeError() {
        System.out.println("Please input a number between 0 and 99 for time.");
    }

    /**
     * Prints the error message when the user inputs a number out of the valid range.
     */
    public void printNegativeTimeError() {
        System.out.println("Please input a positive number for time.");
    }

    /**
     * Prints the error message when the user wants to minus time when there is no actual workload yet.
     */
    public void printWorkloadError() {
        System.out.println("Cannot minus actual time as there is no actual time inputted.");
    }

    /**
     * Prints the error message when the user wants to subtract more time than the current actual workload.
     */
    public void printHoursMinusExceed() {
        System.out.println("Sorry you are trying to remove too many hours.");
    }

    /**
     * Prints out the task list.
     *
     * @param list task list
     */
    public void printTaskList(TaskList list) {
        ArrayList<Task> tasks = list.getTaskData();
        if (tasks.size() == 0) {
            System.out.println("The current task list is empty.");
        } else {
            System.out.println("Here are the tasks in your list:");
            for (int i = 1; i <= tasks.size(); i++) {
                System.out.println(i + ". " + tasks.get(i - 1));
            }
        }
        System.out.println();
    }

    /**
     * Confirms with the user whether he/ she wants to reset all data.
     *
     * @return true if user wants to reset data.
     */
    public boolean confirmReset() {
        System.out.println("---WARNING!---");
        System.out.println("This will delete all your past data and reset the whole program.");
        System.out.println("Type '" + CONFIRMATION + "' if you wish to continue.");
        System.out.println("Enter any other key to cancel this operation." + System.lineSeparator());
        String input = in.nextLine();
        if (input.trim().equalsIgnoreCase("yes")) {
            System.out.println("Okay, the program will reset now..." + System.lineSeparator());
            return true;
        }
        System.out.println("Reset not confirmed. Your data is safe :)" + System.lineSeparator());
        return false;
    }

    /**
     * Confirms with the user whether he/ she wants to clear all data.
     *
     * @return true if user wants to clear data.
     */
    public boolean confirmClear() {
        System.out.println("---WARNING!---");
        System.out.println("This will delete all modules and tasks data.");
        System.out.println("Type '" + CONFIRMATION + "' if you wish to continue.");
        System.out.println("Enter any other key to cancel this operation." + System.lineSeparator());
        String input = in.nextLine();
        if (input.trim().equalsIgnoreCase("yes")) {
            System.out.println("Okay, your data has been deleted :(" + System.lineSeparator());
            return true;
        }
        System.out.println("Clearing of data not confirmed. Your data is safe :)" + System.lineSeparator());
        return false;
    }

    public void printDataError(String input) {
        System.out.println("Unrecognised command in data file: " + input);
        System.out.println("Please do not modify the file. Clear or reset the program to clean up the file!");
        System.out.println();
    }

    /**
     * Prints the given error message.
     */
    public void printErrorMessage(String command) {
        switch (command) {
        case Parser.COMMAND_ADDTIME:
            System.out.println(WRONG_FORMAT);
            System.out.println("Format: addtime <module code> <actual time spent> <week number>"
                    + System.lineSeparator());
            break;
        case Parser.COMMAND_MINUSTIME:
            System.out.println(WRONG_FORMAT);
            System.out.println("Format: minustime <module code> <time> <week number>" + System.lineSeparator());
            break;
        case Parser.COMMAND_EDITTIME:
            System.out.println(WRONG_FORMAT);
            System.out.println("Format: edittime <module code> <actual time spent> <week number>"
                    + System.lineSeparator());
            break;
        case Parser.COMMAND_DELETETIME:
            System.out.print(ERROR_DELETE_TIME);
            System.out.println(" with " + ERROR_WEEK_NUM + System.lineSeparator());
            break;
        case Parser.COMMAND_LIST:
            System.out.println(WRONG_FORMAT);
            System.out.println("Format: list <week number>" + System.lineSeparator());
            break;
        case Parser.COMMAND_ANALYSIS:
            System.out.println(WRONG_FORMAT);
            System.out.println("Format: analyse <week number>" + System.lineSeparator());
            break;
        case Parser.COMMAND_DONE:
            System.out.println(WRONG_FORMAT);
            System.out.println("Format: done <task number>" + System.lineSeparator());
            break;
        case Parser.COMMAND_DELETETASK:
            System.out.println(WRONG_FORMAT);
            System.out.println("Format: deletetask <task number>" + System.lineSeparator());
            break;
        case Parser.COMMAND_ADDTASK:
            System.out.println(WRONG_FORMAT);
            System.out.println("Format: addtask <module code> <task description>" + System.lineSeparator());
            break;
        default:
            break;
        }
    }
}
