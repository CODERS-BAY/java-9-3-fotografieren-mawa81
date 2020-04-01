

public class Main {

    public static void main(String[] args) {

        Lens lens01 = new Lens(150, 150);
        Camera cam01 = new Camera("Nikon", 5.2, 2.5, true, lens01);
        System.out.println(cam01.toString());

    }
}
