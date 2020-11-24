package com.example.firebase;

public class Movie {
    private String MovieName;
    private String ImageUrl;

    public Movie(String movieName, String imageUrl) {
        MovieName = movieName;
        ImageUrl = imageUrl;
    }

    public Movie(){

    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }
}
