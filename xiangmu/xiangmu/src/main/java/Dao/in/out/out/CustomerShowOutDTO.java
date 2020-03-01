package Dao.in.out.out;

public class CustomerShowOutDTO {
    public Integer getCustomerId() {
        return customerId;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getMpbile() {
        return mpbile;
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

    public Boolean getNewSubscribe() {
        return newSubscribe;
    }

    public Integer getRewordsPoints() {
        return rewordsPoints;
    }

    public Integer getDefaultAddressId() {
        return defaultAddressId;
    }

    private Integer customerId;
    private String username;
    private String realName;
    private String avatarUrl;
    private String mpbile;
    private String email;
    private Byte status;
    private Long createTimestamp;
    private Boolean newSubscribe;
    private Integer rewordsPoints;
    private Integer defaultAddressId;

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setMpbile(String mpbile) {
        this.mpbile = mpbile;
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

    public void setNewSubscribe(Boolean newSubscribe) {
        this.newSubscribe = newSubscribe;
    }

    public void setRewordsPoints(Integer rewordsPoints) {
        this.rewordsPoints = rewordsPoints;
    }

    public void setDefaultAddressId(Integer defaultAddressId) {
        this.defaultAddressId = defaultAddressId;
    }
}
