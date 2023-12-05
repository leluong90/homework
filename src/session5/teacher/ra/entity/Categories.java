package session5.teacher.ra.entity;

import java.util.Scanner;

public class Categories {
    private String catalogId ;
    private String catalogName ;
    private String descriptions ;
    private Boolean catalogStatus ;

    public Categories() {
    }

    public Categories(String catalogId, String catalogName, String descriptions, Boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public void inputData(Scanner scanner , Categories[] arrCategories , int index ){
        System.out.println("Enter categories ID : ");
        this.catalogId = scanner.nextLine();
        System.out.println("Enter categories name : ");
        this.catalogName = scanner.nextLine();
        System.out.println("Enter categories description : ");
        this.descriptions = scanner.nextLine();
        System.out.println("Enter categories status : ");
        this.catalogStatus = Boolean.parseBoolean(scanner.nextLine());

//        arrCategories[index].
    }

    public void display(){
        System.out.println("Categories ID : " + this.catalogId);
        System.out.println("Categories Name : " + this.catalogName);
        System.out.println("Description  " + this.descriptions);
        System.out.println("Catalog Status "+ this.catalogStatus);
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Boolean getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(Boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }
}

