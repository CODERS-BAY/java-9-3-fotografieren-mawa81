

public class Main {

    public static void main(String[] args) {

        Lens lens01 = new Lens(18, 80);
        Lens lens02 = new Lens(50, 300);
        Lens lens03 = new Lens(80, 250);

        System.out.println(Camera.countCameras);

        Camera cam01 = new Camera("Nikon", 15.2, 3.5, true, lens01);

        System.out.println(Camera.countCameras);

        Camera cam02 = new Camera("Canon", 17.0, 4.7, true, lens02);

        System.out.println(cam01.toString());
        System.out.println(cam02.toString());

        cam02.setCameraLens(lens03);

        System.out.println(cam02.toString());
        System.out.println(Camera.countCameras);
        System.out.println(Lens.countLenses);
    }
}
