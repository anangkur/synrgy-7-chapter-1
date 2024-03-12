package classplayground;

public class CarJava {
    private Integer wheel;
    private Boolean isElectric;
    private Boolean isTransformable;

    public CarJava() {
    }

    public CarJava(Integer wheel) {
        this.wheel = wheel;
    }

    public CarJava(Boolean isElectric) {
        this.isElectric = isElectric;
    }

    public Integer getWheel() {
        return wheel;
    }

    public void setWheel(Integer wheel) {
        this.wheel = wheel;
    }

    public Boolean getElectric() {
        return isElectric;
    }

    public void setElectric(Boolean electric) {
        isElectric = electric;
    }

    public Boolean getTransformable() {
        return isTransformable;
    }

    public void setTransformable(Boolean transformable) {
        isTransformable = transformable;
    }

    public String makeSound() {
        if (isElectric) {
            return "no sound";
        } else {
            return "brrmmmm";
        }
    }

    static void showWindow() {

    }
}
