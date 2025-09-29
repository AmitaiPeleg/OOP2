package Hw6.Q3.Shap;

public class Program {
    public static void main(String[] args) {
        Playable[] p = {new Guiter(), new Piano()};
        for(int i=0;i<p.length;i++){
            p[i].play();
        }
    }
}
    