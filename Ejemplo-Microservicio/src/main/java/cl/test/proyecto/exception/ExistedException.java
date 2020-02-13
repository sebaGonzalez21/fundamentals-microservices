package cl.test.proyecto.exception;

public class ExistedException extends Exception{

    private String message;

    public ExistedException(String message){
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
