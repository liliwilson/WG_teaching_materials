// Password exercise in Java by Lili Wilson for Wilstaetter Gymnasium, 25.01.2024

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class PasswordExercise {
    private static Map<String, String> passwordHashes = new HashMap<>();

    // Hashed passwords of the people in the exercises
    static {
        passwordHashes.put("Bob", "5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8");
        passwordHashes.put("Jeremy", "1532e76dbe9d43d0dea98c331ca5ae8a65c5e8e8b99d3e2a42ae989356f6242a");
        passwordHashes.put("Olivia", "b4b619c0678def23b479283b0b5042c8f9736bf16d137bc349518aba30e34b6b");
        passwordHashes.put("Kelly", "3171d89ad00530ffa19a244f040e9401a657903cbbbca724996b90a56df2c189");
        passwordHashes.put("Kai", "8c3eab3a9d70f32824f03ccd2658d5e98ad97b3856a2ca5291cad70f3d4a4577");
        passwordHashes.put("Marissa", "403f9b0cae353aa6e0df37d8f0a3e31261072b2c5af892377441877dc142348a");
    }
    
    public static void checkAnswers() {
        int correctAnswers = 0;
        int totalAnswers = 0;

        for (Map.Entry<String, String> entry : passwordHashes.entrySet()) {
            String password = null;
            
            switch (entry.getKey()) {
                case "Bob":
                    password = crackPassword1();
                    break;
                case "Jeremy":
                    password = crackPassword2();
                    break;
                case "Olivia":
                    password = crackPassword3();
                    break;
                case "Kelly":
                    password = crackPassword4();
                    break;
                case "Kai":
                    password = crackPassword5();
                    break;
                case "Marissa":
                    password = crackPassword6();
                    break;

            }

            // Check if the computed hash matches the stored hash
            if (password != null && hashPassword(password).equals(entry.getValue())) {
                correctAnswers++;
                totalAnswers++;
                System.out.printf("\n%s's password... CRACKED! \"%s\" is correct.\n", entry.getKey(), password);
            } else if (password != null) {
                totalAnswers++;
                System.out.printf("\n%s's password... not cracked! \"%s\" is incorrect.\n", entry.getKey(), password);
            }
        }

        System.out.printf("\nNumber of correct answers: %d out of %d\n\n", correctAnswers, totalAnswers);
    
    }
    
    // Hash a password using SHA256, a common hashing algorithm
    // You don't need to fully understand this part, just know that you input a string password, and it returns a hashed version!
    private static String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes());
            StringBuilder hexHash = new StringBuilder();
            for (byte b : hash) {
                hexHash.append(String.format("%02x", b));
            }
            return hexHash.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();

            System.out.println("Hash algorithm does not exist");
            return null;
        }
    }

    public static String crackPassword1() {
        // use this space for any coding you do to find the password
        String password1 = null; // replace this with the string that you think is the password! 

        return password1;
    }

    public static String crackPassword2() {
        // use this space for any coding you do to find the password
        String password2 = null; // replace this with the string that you think is the password! 

        return password2; 
    }

    public static String crackPassword3() {
        // use this space for any coding you do to find the password
        String password3 = null; // replace this with the string that you think is the password! 

        return password3; 
    }
    
    public static String crackPassword4() {
        // use this space for any coding you do to find the password
        String password4 = null; // replace this with the string that you think is the password! 

        return password4; 
    }
    
    public static String crackPassword5() {
        // use this space for any coding you do to find the password
        String password5 = null; // replace this with the string that you think is the password! 

        return password5; 
    }
    
    public static String crackPassword6() {
        // use this space for any coding you do to find the password
        String password6 = null; // replace this with the string that you think is the password! 

        return password6; 
    }

    public static void main(String[] args) {
        checkAnswers();
    }

}
