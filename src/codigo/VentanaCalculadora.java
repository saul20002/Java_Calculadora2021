/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author Gaming JS
 */
public class VentanaCalculadora extends javax.swing.JFrame {

    //aquí van las variables de instancia
    double operando1 = 0; //a la derecha almacena el primer número
    String operacion = ""; //almacena la operación que se ha pulsado
    
    /**
     * Creates new form VentanaCalculadora
     */
    public VentanaCalculadora() {
        initComponents();
        
    }
    
    public void escribeNumeroEnPantalla(String numero){
        if (display.getText() == "0"){
            display.setText(numero);
        }
        else{
            display.setText(display.getText() + numero);
        }
    }
    
    //la función que se encarga de trabajar con la operación pulsada
    public void operacionPulsada (String _operacion){
        //guardo el valor de la pantalla en la variable operando1
        operando1 = Double.valueOf(display.getText());
        
        //pongo a cero la pantalla
        display.setText("0");
        
        //guardo la operación que he pulsado
        operacion = _operacion;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display = new javax.swing.JLabel();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonPor = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        botonSuma = new javax.swing.JButton();
        botonResta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display.setBackground(new java.awt.Color(0, 0, 0));
        display.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        display.setForeground(new java.awt.Color(51, 255, 51));
        display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        display.setText("0");
        display.setOpaque(true);

        boton8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        boton8.setForeground(new java.awt.Color(51, 51, 51));
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        boton9.setForeground(new java.awt.Color(51, 51, 51));
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        boton7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        boton7.setForeground(new java.awt.Color(51, 51, 51));
        boton7.setText("7");
        boton7.setOpaque(false);
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        boton4.setForeground(new java.awt.Color(51, 51, 51));
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        boton1.setForeground(new java.awt.Color(51, 51, 51));
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        boton5.setForeground(new java.awt.Color(51, 51, 51));
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        boton6.setForeground(new java.awt.Color(51, 51, 51));
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        boton2.setForeground(new java.awt.Color(51, 51, 51));
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        boton3.setForeground(new java.awt.Color(51, 51, 51));
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        botonIgual.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        botonIgual.setForeground(new java.awt.Color(51, 51, 51));
        botonIgual.setText("=");

        boton0.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        boton0.setForeground(new java.awt.Color(51, 51, 51));
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });

        botonPor.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        botonPor.setForeground(new java.awt.Color(51, 51, 51));
        botonPor.setText("*");

        botonDivision.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        botonDivision.setForeground(new java.awt.Color(51, 51, 51));
        botonDivision.setText("/");

        botonSuma.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        botonSuma.setForeground(new java.awt.Color(51, 51, 51));
        botonSuma.setText("+");
        botonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumaActionPerformed(evt);
            }
        });

        botonResta.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        botonResta.setForeground(new java.awt.Color(51, 51, 51));
        botonResta.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonPor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonPor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        escribeNumeroEnPantalla("4");
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        escribeNumeroEnPantalla("3");
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        escribeNumeroEnPantalla("7");
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        escribeNumeroEnPantalla("0");
    }//GEN-LAST:event_boton0ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        escribeNumeroEnPantalla("1");
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        escribeNumeroEnPantalla("2");
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        escribeNumeroEnPantalla("5");
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        escribeNumeroEnPantalla("6");
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        escribeNumeroEnPantalla("8");
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        escribeNumeroEnPantalla("9");
    }//GEN-LAST:event_boton9ActionPerformed

    private void botonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumaActionPerformed
        operacionPulsada("+");
    }//GEN-LAST:event_botonSumaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonPor;
    private javax.swing.JButton botonResta;
    private javax.swing.JButton botonSuma;
    private javax.swing.JLabel display;
    // End of variables declaration//GEN-END:variables
}
