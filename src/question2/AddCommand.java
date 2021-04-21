package question2;

public class AddCommand implements Command<String> {
    private Article article;

    public AddCommand(Article article) {
        this.article = article;
    }

    @Override
    public void execute(String s) {
        article.setContent(s);
    }

    @Override
    public void undo() {

    }
}
