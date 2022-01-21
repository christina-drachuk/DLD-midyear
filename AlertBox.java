import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class AlertBox {
   public static void main(String[] args) {
      createWindow();
   }

   private static void createWindow() {    
      JFrame alertBox = new JFrame("Death Code");
      alertBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      createUI(alertBox);
      alertBox.setSize(1000, 20000);      
      alertBox.setLocationRelativeTo(null);  
      alertBox.setVisible(true);
   }

   private static void createUI(final JFrame frame){ 
      JPanel panel = new JPanel();
      LayoutManager layout = new FlowLayout();  
      panel.setLayout(layout);  
      JButton button = new JButton("enter later");
      button.setBorder(new LineBorder(Color.pink,5));

      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "hmmmm idk thats tricky");
            
         }
      });

      panel.add(button);
      frame.getContentPane().add(panel, BorderLayout.CENTER);    
   }  
}