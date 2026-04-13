public class Person {
        private final String name;

        public Person(String name) {
            this.name = java.util.Objects.requireNonNull(name);
        }


        public String getName() { return this.name; }
        @Override
        public String toString() { return "Person [name=" + this.name + "]"; }

}
