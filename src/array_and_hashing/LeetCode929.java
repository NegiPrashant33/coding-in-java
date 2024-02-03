package array_and_hashing;
import java.util.*;
// Unique Email Addresses https://leetcode.com/problems/unique-email-addresses/description/
public class LeetCode929 {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        Set<String> uniqueEmails = new HashSet<>();
        for(String email : emails) {
            String formattedEmail = getFormattedEmail(email);
            uniqueEmails.add(formattedEmail);
        }

        System.out.println(uniqueEmails.size());
    }

    static String getFormattedEmail(String email) {
        String[] arr = email.split("@");
        String localName = arr[0];
        String domainName = arr[1];

        String[] arrLocalWithPlus = localName.split("\\+");
        localName = arrLocalWithPlus[0];

        localName = localName.replace(".", "");

        return localName + "@" + domainName;
    }
}
