package hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    private static int nbDigitalVideoDiscs = 0;
    private int id;
    
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public boolean equals(DigitalVideoDisc b) {
        if (b == null) return false;

        boolean titleEquals = (this.title == null && b.title == null) || 
                              (this.title != null && this.title.equals(b.title));
        boolean categoryEquals = (this.category == null && b.category == null) || 
                                 (this.category != null && this.category.equals(b.category));
        boolean directorEquals = (this.director == null && b.director == null) || 
                                  (this.director != null && this.director.equals(b.director));
        boolean lengthEquals = this.length == b.length;
        boolean costEquals = this.cost == b.cost;

        return titleEquals && categoryEquals && directorEquals && lengthEquals && costEquals;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String toString() {
        return String.format("DVD - %s - %s - %s - %d: %.2f $",
                getTitle(), getCategory(), getDirector(), getLength(), getCost());
    }

    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }
}
