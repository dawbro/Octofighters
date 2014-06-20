package net.mewplex.octo;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class U extends BasicGameState {
	private Image i;
	private Image p;
	float mouseX;
	float mouseY;
	private Sound s;
	private Music m;
	public U(int state){

	}
	
	
	@Override
	public void init(GameContainer container, StateBasedGame sbg)throws SlickException {		
		m = new Music("res/OctoFightersMusic.wav");
		i = new Image("res/OctoFightersStartMENU.jpg");
		p = new Image("res/PlayQuit.png");
		s = new Sound("res/hometown.wav");
		m.loop();
		
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException {
			g.setBackground(Color.cyan);
			int xMouse;
			boolean soundPlayed = false;
			int yMouse;
			mouseX = Mouse.getX();
			mouseY = Mouse.getY();			
			xMouse=Mouse.getX();
			yMouse=Mouse.getY();
			g.drawImage(i,0,0);
			g.drawImage(p,547,260);
			//g.drawString("MouseX= "+xMouse+":"+"MouseY= "+yMouse, 50, 50);
			if((mouseX>548&&mouseX<743)&&(mouseY>359&&mouseY<459)){
				g.setColor(Color.blue);
				if(Mouse.isButtonDown(0)){
					sbg.enterState(1);
				}
			}else{
			}
			if((mouseX>548&&mouseX<743)&&(mouseY>262&&mouseY<357)){
				g.setColor(Color.red);
				
				if(Mouse.isButtonDown(0)){
					System.exit(0);
				}
			}else{
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)){
				System.exit(0);
			}
	}

	@Override
	public void update(GameContainer gcc, StateBasedGame sbg, int delta)throws SlickException {
		Input i = gcc.getInput();

	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
