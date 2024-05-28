package main;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Ventana");
		frame.setSize(750,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		frame.getContentPane().setBackground( Color.decode("#A700EC")); 
		frame.setLayout(null);
		
        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#FFA33A")); //#62A33E
		frame.add(panel);
		panel.setSize(500, 250);
		
		//Calcular coordenadas para que quede centrado
		int x = (frame.getWidth() - panel.getWidth()) / 2;
        int y = (frame.getHeight() - panel.getHeight()) / 2;
        panel.setBounds(x, y, panel.getWidth(), panel.getHeight());
		
		Componentes(panel);
		
		
		frame.setVisible(true);	
	}
	
	
	private static void Componentes(JPanel panel) {
        //panel.setLayout(null); // Desactivar el layout por defecto
        panel.setLayout(new GridBagLayout()); 
        // Crear y añadir JLabel
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Crear y añadir JLabel para el usuario
        JLabel userLabel = new JLabel("Usuario:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(userLabel, gbc);

        // Crear y añadir JTextField para el usuario
        final JTextField userText = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(userText, gbc);

        // Crear y añadir JLabel para la contraseña
        JLabel passwordLabel = new JLabel("Contraseña:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(passwordLabel, gbc);

        // Crear y añadir JTextField para la contraseña
        final JPasswordField passwordText = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(passwordText, gbc);

        // Crear y añadir JComboBox para el rol
        JLabel roleLabel = new JLabel("Rol:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(roleLabel, gbc);

        String[] roles = { "Administrador", "Usuario", "Invitado" };
        final JComboBox<String> roleComboBox = new JComboBox<>(roles);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(roleComboBox, gbc);

        // Crear y añadir JButton para login
        JButton loginButton = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        loginButton.setBackground(Color.BLUE);
        loginButton.setForeground(Color.WHITE);
        panel.add(loginButton, gbc);

        // Crear y añadir JButton para reset
        JButton resetButton = new JButton("Reset");
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        resetButton.setBackground(Color.RED);
        resetButton.setForeground(Color.WHITE);
        panel.add(resetButton, gbc);

        // Añadir ActionListener al botón de login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = userText.getText();
                String contraseña = new String(passwordText.getPassword());
                String rol = (String) roleComboBox.getSelectedItem();

                if (!usuario.isEmpty() && !contraseña.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Login con éxito\nUsuario: " + usuario + "\nRol: " + rol);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese todos los datos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Añadir ActionListener al botón de reset
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                passwordText.setText("");
                roleComboBox.setSelectedIndex(0);
            }
        });
    }
}
