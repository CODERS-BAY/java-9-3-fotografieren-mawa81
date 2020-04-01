

public class Lens {
    private Integer minFocalLength;
    private Integer maxFocalLength;

    public Lens(Integer minFocalLength, Integer maxFocalLength) {
        //this.minFocalLength = minFocalLength;
        //this.maxFocalLength = maxFocalLength;
        if (minFocalLength > maxFocalLength) {
            throw new IllegalArgumentException("The minimum focal length must be less than the maximum focal length");
        } else {
            setMinFocalLength(minFocalLength);
        }
        if (maxFocalLength < minFocalLength) {
            throw new IllegalArgumentException("The minimum focal length must be less than the maximum focal length");
        } else {
            setMaxFocalLength(maxFocalLength);
        }
    }

    public Lens() {
        this.minFocalLength = null;
        this.maxFocalLength = null;
    }

    public Integer getMinFocalLength() {
        return minFocalLength;
    }

    public void setMinFocalLength(Integer minFocalLength) {
        this.minFocalLength = minFocalLength;
    }

    public Integer getMaxFocalLength() {
        return maxFocalLength;
    }

    public void setMaxFocalLength(Integer maxFocalLength) {
        this.maxFocalLength = maxFocalLength;
    }

    @Override
    public String toString() {
        return "Lens{" +
                "minFocalLength=" + minFocalLength +
                ", maxFocalLength=" + maxFocalLength +
                '}';
    }
}
