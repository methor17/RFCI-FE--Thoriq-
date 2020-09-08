import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui implements ActionListener {

	private JFrame frame;
	private JTextField inputText;
	private JComboBox<Modification> modList;
	private JButton executeButton;
	private JLabel resultLabel;
	
	private Modification modification;
	
	public void start() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		inputText = new JTextField(10);
		frame.add(inputText);
		
		Modification[] mods = { new Reverse() };
		modList = new JComboBox<Modification>(mods);
		modList.setSelectedIndex(0);
		modList.addActionListener(this);
		frame.add(modList);
		
		executeButton = new JButton("Reverse");
		executeButton.addActionListener(new ActionExecute());
		frame.add(executeButton);
                
                executeButton = new JButton("Undo/Redo");
		executeButton.addActionListener(new ActionExecute());
		frame.add(executeButton);
                
		resultLabel = new JLabel("");
		frame.add(resultLabel);
		
		frame.setLayout(new GridLayout(2, 2));
		frame.pack();
		frame.setVisible(true);
		
		modification = new Reverse();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		modification = (Modification) modList.getSelectedItem();
	}
	
	private class ActionExecute extends AbstractAction {
		private static final long serialVersionUID = 1L;

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String input = inputText.getText();
			resultLabel.setText(modification.modify(input));
		}
	}
}