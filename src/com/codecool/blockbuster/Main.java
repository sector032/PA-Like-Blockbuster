package com.codecool.blockbuster;

import com.codecool.blockbuster.product.*;

public class Main {
    public static void main(String[] args) {
        BlockBusterStore store = new BlockBusterStore();

        Movie movie = new Movie("Star Wars", 2000,200,1500);
        TvShow show = new TvShow("Game of Thrones", 2010, 400,2300);
        VideoGame game = new VideoGame("Call of Duty", 2011, 1500,3000);
        Music music = new Music("Dua Lipa", 1999, 900,2300);
        Movie movie2 = new Movie("Lord of the Rings", 2001,400,2000);
        Movie movie3 = new Movie ("Back to the Future", 2009,600,1999);
        VideoGame game2 = new VideoGame("Age of Empires", 2001, 800,2000);
        VideoGame game3 = new VideoGame("League of Legends", 2002,900,1200);
        TvShow show2 = new TvShow("Mr Robot", 2011, 1900, 4000);
        TvShow show3 = new TvShow("Big Bang Theory", 2006,1200,900);


        store.addToList(movie);
        store.addToList(show);
        store.addToList(game);
        store.addToList(music);
        store.addToList(movie2);
        store.addToList(movie3);
        store.addToList(game2);
        store.addToList(game3);
        store.addToList(show2);
        store.addToList(show3);


        for(int i = 0; i < 30; i++){
            store.updateDay();
        }
    }
}
