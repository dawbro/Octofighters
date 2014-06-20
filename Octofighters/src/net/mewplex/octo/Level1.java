package net.mewplex.octo;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Level1 extends BasicGameState {
	Image bg;
	Image ss1;
	Image ss2;
	Image ss3;
	Image ss4;
	Image ssl;
	Image ssf;

	public Level1(int state){
		
	}
	@Override
	public void init(GameContainer arg0, StateBasedGame arg1)	throws SlickException {
		bg = new Image("res/BackZGround.jpg");
		ss1 = new Image("res/ShooterStep#1.png");
	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g)throws SlickException {
		g.drawImage(bg,0,0);
		
	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 1;
	}

}
