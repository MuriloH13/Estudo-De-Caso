package visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import controle.ConverterDAO;
import controle.RandomCodon;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class FramePrincipal {

	private JFrame frame;
	private JTextField txtCodon;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal window = new FramePrincipal();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FramePrincipal() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Programa para transcrição e tradução de códons");
		frame.setBounds(500, 200, 750, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);

		JTextArea txtSequencia = new JTextArea(10, 10);
		txtSequencia.setLineWrap(true);
		txtSequencia.setWrapStyleWord(true);
		txtSequencia.setBounds(65, 56, 600, 158);
		frame.getContentPane().add(txtSequencia);


		JTextArea txtResultado = new JTextArea(20, 10);
		txtResultado.setLineWrap(true);
		txtResultado.setWrapStyleWord(true);
		txtResultado.setBounds(10, 294, 710, 246);
		frame.getContentPane().add(txtResultado);
		
		JButton btConverter = new JButton("Transcrição");

		btConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seq = txtCodon.getText();
				seq = seq.toUpperCase();

				ConverterDAO conv = ConverterDAO.getInstance();
				String resultado = conv.converter(seq);
				txtResultado.setText(resultado);
			}
		});
		
		btConverter.setBounds(470, 225, 120, 23);
		frame.getContentPane().add(btConverter);
		
		JButton btRand = new JButton("Randomizar");
		btRand.setBounds(10, 225, 110, 23);
		frame.getContentPane().add(btRand);
		btRand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seq = txtSequencia.getText();
				seq = seq.toUpperCase();

				RandomCodon conv = new RandomCodon();
				String resultado = conv.generatedcodon(seq);
				txtResultado.setText(resultado);
			}
		});

		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(600, 225, 120, 23);
		frame.getContentPane().add(btnFechar);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		JButton btnConverterLetras = new JButton("Tradução");
		btnConverterLetras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seq = txtCodon.getText();
				seq = seq.toUpperCase();

				ConverterDAO conv = ConverterDAO.getInstance();
				String resultado = conv.converter3(seq);
				txtResultado.setText(resultado);
				
			}
		});
		btnConverterLetras.setBounds(132, 225, 120, 23);
		frame.getContentPane().add(btnConverterLetras);

		JButton btnLimpar = new JButton("Limpar Sequência");
		btnLimpar.setBounds(10, 256, 160, 23);
		frame.getContentPane().add(btnLimpar);
		btnLimpar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				txtSequencia.setText(null);
				txtResultado.setText(null);
			}
		});
		

		txtCodon = new JTextField();
		txtCodon.setBounds(63, 25, 86, 20);
		frame.getContentPane().add(txtCodon);
		txtCodon.setColumns(10);

		JLabel lblCodon = new JLabel("Codon:");
		lblCodon.setBounds(10, 28, 46, 14);
		frame.getContentPane().add(lblCodon);

		
		JLabel lblAlterar = new JLabel("Alterar:");
		lblAlterar.setBounds(10, 28, 46, 70);
		frame.getContentPane().add(lblAlterar);

		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RandomCodon rand = RandomCodon.getInstance();
				String codon = txtCodon.getText();
				String altera = txtSequencia.getText();
				rand.alterar(codon);
				rand.inserir(altera);
				
				
			}
			
		});
		
		btnNewButton_1.setBounds(262, 24, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Excluir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RandomCodon rand = RandomCodon.getInstance();
				String codon = txtCodon.getText();
				rand.excluir(codon);
			}
		});
		btnNewButton_2.setBounds(361, 24, 89, 23);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Listar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RandomCodon rand = RandomCodon.getInstance();
				ArrayList<String> codons = rand.mostrar();
				txtResultado.setText(codons.toString());
				
			}
		});
		btnNewButton_3.setBounds(460, 24, 89, 23);
		frame.getContentPane().add(btnNewButton_3);

	}
}
