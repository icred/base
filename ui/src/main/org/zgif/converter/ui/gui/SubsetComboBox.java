package org.zgif.converter.ui.gui;

import java.awt.Component;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.event.ListDataListener;

import org.zgif.converter.plugin.IPluginWrapper;
import org.zgif.model.datatype.enumeration.Subset;

/**
 * @author phoudek
 * 
 */
public class SubsetComboBox extends JComboBox<Subset> {
    public SubsetComboBox() {
        for (Subset subset  : Subset.values()) {
            this.addItem(subset);   
        }
        
        this.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if(value instanceof Subset){
                    Subset subset = (Subset) value;
                    if (subset == Subset.NONE) {
                        setText("please choose first");
                    } else {
                        setText(subset.toString());
                    }
                }
                return this;
            }
        } );
    }
}
