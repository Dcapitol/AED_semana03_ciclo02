package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import semana_03.Balon;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_3_2 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propuesto_3_2 frame = new Propuesto_3_2();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Propuesto_3_2() {
		setTitle("Propuesto_3_2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 403);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		Balon b01 = new Balon("Puma", 550, 40, 20, 120);
		listado(b01);
		Balon b02 = new Balon("Diadora", 360, 35);
		listado(b02);
		Balon b03 = new Balon();
		listado(b03);
		
		imprimir("------------------------------------");
		imprimir("Valor PI:		" + Balon.pi);
		imprimir("factor de descuento:	" + Balon.descuento);
		imprimir("Cantidad de balones:	" + Balon.getCantidadBalones());
		imprimir("Importe a pagar total:	" + Balon.getTotalImportesPagar());
		imprimir("------------------------------------");
		imprimir();
	}
	
	void listado(Balon x) {
		imprimir("DirMem:			" + x);
		imprimir("Marca:			" + x.getMarca());
		imprimir("Peso:			" + x.getPeso() + " gr.");
		imprimir("Presion:		" + x.getPresion() + " PSI.");
		imprimir("Diametro:		" + x.getDiametro() + " cm.");
		imprimir("Precio:			" + x.getPrecio() + " Soles.");
		imprimir("Descuento:		" + x.descuento() + " Soles.");
		imprimir("Importe a pagar:	" + x.ImportePagar() + " Soles.");
		imprimir();
	}

	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	
}