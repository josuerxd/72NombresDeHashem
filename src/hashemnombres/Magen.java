/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashemnombres;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 @author JOSUÉ DANIEL REYNA ROLDÁN OCHOA
 */
public class Magen extends javax.swing.JFrame {
private String Numero;
private  Nombres nombresHashem= new Nombres();
    /**
     * Creates new form JFrameImagen
     */
    public Magen(String numero) {
        initComponents();
        Numero=numero;
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/org/img/lion.png")));  
    // jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/img/1_VEHUIAH.jpg"))); // NOI18N
        this.pack();
       
        nombresHashem.Nombres();
        String nombreF=nombresHashem.nombres.get(numero).get("nombre");
        String titulo=nombresHashem.nombres.get(numero).get("numero")+". "+nombresHashem.nombres.get(numero).get("nombre");
        this.setTitle(titulo);
    /*
    ImageIcon imageIcon = new ImageIcon(new ImageIcon("icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
    label.setIcon(imageIcon);
    */
     
   /// System.out.println( numero);
       String nombreImagen=nombreF+".png";
    
    ImageIcon imageIcon1=new javax.swing.ImageIcon(getClass().getResource("/org/img/estrellas/"+nombreImagen));
    Image image1= imageIcon1.getImage();
    image1= image1.getScaledInstance(getWidth(), getHeight()-30,Image.SCALE_DEFAULT);
    imageIcon1=new ImageIcon(image1);
   // ImageIcon imageIcon= new ImageIcon(new ImageIcon("/org/img/1_VEHUIAH.jpg").getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
    jLabel1.setIcon(imageIcon1);
/*
System.out.println("frame width : "+getWidth());
System.out.println("frame height: "+getHeight());
System.out.println("content pane width : "+getContentPane().getWidth());
System.out.println("content pane height: "+getContentPane().getHeight());
System.out.println("width  of left + right  borders: "+(getWidth()-getContentPane ().getWidth()));
System.out.println("height of top  + bottom borders: "+(getHeight()-getContentPane().getHeight())); 
    */
setLocationRelativeTo(null);  
    }
    


    private Magen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jMenu1.setText("INFO");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked

        String nombre=nombresHashem.nombres.get(Numero).get("nombre");
        String valor=nombresHashem.nombres.get(Numero).get("valor");
        String escritura=nombresHashem.nombres.get(Numero).get("escritura");
        String nota=nombresHashem.nombres.get(Numero).get("nota");
        JOptionPane.showMessageDialog(null,"Nombre: " + nombre +'\n'+ " Valor: " + valor +'\n'+ " Escritura: " + escritura + '\n'+" Nota: " + nota,"INFO",JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Magen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Magen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Magen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Magen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Magen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
