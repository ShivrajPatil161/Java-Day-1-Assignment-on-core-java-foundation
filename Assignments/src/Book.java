class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        Book myBook = new Book("The Alchemist", "Paulo Coelho");
        myBook.displayInfo();

        myBook.setTitle("Brida");

        System.out.println("\nAfter updating title:");
        myBook.displayInfo();

        System.out.println("\nRetrieved title using getter: " + myBook.getTitle());
    }
}
