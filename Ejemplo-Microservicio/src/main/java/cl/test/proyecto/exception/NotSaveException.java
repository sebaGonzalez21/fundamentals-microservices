package cl.test.proyecto.exception;

import java.io.Serializable;

public class NotSaveException extends Exception implements Serializable {

    private String message;

    public NotSaveException(String message){
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
