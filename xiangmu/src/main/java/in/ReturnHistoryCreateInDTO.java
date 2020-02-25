package in;

public class ReturnHistoryCreateInDTO {
    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public void setReturnStatus(Byte returnStatus) {
        this.returnStatus = returnStatus;
    }

    public void setCustomerNotifeid(Boolean customerNotifeid) {
        this.customerNotifeid = customerNotifeid;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    private Integer returnId;
    private Byte returnStatus;
    private Boolean customerNotifeid;
    private String comment;

    public Integer getReturnId() {
        return returnId;
    }

    public Byte getReturnStatus() {
        return returnStatus;
    }

    public Boolean getCustomerNotifeid() {
        return customerNotifeid;
    }

    public String getComment() {
        return comment;
    }
}
