//Create a class monkey with jump( ) and bite ( ) methods Create a class human which inherits this monkey class and implement basic animal interface with eat ( ) and sleep methods
//
class Monkey {
    public void jump() {
        System.out.println("Monkey is jumping..Hupp Hupp");
    }
    public void bite() {
        System.out.println("Biting..szzzzzzzzzzz..");
    }
}
interface BasicAnimal {
    public void eat();
    public void sleep();
}
class Human extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("I am eating..yum yum");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping..zzzzzzzzzzzzzz");
    }
}
public class CodeXam {
    public static void main(String[] args) {
        Human human = new Human();
        human.jump();
        human.bite();
        human.eat();
        human.sleep();

    }
}