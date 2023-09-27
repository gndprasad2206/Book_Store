public class BookStoreProject{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Store_7 s=new Store_7();
    while(true){
      System.out.println();
      System.out.println("1. Add books\n2. Calculate total price of all books\n3. Remove a book by book_id\n4. Update book price by book_id\n5. Search books by author\n6. Quit the program\nSelect One Option");
      int choice=sc.nextInt();
      switch(choice){
        case 1:
          System.out.println();
          sc.nextLine();
          System.out.print("Enter Title: ");
          String title=sc.nextLine();
          System.out.print("Author Name: ");
          String author=sc.nextLine();
          System.out.print("Price Of Book: ");
          double price=sc.nextDouble();
          Book_7 book=new Book_7(title,author,price);
          s.addBook(book);
          break;
        case 2:
          s.priceOfAllBooks();
          break;
        case 3:
          System.out.print("Enter The Book Id: ");
          int bid1=sc.nextInt();
          s.removeWithId(bid1);
          break;
        case 4:
          System.out.print("Enter the Book Id: ");
          int bid2=sc.nextInt();
          s.updatePriceWithId(bid2);
          break;
        case 5:
          System.out.print("Enter the Author Name: ");
          sc.nextLine();
          String author1=sc.nextLine();
          s.searchWithAuthor(author1);
          break;
        case 6:
          System.out.println("Shut Down........");
          System.exit(0);
      }
    }
  }
}