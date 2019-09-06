package tdd;

import java.util.Iterator;

public class StringArrayArgumentMarshaler implements ArgumentMarshaler {


    public static String[] getValue(ArgumentMarshaler argumentMarshaler) {
        return new String[0];
    }

    public void set(Iterator<String> currentArgument) throws ArgsException {

    }
}
