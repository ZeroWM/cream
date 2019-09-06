package tdd;

import java.util.Iterator;

public class BooleanArgumentMarshaler implements ArgumentMarshaler{
    private boolean boolenValue = false;

    public static boolean getValue(ArgumentMarshaler am) {
        if(am != null && am instanceof BooleanArgumentMarshaler)
            return ((BooleanArgumentMarshaler)am).boolenValue;
        else
            return false;
    }

    public void set(Iterator<String> currentArgument) throws ArgsException {
        boolenValue = true;
    }
}
