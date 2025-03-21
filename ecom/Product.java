import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private int stockQuantity;

    public Product(int id, String name, String category, double price, int stockQuantity){

        this.id            = id;
        this.name          = name;
        this.category      = category;
        this.price         = price;
        this.stockQuantity = stockQuantity;
    }

    public int getId(){ return id; }
    public String getName(){ return name; }
    public String getCategory(){ return category; }
    public double getPrice(){ return price; }
    public int getStockQuantity(){ return stockQuantity; }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }


    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj  == null || getClass() != obj.getClass()) return false;
        Product product =  (Product) obj;
        return id == product.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
    
    @Override
    public String toString(){
        return "Product{id = "+id+", name= '"+name+"', category='"+category+"', price="+price +",stock="+stockQuantity+"}";
    }

}
