package com.lojas.americanas.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Prime {

    @SerializedName("xpPrime")
    @Expose
    private Boolean xpPrime;
    @SerializedName("rpPrime")
    @Expose
    private Boolean rpPrime;

    public Boolean getXpPrime() {
        return xpPrime;
    }

    public void setXpPrime(Boolean xpPrime) {
        this.xpPrime = xpPrime;
    }

    public Boolean getRpPrime() {
        return rpPrime;
    }

    public void setRpPrime(Boolean rpPrime) {
        this.rpPrime = rpPrime;
    }

}