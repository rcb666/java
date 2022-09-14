package baobao.Demo2;

public class Test {
    public static void main(String[] args) {

        Swimming s1 = () -> {
            System.out.println("我去游泳~~~");
            };
        s1.swim();
        }
}

interface Swimming{
    void swim();
}
