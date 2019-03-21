public class ShadowingExample {
    String title = "John French";

    public void printTitle() {
        System.out.println("*** Shadowing Example ***");
        System.out.println(title);
        String newtitle = "John Doe";
        System.out.println(newtitle);
    }
}
