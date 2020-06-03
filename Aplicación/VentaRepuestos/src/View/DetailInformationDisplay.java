
package View;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class DetailInformationDisplay extends javax.swing.JFrame {
    
    public DefaultComboBoxModel comboBoxModelPart;
    public DefaultTableModel tableModel;

    public DetailInformationDisplay() {
        initComponents();
        this.comboBoxModelPart = (DefaultComboBoxModel) jComboBox_Part.getModel();
        this.tableModel = (DefaultTableModel) jTable_Detail.getModel();
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_BG = new javax.swing.JPanel();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_Title = new javax.swing.JLabel();
        jLabel_Part = new javax.swing.JLabel();
        jButton_Accept = new javax.swing.JButton();
        jComboBox_Part = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Detail = new javax.swing.JTable();
        jLabel_Amount = new javax.swing.JLabel();
        jTextField_Amount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_BG.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Header.setBackground(new java.awt.Color(153, 0, 0));

        jLabel_Title.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("DETALLES");

        javax.swing.GroupLayout jPanel_HeaderLayout = new javax.swing.GroupLayout(jPanel_Header);
        jPanel_Header.setLayout(jPanel_HeaderLayout);
        jPanel_HeaderLayout.setHorizontalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_HeaderLayout.setVerticalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel_Title)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel_Part.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel_Part.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Part.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Part.setText("PARTE:");

        jButton_Accept.setBackground(new java.awt.Color(153, 0, 0));
        jButton_Accept.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jButton_Accept.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Accept.setText("AGREGAR");

        jComboBox_Part.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jComboBox_Part.setForeground(new java.awt.Color(0, 0, 0));

        jTable_Detail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parte", "Proveedor", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Detail);

        jLabel_Amount.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel_Amount.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Amount.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Amount.setText("CANTIDAD:");

        jTextField_Amount.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel_BGLayout = new javax.swing.GroupLayout(jPanel_BG);
        jPanel_BG.setLayout(jPanel_BGLayout);
        jPanel_BGLayout.setHorizontalGroup(
            jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Part, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Amount, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox_Part, 0, 300, Short.MAX_VALUE)
                    .addComponent(jTextField_Amount))
                .addGap(18, 18, 18)
                .addComponent(jButton_Accept, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel_BGLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel_BGLayout.setVerticalGroup(
            jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BGLayout.createSequentialGroup()
                .addComponent(jPanel_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_BGLayout.createSequentialGroup()
                        .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_Part, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Part))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Amount)
                            .addComponent(jTextField_Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton_Accept, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton_Accept;
    public javax.swing.JComboBox<String> jComboBox_Part;
    private javax.swing.JLabel jLabel_Amount;
    private javax.swing.JLabel jLabel_Part;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JPanel jPanel_BG;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable_Detail;
    public javax.swing.JTextField jTextField_Amount;
    // End of variables declaration//GEN-END:variables
}
