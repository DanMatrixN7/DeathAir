package com.example.deathair2;

public class Rectangle {
	public float x, y;
	public int width, height;

	public Rectangle(float x, float y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public Rectangle getBounds(int width, int height) {
		return new Rectangle(x, y, width, height);
	}

}
