package cscd212classes.lab2;

import java.util.Objects;

public class Television extends Object implements Comparable<Television> {

    private final boolean fourK;
    private final String make;
    private final String model;
    private final int resolution;
    private final int screenSize;
    private final boolean smart;

    public Television(final String make, final String model, final boolean smart, final int screenSize, final int resolution) {

        if (make == null || model == null || screenSize < 32 || resolution < 720) {
            throw new IllegalArgumentException("Invalid parameter in constructor");
        }
        this.make = make;
        this.model = model;
        this.smart = smart;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.fourK = resolution == 2160; //if the resolution is 2160 the 4k is true and means the tv is 4k
    }
    //CHECK THIS CODEEE
    public Television(final String model, final boolean smart, final int screenSize, final int resolution, final String make) {
        this(make, model, smart, screenSize, resolution);
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
        if (!this.smart && !this.fourK) {
            return /*(true ? "this will print": "this will never print")*/  this.make + "-" + this.model + ", " + this.screenSize + " inch tv with " + this.resolution + " resolution";
        }
        else if (this.smart && this.fourK) {
            return  this.make + "-" + this.model + ", " + this.screenSize + " inch smart tv with 4K" + " resolution";
        }
        else if (this.smart && !this.fourK) {
            return this.make + "-" + this.model + ", " + this.screenSize + " inch smart tv with " + this.resolution + " resolution";
        }
        else if (!this.smart && this.fourK) {
            return this.make + "-" + this.model + ", " + this.screenSize + " inch tv with 4K" + " resolution";
        }
        else {
            return null;
        }
    }

    @Override
    public boolean equals(final Object obj) {
        //or could be if(this == obj)
        if (obj == this) {
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
        boolean cmScreenSize = this.screenSize == another.screenSize;
        boolean cmRes = ((int) (this.resolution * 100) == (int) (another.resolution * 100));
        boolean cmSmart = this.smart == another.smart;
        boolean cmFourK = this.fourK == another.fourK;

        if ((!cmMake || !cmModel || !cmScreenSize || !cmRes || !cmSmart || !cmFourK)) {
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

        if (another == null) {
            throw new IllegalArgumentException("null parameter in the compareTo method");
        }

        int cmMake = this.make.compareTo(another.make);
        int cmModel = this.model.compareTo(another.model);
        //int cmScreenSize = Integer.compare(this.screenSize, another.screenSize);
        int cmScreenSize = this.screenSize - another.screenSize;

        if (cmMake == 0) {
            if (cmModel == 0) {
                if (cmScreenSize == 0) {
                    return cmScreenSize;
                }
                else {
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
    }

}
