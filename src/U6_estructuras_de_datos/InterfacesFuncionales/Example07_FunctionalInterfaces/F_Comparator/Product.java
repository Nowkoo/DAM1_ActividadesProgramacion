package U6_estructuras_de_datos.InterfacesFuncionales.Example07_FunctionalInterfaces.F_Comparator;

public class Product {
    private String productKey;
    private String name;
    private Double price;
    private Boolean discount;

    public Product(String productKey, String name, Double price, Boolean discount) {
        this.productKey = productKey;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getProductKey() {
        return productKey;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getDiscount() {
        return discount;
    }
    public String toString(){
        return productKey + ":" + name + " price:" + price.toString();
    }
}
