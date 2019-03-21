public class MethodScopeExample {

    public void methodA() {
        int area = 2;
    }
    public void methodB() {
//        // compiler error, area cannot be resolved to a variable
//        area = area + 2;
    }
}