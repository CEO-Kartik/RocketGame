package com.example.rocketgame;

public class Ship extends Sprite{
    private boolean left, right, Space;
    Ship(double x, double y, int speedx, int speedy, String ImageName) {
        super(x, y, speedx, speedy, "PlayerSprite.gif");
    }

    public void move(){
        if(left){speedx = -5;}

        if (right){speedx = 5;}
        x= x+speedx;
        y=y+speedy;
        iView.setX(x);
        iView.setY(y);
    }

    public void Shoot(){
        if (Space){
            System.out.println("Shoot");
        }
    }

    public void SetLeft(boolean left){
        this.left = left;
    }

    public void SetRight(boolean right){
        this.right = right;
    }

    public void SetSpace(boolean Space){
        this.Space = Space;
    }
}
