package Book;



public class Book {

    private String name;
    private Author authors;
    private double price;
    private int qty;

    public Book(String name, Author authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {

        return this.name;
    }

    public Author getAuthor() {

        return this.authors;
    }

    public double getPrice() {

        return this.price;
    }

    public void Setprice(double price) {

        this.price = price;

    }

    public int getQty() {
        return this.qty;

    }
    


    public void setQty(int qty) {
        this.qty = qty;

    }

    @Override
    public String toString() {

    return "Name : "+authors.Getname()+"Email : "+this.authors.Getemail()+"Gender : "+this.authors.Getgender()+"Author name : "+this.name+"Price"+this.price+"Quentity : "+this.qty;
    
    
    }
}