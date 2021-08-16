public abstract class Animal {

    protected String name;
    static int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public void run (int leng) {
        System.out.println(this.name + " пробежал " + leng + " м");
    }

    public void swim (int dist) {
        System.out.println(this.name + " проплыл " + dist + " м");
    }
}
