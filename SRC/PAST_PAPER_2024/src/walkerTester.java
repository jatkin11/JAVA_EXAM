public class walkerTester {

    static void main() {

        Object[] myList = { 42, null, new Person("Alice"), 4.7,
                new Person("Bob"), new Person("Charly"), "Doris"
                ,
                new Person("Oscar"), null, new Person("Paola") };
        Voyager<Person> v = new Walker(myList, 'o');
        while (v.anotherVisitPossible()) {
            System.out.println(v.makeAVisit());
        }
    }
}
