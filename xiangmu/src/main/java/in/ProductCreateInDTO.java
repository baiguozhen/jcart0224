package in;

import java.util.List;

public class ProductCreateInDTO {
    private String producetCode;
    private String producetName;
    private Double price;
    private Double discount;
    private Integer stockQuantity;
    private Byte status;
    private String mainPicurl;
    private Integer rewordPoints;
    private Integer sortOrder;
    private String description;
    private List<String> otherPicUrls;

    public void setProducetCode(String producetCode) {
        this.producetCode = producetCode;
    }

    public void setProducetName(String producetName) {
        this.producetName = producetName;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public void setMainPicurl(String mainPicurl) {
        this.mainPicurl = mainPicurl;
    }

    public void setRewordPoints(Integer rewordPoints) {
        this.rewordPoints = rewordPoints;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOtherPicUrls(List<String> otherPicUrls) {
        this.otherPicUrls = otherPicUrls;
    }

    public String getProducetCode() {
        return producetCode;
    }

    public String getProducetName() {
        return producetName;
    }

    public Double getPrice() {
        return price;
    }

    public Double getDiscount() {
        return discount;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public Byte getStatus() {
        return status;
    }

    public String getMainPicurl() {
        return mainPicurl;
    }

    public Integer getRewordPoints() {
        return rewordPoints;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getOtherPicUrls() {
        return otherPicUrls;
    }
}
