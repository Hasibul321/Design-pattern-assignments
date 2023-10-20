public class Main {
    public static void main(String[] args) {
        PageContent pageContent = new BasicPageContent("This is the basic page content.");
        PageContent authenticatedPageContent = new AuthenticatedPageContent(pageContent);
        PageContent paginatedPageContent = new PaginatedPageContent(authenticatedPageContent);
        paginatedPageContent.display();
    }
}
