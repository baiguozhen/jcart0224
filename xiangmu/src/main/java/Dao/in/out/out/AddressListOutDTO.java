package Dao.in.out.out;

public class AddressListOutDTO {
    public Integer getAddressId() {
        return addressId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public String getContent() {
        return content;
    }

    public String getTag() {
        return tag;
    }

    private Integer addressId;
    private String receiverName;
    private String receiverMobile;
    private String content;
    private String tag;

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
