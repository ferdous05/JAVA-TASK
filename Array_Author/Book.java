package Array_Author;

public class Book {

    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {

        this.name = name;
        this.authors = authors;
        this.price = price;

    }

    public Book(String name, Author[] authors, double price, int qty) {

        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    //public void setAuthor(Author[] authors) {
      //  this.authors =  authors;
    //}
    
    public Book(int size){
    
    authors= new Author[size];
    }

    public String getName() {
        return this.name;
    }

    public Author[] getAuthor() {
        return this.authors;
    }

    public double getprice() {
        return this.price;
    }

    public void SetPrice(double price) {

        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    

    public String toString() {

        return "Book Name :" + this.name + "[Author " + authors + "Price :" + this.price + "Qty :" + this.qty;
    }

}
