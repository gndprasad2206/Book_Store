class Store_7{
  Scanner sc=new Scanner(System.in);
  ArrayList<Book_7> books=new ArrayList<Book_7>();
  public void addBook(Book_7 b){
    books.add(b);
    System.out.println("New Book Added Successfully");
  }
  public void priceOfAllBooks(){
    double totalPrice=0;
    boolean b=books.isEmpty();
    if(b==false){
      for(Book_7 book:books){
        totalPrice=totalPrice+book.getPrice();
      }
      System.out.println("Price Of All Books: "+totalPrice);
    }
    else{
      System.out.println("The Store is Empty");
    }
  }
  public void removeWithId(int id){
    boolean b=books.isEmpty();
    int c=0;
    if(b==false){
      for(Book_7 book:books){
        if(book.getId()==id){
          System.out.println("Book Id: "+book.getId());
          System.out.println("Book Title: "+book.getTitle());
          System.out.println("Book Author: "+book.getAuthor());
          System.out.println("Book Price: "+book.getPrice());
          books.remove(book);
          c++;
        }
      }
      if(c==0){
        System.out.println("Book is not found with Id: "+id);
      }
    }
    else{
      System.out.println("Store is Empty");
    }
  }
  public void updatePriceWithId(int id){
    boolean b=books.isEmpty();
    int c=0;
    if(b==false){
      for(Book_7 book:books){
        if(book.getId()==id){
          System.out.print("Enter New Price: ");
          double price1=sc.nextDouble();
          book.setPrice(price1);
          System.out.println("Updated Price Successfully");
          c++;
        }
      }
      if(c==0){
        System.out.println("Book is not found with Id: "+id);
      }
    }
    else{
      System.out.println("Store is Empty");
    }
  }
  public void searchWithAuthor(String author){
    boolean b=books.isEmpty();
    int c=0;
    if(b==false){
      for(Book_7 book:books){
        if(book.getAuthor().equalsIgnoreCase(author)){
          System.out.println("Book Id: "+book.getId());
          System.out.println("Book Title: "+book.getTitle());
          System.out.println("Book Author: "+book.getAuthor());
          System.out.println("Book Price: "+book.getPrice());
          c++;
        }
      }
      if(c==0){
        try{
          throw new BookNotFoundException("BookNotFoundException");
        }
        catch(BookNotFoundException e){
          System.out.println("Exception: "+e.getMessage());
        }
      }
    }
    else{
      System.out.println("Store is Empty");
    }
  }
}