import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	
	private JFrame quadro;
	private JPanel painel;
	private JButton botao;
	private JLabel label;
	int contador = 0;
	
	public GUI() {
		
		/*Constrói um novo frame que inicialmente é invisível*/
		quadro = new JFrame();
		/*Constrói um novo painel*/
		painel = new JPanel();
		/*Constroi um novo botão*/
		botao = new JButton("Clique aqui");
		
		label = new JLabel("Números de clique: 0");		
		
		painel.setBorder(BorderFactory.createEmptyBorder(50, 50, 20, 50));
		painel.setLayout(new GridLayout(0, 1));
		painel.add(botao);
		painel.add(label);
		

		quadro.add(painel, BorderLayout.CENTER);
		quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quadro.setTitle("Esse é o teste para fazer um GUI! :)");
		quadro.pack();
		quadro.setVisible(true);
		
		botao.addActionListener(this);
		
		
	}

	public static void main(String[] args) {
		
		new GUI();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		contador++;
		label.setText("Números de clique: " + contador);
		
	}

}
