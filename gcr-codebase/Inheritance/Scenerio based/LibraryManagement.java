class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    String authorName;
    String bio;

    Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + authorName);
        System.out.println("Bio: " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        Author book1 = new Author("Clean Code", 2008, "Robert C. Martin",
                "Software engineer and author of many programming books.");

        Author book2 = new Author("The Pragmatic Programmer", 1999, "Andrew Hunt",
                "Co-founder of the Agile Manifesto.");

        System.out.println("=== Book 1 ===");
        book1.displayInfo();

        System.out.println("\n=== Book 2 ===");
        book2.displayInfo();
    }
}