package com.careerdevs.interm.Classes;
//public is the access modifer, visbible to all other classes in the project
public class TextBox {
    public String text = ""; //Field

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }

}
