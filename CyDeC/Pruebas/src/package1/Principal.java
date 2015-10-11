package package1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField TFTiempo;
	public static JTextField TFIntensidadMax;
	public static JTextField TFCargaMax;
	public static JTextField TFIntensidadTiempo;
	public static JTextField TFCapacitancia;
	public static JTextField TFResistencia;
	public static JTextField TFVoltaje;
	private JLabel lblValorResistencia;
	private JLabel lblCapacitanciaCondensador;
	private JLabel lblTiempoDeCargaMax;
	private JLabel lblIntensidadMaxCircuito;
	private JLabel lblCargaMaxCondensador_1;
	private JLabel lblIntensidadATiempo;
	public static JTextField TFVoltajeTiempoPrima;
	private JLabel lblVoltajeATiempo;
	private JLabel lblCargaInicial;
	public static JTextField TFCargaInicial;
	public static JTextField TFIntensidadInicial;
	private JLabel lblIntensidadInicial;
	private JLabel lblTiempoDeDescarga;
	public static JTextField TFTiempoDescarga;
	public static JTextField TFCapacitanciaPrima;
	private JLabel lblCapacitanciaCondensador_1;
	private JLabel lblValorResistencia_1;
	public static JTextField TFResistenciaPrima;
	public static JTextField TFVoltajeInicial;
	private JLabel lblVoltajeInicial;
	public static JTextField TFIntensidadTiempoPrima;
	private JLabel lblIntensidadATiempo_1;
	private JLabel lblCargaATiempo;
	public static JTextField TFCargaTiempo;
	public static JTextField TFCargaATiempo;
	private JLabel lblCargaATiempo_1;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JLabel lblVoltios;
	private JLabel lblOhm;
	private JLabel lblUfaradio;
	private JLabel lblSegundos;
	private JLabel lblAmpherios;
	private JLabel lblFaradios;
	private JLabel lblAmperios;
	private JLabel lblCoulomb;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel lblOhm_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setResizable(false);
		setTitle("Carga Y Descarga De Condensadores En Circuito Serie. - Norton Irarr\u00E1zabal - Sebastian Rojas - Proyecto F\u00EDsica 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1037, 420);
		contentPane = new Fondo("Scratch-700x428.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVoltajeDeLa = new JLabel("*Voltaje de la fuente:");
		lblVoltajeDeLa.setForeground(Color.WHITE);
		lblVoltajeDeLa.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblVoltajeDeLa.setBounds(10, 47, 138, 30);
		contentPane.add(lblVoltajeDeLa);
		
		lblValorResistencia = new JLabel("*Valor Resistencia:");
		lblValorResistencia.setForeground(Color.WHITE);
		lblValorResistencia.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblValorResistencia.setBounds(10, 88, 128, 30);
		contentPane.add(lblValorResistencia);
		
		lblCapacitanciaCondensador = new JLabel("*Capacitancia Condensador");
		lblCapacitanciaCondensador.setForeground(Color.WHITE);
		lblCapacitanciaCondensador.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblCapacitanciaCondensador.setBounds(10, 119, 170, 30);
		contentPane.add(lblCapacitanciaCondensador);
		
		lblTiempoDeCargaMax = new JLabel("*Tiempo De Carga:");
		lblTiempoDeCargaMax.setForeground(Color.WHITE);
		lblTiempoDeCargaMax.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblTiempoDeCargaMax.setBounds(10, 155, 170, 30);
		contentPane.add(lblTiempoDeCargaMax);
		
		lblIntensidadMaxCircuito = new JLabel("Intensidad Max. Circuito:");
		lblIntensidadMaxCircuito.setForeground(Color.WHITE);
		lblIntensidadMaxCircuito.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblIntensidadMaxCircuito.setBounds(10, 191, 158, 30);
		contentPane.add(lblIntensidadMaxCircuito);
		
		lblCargaMaxCondensador_1 = new JLabel("Carga Max. Condensador:");
		lblCargaMaxCondensador_1.setForeground(Color.WHITE);
		lblCargaMaxCondensador_1.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblCargaMaxCondensador_1.setBounds(10, 227, 158, 30);
		contentPane.add(lblCargaMaxCondensador_1);
		
		lblIntensidadATiempo = new JLabel("Intensidad A Tiempo:");
		lblIntensidadATiempo.setForeground(Color.WHITE);
		lblIntensidadATiempo.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblIntensidadATiempo.setBounds(10, 263, 158, 30);
		contentPane.add(lblIntensidadATiempo);
		
		lblCargaATiempo = new JLabel("Carga A Tiempo:");
		lblCargaATiempo.setForeground(Color.WHITE);
		lblCargaATiempo.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblCargaATiempo.setBounds(10, 301, 158, 30);
		contentPane.add(lblCargaATiempo);
		
		TFVoltaje = new JTextField();
		TFVoltaje.setColumns(10);
		TFVoltaje.setBounds(178, 51, 102, 25);
		contentPane.add(TFVoltaje);
		
		TFResistencia = new JTextField();
		TFResistencia.setColumns(10);
		TFResistencia.setBounds(178, 88, 102, 25);
		contentPane.add(TFResistencia);
		
		TFCapacitancia = new JTextField();
		TFCapacitancia.setColumns(10);
		TFCapacitancia.setBounds(178, 124, 102, 25);
		contentPane.add(TFCapacitancia);
		
		TFTiempo = new JTextField();
		TFTiempo.setFont(new Font("Arial", Font.PLAIN, 11));
		TFTiempo.setColumns(10);
		TFTiempo.setBounds(178, 160, 102, 25);
		contentPane.add(TFTiempo);
		
		TFIntensidadMax = new JTextField();
		TFIntensidadMax.setEditable(false);
		TFIntensidadMax.setColumns(10);
		TFIntensidadMax.setBounds(178, 196, 102, 25);
		contentPane.add(TFIntensidadMax);
		
		TFCargaMax = new JTextField();
		TFCargaMax.setEditable(false);
		TFCargaMax.setColumns(10);
		TFCargaMax.setBounds(178, 232, 102, 25);
		contentPane.add(TFCargaMax);
		
		TFIntensidadTiempo = new JTextField();
		TFIntensidadTiempo.setEditable(false);
		TFIntensidadTiempo.setColumns(10);
		TFIntensidadTiempo.setBounds(178, 268, 102, 25);
		contentPane.add(TFIntensidadTiempo);
		
		TFCargaTiempo = new JTextField();
		TFCargaTiempo.setEditable(false);
		TFCargaTiempo.setColumns(10);
		TFCargaTiempo.setBounds(178, 306, 102, 25);
		contentPane.add(TFCargaTiempo);
		
		lblVoltajeInicial = new JLabel("*Voltaje Inicial:");
		lblVoltajeInicial.setForeground(Color.WHITE);
		lblVoltajeInicial.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblVoltajeInicial.setBounds(689, 47, 128, 30);
		contentPane.add(lblVoltajeInicial);
		
		lblValorResistencia_1 = new JLabel("*Valor Resistencia:");
		lblValorResistencia_1.setForeground(Color.WHITE);
		lblValorResistencia_1.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblValorResistencia_1.setBounds(689, 88, 128, 30);
		contentPane.add(lblValorResistencia_1);
		
		lblCapacitanciaCondensador_1 = new JLabel("*Capacitancia Condensador");
		lblCapacitanciaCondensador_1.setForeground(Color.WHITE);
		lblCapacitanciaCondensador_1.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblCapacitanciaCondensador_1.setBounds(689, 119, 170, 30);
		contentPane.add(lblCapacitanciaCondensador_1);
		
		lblTiempoDeDescarga = new JLabel("*Tiempo De Descarga:");
		lblTiempoDeDescarga.setForeground(Color.WHITE);
		lblTiempoDeDescarga.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblTiempoDeDescarga.setBounds(689, 155, 138, 30);
		contentPane.add(lblTiempoDeDescarga);
		
		lblIntensidadInicial = new JLabel("Intensidad Inicial:");
		lblIntensidadInicial.setForeground(Color.WHITE);
		lblIntensidadInicial.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblIntensidadInicial.setBounds(689, 191, 128, 30);
		contentPane.add(lblIntensidadInicial);
		
		lblCargaInicial = new JLabel("Carga Inicial:");
		lblCargaInicial.setForeground(Color.WHITE);
		lblCargaInicial.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblCargaInicial.setBounds(689, 227, 128, 30);
		contentPane.add(lblCargaInicial);
		
		lblVoltajeATiempo = new JLabel("Voltaje A Tiempo:");
		lblVoltajeATiempo.setForeground(Color.WHITE);
		lblVoltajeATiempo.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblVoltajeATiempo.setBounds(689, 263, 128, 30);
		contentPane.add(lblVoltajeATiempo);
		
		lblIntensidadATiempo_1 = new JLabel("Intensidad A Tiempo:");
		lblIntensidadATiempo_1.setForeground(Color.WHITE);
		lblIntensidadATiempo_1.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblIntensidadATiempo_1.setBounds(689, 296, 138, 30);
		contentPane.add(lblIntensidadATiempo_1);
		
		lblCargaATiempo_1 = new JLabel("Carga A Tiempo:");
		lblCargaATiempo_1.setForeground(Color.WHITE);
		lblCargaATiempo_1.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblCargaATiempo_1.setBounds(689, 333, 128, 30);
		contentPane.add(lblCargaATiempo_1);
		
		TFVoltajeInicial = new JTextField();
		TFVoltajeInicial.setColumns(10);
		TFVoltajeInicial.setBounds(858, 53, 101, 25);
		contentPane.add(TFVoltajeInicial);
		
		TFResistenciaPrima = new JTextField();
		TFResistenciaPrima.setColumns(10);
		TFResistenciaPrima.setBounds(858, 89, 101, 25);
		contentPane.add(TFResistenciaPrima);
		
		TFCapacitanciaPrima = new JTextField();
		TFCapacitanciaPrima.setColumns(10);
		TFCapacitanciaPrima.setBounds(858, 125, 101, 25);
		contentPane.add(TFCapacitanciaPrima);
		
		TFTiempoDescarga = new JTextField();
		TFTiempoDescarga.setColumns(10);
		TFTiempoDescarga.setBounds(858, 161, 101, 25);
		contentPane.add(TFTiempoDescarga);
		
		TFIntensidadInicial = new JTextField();
		TFIntensidadInicial.setEditable(false);
		TFIntensidadInicial.setColumns(10);
		TFIntensidadInicial.setBounds(858, 197, 101, 25);
		contentPane.add(TFIntensidadInicial);
		
		TFCargaInicial = new JTextField();
		TFCargaInicial.setEditable(false);
		TFCargaInicial.setColumns(10);
		TFCargaInicial.setBounds(858, 233, 101, 25);
		contentPane.add(TFCargaInicial);
		
		TFVoltajeTiempoPrima = new JTextField();
		TFVoltajeTiempoPrima.setEditable(false);
		TFVoltajeTiempoPrima.setColumns(10);
		TFVoltajeTiempoPrima.setBounds(858, 269, 101, 25);
		contentPane.add(TFVoltajeTiempoPrima);
		
		TFIntensidadTiempoPrima = new JTextField();
		TFIntensidadTiempoPrima.setEditable(false);
		TFIntensidadTiempoPrima.setColumns(10);
		TFIntensidadTiempoPrima.setBounds(858, 302, 101, 25);
		contentPane.add(TFIntensidadTiempoPrima);
		
		TFCargaATiempo = new JTextField();
		TFCargaATiempo.setEditable(false);
		TFCargaATiempo.setColumns(10);
		TFCargaATiempo.setBounds(858, 338, 101, 25);
		contentPane.add(TFCargaATiempo);
		
		button = new JButton("Calcular Carga");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				imprimir_Carga();
			}
		});
		button.setFont(new Font("Kristen ITC", Font.ITALIC, 11));
		button.setBounds(428, 35, 171, 30);
		contentPane.add(button);
		
		button_1 = new JButton("Limpiar Datos Carga");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimpiarDatosCarga();
			}
		});
		button_1.setFont(new Font("Kristen ITC", Font.ITALIC, 11));
		button_1.setBounds(428, 98, 171, 30);
		contentPane.add(button_1);
		
		button_2 = new JButton("Calcular Descarga");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imprimir_Descarga();
			}
		});
		button_2.setFont(new Font("Kristen ITC", Font.ITALIC, 11));
		button_2.setBounds(428, 174, 171, 30);
		contentPane.add(button_2);
		
		button_3 = new JButton("Limpiar Datos Descarga");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimpiarDatosDescarga();
			}
		});
		button_3.setFont(new Font("Kristen ITC", Font.ITALIC, 11));
		button_3.setBounds(428, 232, 171, 30);
		contentPane.add(button_3);
		
		button_4 = new JButton("Salir");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button_4.setFont(new Font("Kristen ITC", Font.ITALIC, 11));
		button_4.setBounds(428, 320, 171, 30);
		contentPane.add(button_4);
		
		lblVoltios = new JLabel("Voltios");
		lblVoltios.setForeground(Color.WHITE);
		lblVoltios.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblVoltios.setBounds(286, 51, 67, 30);
		contentPane.add(lblVoltios);
		
		lblOhm = new JLabel("Ohm");
		lblOhm.setForeground(Color.WHITE);
		lblOhm.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblOhm.setBounds(286, 92, 67, 30);
		contentPane.add(lblOhm);
		
		lblUfaradio = new JLabel("uFaradio");
		lblUfaradio.setForeground(Color.WHITE);
		lblUfaradio.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblUfaradio.setBounds(286, 123, 67, 30);
		contentPane.add(lblUfaradio);
		
		lblSegundos = new JLabel("Segundos");
		lblSegundos.setForeground(Color.WHITE);
		lblSegundos.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblSegundos.setBounds(286, 160, 67, 30);
		contentPane.add(lblSegundos);
		
		lblAmpherios = new JLabel("Amperios");
		lblAmpherios.setForeground(Color.WHITE);
		lblAmpherios.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblAmpherios.setBounds(286, 191, 67, 30);
		contentPane.add(lblAmpherios);
		
		lblFaradios = new JLabel("Coulomb");
		lblFaradios.setForeground(Color.WHITE);
		lblFaradios.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblFaradios.setBounds(286, 229, 67, 30);
		contentPane.add(lblFaradios);
		
		lblAmperios = new JLabel("Amperios");
		lblAmperios.setForeground(Color.WHITE);
		lblAmperios.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblAmperios.setBounds(286, 263, 67, 30);
		contentPane.add(lblAmperios);
		
		lblCoulomb = new JLabel("Coulomb");
		lblCoulomb.setForeground(Color.WHITE);
		lblCoulomb.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblCoulomb.setBounds(286, 301, 67, 30);
		contentPane.add(lblCoulomb);
		
		label = new JLabel("Coulomb");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		label.setBounds(963, 334, 68, 30);
		contentPane.add(label);
		
		label_1 = new JLabel("Amperios");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		label_1.setBounds(963, 298, 68, 30);
		contentPane.add(label_1);
		
		label_2 = new JLabel("Coulomb");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		label_2.setBounds(963, 228, 68, 30);
		contentPane.add(label_2);
		
		label_3 = new JLabel("Amperios");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		label_3.setBounds(963, 197, 68, 30);
		contentPane.add(label_3);
		
		label_4 = new JLabel("Segundos");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		label_4.setBounds(963, 156, 68, 30);
		contentPane.add(label_4);
		
		label_5 = new JLabel("uFaradio");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		label_5.setBounds(965, 125, 66, 30);
		contentPane.add(label_5);
		
		label_7 = new JLabel("Voltios");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		label_7.setBounds(965, 53, 66, 30);
		contentPane.add(label_7);
		
		label_8 = new JLabel("Voltios");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		label_8.setBounds(963, 268, 68, 30);
		contentPane.add(label_8);
		
		lblOhm_1 = new JLabel("Ohm");
		lblOhm_1.setForeground(Color.WHITE);
		lblOhm_1.setFont(new Font("Kristen ITC", Font.ITALIC, 12));
		lblOhm_1.setBounds(963, 84, 68, 30);
		contentPane.add(lblOhm_1);
		
		JLabel lblCargarCondensador = new JLabel("Datos Cargar.");
		lblCargarCondensador.setForeground(Color.WHITE);
		lblCargarCondensador.setFont(new Font("Felix Titling", Font.BOLD | Font.ITALIC, 12));
		lblCargarCondensador.setBounds(10, 11, 190, 25);
		contentPane.add(lblCargarCondensador);
		
		JLabel lblDatosDescargar = new JLabel("Datos Descargar.");
		lblDatosDescargar.setForeground(Color.WHITE);
		lblDatosDescargar.setFont(new Font("Felix Titling", Font.BOLD | Font.ITALIC, 12));
		lblDatosDescargar.setBounds(693, 11, 190, 25);
		contentPane.add(lblDatosDescargar);
	}
	public static String darVoltaje(){
		return TFVoltaje.getText();
	}
	public void LimpiarDatosCarga(){
		TFVoltaje.setText("");
		TFResistencia.setText("");
		TFCapacitancia.setText("");
		TFTiempo.setText("");
		TFIntensidadMax.setText("");
		TFCargaMax.setText("");
		TFIntensidadTiempo.setText("");
		TFCargaTiempo.setText("");
	}
	public void LimpiarDatosDescarga(){
		TFVoltajeInicial.setText("");
		TFResistenciaPrima.setText("");
		TFCapacitanciaPrima.setText("");
		TFTiempoDescarga.setText("");
		TFIntensidadInicial.setText("");
		TFCargaInicial.setText("");
		TFVoltajeTiempoPrima.setText("");
		TFIntensidadTiempoPrima.setText("");
		TFCargaATiempo.setText("");
	}
	public static void imprimir_Carga(){	
		String V,R,C,T;
		double Vo,Re,Ca,RC,Ti,euler=2.718281828;
		double IntensidadMax,Capacitancia,Q,I,QActual;
		//C=C*Math.pow(10,-6);
		C=TFCapacitancia.getText();
		Ca=Double.parseDouble(C);
		Capacitancia=Ca*Math.pow(10,-6);
		//A=V/R;
		V=TFVoltaje.getText();
		R=TFResistencia.getText();
		Vo=Double.parseDouble(V);
		Re=Double.parseDouble(R);
		IntensidadMax=Vo/Re; 
		TFIntensidadMax.setText(""+IntensidadMax);
		//Q=C*V;
		Q=Capacitancia*Vo;
		TFCargaMax.setText(""+Q);
		//RC=R*C;
		RC=Capacitancia*Re;
		//T;
		T=TFTiempo.getText();
		Ti=Double.parseDouble(T);
		//A=(V/R)*Math.pow(euler,-T/RC);
		I=(Vo/Re)*Math.pow(euler,-Ti/RC);
		TFIntensidadTiempo.setText(""+I);
		//Q=C*V*(1-Math.pow(euler,-T/RC));
		QActual=Capacitancia*Vo*(1-Math.pow(euler,-Ti/RC));
		TFCargaTiempo.setText(""+QActual);
	}
	public static void imprimir_Descarga(){	
		String V,R,C,T;
		double Vo,Re,Ca,RC,Ti,euler=2.718281828;
		double IntensidadMax,Capacitancia,Q,I,QActual,VoltajeFinal;
		
		V=TFVoltajeInicial.getText();
		Vo=Double.parseDouble(V);
		R=TFResistenciaPrima.getText();
		Re=Double.parseDouble(R);
		C=TFCapacitanciaPrima.getText();
		Ca=Double.parseDouble(C);
		Capacitancia=Ca*Math.pow(10,-6);
		//A=V/R;
		IntensidadMax=Vo/Re; 
		TFIntensidadInicial.setText(""+IntensidadMax);
		//Q=C*V;Qpri=Cpri*Vipri;
		Q=Capacitancia*Vo;
		TFCargaInicial.setText(""+Q);
		//RC=R*C;
		RC=Capacitancia*Re;
		//T;
		T=TFTiempoDescarga.getText();
		Ti=Double.parseDouble(T);
		//Vpri=Vipri*Math.pow(eulerpri,-Tpri/RpriCpri);
		VoltajeFinal=Vo*Math.pow(euler,-Ti/RC);
		TFVoltajeTiempoPrima.setText(""+VoltajeFinal);
		//I=Vo/Re*Math.pow(euler,-Ti/RC);
		I=(VoltajeFinal/Re)*Math.pow(euler,-Ti/RC);
		TFIntensidadTiempoPrima.setText(""+I);
		//Q=C*V*(1-Math.pow(euler,-T/RC));
		QActual=Capacitancia*VoltajeFinal*(1-Math.pow(euler,-Ti/RC));
		TFCargaATiempo.setText(""+QActual);
	}
}
