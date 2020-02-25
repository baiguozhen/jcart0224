package Dao.in.out.out;

public class OrderProductShowOutDTO {
    public void setProducetId(Integer producetId) {
        this.producetId = producetId;
    }

    public void setProducetCode(String producetCode) {
        this.producetCode = producetCode;
    }

    public void setProducetName(String producetName) {
        this.producetName = producetName;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setUnitRewordPoints(Integer unitRewordPoints) {
        this.unitRewordPoints = unitRewordPoints;
    }

    private Integer producetId;
    private String producetCode;
    private String producetName;
    private Integer quantity;
    private Double unitPrice;
    private Integer unitRewordPoints;

    public Integer getProducetId() {
        return producetId;
    }

    public String getProducetCode() {
        return producetCode;
    }

    public String getProducetName() {
        return producetName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public Integer getUnitRewordPoints() {
        return unitRewordPoints;
    }
}
