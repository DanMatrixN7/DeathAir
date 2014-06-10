package com.example.deathair2;

import com.example.deathair.framework.Screen;
import com.example.deathair.framework.impl.AndroidGame;

public class DeathAirActivity extends AndroidGame {
    public Screen getStartScreen() {
        return new LoadingScreen(this); 
    }
} 