package casa;

public class Pancarta extends Casa{

    private String text;

    public Pancarta(Dimensini dimensini1, Dimensini dimensiuni2, String text){
        super(dimensini1,dimensiuni2);
        this.text=text;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text=text;
    }

    @Override
    public boolean equals(Object object){
        Pancarta p=(Pancarta) object;
        return this.text.equals(p.text);
    }

    @Override
    public String toString(){
        String text="\n";
        text+=this.text+"\n";
        text+="Lungimea este de " + super.getDimensiuni1() + "centimetri" + "\n";
        text+="Latimea este de " + super.getDimensiuni2() + "centimetri" + "\n";
        return text;
    }

    @Override
    public void afisare(){
        System.out.println(this);
     }

     @Override
     public Pancarta duplicate(){
        return new Pancarta(this.getDimensiuni1(), this.getDimensiuni2(), text);
     }



}
