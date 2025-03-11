import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Main{
    public static ProductManager manage; 
    static Scanner input;
    public static void main(String[] args){



        input = new Scanner(System.in);  
        //reading user Prefernce 
        manage = new ProductManager();
        populateDataFromFile();
        boolean cont = true;

        while(cont){

        System.out.println("-------What is your choice------");
        System.out.println("1  to add new product");
        System.out.println("2  to display all list of products");
        System.out.println("3  to display all unique products");
        System.out.println("4  to display all Key value paired products");
        System.out.println("5  to find product by id");


        int ch = input .nextInt();
        switch(ch){
            case 1:
                Product product = productReader();
                manage.addProduct(product);
                break;
            case 2:
                System.out.println("----- Here am going to display all the list of products----");
                manage.listProducts();
                break;
            case 3:
                 System.out.println("----- Here am going to display unique products----");
                 manage.findUniqueProducts();
                 break;
            case 4: 
                 int productId = readProductId();
                 manage.removeProduct(productId);
                 break;
            case 5:
                 int productI =readProductId();
                 System.out.println(manage.findProductById(productI));
            default:
                 System.out.println("Unknow operator please provide form the listed ones");
                 

          }
         //Asking the user for another operation
          System.out.println("Do you want to continue... press 1 ?");
          int choi = input.nextInt();
          cont = (choi == 1) ? true : false;

          

       }
                 input.close();
    }


   


    public static int readProductId(){
        System.out.println("----- Please provide product id to make an operation----");
        int productId = input.nextInt();
        return productId;

    }

    public static Product productReader(){

        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Please provide product name");
        String name = sc.nextLine();
        System.out.println("Please prvide product category");
        String category = sc.nextLine();
        System.out.println("Please provide price");
        double price  = sc.nextDouble();
        System.out.println("Please provide product available stock quantity");
        int stock = sc.nextInt();
        Product product = new Product(id,name,category,price,stock);
        sc.close();
        return product;
    

    } 

    public static void populateDataFromFile(){

        String filePath = "products.txt";
        System.out.println("Reading file from file path");
        List<Product> products = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            boolean firstLine = true;
            while( (line = br.readLine()) != null){
                //Skipping the header files
                if(firstLine){
                    firstLine = false;
                    continue;
                }

                String[] data =line.split("\t");
                if(data.length == 5){
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    String category = data[2];
                    double price = Double.parseDouble(data[3]);
                    int stockQuantity = Integer.parseInt(data[4]);
                    manage.addProduct(new Product(id, name, category, price, stockQuantity));

                }
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
      
     
    }
}
