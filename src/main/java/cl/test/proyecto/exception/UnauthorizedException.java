package cl.test.proyecto.exception;

public class UnauthorizedException extends Exception{

    private String message;

    public UnauthorizedException(String message){
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
