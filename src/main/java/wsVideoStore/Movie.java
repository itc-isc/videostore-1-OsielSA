package wsVideoStore;

public abstract class Movie
{
	public static final int REGULAR = 1;
    public static final int NEW_RELEASE = 2;
	public static final int CHILDRENS = 3;
	
    private String title;
	private int price;

	public Movie(String title) {
		this.title 		= title;
	}
		
	public String getTitle () {
		return title;
	}

	public abstract double determineAmount(int daysRented);

 	public abstract int determineFrequentRenterPoints(int daysRented);

	public void setPriceCode(int price){
		this.price = price;
	}
	public int getPriceCode() {
		return price;
	}
}