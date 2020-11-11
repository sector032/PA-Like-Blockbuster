package com.codecool.blockbuster.product;

public class Music extends Product {
    public Music(String title, int releaseDate, int dailyRental, int originalPrice) {
        super(title, releaseDate, dailyRental, originalPrice);
    }

    @Override
    public void setPlatform() {
        this.platform = Platform.CD;
    }
}
