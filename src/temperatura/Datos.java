/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;


/**
 *
 * @author Bautista Hernadez Jalil Damián
 */
public class Datos extends javax.swing.JFrame {
    

    //Creamos las variables en formato html para mostrarlo  en una etiqueta a travez de un boton
    private String que = "El método de Holt Winters permite analizar series de tiempo univariantes que contienen "
            + "factores de tendencia y/o estacionalidad, involucrando un enfoque de suavización exponencial "
            + "con métodos analíticos y patrones aditivos y multiplicativos.  " 
            + "El método de suavización exponencial utiliza los promedios históricos de una variable en un"
            + " período para intentar predecir su comportamiento futuro.";
    private String v1 = "At: Valor de suavización para el nivel de la serie en el periodo t";
    private String v2 = "α:Constante de suavización exponencial para nivel";
    private String v3 = "Xt: Valor real de la serie de tiempo en el periodo t";
    private String v4 = "Tt: Componente de tendencia de la serie para el periodo t";
    private String v5 = "γ: Constante de suavización exponencial para la tendencia";
    private String v6 = "St: Componente estacional de la serie para el periodo t";
    private String v7 = "St-s: componente estacional de la serie para el periodo t-s";
    private String v8 = "δ: Constante de suavización exponencial para la estacionalidad";
    private String v9 = "s: Longitud de tiempo de la estacionalidad (s=6 Semestral)";
    private String v10 = "m: Periodos futuros a predecir";
    private String v11 = "X̂ t+m: Predicción de Holt-Winters para el periodo t+m";
    private String DATOS = "Los datos recabados de la temperatura fueron tomados de la pagina https://smn.conagua.gob.mx/es/climatologia/temperaturas-y-lluvias/resumenes-mensuales-de-temperaturas-y-lluvias";
    private String DATOS2="Información por entidad federativa de temperaturas (°C) media, máxima y mínima, así como de la lluvia (mm) total acumulada mensual. También se pueden "
            + "consultar los mapas de distribución de lluvias y temperaturas correspondientes a cada mes dando un doble click en el nombre del mes correspondiente dentro de la "
            + "tabla que se presenta por año. Se muestra una animación del año y evento que se desee visualizar dándose la posibilidad de obtener el mapa que sea de interés.";
    
    
    
    /**
     * Creates new form Datos
     */
    public Datos() {
        initComponents();
        setLocationRelativeTo(null);
    }
    //Cambia nuestro string a formato html
    public String StrToHtml(String texto){
        return "<html><p>" +que+ "</p></html>";
    }
    
    //Cambia nuestro string a formato html
    public String htmlVa(String texto){
        return "<html><p>" +v1+ "</p><p>" +v2+ "</p><p>" +v3+ "</p><p>" +v4+ "</p><p>" +v5+ "</p><p>" +v6+ "</p><p>" +v7+ "</p>"
                + "<p>" +v8+ "</p><p>" +v9+ "</p><p>" +v10+ "</p><p>" +v11+ "</p></html>";  
    }
    //Cambia nuestro string a formato html
    public String DatosHtml(String texto){
        return "<html><p>" +DATOS+ "</p><p>" +DATOS2+ "</p></html>";
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        queque = new javax.swing.JLabel();
        quees = new javax.swing.JButton();
        btnvariable = new javax.swing.JButton();
        variable = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dato = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnTemperatura = new javax.swing.JButton();
        btnFormula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 153));
        jLabel1.setText("INFORMACIÓN");

        queque.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        quees.setBackground(new java.awt.Color(204, 153, 255));
        quees.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        quees.setText("¿Qué es el método Holt Winters? ");
        quees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queesActionPerformed(evt);
            }
        });

        btnvariable.setBackground(new java.awt.Color(204, 153, 255));
        btnvariable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnvariable.setText("Variables del método");
        btnvariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvariableActionPerformed(evt);
            }
        });

        variable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 153, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Datos Recabados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dato.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(407, 407, 407))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(variable, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quees)
                            .addComponent(btnvariable)
                            .addComponent(queque, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(dato, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(278, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quees)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(queque, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnvariable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(variable, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(dato, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 36), new java.awt.Color(153, 0, 153))); // NOI18N

        btnTemperatura.setBackground(new java.awt.Color(255, 0, 0));
        btnTemperatura.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnTemperatura.setForeground(new java.awt.Color(255, 255, 255));
        btnTemperatura.setText("TEMPERATURA");
        btnTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemperaturaActionPerformed(evt);
            }
        });

        btnFormula.setBackground(new java.awt.Color(255, 0, 0));
        btnFormula.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnFormula.setForeground(new java.awt.Color(255, 255, 255));
        btnFormula.setText("FÓRMULA");
        btnFormula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFormula, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTemperatura)
                    .addComponent(btnFormula))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemperaturaActionPerformed
    Principal pd = new Principal(); //Creamos objeto con la otra ventana que nos vamos a mover
    pd.setVisible(true); //  Nos muestra la tra ventana
    this.dispose();; // metodo para que no se nos acumule la ventanas
        
        
    }//GEN-LAST:event_btnTemperaturaActionPerformed

    private void btnFormulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormulaActionPerformed
        Formula pd = new Formula(); //Creamos objeto con la otra ventana que nos vamos a mover
        pd.setVisible(true); //  Nos muestra la tra ventana
        this.dispose(); // metodo para que no se nos acumule la ventanas
        
    }//GEN-LAST:event_btnFormulaActionPerformed

    private void queesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queesActionPerformed
        // TODO add your handling code here:
        queque.setText(StrToHtml(que));
    }//GEN-LAST:event_queesActionPerformed

    private void btnvariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvariableActionPerformed
        // Mostramos nuestras variables en una etiqueta
        variable.setText(htmlVa(v1));
        variable.setText(htmlVa(v2));
        variable.setText(htmlVa(v3));
        variable.setText(htmlVa(v4));
        variable.setText(htmlVa(v5));
        variable.setText(htmlVa(v6));
        variable.setText(htmlVa(v7));
        variable.setText(htmlVa(v8));
        variable.setText(htmlVa(v9));
        variable.setText(htmlVa(v10));
        variable.setText(htmlVa(v11));
    }//GEN-LAST:event_btnvariableActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dato.setText(DatosHtml(DATOS));
        dato.setText(DatosHtml(DATOS2));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFormula;
    private javax.swing.JButton btnTemperatura;
    private javax.swing.JButton btnvariable;
    private javax.swing.JLabel dato;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton quees;
    private javax.swing.JLabel queque;
    private javax.swing.JLabel variable;
    // End of variables declaration//GEN-END:variables
}
