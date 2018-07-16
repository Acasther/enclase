
package s10.pkg2;


public class User {

    public static boolean isValid(String UserName, String Password) {
        if (UserName.equals("@gmail.com")) {
            return true;
        }
        return false;     
    }
    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
    private String UserName;
    private String Password;
    
    
}
