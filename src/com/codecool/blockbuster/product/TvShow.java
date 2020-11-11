package com.codecool.blockbuster.product;

public class TvShow extends Product {
    public TvShow(String title, int releaseDate, int dailyRental, int originalPrice) {
        super(title, releaseDate, dailyRental, originalPrice);
    }

    @Override
    public void setPlatform() {
        if (this.releaseDate <= 2000) {
            this.platform = Platform.VHS;
        } else if (this.releaseDate > 2000 && this.releaseDate <= 2010) {
            this.platform = Platform.DVD;
        } else if (this.releaseDate > 2010) {
            this.platform = Platform.BLURAY;
        }
    }
}
