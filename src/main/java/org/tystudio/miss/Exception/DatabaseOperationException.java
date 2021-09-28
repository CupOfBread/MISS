package org.tystudio.miss.Exception;

public class DatabaseOperationException extends RuntimeException {

    public DatabaseOperationException(String message) {
        super(message);
    }

    public DatabaseOperationException() {
    }
}
