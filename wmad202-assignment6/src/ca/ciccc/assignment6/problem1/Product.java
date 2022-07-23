package ca.ciccc.assignment6.problem1;

public class Product extends Object {
    private Integer ProductId;
    private String ProductName;
    private Float PoductPrice;
    private String ProductMadeInCountry;

    public Product(Integer Id, String Name, Float Price, String MadeInCountry) {
        this.ProductId = Id;
        this.ProductName = Name;
        this.PoductPrice = Price;
        this.ProductMadeInCountry = MadeInCountry;
    }

    public Product() {
    }

    public Integer getId() {
        return ProductId;
    }

    public void setId(Integer id) {
        this.ProductId = id;
    }

    public String getName() {
        return ProductName;
    }

    public void setName(String name) {
        this.ProductName = name;
    }

    public Float getPrice() {
        return PoductPrice;
    }

    public void setPrice(Float price) {
        this.PoductPrice = price;
    }

    public String getMadeInCountry() {
        return ProductMadeInCountry;
    }

    public void setMadeInCountry(String madeInCountry) {
        this.ProductMadeInCountry = madeInCountry;
    }
}
