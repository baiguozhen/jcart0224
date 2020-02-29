package exception;

public class ClientException {
    private String errCode;

    public ClientException(String errCode, String errMsg){
//        super(errMsg);
        this.errCode = errCode;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }
}
