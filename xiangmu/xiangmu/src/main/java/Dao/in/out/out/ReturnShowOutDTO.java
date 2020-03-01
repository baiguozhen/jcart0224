package Dao.in.out.out;

public class ReturnShowOutDTO {
    public Integer getReturnId() {
        return returnId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getOrderTimestamp() {
        return orderTimestamp;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public Byte getStatus() {
        return status;
    }

    public Byte getAction() {
        return action;
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

    public Byte getReason() {
        return reason;
    }

    public Boolean getOpened() {
        return opened;
    }

    public String getComment() {
        return comment;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public Long getUpdateTimestamp() {
        return updateTimestamp;
    }

    private Integer returnId;
    private Long orderId;
    private Long orderTimestamp;
    private Integer customerId;
    private String customerName;
    private String mobile;
    private String email;
    private Byte status;
    private Byte action;
    private String  producetCode;
    private String producetName;
    private Integer quantity;
    private Byte reason;
    private Boolean opened;
    private String comment;
    private Long createTimestamp;
    private Long updateTimestamp;

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setOrderTimestamp(Long orderTimestamp) {
        this.orderTimestamp = orderTimestamp;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public void setAction(Byte action) {
        this.action = action;
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

    public void setReason(Byte reason) {
        this.reason = reason;
    }

    public void setOpened(Boolean opened) {
        this.opened = opened;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public void setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
}
