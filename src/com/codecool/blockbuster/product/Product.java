package com.codecool.blockbuster.product;

import java.util.Random;
import java.util.UUID;

public abstract class Product {
    protected String title;
    protected int releaseDate;
    protected int dailyRental;
    protected int originalPrice;
    protected int daysLeftFromRent;
    protected Platform platform;
    protected boolean canBeRented;

    public Product(String title, int releaseDate, int dailyRental, int originalPrice) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.dailyRental = dailyRental;
        this.originalPrice = originalPrice;
        this.canBeRented = true;
        setPlatform();
    }

    public void rentDays() {
        Random random = new Random();
        this.daysLeftFromRent = random.nextInt(14-3)+3;
    }

    public void decreaseRentDays(){
        this.daysLeftFromRent--;
    }

    public int getDailyRental() {
        return dailyRental;
    }

    public int getDaysLeftFromRent() {
        return daysLeftFromRent;
    }

    public abstract void setPlatform();

    public void setStatus(boolean status) {
        this.canBeRented = status;
    }

    public boolean isCanBeRented() {
        return canBeRented;
    }


    public String getName(){
        return title;
    }

}
