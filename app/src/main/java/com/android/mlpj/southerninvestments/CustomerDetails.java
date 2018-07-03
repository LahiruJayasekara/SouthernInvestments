package com.android.mlpj.southerninvestments;

import com.google.gson.annotations.SerializedName;

public class CustomerDetails {
    @SerializedName("userName")
    private String name;

    @SerializedName("email")
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public CustomerDetails(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

