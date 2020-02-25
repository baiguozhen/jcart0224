package in;

public class OrderHistoryCreateInDTO {
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCustomerNotified(Boolean customerNotified) {
        this.customerNotified = customerNotified;
    }

    private Long orderId;
    private Byte orderStatus;
    private String comment;
    private Boolean customerNotified;

    public Long getOrderId() {
        return orderId;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public String getComment() {
        return comment;
    }

    public Boolean getCustomerNotified() {
        return customerNotified;
    }
}
