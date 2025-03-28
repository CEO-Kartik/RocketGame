package com.example.rocketgame;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Sprite {
    protected double x,y;
    protected int speedx, speedy;
    protected Image img;
    protected ImageView iView;
    Sprite(double x, double y, int speedx, int speedy, String ImageName){
        this.x = x;
        this.y = y;
        this.speedx = speedx;
        this.speedy = speedy;
        img = new Image(getClass().getResourceAsStream(ImageName));

        iView = new ImageView(img);

    }


}

