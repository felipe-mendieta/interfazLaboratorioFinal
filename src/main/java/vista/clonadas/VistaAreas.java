package vista.clonadas;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Http;
import org.json.JSONArray;

/**
 *
 * @author Felipe
 */
public class VistaAreas extends javax.swing.JFrame {

    private DefaultTableModel modelTabla;
    private final String nameRecurso = "/areas";
    private Http peticion;
    public VistaAreas() {

        initComponents();
        extrasSetup();
        inicializarComponentes();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLabelTituloVentana = new javax.swing.JLabel();
        jPanelAcciones = new javax.swing.JPanel();
        jButtonGrabar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jPanelContenedorTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAreas = new javax.swing.JTable();
        jPanelInfo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de Areas");

        jPanelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelTitulo.setLayout(new java.awt.BorderLayout());

        jLabelTituloVentana.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTituloVentana.setText("LAB: AREA");
        jPanelTitulo.add(jLabelTituloVentana, java.awt.BorderLayout.CENTER);

        jPanelAcciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelAcciones.setLayout(new java.awt.GridLayout(3, 1));

        jButtonGrabar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGrabar.setText("Guardar");
        jButtonGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGrabarActionPerformed(evt);
            }
        });
        jPanelAcciones.add(jButtonGrabar);

        jButtonActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanelAcciones.add(jButtonActualizar);

        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanelAcciones.add(jButtonEliminar);

        jPanelContenedorTabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelContenedorTabla.setLayout(new java.awt.BorderLayout());

        jTableAreas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableAreas);

        jPanelContenedorTabla.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanelInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelInfo.setLayout(new java.awt.GridLayout(3, 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("NOMBRE:");
        jPanelInfo.add(jLabel2);

        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanelInfo.add(jTextFieldNombre);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelContenedorTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContenedorTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrabarActionPerformed
        Grabar();
    }//GEN-LAST:event_jButtonGrabarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        Eliminar();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        Actualizar();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAreas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonActualizar;
    public javax.swing.JButton jButtonEliminar;
    public javax.swing.JButton jButtonGrabar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTituloVentana;
    private javax.swing.JPanel jPanelAcciones;
    private javax.swing.JPanel jPanelContenedorTabla;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableAreas;
    public javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
    private void extrasSetup() {
        this.setLocationRelativeTo(null);
    }

    private void inicializarComponentes() {
        modelTabla = new DefaultTableModel();
        modelTabla.addColumn("ID");
        modelTabla.addColumn("AREA");
        jTableAreas.setModel(modelTabla);
        peticion=new Http();
        recuperarDatosParaTabla();
    }

    private void limpiarTabla() {
        int i;
        int cuantos = modelTabla.getRowCount();
        for (i = cuantos - 1; i >= 0; i--) {
            modelTabla.removeRow(i);
        }
    }

    private void recuperarDatosParaTabla() {
        limpiarTabla();
//        var json
//                = "[\n"
//                + "    {\n"
//                + "        \"id\": 1,\n"
//                + "        \"nombre\": \"Orina\",\n"
//                + "        \"status\": \"CREATED\"\n"
//                + "    },\n"
//                + "    {\n"
//                + "        \"id\": 2,\n"
//                + "        \"nombre\": \"Sangre\",\n"
//                + "        \"status\": \"CREATED\"\n"
//                + "    }\n"
//                + "]";

        String json = peticion.sendGet(nameRecurso);
        if(!json.isBlank())
            construirTabla(json);
        System.out.println(json);

    }

    private Object[] construirTabla(String json) {
        Object[] areas = new Object[2];

        JSONArray areasJSON = new JSONArray(json);

        for (int i = 0; i < areasJSON.length(); i++) {
            areas[0] = areasJSON.getJSONObject(i).get("id").toString();
            areas[1] = areasJSON.getJSONObject(i).get("nombre").toString();
            modelTabla.addRow(areas);
        }
        return areas;
    }

    private void Grabar() {
        if (jTextFieldNombre.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Lleno todos los campos");
        } else {
            Map<Object, Object> data;
            data = new HashMap<>();
            data.put("nombre", this.jTextFieldNombre.getText());
            peticion.sendPost(data, nameRecurso);
            recuperarDatosParaTabla();
        }

    }


    private void Eliminar() {
        int identificador = this.jTableAreas.getSelectedRow();
        if (identificador == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else {
            String idArea = (String) this.jTableAreas.getValueAt(identificador, 0);
            System.out.println("IdArea:" + idArea);
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de Eliminar ?", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                //Http.sendGet("");
                JOptionPane.showMessageDialog(null, "Area Eliminado");
            }
            this.jTextFieldNombre.setText("");

            recuperarDatosParaTabla();

        }
    }

    private void Actualizar() {

        int identificador = this.jTableAreas.getSelectedRow();

        if (identificador == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else {
            var index = (String) modelTabla.getValueAt(identificador, 0);
            Map<Object, Object> data;
            data = new HashMap<>();
            data.put("id", index);
            data.put("nombre", this.jTextFieldNombre.getText());

            peticion.sendPost(data, nameRecurso);//Peticion para actualizar

            
            recuperarDatosParaTabla();
        }
    }
}
