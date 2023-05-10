package casa;

import java.util.ArrayList;

public class Schita extends Constructie {

    private ArrayList<Constructie> constructies = new ArrayList<>();

    public Schita(ArrayList<Constructie> schitaArrayList){
        this.constructies= schitaArrayList;
    }

    @Override
    public String toString(){
        String text="\n";
        for (int i=0; i<constructies.size(); i++){
            text+=constructies+"\n";
        }
        return text;
    }

    @Override
    public void afisare(){
        for (int i=0; i<constructies.size(); i++){
            System.out.println(constructies.get(i));
        }
    }

    @Override
    public void translateX(int x){
        for (int i=0; i<constructies.size(); i++){
            constructies.get(i).translateX(x);
        }
    }

    @Override
    public void translateY(int y){
        for (int i=0; i<constructies.size(); i++){
            constructies.get(i).translateY(y);
        }
    }

    @Override
    public void translate(int x, int y){
        for (int i=0; i<constructies.size(); i++){
            constructies.get(i).translate(x,y);
        }
    }

    @Override
    public Schita duplicate(){
        return new Schita(this.constructies);
    }


}
