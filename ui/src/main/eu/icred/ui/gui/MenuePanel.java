package eu.icred.ui.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author phoudek
 * 
 */
public class MenuePanel extends JPanel {
    private static final long serialVersionUID = -2009449360105581730L;
    private SubsetComboBox    subsetBox;
private JButton convertButton = new JButton("convert");
    
    public MenuePanel() {
        subsetBox = new SubsetComboBox();
        
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.add(new JLabel("Subset:"));
        this.add(subsetBox);
        this.add(convertButton);
    }
    
    public void addConvertPressedListener(ActionListener listener) {
        convertButton.addActionListener(listener);
    }

    public void addSubsetChangedListener(ItemListener listener) {
        subsetBox.addItemListener(listener);
    }
}
