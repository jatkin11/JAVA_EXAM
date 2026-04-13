public class BurrowTester {


    static void main() {

        BurrowChamber bc = new BurrowChamber(5,
                new BurrowChamber(0,
                        new BurrowChamber(-1, null, null),
                        new BurrowChamber(0, null, null)),
                new BurrowChamber(0,
                        new BurrowChamber(7, null, null),
                        new BurrowChamber(-9, null, null)));

        System.out.println(bc.allPathsContainPositive());
        System.out.println(bc.countLeaves());
        System.out.println(bc.totalFood());
        System.out.printf(bc.toString());
        System.out.println(bc.trim());
        System.out.printf(bc.toString());
    }
}
