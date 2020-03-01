package Dao.in.out.out;

public class CustomerListOutDTO {
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRealName(String realName) {
        this.realName = realName;
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

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    private Integer customerId;
    private String username;
    private String realName;
    private String mobile;
    private String email;
    private Byte status;
    private Long createTimestamp;

    public Integer getCustomerId() {
        return customerId;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
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

    public Long getCreateTimestamp() {
        return createTimestamp;
    }
}
