package casa;

public class Camere extends Figura {

    private Metri m1;
    private Metri m2;

    public Camere(Metri m1, Metri m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    public Metri getM1() {
        return m1;
    }

    public void setM1(Metri lungime) {
        this.m1 = lungime;
    }

    public Metri getM2() {
        return m2;
    }

    public void setM2(Metri m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        String text = "\n";
        text += "Domitorul are urmatoarele dimensiuni " + m1 + "\n";
        text += "Livingul are urmatoarele dimensiuni " + m2 + "\n";
        return text;
    }

    @Override
    public boolean equals(Object object) {
        Camere c = (Camere) object;
        return this.m1.equals(c.m1) && this.m2.equals(c.m2);
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void translateX(int x){
        this.m2.translateX(x);
        this.m1.translateX(x);
    }

    public void translateY(int y){
        this.m1.translateY(y);
        this.m2.translateY(y);
    }

    @Override
    public void translate(int x, int y){
        this.m2.translateX(x);
        this.m1.translateX(x);
        this.m2.translateY(y);
        this.m1.translateY(y);
    }

    @Override
    public Camere duplicate(){
        return new Camere(this.m1,this.m2);
    }
}
