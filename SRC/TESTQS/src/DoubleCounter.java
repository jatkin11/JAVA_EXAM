public class DoubleCounter extends Counter{


    @Override
    public void click(){
        super.click();
        super.click();
    }

@Override
    public String toString(){

        return "count = " + super.getCount() + "in a double counter";
}

}
