package tdd;

import java.util.NoSuchElementException;

import static tdd.ArgsException.ErrorCode.MISSING_STRING;

public class StringArgumentMarshaler implements ArgumentMarshaler {
    private String stringValue = "";

    public void set(Iterable<String> currentArgument) throws ArgsException {
        try{
            stringValue = currentArgument.iterator().next() ;
        }catch (NoSuchElementException e){
            throw new ArgsException(MISSING_STRING);
        }
    }

    public static String getValue(ArgumentMarshaler am) {
        if(am != null && am instanceof StringArgumentMarshaler) {
            return ((StringArgumentMarshaler)am).stringValue;
        }else {
            return "";
        }
    }
}
