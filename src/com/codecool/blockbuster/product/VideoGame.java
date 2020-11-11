package com.codecool.blockbuster.product;

public class VideoGame extends Product {
    public VideoGame(String title, int releaseDate, int dailyRental, int originalPrice) {
        super(title, releaseDate, dailyRental, originalPrice);
    }

    @Override
    public void setPlatform() {
        this.platform = Platform.DVD;
    }
}
