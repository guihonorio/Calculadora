/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.KeyEvent;
import javax.swing.JButton;
import model.Calculadora;

/**
 *
 * @author Ester
 */
public class jFrameCalculadora extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(jFrameCalculadora.class.getName());
    private Calculadora calculadora = new Calculadora();
    private double primeiroNumero = 0;
    private double segundoNumero = 0;
    private String operador = "";
    private int estado = 0;

    public jFrameCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButtonNumero1 = new javax.swing.JButton();
        jButtonNumero2 = new javax.swing.JButton();
        jButtonNumero3 = new javax.swing.JButton();
        btnSomar = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();
        jButtonNumero4 = new javax.swing.JButton();
        jButtonNumero5 = new javax.swing.JButton();
        jButtonNumero6 = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        jButtonNumero7 = new javax.swing.JButton();
        jButtonNumero8 = new javax.swing.JButton();
        jButtonNumero9 = new javax.swing.JButton();
        jButtonNumero0 = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        display = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();

        jButton4.setText("jButton4");

        jButton12.setText("jButton12");

        jButton13.setText("jButton13");

        jButton19.setText("jButton19");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButtonNumero1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonNumero1.setText("1");
        jButtonNumero1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonNumero1.addActionListener(this::jButtonNumero1ActionPerformed);
        jButtonNumero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNumero1KeyPressed(evt);
            }
        });

        jButtonNumero2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonNumero2.setText("2");
        jButtonNumero2.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonNumero2.addActionListener(this::jButtonNumero1ActionPerformed);
        jButtonNumero2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNumero1KeyPressed(evt);
            }
        });

        jButtonNumero3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonNumero3.setText("3");
        jButtonNumero3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonNumero3.addActionListener(this::jButtonNumero1ActionPerformed);
        jButtonNumero3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNumero1KeyPressed(evt);
            }
        });

        btnSomar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSomar.setText("+");
        btnSomar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSomar.addActionListener(this::jButtonNumero1ActionPerformed);
        btnSomar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNumero1KeyPressed(evt);
            }
        });

        btnSubtrair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSubtrair.setText("-");
        btnSubtrair.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSubtrair.addActionListener(this::jButtonNumero1ActionPerformed);
        btnSubtrair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNumero1KeyPressed(evt);
            }
        });

        jButtonNumero4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonNumero4.setText("4");
        jButtonNumero4.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonNumero4.addActionListener(this::jButtonNumero1ActionPerformed);
        jButtonNumero4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNumero1KeyPressed(evt);
            }
        });

        jButtonNumero5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonNumero5.setText("5");
        jButtonNumero5.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonNumero5.addActionListener(this::jButtonNumero1ActionPerformed);
        jButtonNumero5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNumero1KeyPressed(evt);
            }
        });

        jButtonNumero6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonNumero6.setText("6");
        jButtonNumero6.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonNumero6.addActionListener(this::jButtonNumero1ActionPerformed);
        jButtonNumero6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNumero1KeyPressed(evt);
            }
        });

        btnMultiplicar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMultiplicar.setText("*");
        btnMultiplicar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnMultiplicar.addActionListener(this::jButtonNumero1ActionPerformed);
        btnMultiplicar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNumero1KeyPressed(evt);
            }
        });

        btnDividir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDividir.setText("/");
        btnDividir.setPreferredSize(new java.awt.Dimension(50, 50));
        btnDividir.addActionListener(this::jButtonNumero1ActionPerformed);
        btnDividir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNumero1KeyPressed(evt);
            }
        });

        jButtonNumero7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonNumero7.setText("7");
        jButtonNumero7.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonNumero7.addActionListener(this::jButtonNumero1ActionPerformed);
        jButtonNumero7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNumero1KeyPressed(evt);
            }
        });

        jButtonNumero8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonNumero8.setText("8");
        jButtonNumero8.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonNumero8.addActionListener(this::jButtonNumero1ActionPerformed);
        jButtonNumero8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNumero1KeyPressed(evt);
            }
        });

        jButtonNumero9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonNumero9.setText("9");
        jButtonNumero9.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonNumero9.addActionListener(this::jButtonNumero1ActionPerformed);
        jButtonNumero9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNumero1KeyPressed(evt);
            }
        });

        jButtonNumero0.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonNumero0.setText("0");
        jButtonNumero0.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonNumero0.addActionListener(this::jButtonNumero1ActionPerformed);
        jButtonNumero0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNumero1KeyPressed(evt);
            }
        });

        btnResultado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnResultado.setText("=");
        btnResultado.setPreferredSize(new java.awt.Dimension(50, 50));
        btnResultado.addActionListener(this::jButtonNumero1ActionPerformed);
        btnResultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNumero1KeyPressed(evt);
            }
        });

        display.setEditable(false);
        display.setBackground(new java.awt.Color(255, 255, 255));
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        display.addActionListener(this::displayActionPerformed);

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(this::btnLimparActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonNumero6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButtonNumero7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonNumero8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonNumero9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonNumero0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumero6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNumero7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumero8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumero9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumero0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        maquinaEstadoFinitoCalculadora("Limpar");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void jButtonNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumero1ActionPerformed
        JButton botao = (JButton) evt.getSource();
        String textoBotao = botao.getText();
        this.maquinaEstadoFinitoCalculadora(textoBotao);
    }//GEN-LAST:event_jButtonNumero1ActionPerformed

    public void jButtonNumero1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonNumero1KeyPressed
     if ((evt.getKeyCode() == KeyEvent.VK_0)
            || (evt.getKeyChar() == KeyEvent.VK_1)
            || (evt.getKeyChar() == KeyEvent.VK_2)
            || (evt.getKeyChar() == KeyEvent.VK_3)
            || (evt.getKeyChar() == KeyEvent.VK_4)
            || (evt.getKeyChar() == KeyEvent.VK_5)
            || (evt.getKeyChar() == KeyEvent.VK_6)
            || (evt.getKeyChar() == KeyEvent.VK_7)
            || (evt.getKeyChar() == KeyEvent.VK_8)
            || (evt.getKeyChar() == KeyEvent.VK_9)
            || (evt.getKeyChar() == KeyEvent.VK_ADD)
            || (evt.getKeyChar() == KeyEvent.VK_SUBTRACT)
            || (evt.getKeyChar() == KeyEvent.VK_DIVIDE)
            || (evt.getKeyChar() == KeyEvent.VK_MULTIPLY)
            || (evt.getKeyChar() == KeyEvent.VK_EQUALS)) {
        String tecla = "" + evt.getKeyChar();
      /** Bug 5 (teclado): a tecla "7" estava funcionando como "4", deve enviar o dígito "7" */
        // removido: if (tecla.equals("7")) { tecla = "4"; }
        this.maquinaEstadoFinitoCalculadora(tecla);
    } else if (evt.getKeyCode() == KeyEvent.VK_L) {
    /** Bug 6  a tecla "L" estava indo para a função "+", deve acionar o "Limpar" */
        this.maquinaEstadoFinitoCalculadora("Limpar");
       }
    }//GEN-LAST:event_jButtonNumero1KeyPressed
/**
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        displaysetText("0");
    }//GEN-LAST:event_formWindowOpened
*/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new jFrameCalculadora().setVisible(true));
    }
 private void formWindowOpened(java.awt.event.WindowEvent evt) {
        Calculadora calculadora = new Calculadora(); // mantido como estava (sem efeito)
    }
 public void maquinaEstadoFinitoCalculadora(String entrada) {
        switch (estado) {
            case 0:
                    /** Bug 7: no estado 0 o dígito "0" era exibido como "1", deve mostrar "0" */
                if (entrada.matches("[0-9]")) {
                    display.setText(entrada);
                    estado = 1;
                }
                /** Bug 8: o "Limpar" mudava para o estado 1 e o próximo numero concatenava com o "0", deveria permanecer no estado 0 */
                else if (entrada.equals("Limpar")) {
                    display.setText("0");
                }
                break;

            case 1:
                /** Bug 9: no estado 1 o dígito "5" era ignorado (return), deveria concatenar como qualquer outro numero */
                if (entrada.matches("[0-9]")) {
                    if (display.getText().equals("0")) {
                        display.setText(entrada);
                    } else {
                        display.setText(display.getText() + entrada);
                    }
                }
                  /** Bug 10: no estado 1 o operador "+" funcionava como "-", deve gravar "+" e somar certo */
                else if (entrada.equals("+")
                        || entrada.equals("-")
                        || entrada.equals("*")
                        || entrada.equals("/")) {
                    primeiroNumero = Double.parseDouble(display.getText());
                    operador = entrada;
                    display.setText("");
                    estado = 2;
                }
           	
		/** Bug 11: no estado 1 o "Limpar" mostrava "0.0" (valor do double), deveria mostrar "0" e resetar a operação */
                else if (entrada.equals("Limpar")) {
                    display.setText("0");
                    primeiroNumero = 0;
                    segundoNumero = 0;
                    operador = "";
                    estado = 0;
                }
                break;

            case 2:
    		/** Bug 12: no estado 2 o digito "9" do segundo número era exibido como "8", deve mostrar "9" */
                if (entrada.matches("[0-9]")) {
                    display.setText(entrada);
                    estado = 3;
                }
            /** Bug 13: no estado 2  ao trocar o operador, o "+" era registrado como "*", deve gravar o pressionado */
                else if (entrada.equals("+")
                        || entrada.equals("-")
                        || entrada.equals("*")
                        || entrada.equals("/")) {
                    operador = entrada;
                }
               /** Bug 14: no estado 2 o "Limpar" deixava o display vazio e travava, deve resetar para "0" */
                else if (entrada.equals("Limpar")) {
                    display.setText("0");
                    primeiroNumero = 0;
                    segundoNumero = 0;
                    operador = "";
                    estado = 0;
                }
                break;

            case 3:
                 /** Bug 15: no estado 3 o dígito "3" era concatenado duas vezes ("33"), deve concatenar uma única vez */
                if (entrada.matches("[0-9]")) {
                    display.setText(display.getText() + entrada);
                }
                else if (entrada.equals("=")) {
                    if (display.getText().isEmpty()) {
                        return;
                    }
                    segundoNumero = Double.parseDouble(display.getText());

		 /** Bug 16: no caso "=" a divisão por zero era sobrescrita, deve exibir "Erro" e resetar */
                    if (operador.equals("/") && segundoNumero == 0) {
                        display.setText("Erro");
                        primeiroNumero = 0;
                        segundoNumero = 0;
                        operador = "";
                        estado = 0;
                        return;
                    }

                    switch (operador) {
                        case "+":
                            calculadora.somar(primeiroNumero, segundoNumero);
                            break;
                        case "-":
                            calculadora.substrair(primeiroNumero, segundoNumero);
                            break;
                        case "*":
                            calculadora.multiplicar(primeiroNumero, segundoNumero);
                            break;
                        case "/":
                            calculadora.dividir(primeiroNumero, segundoNumero);
                            break;
                    }
                    /** Bug 17: o resultado era multiplicado por 10, deve exibir o valor real */
                    display.setText(String.valueOf(calculadora.resultado));
                    estado = 4;
                }
                /** Bug 18: no estado 3 o "Limpar" mostrava "0.0" (valor do double), deveria mostrar "0" e resetar a operação */
                else if (entrada.equals("Limpar")) {
                    display.setText("0");
                    primeiroNumero = 0;
                    segundoNumero = 0;
                    operador = "";
                    estado = 0;
                }
                break;

            case 4:
                /** Bug 19: no estado 4 digitar número após o resultado concatenava, deve iniciar cálculo novo */
                if (entrada.matches("[0-9]")) {
                    display.setText(entrada);
                    primeiroNumero = 0;
                    segundoNumero = 0;
                    operador = "";
                    estado = 1;
                }
                /** Bug 20: no estado 4 o operador zerava o primeiro número, deveria encadear a partir do resultado anterior */
                else if (entrada.equals("+")
                        || entrada.equals("-")
                        || entrada.equals("*")
                        || entrada.equals("/")) {
                    primeiroNumero = calculadora.resultado;
                    operador = entrada;
                    display.setText("");
                    estado = 2;
                }
                /** Bug 21: no estado 4 o "=" repetido somava +1 ao resultado, deveria não fazer nada */
                else if (entrada.equals("=")) {
                    // não faz nada — "=" repetido não é operação
                }
               /** Bug 22: no estado 4 o "Limpar" reescrevia o mesmo texto (não limpava), deveria resetar para "0" */
                else if (entrada.equals("Limpar")) {
                    display.setText("0");
                    primeiroNumero = 0;
                    segundoNumero = 0;
                    operador = "";
                    estado = 0;
                }
                break;
        }
    }

    public String getDisplayText() {
        return display.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JTextField display;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonNumero0;
    private javax.swing.JButton jButtonNumero1;
    private javax.swing.JButton jButtonNumero2;
    private javax.swing.JButton jButtonNumero3;
    private javax.swing.JButton jButtonNumero4;
    private javax.swing.JButton jButtonNumero5;
    private javax.swing.JButton jButtonNumero6;
    private javax.swing.JButton jButtonNumero7;
    private javax.swing.JButton jButtonNumero8;
    private javax.swing.JButton jButtonNumero9;
    // End of variables declaration//GEN-END:variables
}
