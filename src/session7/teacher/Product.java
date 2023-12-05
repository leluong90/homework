package session7.teacher;

import java.util.Scanner;

public class Product {
    private String productId ;
    private String productName ;
    private float importPrice ;
    private float exportPrice ;
    private float profit ;
    private int quantity ;
    private String descriptions ;

    private boolean status ;

    public Product() {
    }

    public Product(String productId, String productName, float importPrice, float exportPrice, float profit, int quantity, String descriptions, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.profit = profit;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.status = status;
    }

    public void inputData(Scanner scanner , Product [] arrProduct){

        System.out.println("Enter product id : ");
        this.productId = scanner.nextLine();
        System.out.println("Enter product name : ");
        this.productName = scanner.nextLine();
        System.out.println("Enter import price : ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter export price : ");
        this.exportPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter quantity : ");
        this.quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter descriptions : ");
        this.descriptions = scanner.nextLine();
        System.out.println("Enter status : ");
        this.status = Boolean.parseBoolean(scanner.nextLine());



    }
    public void display(){
        System.out.println("Book id : "+ this.productId);
        System.out.println("Book name : "+ this.productName);
        System.out.println("Import price : "+ this.importPrice);
        System.out.println("Export price : "+ this.exportPrice);
        System.out.println("Profit : "+ this.profit);
        System.out.println("Quantity : "+ this.quantity);
        System.out.println("Description : "+ this.descriptions);
        System.out.println("Status : "+ this.status);


    }
    public float calProfit(){
        return this.profit = this.exportPrice - this.importPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
