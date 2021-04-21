package question2;

public class Invoker {
    private Command<String> cmd;

    public Invoker(Command<String> cmd){
        this.cmd = cmd;
    }

    public void addArticleContent(String note){
        cmd.execute(note);
    }

    public void undo(){

    }
}
