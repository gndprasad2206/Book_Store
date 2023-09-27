class Book_7{
  private static int  nextId=1;
  private int id;
  private String title;
  private String author;
  private double price;
  public Book_7(String title,String author,double price){
    this.id=nextId++;
    this.title=title;
    this.author=author;
    this.price=price;
  }
  public int getId() {
	 return id;
  }
  public String getTitle() {
	 return title;
  }
  public String getAuthor() {
	 return author;
  }
  public void setPrice(double price){
    this.price=price;
  }
  public double getPrice() {
	 return price;
  }
}