package com.example.deathair2;

import java.util.List;
import com.example.deathair.framework.Game;
import com.example.deathair.framework.Graphics;
import com.example.deathair.framework.Input.TouchEvent;
import com.example.deathair.framework.Pixmap;
import com.example.deathair.framework.Screen;

public class GameScreen extends Screen {
	   
	public GameScreen(Game game) 
	{
        super(game);
       
    }
	   @Override
	   public void update(float deltaTime)
	   {
		
	   }
	   @Override
	   public void present(float deltaTime)
	   {
		    Graphics g = game.getGraphics();
		    g.drawPixmap(Assets.player, 0, 0);
	   }
	   @Override
	   public void pause()
	   {
		   
	   }
	   @Override
	    public void resume() 
	   	{
	        
	    }

	    @Override
	    public void dispose() 
	    {
	        
	    }
}
