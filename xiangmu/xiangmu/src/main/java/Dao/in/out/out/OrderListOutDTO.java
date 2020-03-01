package Dao.in.out.out;

public class OrderListOutDTO {
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public void setTotalPirce(Double totalPirce) {
        this.totalPirce = totalPirce;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public void setUpdateTiestamp(Long updateTiestamp) {
        this.updateTiestamp = updateTiestamp;
    }

    private Long orderId;
    private Integer customerId;
    private String customerName;
    private Byte status;
    private Double totalPirce;
    private Long createTimestamp;
    private Long updateTiestamp;

    public Long getOrderId() {
        return orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Byte getStatus() {
        return status;
    }

    public Double getTotalPirce() {
        return totalPirce;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public Long getUpdateTiestamp() {
        return updateTiestamp;
    }
}
