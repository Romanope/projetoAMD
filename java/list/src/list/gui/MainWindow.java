package list.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import list.controllers.ControladorLista;

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel panel1;
	
	private JPanel panel2;
	
	private JComboBox<String> tiposDado;

	private JComboBox<String> comboTpExec;
	
	private JPanel mainPanel;
	
	private JLabel tipoDados;
	
	private JLabel lblQtdElementos;
	
	private JTextField txtQtdElementos;

	private JLabel lblTipoImplementacao;
	
	private JButton btnPopularLista;
	
	private static MainWindow instance;
	
	private JLabel qtdColetas;
	
	private JTextField txtQtdColetas; 
	
	public MainWindow() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Análise de Desempenho");
		this.setSize(1000, 800);
		
		centerWindow(this);
		
		mainPanel = new JPanel(null);
		
		panel1 = new JPanel(null);
		panel1.setBounds(10, 190, 460, 550);
		panel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Implementação"));
		mainPanel.add(panel1);
		
		panel2 = new JPanel(null);
		panel2.setBounds(500, 190, 460, 550);
		panel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nativo"));
		mainPanel.add(panel2);
		
		this.add(mainPanel);
		initComponentsCommoms();
	}
	
	private void initComponentsCommoms () {
		
		tipoDados = Utils.createJLabel(100, 24, 10, 20, "Tipo dado: ");
		mainPanel.add(tipoDados);
		
		tiposDado = new JComboBox<String>();
		tiposDado.addItem("Double");
		tiposDado.addItem("String");
		tiposDado.setBounds(100, 20, 100, 24);
		mainPanel.add(tiposDado);
		
		lblQtdElementos = Utils.createJLabel(100, 24, 10, 50, "N. Elementos: ");
		mainPanel.add(lblQtdElementos);
		
		txtQtdElementos = Utils.createTxtField(100, 24, 100, 50);
		mainPanel.add(txtQtdElementos);
		
		qtdColetas = Utils.createJLabel(190, 24, 10, 80, "Qtd. Coletas:");
		mainPanel.add(qtdColetas);

		lblTipoImplementacao = Utils.createJLabel(190, 24, 10, 112, "Tipo exec.");
		mainPanel.add(lblTipoImplementacao);
		
		txtQtdColetas = Utils.createTxtField(100, 24, 100, 80);
		mainPanel.add(txtQtdColetas);
		
		btnPopularLista = Utils.createJButton(190, 24, 10, 150, "Iniciar");
		addEvent(btnPopularLista);
		mainPanel.add(btnPopularLista);
		
		comboTpExec = new JComboBox<String>();
		comboTpExec.addItem("Implementada");
		comboTpExec.addItem("Nativa");
		comboTpExec.setBounds(100, 112, 100, 24);
		mainPanel.add(comboTpExec);
	}
	
	private void addEvent (JButton btnPopularLista) {
		btnPopularLista.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String tipoExec = (String) comboTpExec.getSelectedItem();
				String numeroElementos = txtQtdElementos.getText().trim();
				
				if (numeroElementos == null || numeroElementos.length() == 0) {
					JOptionPane.showMessageDialog(null, "Campo N. Elementos não pode ser vazio");
					return;
				}
				
				int quantidadeExecucoes = 1;
				try {
					quantidadeExecucoes = Integer.valueOf(txtQtdColetas.getText().trim());
				} catch (Exception e1) {}
				
				try {
					ControladorLista.start(Integer.valueOf(numeroElementos), quantidadeExecucoes, isTipoImplementada(tipoExec));
				} catch (NumberFormatException | IOException e1) {
					JOptionPane.showMessageDialog(null,  e1.getMessage());
				}
			}
		});
	}
	
	private boolean isTipoImplementada (String tipo) {
		return tipo.equalsIgnoreCase("Implementada");
	}
	
	public static void centerWindow(JFrame frame) {
	    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	    frame.setLocation(x, y);
	}
	
	public static void main(String[] args) {
		instance = new MainWindow();
		instance.setVisible(Boolean.TRUE);
	}
}
