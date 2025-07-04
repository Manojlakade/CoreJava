public class Substring {
    public static void main(String[] args) {
        String email = "manojlakade12345@gmail.com";
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@"));
        System.out.printf("%s\n%s",username,domain);
    }
}
