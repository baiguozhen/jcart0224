package Dao.in.out.out;

import java.util.List;

public class OrderShowOutDTO {
    public Long getOrderId() {
        return orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public Byte getStatus() {
        return status;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public Integer getRewordPoints() {
        return rewordPoints;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public Long getUpdateTimestamp() {
        return updateTimestamp;
    }

    public Short getShipMethod() {
        return shipMethod;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public Double getShipPrice() {
        return shipPrice;
    }

    public Short getPayMethod() {
        return payMethod;
    }

    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    public Double getInvoicePrice() {
        return invoicePrice;
    }

    public String getComment() {
        return comment;
    }

    public List<OrderProductShowOutDTO> getOrderProducts() {
        return orderProducts;
    }

    private Long orderId;
    private Integer customerId;
    private Byte status;
    private Double totalPrice;
    private Integer rewordPoints;
    private Long createTimestamp;
    private Long updateTimestamp;
    private Short shipMethod;
    private String shipAddress;
    private Double shipPrice;
    private Short payMethod;
    private String invoiceAddress;
    private Double invoicePrice;
    private String comment;
    private List<OrderProductShowOutDTO> orderProducts;

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setRewordPoints(Integer rewordPoints) {
        this.rewordPoints = rewordPoints;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public void setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public void setShipMethod(Short shipMethod) {
        this.shipMethod = shipMethod;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public void setShipPrice(Double shipPrice) {
        this.shipPrice = shipPrice;
    }

    public void setPayMethod(Short payMethod) {
        this.payMethod = payMethod;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public void setInvoicePrice(Double invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setOrderProducts(List<OrderProductShowOutDTO> orderProducts) {
        this.orderProducts = orderProducts;
    }
}
