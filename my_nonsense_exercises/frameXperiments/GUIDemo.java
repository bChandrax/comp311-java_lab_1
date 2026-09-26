package my_nonsense_exercises.frameXperiments;

import javax.swing.*;

public class GUIDemo {
    
    private JFrame frame;
    private JButton button;
    private int width;
    private int height;

    public GUIDemo(int w, int h){
        frame = new JFrame();
        button = new JButton("CLICK ME");
        //width = w;
        //height = h;
    }

    public void setUpGUI(){
        frame.setSize(width,height);
        frame.setTitle("GUI demo");
        frame.add(button);
        //frame.setDefaultCloseperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
