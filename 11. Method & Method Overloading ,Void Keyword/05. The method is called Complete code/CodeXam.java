class calculate{
     int sum(int a,int b){
        return a+b;
    }

public static void main(String[] args) {
         
        calculate obj = new calculate();
        int c = obj.sum(5,4);
        System.out.println(c);
    }
}
