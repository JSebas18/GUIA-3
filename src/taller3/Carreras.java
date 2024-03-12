package taller3;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.util.Collections;
public class Carreras extends javax.swing.JFrame {
 List<TiempoCarro> tiemposLlegada = new ArrayList<>();

int av1, av2, av3, av4, av5, av6, av7, av8, av9, av10;
int alturaTotal = 600;
int numBotones = 10;
int espacio = alturaTotal / numBotones;
boolean carreraTerminada = false;
int apuesta = 0;
int capital = 100; 
String carroGanador = null;
String carroApostado = "";
boolean carreraTerminada1 = false;
boolean carreraTerminada2 = false;
boolean carreraTerminada3 = false;
boolean carreraTerminada4 = false;
boolean carreraTerminada5 = false;
boolean carreraTerminada6 = false;
boolean carreraTerminada7 = false;
boolean carreraTerminada8 = false;
boolean carreraTerminada9 = false;
boolean carreraTerminada10 = false;
Timer tiempo1 = new Timer(1000, new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                if(!carreraTerminada1) {    
                   int a=(int)(Math.random()*10)+1;
      av1=av1+a;
      
      jButton11.setLocation(av1,espacio*0);          

    detenerCarrera();
         
          }
            }});
Timer tiempo2 = new Timer(1000, new ActionListener(){
               
        public void actionPerformed(ActionEvent e) {
        if(!carreraTerminada2) { 
        int b=(int)(Math.random()*10)+1;
        av2=av2+b; 
      
jButton3.setLocation(av2,espacio*1); 

    detenerCarrera();
        
                }
                }
            });
Timer tiempo3 = new Timer(1000, new ActionListener(){
                
    public void actionPerformed(ActionEvent e) {
    if(!carreraTerminada3) { 
    int c=(int)(Math.random()*10)+1;
    av3=av3+c; 
      
jButton4.setLocation(av3,espacio*2); 

    detenerCarrera();

   }
    }
            });
Timer tiempo4 = new Timer(1000, new ActionListener(){
               
                public void actionPerformed(ActionEvent e) {
                    if(!carreraTerminada4) { 
                   int d=(int)(Math.random()*10)+1;
        av4=av4+d; 
      
jButton5.setLocation(av4,espacio*3); 

    detenerCarrera();

                }
                }
            });
Timer tiempo5 = new Timer(1000, new ActionListener(){
               
                public void actionPerformed(ActionEvent e) {
                    if(!carreraTerminada5) { 
                   int f =(int)(Math.random()*10)+1;
        av5=av5+f; 
      
jButton6.setLocation(av5,espacio*4); 

    detenerCarrera();

               }
                }
            });
Timer tiempo6 = new Timer(1000, new ActionListener(){
               
                public void actionPerformed(ActionEvent e) {
                    if(!carreraTerminada6) { 
                   int g =(int)(Math.random()*10)+1;
        av6=av6+g; 
      
jButton7.setLocation(av6,espacio*5); 

    detenerCarrera();

                }
                }
            });
Timer tiempo7 = new Timer(1000, new ActionListener(){
               
                public void actionPerformed(ActionEvent e) {
                    if(!carreraTerminada7) { 
                   int h =(int)(Math.random()*10)+1;
        av7=av7+h; 
      
jButton8.setLocation(av7,espacio*6); 

    detenerCarrera();

                }
                }
            });
Timer tiempo8 = new Timer(1000, new ActionListener(){
               
                public void actionPerformed(ActionEvent e) {
                    if(!carreraTerminada8) { 
                   int i =(int)(Math.random()*10)+1;
        av8=av8+i; 
      
jButton9.setLocation(av8,espacio*7);

    detenerCarrera();

                }
                }
            });
Timer tiempo9 = new Timer(1000, new ActionListener(){
               
                public void actionPerformed(ActionEvent e) {
                if(!carreraTerminada9) { 
                   int j=(int)(Math.random()*40)+1;
        av9=av9+j; 
      
jButton10.setLocation(av9,espacio*8); 

    detenerCarrera();

                }
                }
            });
Timer tiempo10 = new Timer(1000, new ActionListener(){
               
                public void actionPerformed(ActionEvent e) {
                    if(!carreraTerminada10) {
                   int k=(int)(Math.random()*10)+1;
        av10=av10+k; 
      
jButton12.setLocation(av10,espacio*9);

    detenerCarrera();

                }
                }
            });
    
    public Carreras() {
        
        initComponents();
        
}
 
long tiempoInicial;
void iniciarCarrera() {
    tiempoInicial = System.currentTimeMillis(); 
    
}
 void detenerCarrera(){
   long tiempoActual = System.currentTimeMillis();
     if (!carreraTerminada1 && av1 >= jButton13.getX() + jButton13.getWidth()) {
       tiemposLlegada.add(new TiempoCarro("carro1", tiempoActual));
       carreraTerminada1 = true;
         if (carroGanador == null) {
            carroGanador = "carro1";
         }
        tiempo1.stop();
    }
    if (!carreraTerminada2 && av2 >= jButton13.getX() + jButton13.getWidth()) {
        tiemposLlegada.add(new TiempoCarro("carro2", tiempoActual));
        carreraTerminada2 = true;
        if (carroGanador == null) {
            carroGanador = "carro2";
         }
        tiempo2.stop();
    }
  if (!carreraTerminada3 && av3 >= jButton13.getX() + jButton13.getWidth()) {
        tiemposLlegada.add(new TiempoCarro("carro3", tiempoActual));
      carreraTerminada3 = true;       
            if (carroGanador == null) {
            carroGanador = "carro3";
         }
        tiempo3.stop();
    }
   if (!carreraTerminada4 && av4 >= jButton13.getX() + jButton13.getWidth()) {
        tiemposLlegada.add(new TiempoCarro("carro4", tiempoActual));
       carreraTerminada4 = true;
             if (carroGanador == null) {
            carroGanador = "carro4";
         }
        tiempo4.stop();
    }
    if (!carreraTerminada5 && av5 >= jButton13.getX() + jButton13.getWidth()) {
        tiemposLlegada.add(new TiempoCarro("carro5", tiempoActual));
        carreraTerminada5 = true;
       
             if (carroGanador == null) {
            carroGanador = "carro5";
         }
        tiempo5.stop();
    }
     if (!carreraTerminada6 && av6 >= jButton13.getX() + jButton13.getWidth()) {
        tiemposLlegada.add(new TiempoCarro("carro6", tiempoActual));
         carreraTerminada6 = true;
       

             if (carroGanador == null) {
            carroGanador = "carro6";
         }
        tiempo6.stop();
    }
      if (!carreraTerminada7 && av7 >= jButton13.getX() + jButton13.getWidth()) {
        tiemposLlegada.add(new TiempoCarro("carro7", tiempoActual));
          carreraTerminada7 = true;

             if (carroGanador == null) {
            carroGanador = "carro7";
         }
        tiempo7.stop();
    
    }
      if (!carreraTerminada8 && av8 >= jButton13.getX() + jButton13.getWidth()) {
          tiemposLlegada.add(new TiempoCarro("carro8", tiempoActual));
          carreraTerminada8 = true;
       
             if (carroGanador == null) {
            carroGanador = "carro8";
         }
        tiempo8.stop();
    }
       if (!carreraTerminada9 && av9 >= jButton13.getX() + jButton13.getWidth()) {
        tiemposLlegada.add(new TiempoCarro("carro9", tiempoActual));
           carreraTerminada9 = true;
       
 
             if (carroGanador == null) {
            carroGanador = "carro9";
         }
        tiempo9.stop();
    }
        if (!carreraTerminada10 && av10 >= jButton13.getX() + jButton13.getWidth()) {
        tiemposLlegada.add(new TiempoCarro("carro10", tiempoActual));
            carreraTerminada10 = true;
      
             if (carroGanador == null) {
            carroGanador = "carro10";
         }
        tiempo10.stop();
    }
}
public class TiempoCarro implements Comparable<TiempoCarro> {
    private String nombreCarro;
    private long tiempoLlegada;

    public TiempoCarro(String nombreCarro, long tiempoLlegada) {
        this.nombreCarro = nombreCarro;
        this.tiempoLlegada = tiempoLlegada;
    }

    public String getNombreCarro() {
        return nombreCarro;
    }

    public long getTiempoLlegada() {
        return tiempoLlegada;
    }

    @Override
    public int compareTo(TiempoCarro otroCarro) {
        return Long.compare(this.tiempoLlegada, otroCarro.tiempoLlegada);
    }
}
void mostrarTiemposLlegada() {
    Collections.sort(tiemposLlegada); // Ordena los tiempos de llegada

    jTextArea2.setText("Tiempos de llegada:\n");

    for (TiempoCarro tiempoCarro : tiemposLlegada) {
        long tiempoTranscurrido = tiempoCarro.getTiempoLlegada() - tiempoInicial; // Calcular el tiempo transcurrido desde el inicio de la carrera en milisegundos
        jTextArea2.append(tiempoCarro.getNombreCarro() + ": " + tiempoTranscurrido + " milisegundos\n");
    }
}
private void reiniciarJuego() {
    
    av1 = av2 = av3 = av4 = av5 = av6 = av7 = av8 = av9 = av10 = 0;
    carreraTerminada1 = carreraTerminada2 = carreraTerminada3 = carreraTerminada4 = carreraTerminada5 = false;
    carreraTerminada6 = carreraTerminada7 = carreraTerminada8 = carreraTerminada9 = carreraTerminada10 = false;
    carroGanador = null;
    tiemposLlegada.clear(); 
    iniciarCarrera(); 
}
private void limpiarTablaTiempos() {
    tiemposLlegada.clear(); 
    mostrarTiemposLlegada(); 
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        apostador = new javax.swing.JComboBox<>();
        apostar = new javax.swing.JButton();
        jButton13 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jButton2.setText("START");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Carro2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Carro3");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Carro4");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Carro5");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Carro6");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Carro7");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Carro8");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Carro9");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Carro1");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Carro10");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        apostador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro 1", "Carro 2", "Carro 3", "Carro 4", "Carro 5", "Carro 6", "Carro 7", "Carro 8", "Carro 9", "Carro 10" }));
        apostador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apostadorActionPerformed(evt);
            }
        });

        apostar.setText("apostar");
        apostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apostarActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jButton13Layout = new javax.swing.GroupLayout(jButton13);
        jButton13.setLayout(jButton13Layout);
        jButton13Layout.setHorizontalGroup(
            jButton13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        jButton13Layout.setVerticalGroup(
            jButton13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Balance: 100\n");
        jScrollPane1.setViewportView(jTextArea1);

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });

        jLabel1.setText("cantidad para apostar");

        jLabel2.setText("Carro ganador");

        jButton24.setText("Ver resultados");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setText("Cerrar");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton14.setText("Mostrar tiempos");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("RESTART");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apostador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(apostar)
                                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(97, 97, 97))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton24)
                                    .addComponent(jLabel1))
                                .addGap(75, 75, 75))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton14)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apostador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apostar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton24)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jButton25)
                            .addComponent(jButton15))))
                .addGap(40, 51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
         // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
          // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
iniciarCarrera();
        tiempo1.start();
        tiempo2.start();
        tiempo3.start();
        tiempo4.start();
        tiempo5.start();
        tiempo6.start();
        tiempo7.start();
        tiempo8.start();
        tiempo9.start();
        tiempo10.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:int velocidad = jSlider1.getValue();
        int velocidad=jSlider1.getValue();
        // Ajusta la velocidad de los carros
        tiempo1.setDelay(1000 / velocidad);
        tiempo2.setDelay(1000 / velocidad);
        tiempo3.setDelay(1000 / velocidad);
        tiempo4.setDelay(1000 / velocidad);
        tiempo5.setDelay(1000 / velocidad);
        tiempo6.setDelay(1000 / velocidad);
        tiempo7.setDelay(1000 / velocidad);
        tiempo8.setDelay(1000 / velocidad);
        tiempo9.setDelay(1000 / velocidad);
        tiempo10.setDelay(1000 / velocidad);
    }//GEN-LAST:event_jSlider1StateChanged

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

    }//GEN-LAST:event_jButton11ActionPerformed

    private void apostadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apostadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apostadorActionPerformed

    private void apostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apostarActionPerformed
   
int cantidad_ent = Integer.parseInt(cantidad.getText()); 


       if (apostador.getSelectedItem().equals("Carro 1")) {
            if (cantidad_ent > capital) {
                String mensajeTemporal = "No tienes suficiente capital\n para apostar esa cantidad.";
        jTextArea1.setText(mensajeTemporal);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                jTextArea1.setText("Balance: " + capital);
            }
        });
        timer.setRepeats(false); 
        timer.start();
    } else {
        carroApostado = "carro1";
        apuesta = cantidad_ent;
            }  }else      
       if (apostador.getSelectedItem().equals("Carro 2")) {
            if (cantidad_ent > capital) {
        String mensajeTemporal = "No tienes suficiente capital\n para apostar esa cantidad.";
        jTextArea1.setText(mensajeTemporal);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                jTextArea1.setText("Balance: " + capital);
            }
        });
        timer.setRepeats(false); 
        timer.start();
    } else {
        carroApostado = "carro2";
        apuesta = cantidad_ent;
            }  }else
           if (apostador.getSelectedItem().equals("Carro 3")) {
            if (cantidad_ent > capital) {
        String mensajeTemporal = "No tienes suficiente capital\n para apostar esa cantidad.";
        jTextArea1.setText(mensajeTemporal);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                jTextArea1.setText("Balance: " + capital);
            }
        });
        timer.setRepeats(false); 
        timer.start();
    } else {
        carroApostado = "carro3";
        apuesta = cantidad_ent;
            }  }else
               if (apostador.getSelectedItem().equals("Carro 4")) {
            if (cantidad_ent > capital) {
        String mensajeTemporal = "No tienes suficiente capital\n para apostar esa cantidad.";
        jTextArea1.setText(mensajeTemporal);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                jTextArea1.setText("Balance: " + capital);
            }
        });
        timer.setRepeats(false); 
        timer.start();
    } else {
        carroApostado = "carro4";
        apuesta = cantidad_ent;
            }  }else
                   if (apostador.getSelectedItem().equals("Carro 5")) {
            if (cantidad_ent > capital) {
        String mensajeTemporal = "No tienes suficiente capital\n para apostar esa cantidad.";
        jTextArea1.setText(mensajeTemporal);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                jTextArea1.setText("Balance: " + capital);
            }
        });
        timer.setRepeats(false); 
        timer.start();
    } else {
        carroApostado = "carro5";
        apuesta = cantidad_ent;
            }  }else
                       if (apostador.getSelectedItem().equals("Carro 6")) {
            if (cantidad_ent > capital) {
        String mensajeTemporal = "No tienes suficiente capital\n para apostar esa cantidad.";
        jTextArea1.setText(mensajeTemporal);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                jTextArea1.setText("Balance: " + capital);
            }
        });
        timer.setRepeats(false); 
        timer.start();
    } else {
        carroApostado = "carro6";
        apuesta = cantidad_ent;
            }  }else
                           if (apostador.getSelectedItem().equals("Carro 7")) {
            if (cantidad_ent > capital) {
        String mensajeTemporal = "No tienes suficiente capital\n para apostar esa cantidad.";
        jTextArea1.setText(mensajeTemporal);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                jTextArea1.setText("Balance: " + capital);
            }
        });
        timer.setRepeats(false); 
        timer.start();
    } else {
        carroApostado = "carro7";
        apuesta = cantidad_ent;
            }  }else
                               if (apostador.getSelectedItem().equals("Carro 8")) {
            if (cantidad_ent > capital) {
        String mensajeTemporal = "No tienes suficiente capital\n para apostar esa cantidad.";
        jTextArea1.setText(mensajeTemporal);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                jTextArea1.setText("Balance: " + capital);
            }
        });
        timer.setRepeats(false); 
        timer.start();
    } else {
        carroApostado = "carro8";
        apuesta = cantidad_ent;
            }  }else
                                   if (apostador.getSelectedItem().equals("Carro 9")) {
            if (cantidad_ent > capital) {
        String mensajeTemporal = "No tienes suficiente capital\n para apostar esa cantidad.";
        jTextArea1.setText(mensajeTemporal);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                jTextArea1.setText("Balance: " + capital);
            }
        });
        timer.setRepeats(false); 
        timer.start();
    } else {
        carroApostado = "carro9";
        apuesta = cantidad_ent;
            }  }else
                                       if (apostador.getSelectedItem().equals("Carro 10")) {
            if (cantidad_ent > capital) {
        String mensajeTemporal = "No tienes suficiente capital\n para apostar esa cantidad.";
        jTextArea1.setText(mensajeTemporal);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                jTextArea1.setText("Balance: " + capital);
            }
        });
        timer.setRepeats(false); 
        timer.start();
    } else {
        carroApostado = "carro10";
        apuesta = cantidad_ent;
            }  }
    }//GEN-LAST:event_apostarActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed

        
    if(carroGanador.equals(carroApostado)){
    capital=apuesta+capital;
    String mensajeTemporal = "Enhorabuena. ¡Has ganado!";
        jTextArea1.setText(mensajeTemporal);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                jTextArea1.setText("Balance: " + capital);
            }
        });
        timer.setRepeats(false); 
        timer.start();
}else
    {
capital=capital-apuesta;
String mensajeTemporal = "Rayos. ¡Has perdido!";
        jTextArea1.setText(mensajeTemporal);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                jTextArea1.setText("Balance: " + capital);
            }
        });
        timer.setRepeats(false); 
        timer.start();}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed

  this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
mostrarTiemposLlegada();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
reiniciarJuego();        
limpiarTablaTiempos();
    }//GEN-LAST:event_jButton15ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carreras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> apostador;
    private javax.swing.JButton apostar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JPanel jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

   
        
}
