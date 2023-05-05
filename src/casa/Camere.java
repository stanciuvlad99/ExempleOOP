package casa;

public class Camere {

    private Metri dormitor;
    private Metri living;

    public Camere(Metri dormitor, Metri living) {
        this.dormitor = dormitor;
        this.living = living;
    }

    public Metri getLungime() {
        return dormitor;
    }

    public void setLungime(Metri lungime) {
        this.dormitor = lungime;
    }

    public Metri getLiving() {
        return living;
    }

    public void setLiving(Metri living) {
        this.living = living;
    }

    @Override
    public String toString() {
        String text = "\n";
        text += "Domitorul are urmatoarele dimensiuni " + dormitor + "\n";
        text += "Livingul are urmatoarele dimensiuni " + living + "\n";
        return text;
    }

    public boolean equals(Object object) {
        Camere c = (Camere) object;
        return this.dormitor.equals(c.dormitor) && this.living.equals(c.living);
    }
}
