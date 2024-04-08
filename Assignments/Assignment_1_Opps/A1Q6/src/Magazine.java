public class Magazine extends LibraryResource{
    String issueDate;

    public Magazine(String title, String author, String issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("-----Magazine-----");
        System.out.println("Title : "+getTitle());
        System.out.println("Author : "+getAuthor());
        System.out.println("Issue date : "+getIssueDate());
    }
}
