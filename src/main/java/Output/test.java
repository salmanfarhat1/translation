package Output;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import org.javabip.annotations.Port;
import org.javabip.api.BIPActor;
import org.javabip.api.BIPEngine;
import org.javabip.api.BIPGlue;
import org.javabip.api.PortType;
import org.javabip.engine.factory.EngineFactory;

import akka.actor.ActorSystem;

public class test {
	private static BIPActor gps_1_actor;
	private static BIPActor calls_1_actor;
	private static BIPActor mp3_1_actor;
	private static BIPActor camera_1_actor;
	private static BIPActor screen_1_actor;
	private static BIPActor main_controller_1_actor;
	
	private static ActorSystem system;
	private static EngineFactory engineFactory;
	static BIPGlue glue;
	static BIPEngine engine;
	
	private static GPS_spec gps_1;
	private static Calls_spec calls_1; 
	private static MP3_spec mp3_1;
	private static Camera_spec camera_1;
	private static Screen_spec screen_1; 
	private static Main_Controller_spec main_controller_1; 
	
	 
	private static TextField tf;  
	
	public static void frame1() { 
		
		// 2 buttons reset and start for the
			Frame f=new Frame();  
			Button button_select_calls=new Button("Select Calls");  
	 		Button button_unselect_calls=new Button("Unselect Calls ");  
			Button button_select_GPS=new Button("Select GPS");  
			Button button_unselect_GPS=new Button("Unselect GPS ");  
			
			Button button_select_camera=new Button("Select camera");  
			Button button_unselect_camera=new Button("Unselect camera "); 
			
			Button button_select_mp3=new Button("Select mp3");  
			Button button_unselect_mp3=new Button("Unselect mp3 "); 
			
			Button button_select_h_r=new Button("Select H_R");  
			Button button_unselect_h_r=new Button("Unselect H_R "); 
			
			Button button_select_basic=new Button("Select basic");  
			Button button_unselect_basic=new Button("Unselect basic "); 
			
			Button button_select_colour=new Button("Select colour");  
			Button button_unselect_colour=new Button("Unselect colour "); 
//			 BtnCountListener listener = new BtnCountListener();
//			 b1.addActionListener(listener);
//			
			button_select_GPS.setBounds(180, 50, 130, 30);
			button_select_calls.setBounds(20,50,130,30); 
			button_select_camera.setBounds(500, 50, 130, 30);
			button_select_mp3.setBounds(340, 50, 130, 30);
			button_select_h_r.setBounds(660, 50, 130, 30); // 500 660 820 980 1140 1300
			button_select_basic.setBounds(820, 50, 130, 30); // 500 660 820 980 1140 1300
			button_select_colour.setBounds(980, 50, 130, 30); // 500 660 820 980 1140 1300
			
			button_unselect_GPS.setBounds(180,100,130,30); 
			button_unselect_calls.setBounds(20,100,130,30); 
			button_unselect_camera.setBounds(500,100,130,30);
			button_unselect_mp3.setBounds(340, 100, 130, 30);
			button_unselect_h_r.setBounds(660,100,130,30);
			button_unselect_basic.setBounds(820,100,130,30);
			button_unselect_colour.setBounds(980,100,130,30);
			
			tf = new TextField();  
			tf.setBounds(400,150,270,40);  
			
			
			button_select_calls.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("********************************** ********************************** ********************************** ");
					System.out.println("********************************** Selecting Calls ********************************** ");
					System.out.println("********************************** ********************************** ********************************** ");
					tf.setText("Selecting Calls.... result in terminal");
			        main_controller_1_actor.inform(Main_Controller_ports.Main_Controller_p_Spon_init_to_SCalls);
				}
			});		
			button_unselect_calls.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("********************************** ********************************** ********************************** ");
					System.out.println("********************************** UnSelecting Calls ********************************** ");
					System.out.println("********************************** ********************************** ********************************** ");
					tf.setText("Unselecting Calls ... result in terminal");
			        main_controller_1_actor.inform(Main_Controller_ports.Main_Controller_p_Spon_init_to_RCalls);
				}
			});
			
			
			button_select_GPS.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("********************************** ********************************** ********************************** ");
					System.out.println("********************************** Selecting GPS ********************************** ");
					System.out.println("********************************** ********************************** ********************************** ");
					tf.setText("Selecting GPS.... result in terminal");
			        main_controller_1_actor.inform(Main_Controller_ports.Main_Controller_p_Spon_init_to_SGPS);
				}
			});		
			button_unselect_GPS.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("********************************** ********************************** ********************************** ");
					System.out.println("********************************** UnSelecting GPS ********************************** ");
					System.out.println("********************************** ********************************** ********************************** ");
					tf.setText("Unselecting GPS ... result in terminal");
			        main_controller_1_actor.inform(Main_Controller_ports.Main_Controller_p_Spon_init_to_RGPS);
				}
			});
			
			button_select_mp3.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("********************************** ********************************** ********************************** ");
					System.out.println("********************************** Selecting MP3 ********************************** ");
					System.out.println("********************************** ********************************** ********************************** ");
					tf.setText("Selecting MP3.... result in terminal");
			        main_controller_1_actor.inform(Main_Controller_ports.Main_Controller_p_Spon_init_to_SMP3);
				}
			});		
			button_unselect_mp3.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("********************************** ********************************** ********************************** ");
					System.out.println("********************************** UnSelecting MP3 ********************************** ");
					System.out.println("********************************** ********************************** ********************************** ");
					tf.setText("Unselecting MP3 ... result in terminal");
			        main_controller_1_actor.inform(Main_Controller_ports.Main_Controller_p_Spon_init_to_RMP3);
				}
			});
			
			
			button_select_camera.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("********************************** ********************************** ********************************** ");
					System.out.println("********************************** Selecting Camera ********************************** ");
					System.out.println("********************************** ********************************** ********************************** ");
					tf.setText("Selecting Camera.... result in terminal");
			        main_controller_1_actor.inform(Main_Controller_ports.Main_Controller_p_Spon_init_to_SCamera);
				}
			});		
			button_unselect_camera.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("********************************** ********************************** ********************************** ");
					System.out.println("********************************** UnSelecting Camera ********************************** ");
					System.out.println("********************************** ********************************** ********************************** ");
					tf.setText("Unselecting Camera ... result in terminal");
			        main_controller_1_actor.inform(Main_Controller_ports.Main_Controller_p_Spon_init_to_RCamera);
				}
			});
			
			
			
			button_select_h_r.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("********************************** ********************************** ********************************** ");
					System.out.println("********************************** Selecting High_R ********************************** ");
					System.out.println("********************************** ********************************** ********************************** ");
					tf.setText("Selecting high_R.... result in terminal");
			        main_controller_1_actor.inform(Main_Controller_ports.Main_Controller_p_Spon_init_to_SHigh_Resolution);
				}
			});		
			button_unselect_h_r.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("********************************** ********************************** ********************************** ");
					System.out.println("********************************** UnSelecting High_R ********************************** ");
					System.out.println("********************************** ********************************** ********************************** ");
					tf.setText("Unselecting high_R ... result in terminal");
			        main_controller_1_actor.inform(Main_Controller_ports.Main_Controller_p_Spon_init_to_RHigh_Resolution);
				}
			});
			
			
			button_select_basic.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("********************************** ********************************** ********************************** ");
					System.out.println("********************************** Selecting basic ********************************** ");
					System.out.println("********************************** ********************************** ********************************** ");
					tf.setText("Selecting basic .... result in terminal");
			        main_controller_1_actor.inform(Main_Controller_ports.Main_Controller_p_Spon_init_to_SBasic);
				}
			});		
			button_unselect_basic.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("********************************** ********************************** ********************************** ");
					System.out.println("********************************** UnSelecting basic ********************************** ");
					System.out.println("********************************** ********************************** ********************************** ");
					tf.setText("Unselecting basic ... result in terminal");
			        main_controller_1_actor.inform(Main_Controller_ports.Main_Controller_p_Spon_init_to_RBasic);
				}
			});
			
			
			button_select_colour.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("********************************** ********************************** ********************************** ");
					System.out.println("********************************** Selecting colour ********************************** ");
					System.out.println("********************************** ********************************** ********************************** ");
					tf.setText("Selecting colour .... result in terminal");
			        main_controller_1_actor.inform(Main_Controller_ports.Main_Controller_p_Spon_init_to_SColour);
				}
			});		
			button_unselect_colour.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("********************************** ********************************** ********************************** ");
					System.out.println("********************************** UnSelecting colour ********************************** ");
					System.out.println("********************************** ********************************** ********************************** ");
					tf.setText("Unselecting colour ... result in terminal");
			        main_controller_1_actor.inform(Main_Controller_ports.Main_Controller_p_Spon_init_to_RColour);
				}
			});
			
			
//			@Port(name = "SponCamera" , type = PortType.spontaneous ),
//			@Port(name = "SponMP3" , type = PortType.spontaneous ),
//			@Port(name = "SponHt" , type = PortType.spontaneous ),
//			@Port(name = "SponBasic" , type = PortType.spontaneous ),
//			@Port(name = "SponColour" , type = PortType.spontaneous ),
			
			
//			@Port(name = "RSponCamera" , type = PortType.spontaneous ),
//			@Port(name = "RSponMP3" , type = PortType.spontaneous ),
//			@Port(name = "RSponHt" , type = PortType.spontaneous ),
//			@Port(name = "RSponBasic" , type = PortType.spontaneous ),
//			@Port(name = "RSponColour" , type = PortType.spontaneous ),
			f.add(button_select_calls);
			f.add(button_unselect_calls);
			
			f.add(button_select_GPS);  
			f.add(button_unselect_GPS); 
			
			f.add(button_select_colour);
			f.add(button_unselect_colour);

			f.add(button_select_mp3);
			f.add(button_unselect_mp3);
			
			f.add(button_select_camera);
			f.add(button_unselect_camera);
			
			f.add(button_select_h_r);
			f.add(button_unselect_h_r);
			
			
			f.add(button_select_basic);
			f.add(button_unselect_basic);
			
			f.add(button_select_colour);
			f.add(button_unselect_colour);
			f.add(tf);
			
			f.setSize(1150,600);  
			f.setLayout(null);  
			f.setVisible(true); 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Example Safe Dynamic reconfiguration  ***************");
		setUpBIP();
		
	}
	public static void setUpBIP() {
		system = ActorSystem.create("MySystem");
        engineFactory = new EngineFactory(system);
        
        glue = new Project_Glue().getBipGlue();
        
        engine = engineFactory.create("Engine", glue); // attached the glue to the engine
        
        gps_1 = new GPS_spec();
        calls_1 = new Calls_spec();
        mp3_1 = new MP3_spec();
        camera_1 = new Camera_spec();
        screen_1 = new Screen_spec();
        main_controller_1 = new Main_Controller_spec();
        
        
        gps_1_actor = engine.register(gps_1, "GPS_component", true); 
        calls_1_actor = engine.register(calls_1, "Calls_component", true); 
        mp3_1_actor = engine.register(mp3_1, "mp3_component", true); 
        camera_1_actor = engine.register(camera_1, "camera_component", true);  
        screen_1_actor = engine.register(screen_1, "Screen_component", true); 
        main_controller_1_actor = engine.register(main_controller_1, "Main_Controller_component", true); 
        int n= 1, option =0; 

		engine.start();
		engine.execute();
		frame1();
		Scanner sc = new Scanner(System.in);
		
		main_controller_1_actor.inform(Main_Controller_ports.Main_Controller_p_Spon_init_to_SCalls);
		
		while(n == 1) {
			System.out.println("Use the user interface");	
			option = sc.nextInt();
		}
		
		try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		engine.stop();
		engineFactory.destroy(engine);
		
		System.out.println("The engine is stopped, satisfied?");
		
	}

}
