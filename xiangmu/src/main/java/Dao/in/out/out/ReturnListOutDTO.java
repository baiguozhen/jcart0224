package Dao.in.out.out;

public class ReturnListOutDTO {
    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public void setOverId(Long overId) {
        this.overId = overId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setProducetCode(String producetCode) {
        this.producetCode = producetCode;
    }

    public void setProducetName(String producetName) {
        this.producetName = producetName;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public void setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    private Integer returnId;
        private Long overId;
        private Integer customerId;
        private String customerName;
        private String producetCode;
        private String producetName;
        private Byte status;
        private Long createTimestamp;
        private Long  updateTimestamp;

    public Integer getReturnId() {
        return returnId;
    }

    public Long getOverId() {
        return overId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProducetCode() {
        return producetCode;
    }

    public String getProducetName() {
        return producetName;
    }

    public Byte getStatus() {
        return status;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public Long getUpdateTimestamp() {
        return updateTimestamp;
    }
}
