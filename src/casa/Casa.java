package casa;

public class Casa extends Figura {

    private Camere casa1;
    private Camere casa2;

    public Casa(Camere casa1,Camere casa2){
        this.casa1=casa1;
        this.casa2=casa2;
    }

    public Camere getCasa1(){
        return casa1;
    }

    public void setCasa1(Camere casa1){
        this.casa1=casa1;
    }

    public Camere getCasa2(){
        return casa2;
    }

    public void setCasa2(Camere casa2){
        this.casa2=casa2;
    }

    @Override
    public boolean equals(Object object){
        Casa c = (Casa) object;
        return this.casa1.equals(c.casa1) && this.casa2.equals(c.casa2);
    }

    @Override
    public String toString(){
        String text="";
        text+="Prima casa are are dormitor si living" + casa1 + "\n";
        text+="A doua casa are dormitor si living " + casa2 + "\n";
        return text;
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void translateX(int x){
        this.casa1.translateX(x);
        this.casa2.translateX(x);
    }

    @Override
    public void translateY(int y){
        this.casa1.translateY(y);
        this.casa2.translateY(y);
    }

    @Override
    public void translate(int x, int y){
        this.casa1.translateX(x);
        this.casa2.translateX(x);
        this.casa1.translateY(y);
        this.casa2.translateY(y);
    }

    @Override
    public Casa duplicate(){
        return new Casa(this.casa1,this.casa2);
    }
}
