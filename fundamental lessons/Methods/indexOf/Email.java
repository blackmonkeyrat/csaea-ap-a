public class Email {
    
    private String address;

    public Email(String address) {
        this.address = address;
    }

    public String toString() {
        return address;
    }

    public String getDomain() {
        return address.substring(address.indexOf(".")+1, address.length());
    }

    //getUser will return everything to the left of the @ symbol in the email address
    public String getUser() {
        return address.substring(0, address.indexOf("@"));
    }

    public int getAtIndex() {
        return address.indexOf("@");
    }

    public String getFirstName() {
        return getUser().substring(0, getUser().indexOf("."));
    }

    public String changeDomain(String domain) {
        return this.getUser() + "@" + domain;
    }

    public boolean isSchool() {
        return address.indexOf("hcvsd.org") != -1;
    }

}