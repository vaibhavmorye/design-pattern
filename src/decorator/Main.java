package decorator;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // you can define order
        SMSNotification sms_email_push_notification = new SMSNotification(new EmailNotification(new PushNotifcation(null)));
        sms_email_push_notification.send();

        SMSNotification sms_email = new SMSNotification(new SMSNotification(null));
        sms_email.send();

        // real life example will be java io stream reader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("file.txt")));
        System.out.println(bufferedReader.lines().findAny());

        /**
         * --> Extends
         * ==> implements
         *
         *  public class BufferedReader extends Reader {
         *
         *     private Reader in;
         *
         *  }
         *
         *  public class InputStreamReader extends Reader {
         *
         *     private final StreamDecoder sd;
         *
         *  }
         *
         *  bufferstreamreader , InputStreamReader and StreamDecoder ect all are reader
         *  they all can be used in combination
         *
         *  you can use class and interface
         *
         *
         *
         *
        * */


    }
}
