/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.equivalencia.view;

/**
 *
 * @author anunes
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCurso = new javax.swing.JButton();
        btnPpc = new javax.swing.JButton();
        btnArea = new javax.swing.JButton();
        btnUnidades = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnGrupoEquiv = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        mencadArea = new javax.swing.JMenuItem();
        menCadCurso = new javax.swing.JMenuItem();
        menCadPpc = new javax.swing.JMenu();
        menCadEquivalencia = new javax.swing.JMenuItem();
        menCadUnid = new javax.swing.JMenuItem();
        menCadUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menEquivalencia = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menLogout = new javax.swing.JMenuItem();
        menSair = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menFluxo = new javax.swing.JMenuItem();
        menManual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagem/cursos_1.jpg"))); // NOI18N

        btnPpc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagem/ppc.png"))); // NOI18N

        btnArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagem/tecnologico.png"))); // NOI18N

        btnUnidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagem/unidcurric.png"))); // NOI18N

        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagem/usuario.png"))); // NOI18N

        btnGrupoEquiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/equivalencia/imagem/equivalencia.png"))); // NOI18N

        menCad.setText("Cadastro");

        mencadArea.setText("Área Tecnológica");
        mencadArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mencadAreaActionPerformed(evt);
            }
        });
        menCad.add(mencadArea);

        menCadCurso.setText("Cursos");
        menCad.add(menCadCurso);

        menCadPpc.setText("PPC");
        menCad.add(menCadPpc);

        menCadEquivalencia.setText("Grupo Equivalencia");
        menCad.add(menCadEquivalencia);

        menCadUnid.setText("Unidades Curriculares");
        menCad.add(menCadUnid);

        menCadUsuario.setText("Usuarios");
        menCad.add(menCadUsuario);

        jMenuBar1.add(menCad);

        jMenu2.setText("Equivalência");

        menEquivalencia.setText("Realizar Equivalencia");
        jMenu2.add(menEquivalencia);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Opções");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        menLogout.setText("Logout");
        jMenu3.add(menLogout);

        menSair.setText("Sair");
        menSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSairActionPerformed(evt);
            }
        });
        jMenu3.add(menSair);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ajuda");

        menFluxo.setText("Fluxo de Processo");
        jMenu4.add(menFluxo);

        menManual.setText("Manual");
        jMenu4.add(menManual);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(btnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGrupoEquiv, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(btnUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPpc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPpc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUnidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrupoEquiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        TelaLogin login = new TelaLogin ();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void menSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menSairActionPerformed

    private void mencadAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mencadAreaActionPerformed
        // TODO add your handling code here:
        TelaArea area = new TelaArea();
        area.setVisible(true);
    }//GEN-LAST:event_mencadAreaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnCurso;
    private javax.swing.JButton btnGrupoEquiv;
    private javax.swing.JButton btnPpc;
    private javax.swing.JButton btnUnidades;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenu menCad;
    private javax.swing.JMenuItem menCadCurso;
    private javax.swing.JMenuItem menCadEquivalencia;
    private javax.swing.JMenu menCadPpc;
    private javax.swing.JMenuItem menCadUnid;
    private javax.swing.JMenuItem menCadUsuario;
    private javax.swing.JMenuItem menEquivalencia;
    private javax.swing.JMenuItem menFluxo;
    private javax.swing.JMenuItem menLogout;
    private javax.swing.JMenuItem menManual;
    private javax.swing.JMenuItem menSair;
    private javax.swing.JMenuItem mencadArea;
    // End of variables declaration//GEN-END:variables
}
