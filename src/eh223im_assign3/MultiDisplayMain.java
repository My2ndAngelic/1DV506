package eh223im_assign3;

public class MultiDisplayMain {
    public static void main(String[] args) {
        MultiDisplay md = new MultiDisplay();
        md.setDisplayMessage("Hello");
        md.setDisplayCount(3);
        md.display();

        md.display("Hello World",3);

        System.out.println("Current Message: "+md.getDisplayMessage());
    }
}
