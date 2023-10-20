public class PaginatedPageContent extends PageContentDecorator {
    public PaginatedPageContent(PageContent content) {
        super(content);
    }

    @Override
    public void display() {
        super.display();
        paginateSearchResults();
    }

    private void paginateSearchResults() {
        System.out.println("Displaying pagination for search results...");
    }
}
