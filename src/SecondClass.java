public class SecondClass extends AbstractClass {
    int y;
    public SecondClass() {
        y = 10;
    }

    public void SaySomething() {
        SecondClass people = new SecondClass();
        System.out.println("Hello. My name is " + people.name);
    }

}
