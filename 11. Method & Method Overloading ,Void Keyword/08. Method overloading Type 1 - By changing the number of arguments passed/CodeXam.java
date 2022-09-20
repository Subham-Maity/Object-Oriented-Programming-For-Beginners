class calculate{
    int multiply(int a,int b){
        return a*b;
    }
    int multiply(int a,int b,int c){
        return  a*b*c;
    }

    public static void main(String[] args) {

        calculate obj = new calculate();
        int c = obj.multiply(5,4);
        int d = obj.multiply(5,4,3);
        System.out.println(c);
        System.out.println(d);

    }
}