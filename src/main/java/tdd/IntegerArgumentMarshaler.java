package tdd;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static tdd.ArgsException.ErrorCode.INVALID_INTEGER;
import static tdd.ArgsException.ErrorCode.MISSING_INTEGER;

public class IntegerArgumentMarshaler implements ArgumentMarshaler {
    private int intValue = 0;


    public static int getValue(ArgumentMarshaler am) {
        if(am != null && am instanceof IntegerArgumentMarshaler)
            return ((IntegerArgumentMarshaler) am).intValue;
        else
            return 0;
    }

    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            String parameter = currentArgument.next();
            int value = Integer.parseInt(parameter);
        }catch (NoSuchElementException e){
            throw new ArgsException(MISSING_INTEGER);
        }catch (NumberFormatException e){
            throw new ArgsException(INVALID_INTEGER);
        }
    }
}
