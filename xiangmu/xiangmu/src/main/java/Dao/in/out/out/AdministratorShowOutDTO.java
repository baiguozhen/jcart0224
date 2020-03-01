package Dao.in.out.out;

public class AdministratorShowOutDTO {
    public Integer getAdministratorId() {
        return administratorId;
    }

    public String getUsername() {
        return username;
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

    private Integer administratorId;
    private String username;
    private String email;
    private String avatarUrl;
    private Byte status;

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
