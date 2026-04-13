public class BurrowChamber {
    private int food;
    private BurrowChamber left, right;

    public BurrowChamber(int food, BurrowChamber l, BurrowChamber r) {
        this.food = food;
        this.left = l;
        this.right = r;
    }

    public boolean trim() {
        boolean removed = false;

        if (left != null) {
            if (left.trimHelper()) {
                left = null;
                removed = true;
            } else {
                removed = left.trim() || removed;
            }
        }

        if (right != null) {
            if (right.trimHelper()) {
                right = null;
                removed = true;
            } else {
                removed = right.trim() || removed;
            }
        }

        return removed;
    }

    private boolean trimHelper() {
        if (left != null && left.trimHelper()) {
            left = null;
        }

        if (right != null && right.trimHelper()) {
            right = null;
        }

        boolean trimLeft = (left == null);
        boolean trimRight = (right == null);

        return food <= 0 && trimLeft && trimRight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(food).append("; ");

        if (left != null) {
            sb.append(left.toString()).append("; ");
        }
        if (right != null) {
            sb.append(right.toString()).append("; ");
        }

        return sb.toString();
    }

    public int totalFood(){
       int totalFood = 0;

       totalFood += food;

       if(left != null){
           totalFood += left.totalFood();
       }

       if(right != null){
           totalFood += right.totalFood();
       }

       return totalFood;
    }

    public int countLeaves()
    {
        if(left ==null && right == null ) {return 1;}

        int count = 0;

        if(left != null)
        {
            count += left.countLeaves();
        }

        if(right != null){
            count  += right.countLeaves();
        }

        return count;

    }

    public boolean allPathsContainPositive() {

        boolean leftPositive = false;
        boolean rightPositive = false;

        if (food > 0) {
            return true;
        }

        if (left != null)
        {
            leftPositive = left.allPathsContainPositive();
        }

        if(right != null)
        {
            rightPositive = right.allPathsContainPositive();
        }
        
        return leftPositive && rightPositive;
    }



}