package amimir.throwable;

import java.lang.Exception;

public class AmimirThrowable extends Exception{
    
    public AmimirThrowable(){}
    
    public AmimirThrowable(String errName){
        super(errName);
    }
}