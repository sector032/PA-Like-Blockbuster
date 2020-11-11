package com.codecool.blockbuster;

import com.codecool.blockbuster.product.Product;

import java.util.*;

public class BlockBusterStore {
    private int monthlyRevenue;
    private List<Product> productList;
    public int dayCount;

    public BlockBusterStore() {
        this.productList = new ArrayList<>();
        this.dayCount = 1;
    }

    public void calculateRevenue(Product product) {
        this.monthlyRevenue += product.getDailyRental() * product.getDaysLeftFromRent();
    }

    public boolean chanceForRent() {
        Random random = new Random();
        int num = random.nextInt(100);
        return num < 75;
    }



    public void setStatus(Product product, boolean status) {
        product.setStatus(status);
    }

    public void checkOutProduct(Product product) {
        setStatus(product, false);
        product.rentDays();
        calculateRevenue(product);
    }

    public void updateDay() {
        System.out.println("Total profit at the start of the day: " + monthlyRevenue );
        if(chanceForRent()){
            Product product = getRandomProduct();
            checkOutProduct(product);
            System.out.println("Rented product is: " + product.getName());
        }else{
            System.out.println("No costumer today!");
        }
        for(Product product : productList){
            if(!product.isCanBeRented()){
                product.decreaseRentDays();
            }
        }
        dayCount++;
        System.out.println("Total profit at the end of the day: " + monthlyRevenue );
    }

    public Product getRandomProduct(){
        while(!productList.get(0).isCanBeRented()){
            Collections.shuffle(productList);
        }
        return productList.get(0);
    }

    public void addToList(Product product) {
        productList.add(product);
    }




}
