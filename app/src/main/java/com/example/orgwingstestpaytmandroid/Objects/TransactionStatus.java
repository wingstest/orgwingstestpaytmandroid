package com.example.orgwingstestpaytmandroid.Objects;

import com.google.gson.annotations.SerializedName;

public class TransactionStatus {

    @SerializedName("PAY_STATUS")
    private String paytStatus;

    public String getPaytStatus(){

        return paytStatus;

    }




}
