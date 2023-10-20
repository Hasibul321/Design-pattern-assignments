public abstract class PageContentDecorator implements PageContent {
    private PageContent content;

    public PageContentDecorator(PageContent content) {
        this.content = content;
    }

    @Override
    public void display() {
        content.display();
    }
}
