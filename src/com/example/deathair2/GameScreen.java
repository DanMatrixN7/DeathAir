package com.example.deathair2;

import java.util.List;
import com.example.deathair.framework.Game;
import com.example.deathair.framework.Graphics;
import com.example.deathair.framework.Input.TouchEvent;
//import com.example.deathair.framework.Pixmap;
import com.example.deathair.framework.Screen;
import com.example.deathair2.Phil;
//import android.view.MotionEvent;
import  android.util.Log;


public class GameScreen extends Screen {
	
	 enum GameState {
	        Ready,
	        Running,
	        Paused,
	        GameOver
	    }
	    
	    GameState state = GameState.Ready;
	    Phil phil;
	   
	public GameScreen(Game game) 
	{
        super(game);
        phil = new Phil(125, 50, 0, 0);
       
    }
	   @Override
	   public void update(float deltaTime)
	   {
		   List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
	       game.getInput().getKeyEvents();
	        
	        if(state == GameState.Ready)
	            updateReady(touchEvents);
	        if(state == GameState.Running)
	        	 updateRunning(touchEvents, deltaTime);
	        if(state == GameState.Paused)
	            updatePaused(touchEvents);
	        if(state == GameState.GameOver)
	            updateGameOver(touchEvents);
	   }
	   
	   private void updateReady(List<TouchEvent> touchEvents) {
	        if(touchEvents.size() > 0)
	            state = GameState.Running;
	    }
	   
	   private void updateRunning(List<TouchEvent> touchEvents, float deltaTime) {        
	        int len = touchEvents.size();
	        for(int i = 0; i < len; i++) {
	            TouchEvent event = touchEvents.get(i);
	            if(event.type == TouchEvent.TOUCH_UP) {
	                //phil.vx = 0;
	                //phil.vy = 0;
	            }
	            
	            if(event.type == TouchEvent.TOUCH_DOWN) {
	            	event.getX();
	            	event.getY();
	            	phil.x = event.getX() - 32;
	            	phil.y = event.getY() - 32;
	              	Log.e(String.valueOf(event.getX()), String.valueOf(event.getY()));
	              	
	              	
	            	
	             }
	            
	            if(event.type == TouchEvent.TOUCH_DRAGGED) {
	            	
	            	if(event.x > phil.x || event.x < phil.x) 
	            	{
	            		phil.x = event.x;
	            	}
	            	if(event.y > phil.y || event.y < phil.y)
	            	{
	            		phil.y = event.y;
	            	}
	            	
	            	/*if(event.getX() == phil.x && event.getY() == phil.y)
	            	{
	            		phil.x += 1;
	            	}*/
	            }
	        }
	   }
	            
	   
	   /*private boolean onTouchEvent(MotionEvent event) {
	       int action = event.getAction();
	   switch (action) {
	       case MotionEvent.ACTION_DOWN:
	    	   phil.x = event.getX();
	           phil.y = event.getY();
	           break;
	       case MotionEvent.ACTION_MOVE:
	    	   phil.vx = 10;
	           phil.vy = 10;
	           break;
	       case MotionEvent.ACTION_UP:
		       phil.vx = 0;
		       phil.vy = 0;
	           break;
	       }

	       return true;
	   }*/
	   
	   private void drawReadyUI() {
	        Graphics g = game.getGraphics();
	        
	        g.drawPixmap(Assets.ready, 0, 0);
	        
	    }
	   
	   private void drawRunningUI() {
	        Graphics g = game.getGraphics();
	        
	        g.drawPixmap(Assets.background, 0, 0);
		    g.drawPixmap(Assets.player, (int)phil.x, (int)phil.y);
		    g.drawPixmap(Assets.crate, 125, 300);

	    }
	   
	   private void updatePaused(List<TouchEvent> touchEvents) {
	        
	        }
	    

	   private void updateGameOver(List<TouchEvent> touchEvents) {
	        
	        }
	  
	   @Override
	   public void present(float deltaTime)
	   {
		    Graphics g = game.getGraphics();
		    if(state == GameState.Ready) 
	            drawReadyUI();
		    if(state == GameState.Running)
		    	drawRunningUI();
		   
		   
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
