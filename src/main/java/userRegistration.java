import java.util.regex.Pattern;

public class userRegistration {

    static String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
   static Pattern pat = Pattern.compile(regex);

    public static void registerUser(String username, String email, String password) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (email == null || !pat.matcher(email).matches()) {
            throw new IllegalArgumentException();
        }
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException();
        }
    }
}