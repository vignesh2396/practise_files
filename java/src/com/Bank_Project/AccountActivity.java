package Bank_Project;// overloading methods in java - same method name with different signature

public class AccountActivity {

        public void transferAccount(){

                // *    for encapsulation we can declare the variables as 'private' to protect our data from accessing or modifying by other classes
                // *    we can also declare and define the variable inside the method to hide the data from other classes
                // *    'final' keyword can be used if the access modifier of the variable is public so that
                // other classes can access the variable but they can't modify them.

                final int transactionId = 100;
                final int sourceId = 10_001;
                final int destId = 38_001;
                System.out.println("Amount transferred successfully to " + destId + " from " + sourceId + " and the transaction id is " + transactionId);
        }
        //method which displays some message
        public void displayMsg(){ System.out.println("message 1");}

        //method with string input
        public void displayMsg(String msg){
                System.out.println(msg);
        }

        public void displayMsg(int value){
                System.out.println(value);
        }
}