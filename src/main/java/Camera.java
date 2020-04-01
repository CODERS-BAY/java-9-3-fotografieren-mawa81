public class Camera {
    private String brand;
    private Double megaPixels;
    private Double displaySize;
    private Boolean colored;
    private Lens cameraLens;
    public static int countCameras;

    public Camera(String brand, Double megaPixels, Double displaySize, Boolean colored, Lens cameraLens) {
        setBrand(brand);
        setMegaPixels(megaPixels);
        setDisplaySize(displaySize);
        setColored(colored);
        setCameraLens(cameraLens);
        countCameras++;
    }

    public Camera() {
        this.brand = "Unknown";
        this.megaPixels = null;
        this.displaySize = null;
        this.colored = null;
        this.cameraLens = null;
        countCameras++;
    }

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getMegaPixels() {
        return megaPixels;
    }

    private void setMegaPixels(Double megaPixels) {
        this.megaPixels = megaPixels;
    }

    public Double getDisplaySize() {
        return displaySize;
    }

    private void setDisplaySize(Double displaySize) {
        this.displaySize = displaySize;
    }

    public Boolean getColored() {
        return colored;
    }

    private void setColored(Boolean colored) {
        this.colored = colored;
    }

    public Lens getCameraLens() {
        return cameraLens;
    }

    public void setCameraLens(Lens cameraLens) {
        this.cameraLens = cameraLens;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + getBrand() + '\'' +
                ", megaPixels=" + getMegaPixels() +
                ", displaySize=" + getDisplaySize() +
                ", colored=" + getColored() +
                ", cameraLens=" + getCameraLens() +
                '}';
    }
}
