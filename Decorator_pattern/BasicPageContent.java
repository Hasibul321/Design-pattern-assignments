public class BasicPageContent implements PageContent {
    private String content;

    public BasicPageContent(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println(content);
    }
}
