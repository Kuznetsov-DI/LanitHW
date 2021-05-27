
package org.example.model;

import com.google.gson.annotations.SerializedName;

public class Map {

    @SerializedName("412")
    private int m12;
    @SerializedName("44422")
    private int m4422;
    @SerializedName("available")
    private int available;
    @SerializedName("pending")
    private int pending;
    @SerializedName("sold")
    private int sold;
    @SerializedName("string")
    private int string;
    @SerializedName("testing")
    private int testing;

    public int get12() {
        return m12;
    }

    public void set12(int m12) {
        this.m12 = m12;
    }

    public int get4422() {
        return m4422;
    }

    public void set4422(int m4422) {
        this.m4422 = m4422;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getPending() {
        return pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int getString() {
        return string;
    }

    public void setString(int string) {
        this.string = string;
    }

    public int getTesting() {
        return testing;
    }

    public void setTesting(int testing) {
        this.testing = testing;
    }

    @Override
    public String toString(){
        return
                "Pet{" +
                        "id = '" + m12 + '\'' +
                        ",petId = '" + m4422 + '\'' +
                        ",quantity = '" + available + '\'' +
                        ",shipDate = '" + pending + '\'' +
                        ",status = '" + sold + '\'' +
                        ",complete = '" + string + '\'' +
                        ",complete = '" + testing + '\'' +
                        "}";
    }

}
