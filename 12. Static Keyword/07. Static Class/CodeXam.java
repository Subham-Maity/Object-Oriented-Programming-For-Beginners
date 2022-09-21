public class CodeXam {

    private static String str = "CodeXam";

    // Static class
    static class MyNestedClass {

        // non-static method
        public void disp(){
            System.out.println(str);
        }
    }

    public static void main(String args[])
    {
        CodeXam.MyNestedClass obj = new CodeXam.MyNestedClass();
        obj.disp();
    }
}