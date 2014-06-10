package com.example.deathair2;

import com.example.deathair2.Rectangle;



public class Obstacle {
	
	public float x,y;
		
	public Obstacle(float x, float y)
	{
		this.x = x;
		this.y = y;
						
	}
	
	public Rectangle getBounds(int width, int height) {
		return new Rectangle(x, y, 64, 64);
	}

}
