package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_03.Asesor;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_3_1 extends JFrame implements ActionListener {
	
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
					Propuesto_3_1 frame = new Propuesto_3_1();
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
	public Propuesto_3_1() {
		setTitle("Propuesto_3_1");
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
		Asesor ase1 = new Asesor(73111718, 6875, "Pablito Clavitos", 7084.0);
		listado(ase1);
		Asesor ase2 = new Asesor(88888888,"Lucitano Martinez");
		listado(ase2);
		Asesor ase3 = new Asesor();
		listado(ase3);
		
		imprimir("------------------------------------");
		imprimir("Nombre de la institucion:	" + Asesor.nombreInsti);
		imprimir("cantidad de Asesores:		" + Asesor.getCantidadAsesores());
		imprimir("suma Total de remuneraciones:	" + Asesor.getSumaTotalRemun() + " USD.");
		imprimir("------------------------------------");
		imprimir();
	}
	
	void listado(Asesor x) {
		imprimir("DirMem:		" + x);
		imprimir("DNI:		" + x.getDni());
		imprimir("Codigo:		" + x.getCodigo());
		imprimir("Nombre:		" + x.getNombreAsesor());
		imprimir("Remuneracion:	" + x.getRemuneracionUSD() + " USD.");
		imprimir();
	}
	
	//  M�todos tipo void (sin par�metros)
	void imprimir() {
		imprimir("");
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	
}
