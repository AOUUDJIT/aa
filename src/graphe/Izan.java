package graphe;


import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 
public class Izan extends javax.swing.JFrame {
 
 
    public Izan() {
        initComponents();
    }
 
 
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
 
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trace de lignes et de cercles ");
 
        jButton1.setText("Tracé de ligne par l’équation cartésienne");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
 
        jButton2.setText("Tracé de ligne par l’algorithme de Bresenham");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
 
        jButton3.setText("Tracé de cercle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addGap(27, 27, 27)
                .addComponent(jButton3)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(56, Short.MAX_VALUE)
                    .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(146, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(552, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(70, Short.MAX_VALUE)
                    .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(181, Short.MAX_VALUE)))
        );
 
        pack();
    }// </editor-fold>                        
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double AMi = Double.parseDouble(JOptionPane.showInputDialog(null, "Entrez l'abcise de l'extremité Mi")) ;
        double OMi = Double.parseDouble(JOptionPane.showInputDialog(null, "Entrez l'ordonné extremité Mi")) ; 
        double AMf= Double.parseDouble(JOptionPane.showInputDialog(null, "Entrez l'abcise de l'extremité Mf")) ;
        double OMf = Double.parseDouble(JOptionPane.showInputDialog(null, "Entrez l'ordonné extremité Mf")) ; 
    }                                        
 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double Acc = Double.parseDouble(JOptionPane.showInputDialog(null, "Entrez l'abcisse du centre du cercle")) ;
        double Occ = Double.parseDouble(JOptionPane.showInputDialog(null, "Entrez l'ordonné du centre du cercle")) ;
        double Rayon = Double.parseDouble(JOptionPane.showInputDialog(null, "Entrez le rayon du cercle")) ;
 
    }                                        
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double AMi = Double.parseDouble(JOptionPane.showInputDialog(null, "Entrez l'abcise de l'extremité Mi")) ;
        double OMi = Double.parseDouble(JOptionPane.showInputDialog(null, "Entrez l'ordonné extremité Mi")) ; 
        double AMf = Double.parseDouble(JOptionPane.showInputDialog(null, "Entrez l'abcise de l'extremité Mf")) ;
        double OMf = Double.parseDouble(JOptionPane.showInputDialog(null, "Entrez l'ordonné extremité Mf")) ; 
        DessinPoint p = new DessinPoint();
        //canvas1.add(p);       
 
    }                                        
 
 
 /*    public void ligne(double xi,double yi,double xf,double yf) {
  int x,y ;
  double a,b ;
  a =(double) (yf-yi)/(xf-xi) ;
  b = yi - a * xi ;
  for ( x = (int) xi ; x <= xf ; x++ ) {
    y =(int) (a * x + b) ;
 
           DessinPoint p = new DessinPoint();
           jPanel1.add(p);
 
 
}*/
     public class DessinPoint extends Canvas {
 
    public void paintGraphics(Graphics g,int x,int y) {
        if(g == null)
            System.out.println("graphics null");
        else {
            g=this.getGraphics();
            g.fillRect(x,y,1,1);
        }
 
    } 
     }
    public static void main(String args[]) {
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Izan().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify                     
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration                   
}