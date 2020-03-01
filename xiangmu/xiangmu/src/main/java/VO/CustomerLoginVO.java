package VO;

public class CustomerLoginVO {
    private Integer customerId;
    private String username;

    public void setCustomerId(Integer customerId){
        this.customerId=customerId;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
}
