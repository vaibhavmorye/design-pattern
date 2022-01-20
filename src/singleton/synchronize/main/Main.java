package singleton.synchronize.main;

public class Main {
     /**
      * create instance from outside should be impossible in singleton interface
      *
        Singleton1 singleton1 = new Singleton1(); 'Singleton1()' has private access in 'singleton.Singleton1'

        to make instance impossible to create make constructor private
        creation of instance now can only done inside same class for that we should use static method
        to store reference to single instance we will create member variable inside class and set it.


        In multithreaded environment multiple thread can try to create instance of singleton1 class
        only last object will be return from constructor and sucessfully assign to reference object

      */


}
