public class Node {
    private int data;
    private Node left, right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(int data) {
        this(data, null, null);
    }

    public int total(){
        int count = 0;

        count += data;

        if(left != null){
            count+= left.total();
        }

        if(right != null){
            count+= right.total();
        }

        return count;
    }

    public int countLeaves(){
        int count = 0;

        if(left == null && right == null){
            return 1;
        }

        if(left !=null )
        {
            count += left.countLeaves();
        }

        if(right !=null){
            count += right.countLeaves();
        }

        return count;
    }

    public boolean contains(int d){

        boolean leftContains = false;
        boolean rightContains = false;

        if(data == d){
            return true;
        }

        if(left != null){
            leftContains = left.contains(d);
        }

        if(right != null){
            rightContains = right.contains(d);
        }

        return leftContains || rightContains;
    }


    public int countGreaterThan(int x){
        int count = 0;

        if(data > x){count++;}

        if(left != null){
            count+= left.countGreaterThan(x);
        }

        if(right != null){
            count+= right.countGreaterThan(x);
        }

        return count;
    }

}