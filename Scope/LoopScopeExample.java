public class LoopScopeExample {
    String[] listOfNames = {"Joe", "Susan", "Patrick"};

    public void iterationOfNames() {
       String allNames = "";
       for (String name : listOfNames) {
           allNames = allNames + " " + name;
       }
       // compiler error, name cannot be resolved to a variable
       String lastNameUsed = name;
    }
}
