package in;

public class ReturnSearchInDTO {
    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    private Integer returnId;
    private Long orderId;
    private String customerName;
    private String productCode;
    private String productName;
    private Byte status;

    public Integer getReturnId() {
        return returnId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public Byte getStatus() {
        return status;
    }
}
