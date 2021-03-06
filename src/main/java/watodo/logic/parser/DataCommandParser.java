package watodo.logic.parser;

import static watodo.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import watodo.logic.commands.Command;
import watodo.logic.commands.DataCommand;
import watodo.logic.commands.IncorrectCommand;

/**
 * Parses input arguments and creates a new DeleteCommand object
 */
public class DataCommandParser {

    /**
     * Parses the given {@code String} of arguments in the context of the DeleteCommand
     * and returns an DeleteCommand object for execution.
     */
    public Command parse(String args) {

        String path = ParserUtil.parsePath(args);
        if (path.isEmpty()) {
            return new IncorrectCommand(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, DataCommand.MESSAGE_USAGE));
        }

        return new DataCommand(path);
    }

}
