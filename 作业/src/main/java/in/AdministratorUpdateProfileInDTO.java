package in;

public class AdministratorUpdateProfileInDTO {
    public String getRealName() {
        return realName;
    }

    public String getEmail() {
        return email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getPassword() {
        return password;
    }

    public Byte getStatus() {
        return status;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    private String realName;
    private String email;
    private String avatarUrl;
    private String password;
    private Byte  status;


}
