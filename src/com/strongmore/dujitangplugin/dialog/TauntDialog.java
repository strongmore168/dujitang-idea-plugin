package com.strongmore.dujitangplugin.dialog;

import com.intellij.openapi.ui.DialogWrapper;
import com.strongmore.dujitangplugin.util.HttpUtility;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jetbrains.annotations.Nullable;

public class TauntDialog extends DialogWrapper {

  private JLabel jLabel;

  public TauntDialog() {
    super(true);
    setTitle("每天一碗毒鸡汤");
    init();
  }

  @Nullable
  @Override
  protected JComponent createCenterPanel() {
    JPanel jPanel = new JPanel();
    jLabel = new JLabel();
    jLabel.setText(HttpUtility.getTauntContent());
    jPanel.add(jLabel);
    return jPanel;
  }

  @Override
  protected JComponent createSouthPanel() {
    JPanel jPanel = new JPanel();
    JButton jButton = new JButton("再来一碗");
    jButton.addActionListener((e) -> {
      jLabel.setText(HttpUtility.getTauntContent());
    });
    jPanel.add(jButton);
    return jPanel;
  }
}
