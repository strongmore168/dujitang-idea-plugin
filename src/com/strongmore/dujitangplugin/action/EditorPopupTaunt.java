package com.strongmore.dujitangplugin.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.strongmore.dujitangplugin.dialog.TauntDialog;

public class EditorPopupTaunt extends AnAction {

  @Override
  public void actionPerformed(AnActionEvent e) {
    new TauntDialog().show();
  }
}
