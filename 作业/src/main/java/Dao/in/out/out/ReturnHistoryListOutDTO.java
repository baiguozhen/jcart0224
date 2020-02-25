package Dao.in.out.out;

public class ReturnHistoryListOutDTO {
    public Integer getReturnHistoryId() {
        return returnHistoryId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public Byte getReturnStatus() {
        return returnStatus;
    }

    public String getComment() {
        return comment;
    }

    public Boolean getCustomerNotified() {
        return customerNotified;
    }

    public void setReturnHistoryId(Integer returnHistoryId) {
        this.returnHistoryId = returnHistoryId;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setReturnStatus(Byte returnStatus) {
        this.returnStatus = returnStatus;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCustomerNotified(Boolean customerNotified) {
        this.customerNotified = customerNotified;
    }

    private Integer returnHistoryId;
    private Long timestamp;
    private Byte returnStatus;
    private String comment;
    private Boolean customerNotified;
}
