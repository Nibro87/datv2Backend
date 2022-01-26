package entities;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity(name = "boat")
public class Boat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="boat_name", length=20, nullable = false,unique = false )
    private String name;

    @Column(name="boat_brand", length=20, nullable = false,unique = false )
    private String brand;

    @Column(name="boat_year", length=8, nullable = false,unique = false )
    private String year;

    @Column(name="boat_imageurl", length=50, nullable = false,unique = false )
    private String imageUrl;

    @ManyToOne(cascade = CascadeType.ALL)
    private Auction auction;

    @ManyToMany(mappedBy = "boatList")
    private List<User> userList;

    public Boat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
