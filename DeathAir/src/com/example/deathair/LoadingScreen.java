package com.example.deathair;

import com.example.deathair.framework.Game;
import com.example.deathair.framework.Graphics;
import com.example.deathair.framework.Screen;
import com.example.deathair.framework.Graphics.PixmapFormat;

public class LoadingScreen extends Screen {
    public LoadingScreen(Game game) {
        super(game);
    }

    public void update(float deltaTime) 
    {
    	 Graphics g = game.getGraphics();
    	 //Settings.load(game.getFileIO());
         //game.setScreen(new MainMenuScreen(game));
    }
    
    public void present(float deltaTime) {

    }

    public void pause() {

    }

    public void resume() {

    }

    public void dispose() {

    }
}
