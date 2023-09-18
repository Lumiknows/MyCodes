

public class User {
        int userID;
        String username, email;

        User(int userID, String username, String email) {
            this.userID = userID;
            this.username = username;
            this.email = email;
        }
        User () {

        }
        void login() {
        System.out.println("You are now Logged In!");
        System.out.println("UserID: " + userID + " Username: " + username + " Email: " + email);
        }
        void logout() {
        System.out.println("You are now Logged Out!");
        }
    }