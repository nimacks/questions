public class LikesFormatter {
     public static String likes(String... names) {

             String[] msgFormat = {
                     "no one likes this",
                     "- likes this",
                     "- and - like this",
                     "-, - and - like this",
                     "-, - and -- others like this"
             };

             String msg = msgFormat[Math.min(names.length, 4)];

             for (int i = 0; i < names.length; i++) {
                 msg = msg.replaceFirst("-", names[i]);
                 msg = msg.replaceFirst("--", "" + (names.length - 2));
             }
             return msg;
         }
}