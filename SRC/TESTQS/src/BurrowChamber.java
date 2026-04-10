public class BurrowChamber {
        private int food;
        private BurrowChamber left, right;

        public BurrowChamber(int food, BurrowChamber left, BurrowChamber right) {
            this.food = food;
            this.left = left;
            this.right = right;
        }

    public int countPositiveFoodChambers() {
        int count = 0;

        if (food > 0) {
            count++;
        }

        if (left != null) {
            count += this.left.countPositiveFoodChambers();
        }

        if (right != null)
        {
            count += this.right.countPositiveFoodChambers();
        }
        return count;
    }

        void main(String[] args) {

    }
}




