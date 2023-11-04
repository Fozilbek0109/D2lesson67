package uz.coder.d2lesson67;

import java.io.Serializable;

public class AvtoModel implements Serializable {
    private String name;
    private String img;
    private int prise;

    public AvtoModel(String name, String img, int prise) {
        this.name = name;
        this.img = img;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }
}
