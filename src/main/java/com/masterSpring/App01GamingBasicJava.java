package com.masterSpring;

import com.masterSpring.game.*;

public class App01GamingBasicJava {

    public static void main(String[] args) {

        GamingConsole game= new MarioGame();
        GamingConsole game1= new SuperContraGame();
        GamingConsole game2= new PacManGame();

        GameRunner gameRunner= new GameRunner(game);
        //game is a Dependency of GameRunner --> Dependency's Injection
        gameRunner.run();

    }

}