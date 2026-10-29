public class Password {

    public String secret;

    public Password(String secret) {
        this.secret = secret;
    }

    //BROKEN method: compares objects, not characters

    public boolean checkBroken(String attempt) {
        return secret == attempt;
    }

    public boolean check(String attempt) {
        return attempt.equals(secret);
    }

    public boolean sameAs(String other) {
        return this.secret.equals(other);
    }

    public String change(String newPass1, String newPass2) {
        if (newPass1 == newPass2 && newPass1 != secret) {
            return "New password: " + newPass1;
        }
        else {
            return "Enter a different password";
    }
        
    }


}
