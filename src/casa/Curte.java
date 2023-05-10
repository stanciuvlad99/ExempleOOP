package casa;

public class Curte extends Constructie{
    private Metri metri;
    private int garaje;

    public Curte(Metri metri, int raza) {
        this.metri = metri;
        this.garaje = raza;
    }

    public Metri getMetri() {
        return metri;
    }

    public void setMetri(Metri metri) {
        this.metri = metri;
    }

    public int getRaza() {
        return garaje;
    }

    public void setRaza(int raza) {
        this.garaje = raza;
    }

    @Override
    public boolean equals(Object object){
        Curte c =(Curte) object;
        return this.metri.equals(c.metri) && this.garaje==c.garaje;
     }

     @Override
     public String toString(){
        String text = "\n";
        text+="Curtea are " + metri + "metri patrati"+"\n";
        text+="Curtea are " + garaje + "garaje"+"\n";
        return text;
     }

    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public void translateX(int x) {
        this.metri.translateX(x);
    }

    @Override
    public void translateY(int y) {
        this.metri.translateY(y);
    }

    @Override
    public void translate(int x, int y) {
        this.metri.translate(x,y);
    }

    @Override
    public Curte duplicate() {
        return new Curte(this.metri,this.garaje);
    }
}
