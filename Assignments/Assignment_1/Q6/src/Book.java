public class Book extends LibraryResource{
    int pageCount;
    public Book(String title, String author,int pageCount) {
        super(title, author);
        this.pageCount=pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("-------BOOK-------");
        System.out.println("Title : "+getTitle());
        System.out.println("Author : "+getAuthor());
        System.out.println("Page count : "+getPageCount());
    }
}
