
public class InvalidRuleConditionException extends RuntimeException {
     public InvalidRuleConditionException(){
    	 super();
     }
     
     public InvalidRuleConditionException(String message){
    	 super(message);
     }
     public InvalidRuleConditionException(String message , Exception e){
    	 super(message,e);
     }
     
}
