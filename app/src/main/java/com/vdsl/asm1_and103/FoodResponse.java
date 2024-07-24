package com.vdsl.asm1_and103;

import java.util.List;

public class FoodResponse {
    private int status;
    private String messenger;
    private List<foodModel> data;

    // Getters và setters
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessenger() {
        return messenger;
    }

    public void setMessenger(String messenger) {
        this.messenger = messenger;
    }

    public List<foodModel> getData() {
        return data;
    }

    public void setData(List<foodModel> data) {
        this.data = data;
    }
}
