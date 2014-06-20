package net.mewplex.octo;

import java.awt.Menu;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.ScalableGame;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import de.lessvoid.nifty.slick2d.NiftyStateBasedGame;

public class Game extends StateBasedGame{
	public static int u = 0;
	public static int level1 = 1;
	public static int options = 2;
	public static int credits = 3;
	public static int level2 = 4;
	public static int level3 = 5;
	public static int level4 = 6;
	public static int level5 = 7;
	public static int level6 = 8;
	public static int level7 = 9;
	public static int level8 = 10;
	public static int level9 = 11;
	public static int level10 = 12;
	public static int level11 = 13;
	public static int level12 = 14;
	public static int level13 = 15;
	public static int level14 = 16;
	public static int level15 = 17;
	public static int level16 = 18;
	public static int level17 = 19;
	public static int level18 = 20;
	public static int level19 = 21;
	public static int level20 = 22;
	public static int level21 = 23;
	public static int level22 = 24;
	public static int level23 = 25;
	public static int level24 = 26;
	public static int level25 = 27;
	public static int level26 = 28;
	public static int level27 = 29;
	public static int level28 = 30;
	public static int level29 = 31;
	public static int level30 = 32;
	public static int level31 = 33;
	public static int level32 = 34;
	public static int level33 = 35;
	public static int level34 = 36;
	public static int level35 = 37;
	public static int level36 = 38;
	public static int level37 = 39;
	public static int level38 = 40;
	public static int level39 = 41;
	public static int level40 = 42;
	public static int level41 = 43;
	public static int level42 = 44;
	public static int level43 = 45;
	public static int level44 = 46;
	public static int level45 = 47;
	public static int level46 = 48;
	public static int level47 = 49;
	public static int level48 = 50;
	public static int level49 = 51;
	public static int level50 = 52;
	public static int login = 53;
	public static final int DEFAULT_WIDTH = 1280;
	public static final int DEFAULT_HEIGHT = 720;
	public static final String name="Octofighters B10051";
	private static AppGameContainer appgc;

	public Game(String name) {
		super(name);
		this.addState(new U(u));
		this.addState(new Options(options));
		this.addState(new Level1(level1));
		this.addState(new Level2(level2));
		this.addState(new Credits(credits));
	}

	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		this.getState(u).init(container, this);
		this.getState(options).init(container, this);
		this.getState(credits).init(container, this);
		this.getState(level1).init(container, this);
		this.getState(level2).init(container, this);
		this.enterState(u);
	}
	  
	public static void main(String[] args){
		try{
			appgc = new AppGameContainer(new Game(name),1280,720,false);
			appgc.setShowFPS(false);
			appgc.setIcon("res/icon.png");
			appgc.start();
			
		}catch(SlickException e){
			e.printStackTrace();
		}
	}
	

}
