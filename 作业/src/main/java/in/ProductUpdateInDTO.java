package in;

import java.util.List;

public class ProductUpdateInDTO {
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public void setMainPicUrl(String mainPicUrl) {
        this.mainPicUrl = mainPicUrl;
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

    private Integer productId;
    private String productName;
    private Double price;
    private Double discount;
    private Integer stockQuantity;
    private Byte status;
    private String mainPicUrl;
    private Integer rewordPoints;
    private Integer sortOrder;
    private String description;
    private List<String> otherPicUrls;

    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
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

    public String getMainPicUrl() {
        return mainPicUrl;
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

