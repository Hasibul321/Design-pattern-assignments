public class AuthenticatedPageContent extends PageContentDecorator {
    public AuthenticatedPageContent(PageContent content) {
        super(content);
    }

    @Override
    public void display() {
        if (isUserAuthenticated()) {
            super.display();
        } else {
            System.out.println("Access denied. Please log in.");
        }
    }

    private boolean isUserAuthenticated() {
        // Add your user authentication logic here
        return true; // For demonstration purposes, always return true
    }
}
