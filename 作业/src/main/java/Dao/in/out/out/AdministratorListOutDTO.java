package Dao.in.out.out;

public class AdministratorListOutDTO {
    public void setAdministratorID(Integer administratorID) {
        this.administratorID = administratorID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    private Integer administratorID;
    private String username;
    private Byte status;
    private Long createTimestamp;

    public Integer getAdministratorID() {
        return administratorID;
    }

    public String getUsername() {
        return username;
    }

    public Byte getStatus() {
        return status;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }
}
