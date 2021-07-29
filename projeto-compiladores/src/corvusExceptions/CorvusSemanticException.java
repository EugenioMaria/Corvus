package corvusExceptions;

public class CorvusSemanticException extends RuntimeException{
    public CorvusSemanticException(String errorMsg){
        super(errorMsg);
    }
}
