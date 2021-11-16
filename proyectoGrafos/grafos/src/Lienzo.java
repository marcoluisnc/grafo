import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JPanel;


public class Lienzo extends JPanel implements MouseListener {
    private Vector <Nodo> vectorNodos;

    public Lienzo() {
        this.vectorNodos = new Vector<>();
        this.addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        for(Nodo nodos : vectorNodos){
            nodos.pintar(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getButton()== MouseEvent.BUTTON1){
            this.vectorNodos.add(new Nodo(e.getX(), e.getY()));
            repaint();
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
