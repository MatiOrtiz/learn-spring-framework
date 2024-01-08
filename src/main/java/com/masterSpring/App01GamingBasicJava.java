package com.masterSpring;

import com.masterSpring.game.*;

public class App01GamingBasicJava {

    public static void main(String[] args) {

        var game= new MarioGame();
        var game1= new SuperContraGame();
        var game2= new PacManGame();

        var gameRunner= new GameRunner(game);
        //game is a Dependency of GameRunner --> Dependency's Injection
        gameRunner.run();

    }

}