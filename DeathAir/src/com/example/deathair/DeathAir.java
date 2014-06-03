package com.example.deathair;

import com.example.deathair.framework.Screen;
import com.example.deathair.framework.impl.AndroidGame;

public class DeathAir extends AndroidGame {
    public Screen getStartScreen() {
        return new LoadingScreen(this); 
    }
} 