/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.clonadas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Area;
import modelo.Http;
import modelo.UnidadMedida;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Felipe
 */
public class VistaExamen extends javax.swing.JFrame {

    private DefaultTableModel modelTabla;
    private final String nameRecurso = "/examenes";
    private Http peticion;
    public VistaExamen() {
        initComponents();
        extrasSetup();
        inicializarComponentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLabelTituloVentana = new javax.swing.JLabel();
        jPanelAcciones = new javax.swing.JPanel();
        jButtonNuevo = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonGrabar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jPanelContenedorTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePruebas = new javax.swing.JTable();
        jPanelInfo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldMedico = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldLaboratorista = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelTitulo.setLayout(new java.awt.BorderLayout());

        jLabelTituloVentana.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTituloVentana.setText("LAB: EXAMEN");
        jPanelTitulo.add(jLabelTituloVentana, java.awt.BorderLayout.CENTER);

        jPanelAcciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelAcciones.setLayout(new java.awt.GridLayout(5, 1));

        jButtonNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonNuevo.setText("Nuevo");
        jPanelAcciones.add(jButtonNuevo);

        jButtonActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jPanelAcciones.add(jButtonActualizar);

        jButtonGrabar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGrabar.setText("Grabar");
        jPanelAcciones.add(jButtonGrabar);

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jPanelAcciones.add(jButtonCancelar);

        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jPanelAcciones.add(jButtonEliminar);

        jPanelContenedorTabla.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenedorTabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelContenedorTabla.setLayout(new java.awt.BorderLayout());

        jTablePruebas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTablePruebas);

        jPanelContenedorTabla.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanelInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelInfo.setLayout(new java.awt.GridLayout(4, 2));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("CÉDULA PACIENTE:");
        jPanelInfo.add(jLabel3);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("MÉDICO:");
        jPanelInfo.add(jLabel5);

        jTextFieldTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanelInfo.add(jTextFieldTitulo);

        jTextFieldMedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanelInfo.add(jTextFieldMedico);

        jButton1.setText("VER PACIENTES");
        jPanelInfo.add(jButton1);

        jButton2.setText("VER MEDICOS");
        jPanelInfo.add(jButton2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("RESPONSABLE:");
        jPanelInfo.add(jLabel4);

        jTextFieldLaboratorista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanelInfo.add(jTextFieldLaboratorista);

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
                    .addComponent(jPanelContenedorTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContenedorTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VistaExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaExamen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JButton jButtonActualizar;
    public javax.swing.JButton jButtonCancelar;
    public javax.swing.JButton jButtonEliminar;
    public javax.swing.JButton jButtonGrabar;
    public javax.swing.JButton jButtonNuevo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTituloVentana;
    private javax.swing.JPanel jPanelAcciones;
    private javax.swing.JPanel jPanelContenedorTabla;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTablePruebas;
    private javax.swing.JTextField jTextFieldLaboratorista;
    private javax.swing.JTextField jTextFieldMedico;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
    private void extrasSetup() {
        this.setLocationRelativeTo(null);
    }

    private void inicializarComponentes() {
        modelTabla = new DefaultTableModel();
       
        modelTabla.addColumn("ID");
        modelTabla.addColumn("Cedula");
        modelTabla.addColumn("Medico");
        modelTabla.addColumn("Resposable");
        modelTabla.addColumn("Fecha de creación");
        

        jTablePruebas.setModel(modelTabla);
        
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
        peticion=new Http();
        String json = peticion.sendGet(nameRecurso);
        construirTabla(json);
        System.out.println(json);

    }

    private Object[] construirTabla(String json) {
        Object[] areas = new Object[7];

        JSONArray areasJSON = new JSONArray(json);

        for (int i = 0; i < areasJSON.length(); i++) {
            areas[0] = areasJSON.getJSONObject(i).get("id").toString();
            areas[1] = areasJSON.getJSONObject(i).get("titulo").toString();
            areas[2] = areasJSON.getJSONObject(i).get("precio").toString();
            areas[3] = areasJSON.getJSONObject(i).get("limiteInferior").toString();
            areas[4] = areasJSON.getJSONObject(i).get("limiteSuperior").toString();

            //areas[5] = (areasJSON.getJSONObject(i).get("area").toString()).split("\"")[0];
            var area = (JSONObject) areasJSON.getJSONObject(i).get("area");
            areas[5] = area.get("nombre").toString();

            var unidadM = (JSONObject) areasJSON.getJSONObject(i).get("unidadMedida");
            areas[6] = unidadM.get("unidadDeMedida").toString();
            //areas[6] = areasJSON.getJSONObject(i).get("unidadMedida").toString();
            modelTabla.addRow(areas);
        }
        return areas;
    }

    private void grabar() {
        if (jTextFieldTitulo.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Lleno todos los campos");
        } else {
            Map<Object, Object> data;
            data = new HashMap<>();
            data.put("titulo", this.jTextFieldTitulo.getText());
           
            
            
            peticion=new Http();
            peticion.sendPost(data, nameRecurso);
            recuperarDatosParaTabla();
        }

    }

    private void eliminar() {
        int identificador = this.jTablePruebas.getSelectedRow();
        if (identificador == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else {
            String idArea = (String) this.jTablePruebas.getValueAt(identificador, 0);
            System.out.println("IdArea:" + idArea);
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de Eliminar ?", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                //Http.sendGet("");
                JOptionPane.showMessageDialog(null, "Unidad Eliminada.");
            }
            this.jTextFieldTitulo.setText("");

            recuperarDatosParaTabla();

        }
    }

    private void actualizar() {

        int identificador = this.jTablePruebas.getSelectedRow();

        if (identificador == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else {

            var index = (String) modelTabla.getValueAt(identificador, 0);
            Map<Object, Object> data;
            data = new HashMap<>();
            data.put("titulo", this.jTextFieldTitulo.getText());
            
            peticion.sendPost(data, nameRecurso);
            recuperarDatosParaTabla();

        }
    }

    private ArrayList<UnidadMedida> getUnidadesMedidaObjetcs() {
        var listaUM = new ArrayList<UnidadMedida>();
        String tabla = "/unidades";
        String json = peticion.sendGet(tabla);
        JSONArray areasJSON = new JSONArray(json);
        for (int i = 0; i < areasJSON.length(); i++) {
            var id = (Integer) areasJSON.getJSONObject(i).get("id");
            var valor = (String) areasJSON.getJSONObject(i).get("unidadDeMedida");
            var unidadDeMedida = new UnidadMedida(id, valor);
            listaUM.add(unidadDeMedida);

        }

        return listaUM;
    }

    private ArrayList<Area> getAreaObjetcs() {
        var listaArea = new ArrayList<Area>();
        String tabla = "/areas";
        String json = peticion.sendGet(tabla);
        JSONArray areasJSON = new JSONArray(json);
        for (int i = 0; i < areasJSON.length(); i++) {
            var id = (Integer) areasJSON.getJSONObject(i).get("id");
            var valor = (String) areasJSON.getJSONObject(i).get("nombre");
            var area = new Area(id, valor);
            listaArea.add(area);

        }
        return listaArea;
    }
}