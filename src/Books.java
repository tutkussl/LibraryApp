<<<<<<< HEAD
public class Main {
    private static int ID_counter=0;
    private int ID;
=======
public class Books {
    private int id;
>>>>>>> c987aec (Güncellendi)
    private String name;
    private String author;
    private int publishedYear;

<<<<<<< HEAD
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
=======
    public Books(int id, String name, String author, int publishedYear) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public int getId() {
        return id;
>>>>>>> c987aec (Güncellendi)
    }

    public String getName() {
        return name;
    }

<<<<<<< HEAD
    public void setName(String name) {
        this.name = name;
    }

    public int getID() {     //seID silindi çünkü dışarıdan erişim sağlanmasın ve değiştirilmesin
        return ID;
=======
    public String getAuthor() {
        return author;
>>>>>>> c987aec (Güncellendi)
    }

    public int getPublishedYear() {
        return publishedYear;
    }

<<<<<<< HEAD
    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }










}
=======
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
}
>>>>>>> c987aec (Güncellendi)
