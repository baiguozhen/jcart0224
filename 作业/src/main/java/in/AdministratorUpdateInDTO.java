package in;

public class AdministratorUpdateInDTO {
    public void setAdministratodId(Integer administratodId) {
        this.administratodId = administratodId;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    private Integer administratodId;
    private String realName;
    private String password;
    private String email;
    private Byte status;

    public Integer getAdministratodId() {
        return administratodId;
    }

    public String getRealName() {
        return realName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Byte getStatus() {
        return status;
    }
}
