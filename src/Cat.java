public class Cat extends Animal{

    static int count;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void swim (int dist) {
        System.out.println(this.name + " не умеет плавать");
    }
}
