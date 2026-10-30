package Part10;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int rating;

    public Book( String title, String author, int rating) {
        this.title = title;
        this.author = author;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getRating() {
        return rating;
    }

    public String toString() {
        return this.author + ": " + this.title + " (" + this.rating + ")";
    }

    @Override
    public int compareTo(Book object) {
        return Integer.compare(object.rating, this.rating);

    }












}
