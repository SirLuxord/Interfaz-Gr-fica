package main;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        panel.setLayout(null); // Desactivar el layout por defecto

        // Crear y añadir JLabel
        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        // Crear y añadir JTextField
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // Crear y añadir JComboBox
        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        comboBox.setBounds(10, 50, 165, 25);
        panel.add(comboBox);

        // Crear y añadir JButton
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        // Añadir ActionListener al botón
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar mensaje de "Login con éxito"
                JOptionPane.showMessageDialog(null, "Login con éxito");
            }
        });
    }

}

/*
public class VentanaPro {
    public static void main(String[] args) {
        // Crear el marco
        JFrame frame = new JFrame("Ventana Pro");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel con un color de fondo
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);

        // Usar GridBagConstraints para la disposición de componentes
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Crear y añadir JLabel para el usuario
        JLabel userLabel = new JLabel("Usuario:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(userLabel, gbc);

        // Crear y añadir JTextField para el usuario
        JTextField userText = new JTextField(20);
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
        JPasswordField passwordText = new JPasswordField(20);
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
        JComboBox<String> roleComboBox = new JComboBox<>(roles);
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

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
*/