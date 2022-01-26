package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "action")
public class Auction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="Action_name", length=15, nullable = false,unique = false )
    private String name;

    @Column(name="Action_date", length=15, nullable = false,unique = false )
    private String date;

    @Column(name="Action_time", length=15, nullable = false,unique = false )
    private String time;

    @Column(name="Action_location", length=15, nullable = false,unique = false )
    private String location;

    @OneToMany(mappedBy = "auction", cascade = CascadeType.ALL)
    private List<Boat> boatList;



    public Auction() {
    }

    public Auction(String name, String date, String time, String location) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
