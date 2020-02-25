package in;

public class AdministratorResetPwdInDTO {
    public void setEmail(String email) {
        this.email = email;
    }

    public void setResetCode(String resetCode) {
        this.resetCode = resetCode;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }

    private String email;
    private String resetCode;
    private  String newPwd;

    public String getEmail() {
        return email;
    }

    public String getResetCode() {
        return resetCode;
    }

    public String getNewPwd() {
        return newPwd;
    }
}
