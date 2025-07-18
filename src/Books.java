public class Main {
    private static int ID_counter=0;
    private int ID;
    private String name;
    private String author;
    private int publishedYear;

    public Main(String name, String author, int publishedYear) {    //constructor(bilgiyi al ve nesneye ata)
        this.name=name;
        this.author=author;
        this.publishedYear=publishedYear;
        ID_counter++;    //ID=0 ile başlattık, ++ ile birbir arttırdığımız için ilk kitanbın IDsi 1 ile başlar
        this.ID=ID_counter;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {     //seID silindi çünkü dışarıdan erişim sağlanmasın ve değiştirilmesin
        return ID;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }










}