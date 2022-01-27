package examenkilito.model;


public class ElemPatrimonial {
    private final String position;
    private final String name;
    private final String author;
    private final int year;
    private final String method;
    private final String material;
    private final String status;
    private final String pictures;
    private final String type;

    public ElemPatrimonial(String position, String name, String author, int year, String method, String material, String status, String pictures, String type) {
        this.position = position;
        this.name = name;
        this.author = author;
        this.year = year;
        this.method = method;
        this.material = material;
        this.status = status;
        this.pictures = pictures;
        this.type = type;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getMethod() {
        return method;
    }

    public String getMaterial() {
        return material;
    }

    public String getStatus() {
        return status;
    }

    public String getPictures() {
        return pictures;
    }

    public String getType() {
        return type;
    }
    
    
}
