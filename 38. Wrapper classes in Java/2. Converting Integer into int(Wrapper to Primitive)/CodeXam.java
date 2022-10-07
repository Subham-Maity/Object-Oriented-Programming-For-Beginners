public  class CodeXam {
    public static void main(String[] args) {
        //Converting Integer to int
        Integer a=new Integer(3);
        int i=a.intValue();//unboxing i.e converting Integer to int
        int j=a;//auto unboxing, now compiler will write a.intValue() internally

        System.out.println(a+" "+i+" "+j);
    }
}