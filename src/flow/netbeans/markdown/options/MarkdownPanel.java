package flow.netbeans.markdown.options;

import org.openide.util.NbPreferences;

public final class MarkdownPanel extends javax.swing.JPanel {

    private final MarkdownOptionsPanelController controller;

    MarkdownPanel(MarkdownOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        TABS = new javax.swing.JTabbedPane();
        EXTENSIONS_PANEL = new javax.swing.JPanel();
        EXTENSIONS_PANEL_HEADER = new javax.swing.JLabel();
        SMARTS = new javax.swing.JCheckBox();
        QUOTES = new javax.swing.JCheckBox();
        ABBREVIATIONS = new javax.swing.JCheckBox();
        HARDWRAPS = new javax.swing.JCheckBox();
        AUTOLINKS = new javax.swing.JCheckBox();
        TABLES = new javax.swing.JCheckBox();
        DEFINITION_LISTS = new javax.swing.JCheckBox();
        FENCED_CODE_BLOCKS = new javax.swing.JCheckBox();
        HTML_BLOCK_SUPPRESSION = new javax.swing.JCheckBox();
        INLINE_HTML_SUPPRESSION = new javax.swing.JCheckBox();
        WIKILINKS = new javax.swing.JCheckBox();
        HTML_EXPORT_PANEL = new javax.swing.JPanel();
        HTML_PANEL_HEADER = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HTML_TEMPLATE = new javax.swing.JTextArea();

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox1, org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.jCheckBox1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(EXTENSIONS_PANEL_HEADER, org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.EXTENSIONS_PANEL_HEADER.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(SMARTS, org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.SMARTS.text")); // NOI18N
        SMARTS.setToolTipText(org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.SMARTS.toolTipText")); // NOI18N
        SMARTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMARTSActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(QUOTES, org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.QUOTES.text")); // NOI18N
        QUOTES.setToolTipText(org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.QUOTES.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(ABBREVIATIONS, org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.ABBREVIATIONS.text")); // NOI18N
        ABBREVIATIONS.setToolTipText(org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.ABBREVIATIONS.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(HARDWRAPS, org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.HARDWRAPS.text")); // NOI18N
        HARDWRAPS.setToolTipText(org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.HARDWRAPS.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(AUTOLINKS, org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.AUTOLINKS.text")); // NOI18N
        AUTOLINKS.setToolTipText(org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.AUTOLINKS.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(TABLES, org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.TABLES.text")); // NOI18N
        TABLES.setToolTipText(org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.TABLES.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(DEFINITION_LISTS, org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.DEFINITION_LISTS.text")); // NOI18N
        DEFINITION_LISTS.setToolTipText(org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.DEFINITION_LISTS.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(FENCED_CODE_BLOCKS, org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.FENCED_CODE_BLOCKS.text")); // NOI18N
        FENCED_CODE_BLOCKS.setToolTipText(org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.FENCED_CODE_BLOCKS.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(HTML_BLOCK_SUPPRESSION, org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.HTML_BLOCK_SUPPRESSION.text")); // NOI18N
        HTML_BLOCK_SUPPRESSION.setToolTipText(org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.HTML_BLOCK_SUPPRESSION.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(INLINE_HTML_SUPPRESSION, org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.INLINE_HTML_SUPPRESSION.text")); // NOI18N
        INLINE_HTML_SUPPRESSION.setToolTipText(org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.INLINE_HTML_SUPPRESSION.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(WIKILINKS, org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.WIKILINKS.text")); // NOI18N
        WIKILINKS.setToolTipText(org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.WIKILINKS.toolTipText")); // NOI18N

        javax.swing.GroupLayout EXTENSIONS_PANELLayout = new javax.swing.GroupLayout(EXTENSIONS_PANEL);
        EXTENSIONS_PANEL.setLayout(EXTENSIONS_PANELLayout);
        EXTENSIONS_PANELLayout.setHorizontalGroup(
            EXTENSIONS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EXTENSIONS_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EXTENSIONS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EXTENSIONS_PANEL_HEADER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EXTENSIONS_PANELLayout.createSequentialGroup()
                        .addGroup(EXTENSIONS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(INLINE_HTML_SUPPRESSION)
                            .addComponent(SMARTS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(QUOTES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ABBREVIATIONS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HARDWRAPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AUTOLINKS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TABLES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DEFINITION_LISTS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FENCED_CODE_BLOCKS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HTML_BLOCK_SUPPRESSION, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(WIKILINKS, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 118, Short.MAX_VALUE))))
        );
        EXTENSIONS_PANELLayout.setVerticalGroup(
            EXTENSIONS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EXTENSIONS_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EXTENSIONS_PANEL_HEADER)
                .addGap(17, 17, 17)
                .addComponent(SMARTS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QUOTES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ABBREVIATIONS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HARDWRAPS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AUTOLINKS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TABLES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DEFINITION_LISTS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FENCED_CODE_BLOCKS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HTML_BLOCK_SUPPRESSION)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(INLINE_HTML_SUPPRESSION)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WIKILINKS)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        TABS.addTab(org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.EXTENSIONS_PANEL.TabConstraints.tabTitle"), EXTENSIONS_PANEL); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(HTML_PANEL_HEADER, org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.HTML_PANEL_HEADER.text")); // NOI18N

        HTML_TEMPLATE.setColumns(20);
        HTML_TEMPLATE.setRows(5);
        HTML_TEMPLATE.setText(org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.HTML_TEMPLATE.text")); // NOI18N
        jScrollPane1.setViewportView(HTML_TEMPLATE);

        javax.swing.GroupLayout HTML_EXPORT_PANELLayout = new javax.swing.GroupLayout(HTML_EXPORT_PANEL);
        HTML_EXPORT_PANEL.setLayout(HTML_EXPORT_PANELLayout);
        HTML_EXPORT_PANELLayout.setHorizontalGroup(
            HTML_EXPORT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HTML_EXPORT_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HTML_EXPORT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HTML_PANEL_HEADER, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addGroup(HTML_EXPORT_PANELLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                        .addGap(8, 8, 8))))
        );
        HTML_EXPORT_PANELLayout.setVerticalGroup(
            HTML_EXPORT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HTML_EXPORT_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HTML_PANEL_HEADER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );

        TABS.addTab(org.openide.util.NbBundle.getMessage(MarkdownPanel.class, "MarkdownPanel.HTML_EXPORT_PANEL.TabConstraints.tabTitle"), HTML_EXPORT_PANEL); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TABS)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(TABS))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SMARTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMARTSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SMARTSActionPerformed

    void load() {
        // TODO read settings and initialize GUI
        // Example:
        // someCheckBox.setSelected(Preferences.userNodeForPackage(MarkdownPanel.class).getBoolean("someFlag", false));
        // or for org.openide.util with API spec. version >= 7.4:
        // someCheckBox.setSelected(NbPreferences.forModule(MarkdownPanel.class).getBoolean("someFlag", false));
        // or:
        // someTextField.setText(SomeSystemOption.getDefault().getSomeStringProperty());
        ABBREVIATIONS.setSelected(NbPreferences.forModule(MarkdownPanel.class).getBoolean("ABBREVIATIONS", false));
        AUTOLINKS.setSelected(NbPreferences.forModule(MarkdownPanel.class).getBoolean("AUTOLINKS", false));
        DEFINITION_LISTS.setSelected(NbPreferences.forModule(MarkdownPanel.class).getBoolean("DEFINITION_LISTS", false));
        FENCED_CODE_BLOCKS.setSelected(NbPreferences.forModule(MarkdownPanel.class).getBoolean("FENCED_CODE_BLOCKS", false));
        HARDWRAPS.setSelected(NbPreferences.forModule(MarkdownPanel.class).getBoolean("HARDWRAPS", false));
        HTML_BLOCK_SUPPRESSION.setSelected(NbPreferences.forModule(MarkdownPanel.class).getBoolean("HTML_BLOCK_SUPPRESSION", false));
        INLINE_HTML_SUPPRESSION.setSelected(NbPreferences.forModule(MarkdownPanel.class).getBoolean("INLINE_HTML_SUPPRESSION", false));
        QUOTES.setSelected(NbPreferences.forModule(MarkdownPanel.class).getBoolean("QUOTES", false));
        SMARTS.setSelected(NbPreferences.forModule(MarkdownPanel.class).getBoolean("SMARTS", false));
        TABLES.setSelected(NbPreferences.forModule(MarkdownPanel.class).getBoolean("TABLES", false));
        WIKILINKS.setSelected(NbPreferences.forModule(MarkdownPanel.class).getBoolean("WIKILINKS", false));
        HTML_TEMPLATE.setText(NbPreferences.forModule(MarkdownPanel.class).get("HTML_TEMPLATE", getDefaultHtmlTemplate()));
    }

    void store() {
        // TODO store modified settings
        // Example:
        // Preferences.userNodeForPackage(MarkdownPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or for org.openide.util with API spec. version >= 7.4:
        // NbPreferences.forModule(MarkdownPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or:
        // SomeSystemOption.getDefault().setSomeStringProperty(someTextField.getText());

        NbPreferences.forModule(MarkdownPanel.class).putBoolean("ABBREVIATIONS", ABBREVIATIONS.isSelected());
        NbPreferences.forModule(MarkdownPanel.class).putBoolean("AUTOLINKS", AUTOLINKS.isSelected());
        NbPreferences.forModule(MarkdownPanel.class).putBoolean("DEFINITION_LISTS", DEFINITION_LISTS.isSelected());
        NbPreferences.forModule(MarkdownPanel.class).putBoolean("FENCED_CODE_BLOCKS", FENCED_CODE_BLOCKS.isSelected());
        NbPreferences.forModule(MarkdownPanel.class).putBoolean("HARDWRAPS", HARDWRAPS.isSelected());
        NbPreferences.forModule(MarkdownPanel.class).putBoolean("HTML_BLOCK_SUPPRESSION", HTML_BLOCK_SUPPRESSION.isSelected());
        NbPreferences.forModule(MarkdownPanel.class).putBoolean("INLINE_HTML_SUPPRESSION", INLINE_HTML_SUPPRESSION.isSelected());
        NbPreferences.forModule(MarkdownPanel.class).putBoolean("QUOTES", QUOTES.isSelected());
        NbPreferences.forModule(MarkdownPanel.class).putBoolean("SMARTS", SMARTS.isSelected());
        NbPreferences.forModule(MarkdownPanel.class).putBoolean("TABLES", TABLES.isSelected());
        NbPreferences.forModule(MarkdownPanel.class).putBoolean("WIKILINKS", WIKILINKS.isSelected());
        NbPreferences.forModule(MarkdownPanel.class).put("HTML_TEMPLATE", HTML_TEMPLATE.getText());
    }
    
    public static String getDefaultHtmlTemplate()
    {
        return "<html>\n"
                + "<head>\n"
                + "<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n"
                + "<title>{%TITLE%}</title>\n"
                + "<style type=\"text/css\">/*...*/</style>\n"
                + "</head>\n"
                + "<body>\n"
                + "{%CONTENT%}\n"
                + "</body\n>"
                + "</html>";
    }

    boolean valid() {
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ABBREVIATIONS;
    private javax.swing.JCheckBox AUTOLINKS;
    private javax.swing.JCheckBox DEFINITION_LISTS;
    private javax.swing.JPanel EXTENSIONS_PANEL;
    private javax.swing.JLabel EXTENSIONS_PANEL_HEADER;
    private javax.swing.JCheckBox FENCED_CODE_BLOCKS;
    private javax.swing.JCheckBox HARDWRAPS;
    private javax.swing.JCheckBox HTML_BLOCK_SUPPRESSION;
    private javax.swing.JPanel HTML_EXPORT_PANEL;
    private javax.swing.JLabel HTML_PANEL_HEADER;
    private javax.swing.JTextArea HTML_TEMPLATE;
    private javax.swing.JCheckBox INLINE_HTML_SUPPRESSION;
    private javax.swing.JCheckBox QUOTES;
    private javax.swing.JCheckBox SMARTS;
    private javax.swing.JCheckBox TABLES;
    private javax.swing.JTabbedPane TABS;
    private javax.swing.JCheckBox WIKILINKS;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
