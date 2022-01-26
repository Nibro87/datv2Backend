package entities.DTO;

import java.util.List;

public class BoatDTO {

    private Long id;
    private String name;
    private String brand;
    private String year;
    private String imageUrl;
    private AuctionDTO auctionDTO;
    private List<UserDTO> userList;

    public BoatDTO() {
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

    public AuctionDTO getAuctionDTO() {
        return auctionDTO;
    }

    public void setAuctionDTO(AuctionDTO auctionDTO) {
        this.auctionDTO = auctionDTO;
    }

    public List<UserDTO> getUserList() {
        return userList;
    }

    public void setUserList(List<UserDTO> userList) {
        this.userList = userList;
    }
}
