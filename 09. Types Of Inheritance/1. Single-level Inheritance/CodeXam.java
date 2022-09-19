class GrandFather {
    float salary=34534*12;
}

  class Father extends GrandFather{
      float bonus=3000*6;
  }
public class CodeXam {
    public static void main(String[] args) {
        Father f=new Father();
        System.out.println("Salary of GrandFather is "+f.salary);
        System.out.println("Bonus of Father is "+f.bonus);

    }
}