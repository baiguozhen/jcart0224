package Dao.in.out.out;

public class AdministratorGetProfileOutDTO {
    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    private Integer administratorId;
    private String username;
    private String password;
    private String email;
    private String avatarUrl;
    private Byte status;
    private Long createTimestamp;

    public Integer getAdministratorId() {
        return administratorId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public Byte getStatus() {
        return status;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }
}
