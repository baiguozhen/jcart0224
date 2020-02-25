package in;

public class CustomerSearchInDTO {
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

    private String username;
    private String realName;
    private String mobile;
    private String email;
    private Byte status;

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
}
