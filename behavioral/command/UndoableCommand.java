package behavioral.command;

public interface UndoableCommand extends Command {
    void undo();
}