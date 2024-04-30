package io.github.samwiz.parking_lot_using_springboot.exceptions;

public class InvalidGateException extends Exception
{
    public InvalidGateException(String message)
    {
        super(message);
    }
}
