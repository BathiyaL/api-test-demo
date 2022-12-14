package restapi;

public class AuthenticationObject {

    private String username = "";
    private String userpassword = "";
    private String endpoint = "";
    private String payloadPath = "";
    private String tokenUrl = "";
    private String scopes = "";
    private String grantType = "";
    private String contentType = "";   

    
    

    /**
     * @return String return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return String return the userpassword
     */
    public String getUserpassword() {
        return userpassword;
    }

    /**
     * @param userpassword the userpassword to set
     */
    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    /**
     * @return String return the endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * @param endpoint the endpoint to set
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * @return String return the payloadPath
     */
    public String getPayloadPath() {
        return payloadPath;
    }

    /**
     * @param payloadPath the payloadPath to set
     */
    public void setPayloadPath(String payloadPath) {
        this.payloadPath = payloadPath;
    }

    /**
     * @return String return the tokenUrl
     */
    public String getTokenUrl() {
        return tokenUrl;
    }

    /**
     * @param tokenUrl the tokenUrl to set
     */
    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    /**
     * @return String return the scope
     */
    public String getScopes() {
        return scopes;
    }

    /**
     * @param scope the scope to set
     */
    public void setScopes(String... scopes) {
        this.scopes = String.join(" ",scopes);
    }

    /**
     * @return String return the grantType
     */
    public String getGrantType() {
        return grantType;
    }

    /**
     * @param grantType the grantType to set
     */
    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    /**
     * @return String return the contentType
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * @param contentType the contentType to set
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

}
