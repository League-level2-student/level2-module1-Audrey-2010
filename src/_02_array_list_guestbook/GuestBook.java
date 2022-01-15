package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import _01_array_list_visualizer.data.ArrayList;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	// 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

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton view = new JButton();
	JLabel label = new JLabel();
	ArrayList<String> guests = new ArrayList<String>();

	public void setup() {

		guests.add("Bob Banders");
		guests.add("Sandy Summers");
		guests.add("Greg Ganders");
		guests.add("Donny Doners");

		frame.add(panel);
		panel.add(add);
		panel.add(view);
		panel.add(label);

		add.addActionListener(this);
		view.addActionListener(this);

		add.setText("add a name");
		view.setText("view the list");

		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource().equals(add)) {
			String addname = JOptionPane.showInputDialog("insert name below");
			guests.add(addname);
		} 
		else if (arg0.getSource().equals(view)) {

			String names = "";
			for (int i = 0; i < guests.size(); i++) {
				
				names += "Guest #"+i+": ";
				names += guests.get(i);
				names += "\n";
			}
			JOptionPane.showMessageDialog(null, names);
		}
	
	}
}
