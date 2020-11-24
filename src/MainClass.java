public class MainClass {
    final int x = 5;

    public static void sayHi() {
        System.out.println("Hello world");
    }

    public void sayHo() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        System.out.println("Test create object from another Class");
        MainClass myObj = new MainClass();
        SecondClass secondObj = new SecondClass();
        secondObj.SaySomething();

        System.out.println("----------------------------------------");
        System.out.println("Test class static and public method");
        System.out.println(myObj.x);
        System.out.println(secondObj.y);
        sayHi();
        myObj.sayHo();

        System.out.println("----------------------------------------");
        System.out.println("Test class encapsulation");
        EncapsulationClass encapObj = new EncapsulationClass();
        System.out.println("Get volume: " + encapObj.getVolume());
        encapObj.setVolume(10);
        System.out.println("After set volume: " + encapObj.getVolume());
    }
}
