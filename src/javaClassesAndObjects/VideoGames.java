package javaClassesAndObjects;

public class VideoGames {
	
	private	String name = "";
	private String rating = "";
	private Integer dnldSize = 0;
	
	public VideoGames() {
		
	}
	public VideoGames(String name, String rating) {
		
	}
	public VideoGames(String name, String rating, Integer dnldSize) {
		
	}
	
	public String getName() {
		return name;
	}
	public String getRating() {
		return rating;
	}
	public Integer getDnldSize() {
		return dnldSize;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public void setRating(String newRating) {
		this.rating = newRating;
	}
	public void setDnldSize(Integer newDnldSize) {
		this.dnldSize = newDnldSize;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String wishlistMsg() {
		return "Add this game to your wishlist!";
	}
	public boolean isInStock() {
		return true;
	}

}
