  package StackException;

public class StackException {
      public class OverFlowException extends Exception {
          public OverFlowException(String message){
              super(message);
          }
      }
      public class IsnotOverException extends Exception {
        public IsnotOverException(String message){
            super(message);
        }
    }
}





