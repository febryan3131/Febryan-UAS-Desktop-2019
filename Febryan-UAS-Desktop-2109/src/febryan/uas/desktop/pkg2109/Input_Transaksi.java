/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package febryan.uas.desktop.pkg2109;

/**
 *
 * @author febryan
 */
public class Input_Transaksi extends javax.swing.JFrame {

    /**
     * Creates new form Input_Transaksi
     */
    public Input_Transaksi() {
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

        jToggleButton1 = new javax.swing.JToggleButton();
        NB = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        harga = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jumlah1 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        tt = new javax.swing.JTextField();
        th = new javax.swing.JTextField();
        tj = new javax.swing.JTextField();
        T = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NB.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Form Input Transaksi");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nama Barang");

        tanggal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tanggal.setText("Tanggal");

        harga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        harga.setText("Harga");

        total.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        total.setText("Total");

        jumlah1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jumlah1.setText("Jumlah");

        btnSubmit.setText("Submit");

        btnCancel.setText("Cancel");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tolak Miskin Sido Muncul", "Pasta Gigi President", "Mie Instant Suami-Istri Dua", "Teh Katak", "Kopi Kapal Terbang", "Minuman Berenergi- Extra Boss" }));

        javax.swing.GroupLayout NBLayout = new javax.swing.GroupLayout(NB);
        NB.setLayout(NBLayout);
        NBLayout.setHorizontalGroup(
            NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jumlah1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(harga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tanggal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
                .addGap(32, 32, 32)
                .addGroup(NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(NBLayout.createSequentialGroup()
                        .addComponent(btnSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel))
                    .addGroup(NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tt)
                        .addComponent(th)
                        .addComponent(tj)
                        .addComponent(T)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        NBLayout.setVerticalGroup(
            NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NBLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addGroup(NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(tanggal))
                    .addComponent(tt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(harga)
                    .addComponent(th, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnCancel))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(Input_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        private void btnActionPerformed(java.awt.event.ActionEvent evt) {                                    
     
       // TODO add your handling code here:
        if (Tid.getText().isEmpty()) {
        } else if (tt.getText().isEmpty()){
           
        } else if (th.getText().isEmpty()){
           
        }else if (tj.getText().isEmpty()){
           
        }else if (T.getText().isEmpty()){
           
        }else
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Input_Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NB;
    private javax.swing.JTextField T;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel harga;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel jumlah1;
    private javax.swing.JLabel tanggal;
    private javax.swing.JTextField th;
    private javax.swing.JTextField tj;
    private javax.swing.JLabel total;
    private javax.swing.JTextField tt;
    // End of variables declaration//GEN-END:variables
}
