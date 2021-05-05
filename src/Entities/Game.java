package Entities;

import Abstract.BaseGameManager;
import Abstract.Entity;

public class Game implements Entity{

	private int gameId;
	private String gameName;
	private double gamePrice;
	private String gameGenre;
	
	public Game() {
		
	}

	public Game(int gameId, String gameName, double gamePrice, String gameGenre) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.gameGenre = gameGenre;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

	public String getGameGenre() {
		return gameGenre;
	}

	public void setGameGenre(String gameGenre) {
		this.gameGenre = gameGenre;
	}
}

