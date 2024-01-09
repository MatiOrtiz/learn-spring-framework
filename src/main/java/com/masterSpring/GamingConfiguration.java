package com.masterSpring;

import com.masterSpring.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        return new PacManGame();
    }

    @Bean
    public GameRunner gameRunner(){
        return new GameRunner(game());
    }

}
