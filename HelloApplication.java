package com.example.rocketgame;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Image background = new Image(getClass().getResourceAsStream("SpaceImage.gif"));

        ImageView IvBack = new ImageView(background);

        Group myG = new Group();


        Ship Player = new Ship(256,370,5,0,"PlayerSprite.gif");

        myG.getChildren().add(IvBack);
        myG.getChildren().add(Player.iView);
        Scene scene = new Scene(myG, 750, 512);
        stage.setTitle("Rocket Game!");
        stage.setScene(scene);
        stage.show();

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {

                if (keyEvent.getCode()== KeyCode.LEFT){
                    Player.SetLeft(true);
                    Player.move();
                }
                if (keyEvent.getCode()==KeyCode.RIGHT){
                    Player.SetRight(true);
                    Player.move();
                }
                if (keyEvent.getCode()==KeyCode.SPACE){
                    Player.SetSpace(true);
                    Player.Shoot();
                }

            }
        });

        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode()==KeyCode.LEFT){
                    Player.SetLeft(false);
                }
                if (keyEvent.getCode()==KeyCode.RIGHT){
                    Player.SetRight(false);
                }
            }
        });

    }

    public static void main(String[] args) {
        launch();
    }
}
