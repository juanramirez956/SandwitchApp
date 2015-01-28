package com.example.user.sandwiches;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by user on 27/01/2015.
 */
public class Sandwitch implements Parcelable {
    private String bread;
    private String onion;
    private String cheese;
    private String lettuce;
    private String bacon;
    private String peperoni;

    public String getBread() {
        return bread;
    }

    public String getKetchup() {
        return ketchup;
    }

    public String getOnion() {
        return onion;
    }

    public String getCheese() {
        return cheese;
    }

    public String getLettuce() {
        return lettuce;
    }

    public String getBacon() {
        return bacon;
    }

    public String getPeperoni() {
        return peperoni;
    }

    private String ketchup;

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setKetchup(String ketchup) {
        this.ketchup = ketchup;
    }

    public void setOnion(String onion) {
        this.onion = onion;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setLettuce(String lettuce) {
        this.lettuce = lettuce;
    }

    public void setBacon(String bacon) {
        this.bacon = bacon;
    }

    public void setPeperoni(String peperoni) {
        this.peperoni = peperoni;
    }



    public Sandwitch(String bread, String ketchup, String onion, String cheese, String lettuce, String bacon, String peperoni) {
        this.bread= bread;
        this.ketchup = ketchup;
        this.onion = onion;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.bacon = bacon;
        this.peperoni = peperoni;
    }

    public Sandwitch(Parcel in)
    {
        String[] data = new String[7];
        in.readStringArray(data);
        this.bread = data[0];
        this.ketchup= data[1];
        this.onion= data[2];
        this.cheese = data[3];
        this.lettuce = data[4];
        this.bacon = data[5];
        this.peperoni = data[6];
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[]{this.bread,this.ketchup,this.onion,this.cheese,this.lettuce,this.bacon,this.peperoni});
    }

    public static final Parcelable.Creator<Sandwitch> CREATOR = new Creator<Sandwitch>() {

        public Sandwitch createFromParcel(Parcel in) {
            return new Sandwitch(in);
        }

        public Sandwitch[] newArray(int size) {
            return new Sandwitch[size];
        }

    };
}
