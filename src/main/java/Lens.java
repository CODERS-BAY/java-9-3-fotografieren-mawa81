public class Lens {
    private Integer minFocalLength;
    private Integer maxFocalLength;
    public static int countLenses;

    public Lens(Integer minFocalLength, Integer maxFocalLength) {
        if (minFocalLength > maxFocalLength) {
            throw new IllegalArgumentException("The minimum focal length must be less than the maximum focal length");
        } else {
            setMinFocalLength(minFocalLength);
            setMaxFocalLength(maxFocalLength);
            countLenses++;
        }
    }

    public Lens() {
        this.minFocalLength = null;
        this.maxFocalLength = null;
    }

    public Integer getMinFocalLength() {
        return minFocalLength;
    }

    private void setMinFocalLength(Integer minFocalLength) {
        this.minFocalLength = minFocalLength;
    }

    public Integer getMaxFocalLength() {
        return maxFocalLength;
    }

    private void setMaxFocalLength(Integer maxFocalLength) {
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
