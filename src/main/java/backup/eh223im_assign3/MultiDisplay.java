package backup.eh223im_assign3;

public class MultiDisplay {

    private int count = 0;
    private String disMes = "";

    public String getDisplayMessage() {
        return disMes;
    }

    public void setDisplayMessage(String args) {
        disMes = args;
    }

    public void setDisplayCount(int ints) {
        count = ints;
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.println(disMes);
        }
    }

    public void display(String args, int ints) {
        setDisplayMessage(args);
        setDisplayCount(ints);
        for (int i = 0; i < count; i++) {
            System.out.println(disMes);
        }
    }
}
