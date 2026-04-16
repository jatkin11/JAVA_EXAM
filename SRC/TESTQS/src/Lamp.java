public class Lamp {

    private boolean on;

    public Lamp(){
        this.on = false;
    }

    public void switchOn(){
        this.on = true;
    }

    public void switchOff(){
        this.on = false;
    }

    public boolean isOn(){
        return on;
    }


    @Override
    public String toString(){
        if(on){
            return "lamp is on";
        }
        return "lamp if off";
    }

}
