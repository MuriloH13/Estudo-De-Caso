package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FramePrincipal {
	

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal window = new FramePrincipal();
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
		frame.setBounds(500, 200, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtSequencia = new JTextArea();
		txtSequencia.setBounds(10, 11, 710, 113);
		frame.getContentPane().add(txtSequencia);
		
		JButton btConverter = new JButton("Transcrição");
		
		btConverter.setBounds(400, 135, 120, 23);
		frame.getContentPane().add(btConverter);
		
		JTextArea txtResultado = new JTextArea();
		txtResultado.setBounds(10, 170, 710, 276);
		frame.getContentPane().add(txtResultado);
		
		JButton btRand = new JButton("Randomizar");
		
		btRand.setBounds(10, 135, 110, 23);
		frame.getContentPane().add(btRand);	
		btRand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seq = txtSequencia.getText();
				seq = seq.toUpperCase();
				
				randomcodon conv = new randomcodon();
				String resultado=conv.generatedcodon(seq);
				txtResultado.setText(resultado);
			}
		});
		
		JButton btnFechar = new JButton("Fechar");
		
		btnFechar.setBounds(600, 135, 120, 23);
		frame.getContentPane().add(btnFechar);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
			
	
		JButton btnConverterLetras = new JButton("Tradução");
		
		btnConverterLetras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seq = txtSequencia.getText();
				seq = seq.toUpperCase();
				
				Converter conv = new Converter();
				String resultado=conv.converter3(seq);
				txtResultado.setText(resultado);
			}
		});
		btnConverterLetras.setBounds(200, 135, 120, 23);
		frame.getContentPane().add(btnConverterLetras);
		
		btConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seq = txtSequencia.getText();
				seq = seq.toUpperCase();
				
				Converter conv = new Converter();
				String resultado=conv.converter(seq);
				txtResultado.setText(resultado);
			}
		});
		
				
			}
	}
	
	
