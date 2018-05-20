
package com.lojas.americanas.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Produto {

    @SerializedName("search")
    @Expose
    private String search;
    @SerializedName("prodId")
    @Expose
    private String prodId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("rating")
    @Expose
    private float rating;
    @SerializedName("numReviews")
    @Expose
    private Integer numReviews;
    @SerializedName("stock")
    @Expose
    private String stock;
    @SerializedName("productSku")
    @Expose
    private String productSku;
    @SerializedName("partnerId")
    @Expose
    private String partnerId;
    @SerializedName("partnerName")
    @Expose
    private String partnerName;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("priceHeadline")
    @Expose
    private PriceHeadline priceHeadline;
    @SerializedName("installment")
    @Expose
    private String installment;
    @SerializedName("prime")
    @Expose
    private Prime prime;
    @SerializedName("priceFrom")
    @Expose
    private String priceFrom;
    @SerializedName("discountBadgeText")
    @Expose
    private String discountBadgeText;


    public Produto(String name, int numReviews, int thumbnail) {
        this.name = name;
        this.numReviews = numReviews;
        this.numReviews = thumbnail;
    }


    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getNumReviews() {
        return numReviews;
    }

    public void setNumReviews(Integer numReviews) {
        this.numReviews = numReviews;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public PriceHeadline getPriceHeadline() {
        return priceHeadline;
    }

    public void setPriceHeadline(PriceHeadline priceHeadline) {
        this.priceHeadline = priceHeadline;
    }

    public String getInstallment() {
        return installment;
    }

    public void setInstallment(String installment) {
        this.installment = installment;
    }

    public Prime getPrime() {
        return prime;
    }

    public void setPrime(Prime prime) {
        this.prime = prime;
    }

    public String getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(String priceFrom) {
        this.priceFrom = priceFrom;
    }

    public String getDiscountBadgeText() {
        return discountBadgeText;
    }

    public void setDiscountBadgeText(String discountBadgeText) {
        this.discountBadgeText = discountBadgeText;
    }

}