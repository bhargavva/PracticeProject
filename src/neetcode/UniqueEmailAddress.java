package neetcode;

public class UniqueEmailAddress {
    public static void main(String[] args) {
        int uniqueEmailsCount = findUniqueEmails(new String[] {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"});

        System.out.println(uniqueEmailsCount);
    }

    private static int findUniqueEmails(String[] emails) {
        int emailCount = 0;

        int length = emails.length;
        for (int i = 0; i < length; i++) {

            String domainName = emails[i].substring(emails[i].indexOf('@')+1, emails[i].lastIndexOf('.'));

            boolean isValid = true;
            for (int j = 0; j < domainName.length(); j++) {
                if(!Character.isLetter(domainName.charAt(j))){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                emailCount+=1;
            }
        }
        return emailCount;
    }
}
