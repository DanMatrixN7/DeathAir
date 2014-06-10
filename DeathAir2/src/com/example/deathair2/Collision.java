package com.example.deathair2;

import java.util.List;
import com.example.deathair2.Rectangle;
import com.example.deathair2.Phil;
import com.example.deathair2.Obstacle;


public class Collision {
	
	Obstacle[] obstacles;
	
	public static boolean RectCollision(Phil phil, Obstacle obj)
	{ 
		for(int i = 0; i < obstacles.size(); ++i) 
		{
			if(phil.getBounds(64, 64).intersects(obstacles.get(i).getBounds())) 
			{ 
				return true; 
			} 
			 
		}
		return false;
	}
}
 
 
 