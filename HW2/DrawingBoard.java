package HW2;

public class DrawingBoard {
    private Shape[] s;
    private int counter = 0;

    public DrawingBoard(int size) {
        s = new Shape[size];
    }

    public void add(Shape... shapes) {
        for (int i = 0; i < shapes.length; i++) {
            if (counter == s.length) {
                Shape[] sh = new Shape[s.length];
                for (int j = 0; j < s.length; j++) {
                    sh[j] = s[j];
                }
                int a = (int) ((int) s.length * 1.5);
                s = new Shape[a];
                for (int k = 0; k < sh.length; k++) {
                    s[k] = sh[k];
                }
            }
            s[counter] = shapes[i];
            counter++;
        }
        
    }
    public void showAll(){
        for(int i=0;i<s.length;i++){
            
        }
    }
}
