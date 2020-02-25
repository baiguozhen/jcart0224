package in;

public class ReturnUpdateActionInDTO {
    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public void setAction(Byte action) {
        this.action = action;
    }

    private Integer returnId;
    private Byte action;

    public Integer getReturnId() {
        return returnId;
    }

    public Byte getAction() {
        return action;
    }
}
