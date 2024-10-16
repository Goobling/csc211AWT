import java.awt.*;
import java.awt.event.*;

public class AWThw {

  public static void main(String[] args) {
    Frame frame = new Frame("AWT  homework");

    Button exitButton = new Button("Exit");

    exitButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });

    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });

    frame.add(exitButton);

    frame.setSize(300, 200);

    frame.setVisible(true);
  }
}
