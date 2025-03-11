import java.util.*;

public class ProductManager {

    private List<Product> productList = new ArrayList<>();
    private Set<Product> uniqueProducts = new HashSet<>();
    private Map<Integer, Product> productMap = new HashMap<>();




    public void addProduct(Product product){

        productList.add(product);
        uniqueProducts.add(product);
        productMap.put(product.getId(), product);

    }

    public void removeProduct(int productId){
        productList.removeIf(p-> p.getId() == productId);
        uniqueProducts.removeIf(p->p.getId() == productId);
        productMap.remove(productId);
    }

    public Product findProductById(int id){

        return productMap.get(id);
    }

    public void listProducts(){
        productList.forEach(System.out::println);
    }

    public void findUniqueProducts(){
        uniqueProducts.forEach(System.out::println);
    }

    public void findProductsByCategory(String category){
        productList.stream()
            .filter(p->p.getCategory().equalsIgnoreCase(category))
            .forEach(System.out::println);
    }


}

