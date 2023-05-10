package casa;

public class Metri extends Constructie {

    private int x;
    private int y;

    public Metri(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString(){
        String text="\n";
        text+="Camera are " + x +" metri lungime "+ "\n";
        text+="Camera are " + y +" metri latime " +"\n";
        return text;
    }

    public boolean equals(Object object){
        Metri m = (Metri) object;
        return this.x== m.x && this.y==m.y;
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void translateX(int x){
        this.x+=x;
    }

    @Override
    public void translateY(int y){
        this.y+=y;
    }

    @Override
    public void translate(int x, int y){
        this.x+=x;
        this.y+=y;
    }

    @Override
    public Metri duplicate(){
        return new Metri(this.x, this.y);
    }

}
