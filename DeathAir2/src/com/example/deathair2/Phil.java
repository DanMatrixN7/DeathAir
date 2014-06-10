package com.example.deathair2;

import com.example.deathair2.Rectangle;

public class Phil {
	
	public float x,y;
	public int vx, vy;
	
	public Phil(float x, float y, int vx, int vy)
	{
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}
	
	public Rectangle getBounds(int width, int height) {
		return new Rectangle(x, y, 64, 64);
	}

}
