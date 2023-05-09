package casa;

public class Casa extends Figura {

    private Dimensini dimensiuni1;
    private Dimensini dimensiuni2;

    public Casa(Dimensini dimensiuni1, Dimensini dimensiuni2){
        this.dimensiuni1 = dimensiuni1;
        this.dimensiuni2 = dimensiuni2;
    }

    public Dimensini getDimensiuni1(){
        return dimensiuni1;
    }

    public void setDimensiuni1(Dimensini dimensiuni1){
        this.dimensiuni1 = dimensiuni1;
    }

    public Dimensini getDimensiuni2(){
        return dimensiuni2;
    }

    public void setDimensiuni2(Dimensini dimensiuni2){
        this.dimensiuni2 = dimensiuni2;
    }

    @Override
    public boolean equals(Object object){
        Casa c = (Casa) object;
        return this.dimensiuni1.equals(c.dimensiuni1) && this.dimensiuni2.equals(c.dimensiuni2);
    }

    @Override
    public String toString(){
        String text="";
        text+="Prima casa are are dormitor si living" + dimensiuni1 + "\n";
        text+="A doua casa are dormitor si living " + dimensiuni2 + "\n";
        return text;
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void translateX(int x){
        this.dimensiuni1.translateX(x);
        this.dimensiuni2.translateX(x);
    }

    @Override
    public void translateY(int y){
        this.dimensiuni1.translateY(y);
        this.dimensiuni2.translateY(y);
    }

    @Override
    public void translate(int x, int y){
        this.dimensiuni1.translateX(x);
        this.dimensiuni2.translateX(x);
        this.dimensiuni1.translateY(y);
        this.dimensiuni2.translateY(y);
    }

    @Override
    public Casa duplicate(){
        return new Casa(this.dimensiuni1,this.dimensiuni2);
    }
}
