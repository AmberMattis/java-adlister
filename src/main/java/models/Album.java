package models;

import java.util.Date;

public class Album {

    // property values for the attributes in the albums table

    private long id;
    private String artist;
    private String name;
    private Date releaseDate;
    private float sales;
    private String genre;



    //zero argument constructor

    public Album(){};






    //genre getter and setter
    public String getGenre(String genre) {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }




    //id gns
    public long getId() {
        return id;
    }

    public void setId(){
        this.id = id;
    }




    // artist getter and setter
    public String getArtist(){
        return artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }




    // name  getter and setter
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }




    // releaseDate getter and setter
    public  Date getReleaseDate(){
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate){
        this.releaseDate = releaseDate;
    }




    /// sales getter and setter
    public float getSales(){
        return sales;
    }

    public void setSales(){
        this.sales = sales;
    }
}
