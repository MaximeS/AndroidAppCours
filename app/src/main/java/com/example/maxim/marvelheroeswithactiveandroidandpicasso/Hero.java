package com.example.maxim.marvelheroeswithactiveandroidandpicasso;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.SerializedName;

@Table(name="Heroes")
public class Hero {

    @Column(name = "name")
    @SerializedName("name")
    private String name;
    @Column (name = "realname")
    @SerializedName("realname")
    private String realname;
    @Column (name = "team")
    @SerializedName("team")
    private String team;
    @Column (name = "firstappearance")
    @SerializedName("firstappearance")
    private String firstappearance;
    @Column (name = "createdby")
    @SerializedName("createdby")
    private String createdby;
    @Column (name = "publisher")
    @SerializedName("publisher")
    private String publisher;
    @Column (name = "imageurl")
    @SerializedName("imageurl")
    private String imageurl;
    @Column (name = "bio")
    @SerializedName("bio")
    private String bio;


    public Hero(String name, String realname, String team, String firstappearance, String createdby, String publisher, String imageurl, String bio) {
        this.name = name;
        this.realname = realname;
        this.team = team;
        this.firstappearance = firstappearance;
        this.createdby = createdby;
        this.publisher = publisher;
        this.imageurl = imageurl;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getFirstappearance() {
        return firstappearance;
    }

    public String getCreatedby() {
        return createdby;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImageurl() {
        return imageurl;
    }

    public String getBio() {
        return bio;
    }
}