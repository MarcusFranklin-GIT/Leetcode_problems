import java.util.*;
public class Book implements Comparable<Book> {

    private String title;
    private String ISBN;
    private int price;
    private int rating;
    private int year;

    // getters and setters

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getISBN() { return ISBN; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    @Override
    public int compareTo(Book b) {

        // price ascending
        if (this.price != b.price)
            return this.price - b.price;

        // rating descending
        if (this.rating != b.rating)
            return b.rating - this.rating;

        // year descending
        if (this.year != b.year)
            return b.year - this.year;

        // title ascending
        return this.title.compareTo(b.title);
    }

    //this has to be in Main Class
    private static Map<Integer, List<Book>> getYearwiseBooks(List<Book> books) {

    Map<Integer, List<Book>> map = new HashMap<>();

    for (Book b : books) {
        map.putIfAbsent(b.getYear(), new ArrayList<>());
        map.get(b.getYear()).add(b);
    }

    // sort each year's list
    for (List<Book> list : map.values()) {
        Collections.sort(list);
    }

    return map;
}
}





// ```
// You are given details of N books: title, ISBN, price, rating, and publication year.
// A year Y is then provided as input.

// Write a program to:

// Filter and display only the books published in year Y.

// Sort the filtered books using the following priority:

// Price in ascending order

// If price is same → Rating in descending order

// If price and rating are same → Year in descending order

// If all above are same → Title in ascending (alphabetical) order

// Print each book’s details in the required format.
// ```