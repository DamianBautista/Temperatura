/*
 * Proyecto de Simulacion 
BAUTISTA HERNANDEZ JALIL DAMIAN
 */
package temperatura;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;


public class Principal extends javax.swing.JFrame implements Printable{
    String mes[];
    
    

    public Principal() {
        initComponents();
        Datos dato = new Datos();
        setLocationRelativeTo(null);
        
    }
    DecimalFormat decimal = new DecimalFormat("#.000");

    //Datos guradados en un arrego de temperaturas
    double[] Aguascaliente = {21.6, 23.7, 29.0, 31.1, 30.6, 30.2, 28.1, 26.9, 26.0, 27.4, 25.9, 22.9, 23.0, 25.8, 28.9, 29.8, 29.8, 26.6, 25.0, 26.0, 24.9, 25.4, 24.3, 24.8};
    double[] BajaCalifornia = {20.2, 21.0, 19.9, 24.6, 29.8, 31.4, 33.9, 35.4, 34.3, 30.6, 23.5, 20.4, 20.0, 20.8, 20.8, 25.2, 27.8, 31.3, 33.2, 33.1, 32.7, 27.4, 25.8, 19.8};
    double[] Campeche = {30.2, 32.4, 34.9, 29.5, 36.7, 34.1, 35.0, 34.4, 34.0, 32.2, 31.0, 29.1, 29.3, 31.3, 33.9, 36.5, 36.2, 34.8, 34.6, 34.4, 34.2, 33.4, 30.5, 34.3};
    double[] Coahuila = {21.6, 23.5, 29.2, 31.5, 34.1, 34.8, 35.7, 35.5, 30.4, 31.2, 27.2, 22.0, 21.6, 24.4, 28.4, 30.9, 33.5, 35.0, 33.7, 34.0, 33.7, 31.0, 25.8, 26.9};
    double[] Colima = {32.6, 31.9, 33.2, 33.5, 33.2, 33.9, 34.1, 33.2, 33.1, 34.3, 34.4, 32.3, 31.9, 31.3, 32.5, 32.7, 34.1, 33.3, 33.8, 33.1, 32.7, 33.7, 33.6, 32.6};
    double[] Chiapas = {31.1, 32.3, 32.8, 34.9, 33.5, 30.9, 31.8, 31.3, 30.8, 30.2, 30.0, 28.4, 30.2, 31.4, 32.4, 33.9, 32.7, 31.5, 31.9, 31.5, 30.8, 30.9, 28.7, 29.8};
    double[] Chihuahua = {20.0, 20.9, 25.4, 28.9, 33.4, 35.3, 33.6, 35.1, 30.4, 30.7, 26.7, 19.5, 19.7, 23.3, 25.7, 29.0, 32.5, 35.1, 31.3, 31.2, 30.8, 29.1, 25.3, 22.9};
    double[] CiudadMexico = {23.0, 25.9, 27.9, 28.4, 27.3, 26.5, 26.1, 24.9, 23.9, 24.5, 23.7, 23.2, 23.2, 25.4, 27.8, 28.3, 27.1, 24.2, 25.3, 25.2, 24.3, 23.9, 22.3, 23.7};
    double[] Durango = {21.1, 23.3, 27.8, 30.5, 32.1, 32.7, 30.9, 31.2, 27.5, 28.5, 26.5, 21.9, 22.2, 25.8, 28.3, 30.2, 31.8, 31.6, 28.3, 28.5, 28.1, 27.5, 25.3, 24.4};
    double[] Guanajuato = {23.9, 26.5, 30.1, 32.3, 31.2, 29.7, 28.6, 27.2, 26.6, 28.0, 26.6, 24.7, 25.1, 27.5, 30.5, 31.4, 30.5, 26.9, 26.5, 26.9, 25.7, 26.5, 25.2, 25.8};
    double[] Guerrero = {31.5, 32.4, 33.6, 34.5, 34.2, 33.2, 32.2, 31.9, 31.1, 32.0, 32.2, 31.2, 31.0, 31.4, 33.4, 34.6, 34.5, 31.3, 32.2, 31.2, 31.1, 31.5, 31.4, 31.8};
    double[] Hidalgo = {23.2, 25.1, 28.5, 30.8, 29.7, 27.9, 28.6, 26.7, 26.0, 25.8, 23.7, 23.0, 23.4, 26.2, 28.7, 29.5, 29.3, 26.1, 26.1, 26.1, 25.3, 26.0, 23.2, 24.9};
    double[] Jalisco = {26.2, 28.2, 31.7, 32.8, 32.8, 32.4, 30.1, 29.5, 29.0, 30.4, 29.6, 26.5, 27.1, 29.2, 31.8, 32.9, 32.9, 29.9, 29.0, 29.0, 28.3, 28.9, 28.2, 27.7};
    double[] EstadoMexico = {20.4, 23.1, 25.6, 26.2, 25.2, 24.2, 23.3, 22.2, 21.7, 22.6, 22.0, 20.9, 21.4, 23.3, 26.0, 26.3, 25.0, 22.2, 22.3, 22.1, 21.5, 22.4, 21.0, 22.0};
    double[] Michoacan = {26.5, 28.7, 31.2, 32.8, 32.4, 30.9, 29.3, 28.3, 27.9, 28.9, 28.5, 26.6, 26.9, 28.3, 31.1, 31.8, 31.1, 28.2, 28.0, 27.7, 27.5, 28.0, 26.8, 27.0};
    double[] Morelos = {28.1, 30.3, 33.7, 34.9, 34.0, 32.0, 29.4, 28.8, 27.5, 28.7, 29.3, 28.3, 28.4, 30.6, 33.2, 34.3, 32.2, 28.3, 28.9, 28.5, 27.9, 29.0, 28.2, 28.9};
    double[] Nayarit = {29.9, 29.9, 32.6, 34.1, 35.3, 35.8, 34.3, 34.0, 33.3, 34.8, 34.5, 29.1, 28.9, 30.9, 32.8, 34.3, 35.2, 34.1, 33.4, 33.3, 32.3, 33.2, 32.9, 30.4};
    double[] NuevoLeon = {23.5, 24.6, 30.4, 31.6, 33.1, 33.3, 35.1, 34.7, 30.9, 31.3, 27.7, 22.9, 23.5, 25.3, 29.1, 32.0, 33.2, 33.9, 32.5, 34.5, 33.4, 30.9, 25.6, 27.3};
    double[] Oaxaca = {28.8, 30.4, 32.8, 34.6, 33.2, 31.4, 31.3, 30.3, 30.1, 30.0, 29.3, 29.3, 28.1, 30.3, 32.0, 33.4, 32.6, 29.6, 30.7, 30.3, 29.6, 30.1, 28.8, 28.5};
    double[] Puebla = {23.7, 25.7, 29.0, 30.9, 29.5, 28.3, 28.0, 26.8, 25.8, 26.4, 25.4, 23.8, 24.0, 25.9, 28.6, 29.6, 28.3, 25.3, 26.2, 26.1, 25.3, 25.9, 24.0, 25.5};
    double[] Queretaro = {23.9, 27.3, 30.9, 32.7, 31.8, 30.1, 29.7, 28.0, 27.1, 27.7, 25.7, 23.1, 24.5, 27.2, 30.1, 30.9, 30.6, 27.7, 27.5, 28.0, 27.0, 27.1, 25.1, 26.2};
    double[] QuintanaRoo = {30.4, 31.3, 32.2, 34.4, 33.8, 33.2, 34.3, 34.2, 34.5, 32.6, 31.1, 29.3, 29.1, 30.5, 31.3, 33.4, 33.7, 32.9, 33.7, 33.7, 33.3, 32.8, 30.3, 30.6};
    double[] SanLuisPotosi = {25.5, 27.1, 32.0, 36.1, 34.6, 34.4, 35.1, 33.4, 31.8, 31.8, 29.1, 24.9, 25.5, 27.9, 31.9, 34.7, 34.4, 32.2, 31.8, 32.6, 31.1, 30.5, 26.9, 28.6};
    double[] Sinaloa = {28.4, 29.1, 31.5, 34.0, 36.3, 37.7, 36.9, 37.1, 35.9, 36.6, 34.2, 29.3, 28.6, 29.9, 32.1, 34.6, 36.6, 37.4, 36.3, 35.9, 34.9, 35.0, 33.8, 31.1};
    double[] Sonora = {28.4, 29.1, 31.5, 34.0, 36.3, 37.7, 36.9, 37.1, 35.9, 36.6, 34.2, 29.3, 23.6, 25.8, 27.3, 32.1, 35.1, 39.2, 37.1, 37.3, 35.8, 33.4, 31.1, 25.4};
    double[] Tabasco = {29.1, 31.0, 33.6, 36.9, 35.4, 33.1, 34.6, 33.5, 32.6, 31.4, 29.7, 27.9, 28.4, 30.3, 32.8, 35.2, 34.8, 33.6, 34.2, 34.0, 33.3, 32.7, 29.4, 30.8};
    double[] Tamaulipas = {25.5, 25.6, 31.5, 33.8, 34.0, 34.2, 36.1, 35.1, 32.8, 32.2, 29.3, 25.2, 25.0, 25.2, 29.8, 32.7, 34.2, 34.1, 33.9, 35.7, 34.2, 32.0, 27.4, 28.9};
    double[] Tlaxcala = {21.0, 23.7, 26.5, 26.7, 25.1, 24.1, 23.8, 22.8, 21.8, 23.2, 22.2, 21.0, 21.3, 22.9, 26.6, 26.5, 24.8, 21.9, 23.1, 22.6, 22.0, 22.9, 22.0, 23.1};
    double[] Veracruz = {24.6, 25.7, 30.0, 33.0, 31.6, 30.3, 31.7, 30.0, 29.5, 28.8, 26.8, 24.0, 24.2, 25.8, 28.8, 31.2, 31.7, 30.0, 30.0, 39.8, 39.7, 39.2, 25.9, 27.3};
    double[] Yucatan = {29.9, 32.1, 34.6, 38.8, 36.0, 33.7, 34.9, 34.7, 34.7, 32.0, 30.1, 28.8, 28.9, 31.5, 33.4, 36.4, 35.9, 33.9, 34.4, 34.1, 33.7, 33.4, 30.2, 30.7};
    double[] Zacatecas = {21.6, 23.9, 28.7, 30.8, 30.9, 30.6, 27.8, 27.7, 26.4, 28.3, 26.8, 23.3, 23.6, 26.5, 29.4, 30.6, 31.2, 28.3, 26.0, 26.9, 25.9, 26.5, 25.2, 25.5};
    

    //Formulas del modelo 
    
    public void modelo(double xt[], double alfa, double delta, double beta) {
        try {
            ArrayList cal = new ArrayList();
            ArrayList<ArrayList> Dcal = new ArrayList();
            ArrayList cal2 = new ArrayList();
            ArrayList cal3 = new ArrayList();
            double[] xd = new double[23];
            double At = xt[0]; //Serie suavizada exponencialmente o nivel estimado 
            double St = 1.0;//Estimación de estacionalidad
            double Tt = 0.0; //Estimación de Tendencia
            double x; //Pronostico
            int t;

            //Se imprementa la formula con datos cuando st vale 1
            for (int i = 1; i < 12; i++) {
                double at_1 = At;
                double s = St;
                double tt = Tt;
                At = ((alfa * (xt[i]) / 1)) + ((1 - alfa) * (at_1 + Tt));
                Tt = (delta * (At - at_1)) + ((1 - delta) * Tt);
                St = ((xt[i] * beta) / At) + ((1 - beta) * 1);
                x = (at_1 + (1 * tt)) * 1;
                cal3 = new ArrayList();
                cal3.add(xt[i]);
                cal3.add(x);
                Dcal.add(cal3);
            }
            St=1.0;
            for (int i = 12; i < 24; i++) {
                double at_1 = At;
                double s = St;
                double tt = Tt;
                At = ((alfa * (xt[i]) / St)) + ((1 - alfa) * (at_1 + Tt));
                Tt = (delta * (At - at_1)) + ((1 - delta) * Tt);
                St = ((xt[i] * beta) / At) + ((1 - beta) * St);
                xd[i - 12] = St;
                x = (at_1 + (1 * tt)) * s;
                System.out.println("Xd");
                System.out.println(xd[i - 12]);
                cal = new ArrayList();
                cal.add(xt[i]);
                cal.add(x);
                Dcal.add(cal);

            }
            for (int i = 1; i < 13; i++) {
                x = (At + (i * Tt)) * xd[i - 1];
                //System.out.println(x);
                cal2 = new ArrayList();
                cal2.add(-1.0);
                cal2.add(x);
                Dcal.add(cal2);
            }

            //Rellena los datos de nuestra tabla en los valores pronosticados
            g g = new g();
            g.grafica(grafica, Dcal, 0);
            tabla(Dcal);
        } catch (NumberFormatException e) {

        }
    }
    
    //metodo para imprimir la tabla 
    public void tabla(ArrayList<ArrayList> arr) {
        DefaultTableModel modelo = new DefaultTableModel();
        String datos[] = new String[5];
        modelo.addColumn("Meses");
        modelo.addColumn("Temperatura");
        modelo.addColumn("Pronostico");
        //  Datos para la columna mes 
        String mes[]={"2020-Enero","2020-Febrero","2020-Marzo","2020-Abril","2020-Mayo","2020-Junio","2020-Julio","2020-Agosto","2020-Septiembre","2020-Octubre","2020-Noviembre","2020-Diciembre",
                "2021-Enero","2021-Febrero","2021-Marzo","2021-Abril","2021-Mayo","2021-Junio","2021-Julio","2021-Agosto","2021-Septiembre","2021-Octubre","2021-Noviembre","2021-Diciembre",
                "2022-Enero","2022-Febrero","2022-Marzo","2022-Abril","2022-Mayo","2022-Junio","2022-Julio","2022-Agosto","2022-Septiembre","2022-Octubre","2022-Noviembre","2022-Diciembre"};
        for (int x = 0; x < arr.size(); x++) {
            datos[0] = mes[x+1];
            datos[1] = decimal.format((Double) arr.get(x).get(0));
            datos[2] = decimal.format((Double) arr.get(x).get(1));
            modelo.addRow(datos);
        }
        tabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        grafica = new javax.swing.JPanel();
        es = new javax.swing.JComboBox<>();
        Bg = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PreguntaTemperatura = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnArticulo = new javax.swing.JButton();
        BTNManual = new javax.swing.JButton();
        btnañosDatos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Formula = new javax.swing.JButton();
        info = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        grafica.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout graficaLayout = new javax.swing.GroupLayout(grafica);
        grafica.setLayout(graficaLayout);
        graficaLayout.setHorizontalGroup(
            graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        graficaLayout.setVerticalGroup(
            graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );

        es.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        es.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascaliente", "Baja California", "Campeche", "Coahuila", "Colima", "Chiapas", "Chihuahua", "Ciudad de Mexico", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Estado de Mexico", "Michoacan", "Morelos", "Nayarit", "Nuevo Leon", "Oaxaca", "Puebla", "Queretaro", "Quintana Roo", "San Luis Potosi", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatan", "Zacatecas" }));
        es.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esActionPerformed(evt);
            }
        });

        Bg.setBackground(new java.awt.Color(102, 0, 153));
        Bg.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Bg.setForeground(new java.awt.Color(255, 255, 255));
        Bg.setText("Graficar");
        Bg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BgActionPerformed(evt);
            }
        });

        tabla.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Meses", "Temperatura", "Pronostico"
            }
        ));
        tabla.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tabla);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Holt-Winters");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 153));
        jLabel2.setText("TEMPERATURA 2020-2021");

        PreguntaTemperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/temperatura/pre.png"))); // NOI18N
        PreguntaTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreguntaTemperaturaActionPerformed(evt);
            }
        });

        btnPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/temperatura/pre.png"))); // NOI18N
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        btnArticulo.setBackground(new java.awt.Color(102, 0, 153));
        btnArticulo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnArticulo.setForeground(new java.awt.Color(255, 255, 255));
        btnArticulo.setText("ARTICULO");
        btnArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticuloActionPerformed(evt);
            }
        });

        BTNManual.setBackground(new java.awt.Color(102, 0, 153));
        BTNManual.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BTNManual.setForeground(new java.awt.Color(255, 255, 255));
        BTNManual.setText("MANUAL");
        BTNManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNManualActionPerformed(evt);
            }
        });

        btnañosDatos.setBackground(new java.awt.Color(102, 0, 153));
        btnañosDatos.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnañosDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnañosDatos.setText("DATOS");
        btnañosDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañosDatosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 153));
        jLabel3.setText("Bautista Hernández ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 153));
        jLabel4.setText("Jalil Damián");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(btnPre)
                                .addGap(86, 86, 86)
                                .addComponent(PreguntaTemperatura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addGap(18, 18, 18)))
                        .addComponent(grafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(jLabel2)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTNManual, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(es, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(Bg)
                                .addGap(115, 115, 115)
                                .addComponent(jLabel1)
                                .addGap(71, 71, 71)
                                .addComponent(btnañosDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnArticulo)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(BTNManual))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(es, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bg))
                    .addComponent(btnañosDatos)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PreguntaTemperatura)
                            .addComponent(btnPre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addComponent(grafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 36), new java.awt.Color(102, 0, 153))); // NOI18N

        Formula.setBackground(new java.awt.Color(255, 0, 51));
        Formula.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Formula.setForeground(new java.awt.Color(255, 255, 255));
        Formula.setText("FÓRMULA");
        Formula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormulaActionPerformed(evt);
            }
        });

        info.setBackground(new java.awt.Color(255, 0, 51));
        info.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        info.setForeground(new java.awt.Color(255, 255, 255));
        info.setText("INFORMACIÓN");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });

        btnImprimir.setBackground(new java.awt.Color(0, 0, 204));
        btnImprimir.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Formula, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimir)
                .addGap(44, 44, 44)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(info)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Formula)
                .addComponent(btnImprimir))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boron Graficar
    private void BgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BgActionPerformed
        if (es.getSelectedItem().toString() == "Aguascaliente") {
            modelo(Aguascaliente,0.952,0.201,0.011);
        }if(es.getSelectedItem().toString()=="Baja California"){
            modelo(BajaCalifornia,0.802,0.056,0.011);
        }
        if (es.getSelectedItem().toString() == "Campeche") {
            modelo(Campeche,0.999,0.202,0.011);
        }
        if (es.getSelectedItem().toString() == "Coahuila") {
            modelo(Coahuila,0.952,0.105,0.011);
        }if(es.getSelectedItem().toString()=="Chiapas"){
            modelo(Chiapas,0.952,0.202,01);
        }if(es.getSelectedItem().toString()=="Chihuahua"){
            modelo(Chihuahua,0.952,0.059,0.011);
        }if (es.getSelectedItem().toString() == "Colima") {
            modelo(Colima,0.952,0.202,0.011);
        }if (es.getSelectedItem().toString() == "Ciudad de Mexico") {
            modelo(CiudadMexico,0.952,0.202,0.011);
        }
        if (es.getSelectedItem().toString() == "Durango") {
            modelo(Durango,0.952,0.105,0.011);
        }
        if (es.getSelectedItem().toString() == "Guanajuato") {
            modelo(Guanajuato,0.952,0.202,0.01);
        }
        if (es.getSelectedItem().toString() == "Guerrero") {
            modelo(Guerrero,0.952,0.011,0.011);
        }
        if (es.getSelectedItem().toString() == "Hidalgo") {
            modelo(Hidalgo,0.952,0.202,0.011);
        }
        if (es.getSelectedItem().toString() == "Jalisco") {
            modelo(Jalisco,0.952,0.202,0.011);
        }
        if (es.getSelectedItem().toString() == "Estado de Mexico") {
            modelo(EstadoMexico,0.952,0.202,0.011);
        }
        if (es.getSelectedItem().toString() == "Michoacan") {
            modelo(Michoacan,0.952,0.202,0.011);
        }
        if (es.getSelectedItem().toString() == "Morelos") {
            modelo(Morelos,0.952,0.202,0.011);
        }if(es.getSelectedItem().toString()=="Nayarit"){
            modelo(Nayarit,0.952,0.099,0.011);
        }if(es.getSelectedItem().toString()=="Nuevo Leon"){
            modelo(NuevoLeon,0.952,0.105,0.011);
        }if(es.getSelectedItem().toString()=="Oaxaca"){
            modelo(Oaxaca,0.952,0.095,0.011);
        }
        if (es.getSelectedItem().toString() == "Puebla") {
            modelo(Puebla,0.952,0.202,0.011);
        }
        if (es.getSelectedItem().toString() == "Queretaro") {
            modelo(Queretaro,0.952,0.202,0.011);
        }if(es.getSelectedItem().toString()=="Quintana Roo"){
            modelo(QuintanaRoo,0.952,0.105,0.011);
        }if(es.getSelectedItem().toString()=="San Luis Potosi"){
            modelo(SanLuisPotosi,0.952,0.202,0.011);
        }if(es.getSelectedItem().toString()=="Sinaloa"){
            modelo(Sinaloa,0.952,0.105,0.011);
        }if(es.getSelectedItem().toString()=="Sonora"){
            modelo(Sonora,0.952,0.032,0.011);
        }if(es.getSelectedItem().toString()=="Tamaulipas"){
            modelo(Tamaulipas,0.952,0.105,0.011);
        }
        if (es.getSelectedItem().toString() == "Tabasco") {
            modelo(Tabasco,0.952,0.202,0.011);
        }
        if (es.getSelectedItem().toString() == "Tlaxcala") {
            modelo(Tlaxcala,0.952,0.202,0.011);
        }if(es.getSelectedItem().toString()=="Veracruz"){
            modelo(Veracruz,0.952,0.011,0.011);
        }
        if (es.getSelectedItem().toString() == "Yucatan") {
            modelo(Yucatan,0.952,0.105,0.011);
        }
        if (es.getSelectedItem().toString() == "Zacatecas") {
            modelo(Zacatecas,0.952,0.202,0.011);
        }  
        
    }//GEN-LAST:event_BgActionPerformed

    private void FormulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormulaActionPerformed
        // Nos cambia de ventana
        Formula pd = new Formula(); //Creamos objeto con la otra ventana que nos vamos a mover
        pd.setVisible(true); //  Nos muestra la tra ventana
        this.dispose(); // metodo para que no se nos acumule la ventanas
    }//GEN-LAST:event_FormulaActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        // TODO add your handling code here:
        Datos pd = new Datos(); //Creamos objeto con la otra ventana que nos vamos a mover
        pd.setVisible(true); //  Nos muestra la tra ventana
        this.dispose(); // metodo para que no se nos acumule la ventanas
        //Datos datos = new Datos();
    }//GEN-LAST:event_infoActionPerformed

    private void PreguntaTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreguntaTemperaturaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "TEMPERATURA \n Los Datos reales fueron obtenidos de https://smn.conagua.gob.mx/");
    }//GEN-LAST:event_PreguntaTemperaturaActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "PREDICCIÓN \nPara calcular la predicción de m periodos en futuro se utilizaron las formulas de "
                + "\nSerie suavizada exponencialmente o nivel estimado "
                + "\nEstimación de Tendencia  "
                + "\nEstimación de estacionalidad y "
                + "\nPredicción de m periodos en el futuro");
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticuloActionPerformed
        // Busca y muestra el pdf
        try{
            //C:\Users\DAMIAN\Downloads\Temperatura
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "src\\Documentacion\\Holt-Winters.pdf");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Check file details");
        }
        
    }//GEN-LAST:event_btnArticuloActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);
        if(job.printDialog()){
            try{
                job.print();
            }catch(PrinterException ex){
                
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "La impresion se canselo");
        }
        
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnañosDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañosDatosActionPerformed
        // Muestra el pdf de los años recabados
        try{
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "src\\Documentacion\\2020_2021.pdf");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Check file details");
        }
    }//GEN-LAST:event_btnañosDatosActionPerformed

    private void BTNManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNManualActionPerformed
        // Boton para ver el pdf del manual
        try{
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "src\\Documentacion\\Manual.pdf");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Check file details");
        }
    }//GEN-LAST:event_BTNManualActionPerformed

    private void esActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_esActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNManual;
    private javax.swing.JButton Bg;
    private javax.swing.JButton Formula;
    private javax.swing.JButton PreguntaTemperatura;
    private javax.swing.JButton btnArticulo;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnañosDatos;
    private javax.swing.JComboBox<String> es;
    private javax.swing.JPanel grafica;
    private javax.swing.JButton info;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    //Metodo imprimir 
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
       //Metodo para imprimir 
       
       if(pageIndex==0){
           Graphics2D graphics2d = (Graphics2D) graphics;
           //Conbierte el grafico normal a pd
           //graphics2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
           graphics2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
           //graphics2d.scale(0.4, 1.1);
           graphics2d.scale(0.5, 0.5);
           //tabla.printAll(graphics2d);
           //grafica.printAll(graphics2d);
           jPanel1.printAll(graphics2d);
           return PAGE_EXISTS;
       }else{
           return NO_SUCH_PAGE;
       }
    }
}
