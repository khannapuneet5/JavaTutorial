package com.msci.bl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GameTest {
	private Game game;
	@Before
	public void setUp() throws Exception {
		game = new Game();
	}

	@After
	public void tearDown() throws Exception {
		game = null;
	}

	@Test
	public void testPlay1() {
		int guess = 10;
		game.play(guess);
		String result = game.getMessage();
		assertTrue(result.equals("Aim higher"));
	}
	
	@Test
	public void testIsGameOver(){
		assertTrue(game.isGameOver());
	}
	@Test
	public void testIsGameOver2(){
		assertFalse(game.isGameOver());
	}

}
