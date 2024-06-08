package com.api.customexceptions;

public class FrameExceptions extends RuntimeException{

    public FrameExceptions(String message){
        super(message);
    }
    public FrameExceptions(String message,Throwable cause){
        super(message,cause);
    }
}
