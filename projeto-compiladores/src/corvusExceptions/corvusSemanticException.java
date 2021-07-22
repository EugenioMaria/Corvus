package corvusExceptions;

public class corvusSemanticException extends RuntimeException{
    public corvusSemanticException(String errorMsg){
        super(errorMsg);
    }
}
