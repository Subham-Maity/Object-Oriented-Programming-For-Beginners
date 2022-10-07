// Java program to demonstrate Wrapping and UnWrapping
// in Java Classes
class CodeXam {
    public static void main(String args[]) {
        // byte data type
        byte a = 1;

        // wrapping around Byte object
        Byte byteObj = new Byte(a);

        // int data type
        int b = 10;

        //wrapping around Integer object
        Integer intObj = new Integer(b);

        // float data type
        float c = 18.6f;

        // wrapping around Float object
        Float floatObj = new Float(c);

        // double data type
        double d = 250.5;

        // Wrapping around Double object
        Double doubleObj = new Double(d);

        // char data type
        char e='a';

        // wrapping around Character object
        Character charObj=e;

        // printing the values from objects
        System.out.println("Values of Wrapper objects (printing as objects)");
        System.out.println("Byte object byteObj: " + byteObj);
        System.out.println("Integer object intObj: " + intObj);
        System.out.println("Float object floatObj: " + floatObj);
        System.out.println("Double object doubleObj: " + doubleObj);
        System.out.println("Character object charObj: " + charObj);

        // objects to data types (retrieving data types from objects)
        // unwrapping objects to primitive data types
        byte bv = byteObj;
        int iv = intObj;
        float fv = floatObj;
        double dv = doubleObj;
        char cv = charObj;

        // printing the values from data types
        System.out.println("Unwrapped values (printing as data types)");
        System.out.println("byte value, bv: " + bv);
        System.out.println("int value, iv: " + iv);
        System.out.println("float value, fv: " + fv);
        System.out.println("double value, dv: " + dv);
        System.out.println("char value, cv: " + cv);
    }
}


