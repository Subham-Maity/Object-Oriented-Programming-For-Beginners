class calculate {
    static int add(int a , int b){
        return a + b;
    }
    static int add(int a , int b, int c){
        return a + b + c;
    }
    static int add(int a , int b, int c, int d){
        return a + b + c + d;
    }

    public static void main(String[] args){
        System.out.println(add(1,2));
        System.out.println(add(2,3,4));
        System.out.println(add(4,5,6,7));
    }
}