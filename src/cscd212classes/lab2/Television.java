package cscd212classes.lab2;

import java.util.Objects;

public class Television extends Object implements Comparable<Television> {

    private boolean fourK;
    private String make;
    private String model;
    private int resolution;
    private int screenSize;
    private boolean smart;

    public Television(final String make, final String model, final boolean smart, final int screenSize, final int resolution) {

        if (make.isBlank() || model.isBlank() || screenSize < 32 || resolution < 720) {
            throw new IllegalArgumentException("Something went wrong with Television constructor");
        }
        this.make = make;
        this.model = model;
        this.smart = smart;
        this.screenSize = screenSize;
        this.resolution = resolution;
    }
    //CHECK THIS CODEEE
    public Television(final String model, final boolean smart, final int screenSize, final int resolution, final String make) {
        Television television = new Television(make, model, smart, screenSize, resolution);
    }
    /////?????
    public int getScreenSize() {
        return this.screenSize;
    }
    public int getResolution() {
        return this.resolution;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        if (!this.smart) {
            return "Make-Model: " + this.make + " - " + this.model + "," + this.screenSize + " Inch TV with" + this.resolution + "resolution";
        }
        else {
            return "Make-Model: " + this.make + " - " + this.model + "," + this.screenSize + " Inch Smart TV with" + this.resolution + "resolution";
        }
    }

    @Override
    public boolean equals(final Object obj) {
        //or could be if(this == obj)
        if (obj.equals(this)) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Television)) {
            return false;
        }
        Television another = (Television) obj;
        boolean cmMake = this.make.equals(another.make);
        boolean cmModel = this.model.equals(another.model);
        boolean cmScreenSize = ((int) (this.screenSize * 100) == (int) (another.screenSize * 100));
        boolean cmRes = ((int) (this.resolution * 100) == (int) (another.resolution * 100));
        boolean cmSmart = this.smart == another.smart;
        boolean cmFourK = this.fourK == another.fourK;

        if (!(cmMake && cmModel && cmScreenSize && cmRes && cmSmart && cmFourK)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return this.make.hashCode() + this.model.hashCode() + Integer.valueOf(this.resolution).hashCode() + Boolean.hashCode(this.smart) + Boolean.hashCode(this.fourK);
    }

    @Override
    public int compareTo(final Television another) {
        if(another == null){

            throw new IllegalArgumentException("Television:compareTo: another can't be null");
        }
        int cmMake = this.make.compareTo(another.make);
        int cmModel = this.model.compareTo(another.model);
        int cmScreenSize = Integer.compare(this.screenSize, another.screenSize);

        if (cmMake == 0) {
            if (cmModel == 0) {
                if (cmScreenSize == 0) {
                    return cmScreenSize;
                }
            }
            else {
                return cmModel;
            }
        }
        else {
            return cmMake;
        }

        return -1;
    }

}
