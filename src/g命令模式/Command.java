package g命令模式;

public interface Command {
    public void execute();
    // 撤销按钮
    public void undo();
}
