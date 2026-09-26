package my_nonsense_exercises.frameXperiments;

import javax.swing.JFrame;

public class GUIfrommemory {
    
    public static class GUIdemo{
        private JFrame frame;
        private int width, height;
        
        public GUIdemo(int l, int w){
            height = l;
            width = w;
            frame = new JFrame();
        }
        
        public void setUpGUI(){
            frame.setSize(height, width);
            frame.setTitle("Test-1");
            frame.setVisible(true);
        }
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		GUIdemo test1 = new GUIdemo(500,500);
		test1.setUpGUI();
	}
}
