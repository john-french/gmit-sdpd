public class TestScopeExamples {

    public static void main(String[] args) {
        ClassScopeExample classScopeExample = new ClassScopeExample();
        classScopeExample.incrementAmount(); // amount now = 1
        classScopeExample.addToAmount(5); // amount now = 6

//        MethodScopeExample methodScopeExample = new MethodScopeExample();

        ShadowingExample shadowingExample = new ShadowingExample();
        shadowingExample.printTitle();
    }



}
