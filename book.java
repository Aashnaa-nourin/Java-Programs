public class book {

    private String title;
    private String author;
    private int price;
    public book(String title, String author, int price) 
    {
        this.title = title;
        this.author = author;
        this.price=price;
    }
    public void display()
    {
        System.out.println("Title: "+title+"Author:"+author+"Price:"+price);
    }
}