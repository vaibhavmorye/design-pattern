package adapter.main;

import adapter.depenency.DependencyEmailNotificationSenderImp;

public class ApplicationNotificationSender implements NotificationSender{

    private final DependencyEmailNotificationSenderImp dependencyEmailNotificationSenderImp;

    public ApplicationNotificationSender(DependencyEmailNotificationSenderImp dependencyEmailNotificationSenderImp) {
        this.dependencyEmailNotificationSenderImp = dependencyEmailNotificationSenderImp;
    }

    @Override
    public void sendNotification() {
        dependencyEmailNotificationSenderImp.sender();
    }

    /**
     * Good example of adapter pattern is spring security
     *  to use spring security you have to implement userdetails service
     *  but it doest provide class to store data in database
     *  we can create entity name user and store it in database
     *
     * @Entity
     *  class user {
     *      private int id;
     *      private string username;
     *      private String password
     *      private String email;
     *      // Getter & setter
     *
     *  }
     *
     *  but to use this calls we have to implement userdetails interface
     *  so spring security can use it to create and maintain application
     *
     *  But this defeat single responsibility principle of design
     *  now user class is entity + implementation this is very bad as code structure
     *
     *  instead we will create new class called security user which will implement userdetails service and its method
     *
     *  class SecurityUser implements userdetails {
     *
     *      // to adapt this change with user we will add User entity as member to class
     *
     *      private final User user;
     *
     *      private string getPassword(){
     *          // and use it from this method so that it can be used by userdetails
     *          user.getPassword();
     *      }
     *  }
     *
     * */
}
