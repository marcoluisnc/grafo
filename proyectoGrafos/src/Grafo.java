import javax.swing.JFrame;

public class Grafo {
    public static void main(String[] args) throws Exception {
        JFrame ventana = new JFrame("grafos");
        ventana.add(new Lienzo());
        ventana.setSize(600, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        
    }
}
