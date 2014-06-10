package com.example.deathair2;

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
    	 Assets.backgroundMenu = g.newPixmap("falling.png", PixmapFormat.RGB565);
    	 Assets.background = g.newPixmap("sky.png", PixmapFormat.RGB565);
    	 Assets.player = g.newPixmap("player.png", PixmapFormat.RGB565);
    	 Assets.crate = g.newPixmap("crate.png", PixmapFormat.RGB565);
    	 Assets.ready = g.newPixmap("ready.png", PixmapFormat.ARGB4444);
    	 Assets.play = g.newPixmap("Play.png", PixmapFormat.RGB565);
    	 //Settings.load(game.getFileIO());
         game.setScreen(new MainMenuScreen(game));
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
