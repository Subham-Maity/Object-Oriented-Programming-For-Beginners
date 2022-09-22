class calculate {
static int add(int x , int ...arr){
 int sum = 0;
     for (int a:arr){
     sum += a;
     }
       return sum;
}

    public static void main(String[] args){
        System.out.println(add());
        System.out.println(add(1,2));
        System.out.println(add(2,3,4));
        System.out.println(add(4,5,6));
    }
}
