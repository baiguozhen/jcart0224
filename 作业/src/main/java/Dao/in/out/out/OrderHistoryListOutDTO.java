package Dao.in.out.out;

public class OrderHistoryListOutDTO {
    public void setOrderHistoryId(Long orderHistoryId) {
        this.orderHistoryId = orderHistoryId;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
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

    private Long orderHistoryId;
    private Long timestamp;
    private Byte orderStatus;
    private String comment;
    private Boolean customerNotified;

    public Long getOrderHistoryId() {
        return orderHistoryId;
    }

    public Long getTimestamp() {
        return timestamp;
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
