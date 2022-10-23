/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import DAO.CargosDAO;
import Modelo.CargosModel;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI
 */
public class FormCargos extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormCargos
     */
    private long codcargo=0;
    private CargosDAO cargosDAO;
    public FormCargos() {
        initComponents();
        this.cargosDAO= new CargosDAO();
        if (this.cargosDAO.getError()==null) {
            JOptionPane.showMessageDialog(this, this.cargosDAO.getError());
            System.exit(0);           
        }
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
        jLabel2 = new javax.swing.JLabel();
        Cargo = new javax.swing.JTextField();
        Sueldo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Nuevo = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Filtrar = new javax.swing.JButton();
        Todos = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Cargo:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Sueldo:");

        Cargo.setEditable(false);
        Cargo.setName("Cargo"); // NOI18N

        Sueldo.setEditable(false);
        Sueldo.setName("Sueldo"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.setEnabled(false);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.setEnabled(false);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nuevo)
                .addGap(18, 18, 18)
                .addComponent(Modificar)
                .addGap(18, 18, 18)
                .addComponent(Eliminar)
                .addGap(18, 18, 18)
                .addComponent(Guardar)
                .addGap(18, 18, 18)
                .addComponent(Cancelar)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nuevo)
                    .addComponent(Modificar)
                    .addComponent(Eliminar)
                    .addComponent(Guardar)
                    .addComponent(Cancelar))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar"));

        Filtrar.setText("Filtrar");
        Filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltrarActionPerformed(evt);
            }
        });

        Todos.setText("Todos");
        Todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Todos)
                    .addComponent(Filtrar))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Filtrar)
                .addGap(56, 56, 56)
                .addComponent(Todos)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cargo, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(Sueldo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:
        this.activarObjetos(true);
        this.limpiar();
        this.Cargo.requestFocus();
    }//GEN-LAST:event_NuevoActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        CargosModel obj = this.crearModelo();
        if (this.codcargo==0) {
            this.cargosDAO.insertar(obj);
        } else {
            this.cargosDAO.update(obj);
        }
        JOptionPane.showMessageDialog(this, "Registro Guardado");
        this.limpiar();
        this.activarObjetos(false);
    }//GEN-LAST:event_GuardarActionPerformed

    private void FiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltrarActionPerformed
        // TODO add your handling code here:
        String codigo=JOptionPane.showInputDialog(this, "Digite el Codigo del Cargo");
        long cod=Long.parseLong(codigo);
        CargosModel obj = this.cargosDAO.getOne(cod);
        if (obj!=null) {
            this.codcargo=obj.getCodcargo();
            this.Cargo.setText(obj.getCargo());
            this.Sueldo.setText(String.valueOf(obj.getSueldo()));
        } else {
            JOptionPane.showMessageDialog(this, "El Codigo no existe");
        }
    }//GEN-LAST:event_FiltrarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        if (this.codcargo==0) {
            JOptionPane.showMessageDialog(this, "Debe recuperar un registro antes de usar el boton modificar");
        } else {
            this.activarObjetos(true);
            this.Cargo.requestFocus(); 
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        this.limpiar();
        this.activarObjetos(false);        
    }//GEN-LAST:event_CancelarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
         if (this.codcargo==0) {
            JOptionPane.showMessageDialog(this, "Debe recuperar un registro para poder eliminarlo");
         } else {
            if (JOptionPane.showConfirmDialog(this, "Esta seguro de Eliminar el Registro?", 
                                                    "Administrador", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
                CargosModel obj = this.crearModelo();
                this.cargosDAO.delete(obj);
                JOptionPane.showMessageDialog(this, "Registro Eliminado");
                this.limpiar();
                this.activarObjetos(false);
            }          
         }          
    }//GEN-LAST:event_EliminarActionPerformed

    private void TodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosActionPerformed
        // TODO add your handling code here:
        FormListCargos fmrcargos = new FormListCargos(this.cargosDAO);
        this.getParent().add(fmrcargos);
        Dimension desk=this.getParent().getSize();
        Dimension form=fmrcargos.getSize();
        int x=(int) ((desk.width-form.width)/2);
        int y=(int) ((desk.height-form.height)/2);
        fmrcargos.setLocation(x, y);
        fmrcargos.setVisible(true);
        fmrcargos.setFocusable(true);            
    }//GEN-LAST:event_TodosActionPerformed
   
    private CargosModel crearModelo() {
        String c = this.Cargo.getText();
        double s=Double.parseDouble(this.Sueldo.getText());
        CargosModel cm=new CargosModel(this.codcargo,c,s);
        return cm;
    }
    
    private void limpiar() {
        this.Cargo.setText("");
        this.Sueldo.setText("");
        this.codcargo=0;       
    }
    
    private void activarObjetos (boolean estado) {
        this.Cargo.setEditable(estado);
        this.Sueldo.setEditable(estado);
        this.Nuevo.setEnabled(!estado);
        this.Modificar.setEnabled(!estado);
        this.Todos.setEnabled(!estado);
        this.Eliminar.setEnabled(!estado);
        this.Filtrar.setEnabled(!estado);
        this.Guardar.setEnabled(estado);
        this.Cancelar.setEnabled(estado);              
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Cargo;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Filtrar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Nuevo;
    private javax.swing.JTextField Sueldo;
    private javax.swing.JButton Todos;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}