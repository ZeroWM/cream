package tdd;

public class StringArrayArgumentMarshaler implements ArgumentMarshaler {


    public static String[] getValue(ArgumentMarshaler argumentMarshaler) {
        return new String[0];
    }

    public void set(Iterable<String> currentArgument) throws ArgsException {

    }
}
