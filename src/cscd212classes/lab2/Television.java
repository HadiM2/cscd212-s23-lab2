package cscd212classes.lab2;

public class Television extends Object implements Comparable<Television>{

    private final boolean fourK;
    private final String make;
    private final String model;
    private final int resolution;
    private final int screenSize;
    private final boolean smart;

    public Television(){

    }
    public Television(final String make, final String model, final boolean smart, final int screenSize, final int resolution){

        if (make.isBlank() || model.isBlank() || screenSize < 32 || resolution < 720){
            throw new IllegalArgumentException("Something went wrong with Television constructor");
        }
        this.make = make;
        this.model = model;
        this.smart = smart;
        this.screenSize = screenSize;
        this.resolution = resolution;
    }
    //CHECK THIS CODEEE
    public Television(final String model, final boolean smart, final int screenSize, final int resolution, final String make){
        Television television = new Television();
        television = new Television(make, model, smart, screenSize, resolution);
        return;
    }
    /////?????
    public int getScreenSize(){
        return screenSize;
    }
    public int getResolution(){
        return resolution;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        //or could be if(this == obj)
        if (obj.equals(this)){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Television)){
            return false;
        }
        Television another = (Television)obj;
        boolean cmMake = this.make.equals(another.make);
        boolean cmModel = this.model.equals(another.model);
        boolean cmScreenSize = ((int)(this.screenSize * 100) == (int)(another.screenSize * 100));
        boolean cmRes = ((int)(this.resolution * 100) == (int)(another.resolution * 100));
        boolean cmSmart = this.smart == another.smart;
        boolean cmFourK = this.fourK == another.fourK;

        if (!(cmMake && cmModel && cmScreenSize && cmRes && cmSmart && cmFourK)){
            return false;
        }
        return true;
    }

}
