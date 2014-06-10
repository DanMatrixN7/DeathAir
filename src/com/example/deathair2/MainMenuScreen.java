package com.example.deathair2;

import java.util.List;
import com.example.deathair.framework.Game;
import com.example.deathair.framework.Graphics;
import com.example.deathair.framework.Input.TouchEvent;
import com.example.deathair.framework.Screen;

public class MainMenuScreen extends Screen {
    public MainMenuScreen(Game game) {
        super(game);               
    }   

    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
        game.getInput().getKeyEvents();       
        
        int len = touchEvents.size();
        for(int i = 0; i < len; i++) {
            TouchEvent event = touchEvents.get(i);
            if(event.type == TouchEvent.TOUCH_UP) {
            	 if(inBounds(event, 40, 50, 300, 100) ) {
                     game.setScreen(new GameScreen(game));
                     return;
                 }
                
            }
        }
    }
    
    private boolean inBounds(TouchEvent event, int x, int y, int width, int height) {
        if(event.x > x && event.x < x + width - 1 && 
           event.y > y && event.y < y + height - 1) 
            return true;
        else
            return false;
    }

    public void present(float deltaTime) {
        Graphics g = game.getGraphics();
        
        g.drawPixmap(Assets.backgroundMenu, 0, 0);
        g.drawPixmap(Assets.play, 40, 50, 0, 0, 256, 128);
      ;
    }

    public void pause() {        
       
    }

    public void resume() {

    }

    public void dispose() {

    }
}

