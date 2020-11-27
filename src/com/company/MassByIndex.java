package com.company;

public class MassByIndex extends Throwable{
    private String message;
    public MassByIndex(int ind){
        message = "Индекс " + ind + " вне диапазона";
    }

    public String getMessage() {
        return message;
    }
}