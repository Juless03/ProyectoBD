/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import ConexionSQL.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Dares
 */
public class ModificarPersona extends javax.swing.JDialog {
    
    private Conexion modificarDatos;
    
    private ImageIcon fotoSelect;
    private Image mImagen;
    /**
     * Creates new form ModificarDatos
     */
    public ModificarPersona(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        titulo1.setVisible(false);
        botonTexto1.setVisible(false);
        botonTexto3.setVisible(false);
        botonModificar.setEnabled(false);
        comboBoxGeneral.setVisible(false);
        botonFotoSeleccionada.setVisible(false);
        botonSeleccionarFoto.setVisible(false);
        comboBoxNombres.setVisible(false);
        tituloTipoTelefono.setVisible(false);
        comBoxTipoNimero.setVisible(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
      
    }

    public ModificarPersona(AdminSetup aThis, boolean modal, Conexion setupAdmin) throws SQLException {
        super(aThis, modal);
        initComponents();
        modificarDatos = setupAdmin;
        titulo1.setVisible(false);
        botonTexto1.setVisible(false);
        botonTexto3.setVisible(false);
        botonModificar.setEnabled(false);
        comboBoxGeneral.setVisible(false);
        botonFotoSeleccionada.setVisible(false);
        botonSeleccionarFoto.setVisible(false);
        modificarDatos.getPerson(botonPersonas);
        comboBoxNombres.setVisible(false);
        tituloTipoTelefono.setVisible(false);
        comBoxTipoNimero.setVisible(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonPersonas = new javax.swing.JComboBox<>();
        botonOpcionModificar = new javax.swing.JComboBox<>();
        botonModificar = new javax.swing.JButton();
        botonSeleccionar = new javax.swing.JButton();
        titulo1 = new javax.swing.JLabel();
        botonTexto1 = new javax.swing.JTextField();
        botonTexto3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboBoxGeneral = new javax.swing.JComboBox<>();
        botonSeleccionarFoto = new javax.swing.JButton();
        botonFotoSeleccionada = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboBoxNombres = new javax.swing.JComboBox<>();
        tituloTipoTelefono = new javax.swing.JLabel();
        comBoxTipoNimero = new javax.swing.JComboBox<>();
        botonDatos = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel1.setText("Seleccione la persona a  modificar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 230, 30));

        botonPersonas.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        getContentPane().add(botonPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 302, 40));

        botonOpcionModificar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        botonOpcionModificar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Genero", "Distrito", "Fecha de nacimiento", "Foto", "Teléfono", "Email" }));
        getContentPane().add(botonOpcionModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 160, 60));

        botonModificar.setBackground(new java.awt.Color(255, 193, 5));
        botonModificar.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 133, 60));

        botonSeleccionar.setBackground(new java.awt.Color(255, 193, 5));
        botonSeleccionar.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonSeleccionar.setText("Seleccionar");
        botonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(botonSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 120, 60));

        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 550, 30));

        botonTexto1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        getContentPane().add(botonTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 218, 50));

        botonTexto3.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        getContentPane().add(botonTexto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 218, 50));

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel2.setText("Seleccione la categoria a modificar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 230, 40));

        comboBoxGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxGeneralActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 210, 60));

        botonSeleccionarFoto.setText("Seleccionar Foto");
        botonSeleccionarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarFotoActionPerformed(evt);
            }
        });
        getContentPane().add(botonSeleccionarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 130, 70));

        botonFotoSeleccionada.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(botonFotoSeleccionada, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 190, 180));

        botonRegresar.setBackground(new java.awt.Color(255, 193, 5));
        botonRegresar.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, 110, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        jLabel3.setText("Modificar Persona");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        comboBoxNombres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primer Nombre", "Segundo Nombre", "Primer Apellido", "Segundo Apellido" }));
        getContentPane().add(comboBoxNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 140, 70));

        tituloTipoTelefono.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        tituloTipoTelefono.setText("Tipo");
        getContentPane().add(tituloTipoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 50, 20));

        comBoxTipoNimero.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        comBoxTipoNimero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Celular", "Trabajo" }));
        getContentPane().add(comBoxTipoNimero, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 80, 50));

        botonDatos.setBackground(new java.awt.Color(255, 193, 5));
        botonDatos.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonDatos.setText("Ver Datos");
        botonDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDatosActionPerformed(evt);
            }
        });
        getContentPane().add(botonDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 700, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        String PersonaElegida;
        PersonaElegida = (String) botonPersonas.getSelectedItem();
        String[] nombrePartes;
        nombrePartes = PersonaElegida.split(" ");
        String primerNombre;
        String segundoNombre;
        String primerApellido;
        String segundoApellido;
        
        primerNombre =  nombrePartes[0]; 
        segundoNombre = nombrePartes[1];
        primerApellido = nombrePartes[2];
        segundoApellido = nombrePartes[3];
        int idPersona = 0;
        boolean validandoFecha = false;
        //boolean validandoFec
        try {
            idPersona = modificarDatos.getPersonID(primerNombre,segundoNombre,primerApellido,segundoApellido);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String Modificar = botonOpcionModificar.getSelectedItem().toString();
        if(Modificar == "Nombre"){
            String TipoNombre = comboBoxNombres.getSelectedItem().toString();
            String Dato = botonTexto3.getText().toString();
           if(TipoNombre == "Primer Nombre"){
               if(botonTexto3.getText().isEmpty()){
                   JOptionPane.showMessageDialog(null,"No se ha modificado nada!\n El campo está vacio");
               } else {
                   try {
                       modificarDatos.updatePersonFirstName(idPersona,Dato);
                       botonTexto3.setText(null);
                   } catch (SQLException ex) {
                       Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   JOptionPane.showMessageDialog(null,"Primer Nombre Modificado");
                   
               }
           }
           if(TipoNombre == "Segundo Nombre"){
               if(botonTexto3.getText().isEmpty()){
                   JOptionPane.showMessageDialog(null,"No se ha modificado nada!\n El campo está vacio");
               } else {
                   
                   try {
                       modificarDatos.updatePersonMiddleName(idPersona,Dato);
                       botonTexto3.setText(null);
                   } catch (SQLException ex) {
                       Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   JOptionPane.showMessageDialog(null,"Segundo Nombre Modificado");
                   
               }
           }
            if(TipoNombre == "Primer Apellido"){
               if(botonTexto3.getText().isEmpty()){
                   JOptionPane.showMessageDialog(null,"No se ha modificado nada!\n El campo está vacio");
               } else {
                   
                   try {
                       modificarDatos.updatePersonFirstLastName(idPersona,Dato);
                       botonTexto3.setText(null);
                   } catch (SQLException ex) {
                       Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   JOptionPane.showMessageDialog(null,"Primer Apellido Modificado"); 
               }
           }
            if(TipoNombre == "Segundo Apellido"){
               if(botonTexto3.getText().isEmpty()){
                   JOptionPane.showMessageDialog(null,"No se ha modificado nada!\n El campo está vacio");
               } else {
                   try {
                       modificarDatos.updatePersonSecondLastName(idPersona,Dato);
                       botonTexto3.setText(null);
                   } catch (SQLException ex) {
                       Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   JOptionPane.showMessageDialog(null,"Segundo Apellido Modificado"); 
               }
           }
            botonPersonas.setVisible(false);
            botonPersonas.removeAllItems();
            try {
                modificarDatos.getPerson(botonPersonas);
            } catch (SQLException ex) {
                Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
           botonPersonas.setVisible(true);
        }
 
        if(Modificar == "Genero"){
            titulo1.setText("Genero");
            int Genero = 0;
            String GeneroNombre;
            GeneroNombre = (String) comboBoxGeneral.getSelectedItem();
            try {
                Genero = modificarDatos.getGenderCode(GeneroNombre);
            } catch (SQLException ex) {
                Logger.getLogger(RegistroPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                modificarDatos.updatePersonGender(idPersona, Genero);
                JOptionPane.showMessageDialog(null,"Genero Modificado!");
            } catch (SQLException ex) {
                Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(Modificar == "Distrito"){
           int Distrito = 0;
           String DistritoNombre;
           DistritoNombre = (String) comboBoxGeneral.getSelectedItem();
           try {
               Distrito = modificarDatos.getDistrictCode(DistritoNombre);
           } catch (SQLException ex) {
                Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
           } try {
                modificarDatos.updatePersonDistrict(idPersona, Distrito);
                JOptionPane.showMessageDialog(null,"Distrito Modificado!"); 
                } catch (SQLException ex) {
                Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(Modificar == "Fecha de nacimiento"){
           if(botonTexto1.getText().isEmpty()){
               JOptionPane.showMessageDialog(null,"No se ha modificado nada!\nTodos el espacio de fecha está vacio");
            } else {
                    String FechaNacimientoModicar;
                    String[] partesFecha;
                    String ParteDia; 
                    String ParteMes;
                    String ParteAños;
                    FechaNacimientoModicar = botonTexto1.getText();
                    
                    partesFecha = FechaNacimientoModicar.split("/");
                    ParteDia = partesFecha[0];
                    ParteMes = partesFecha[1];
                    ParteAños = partesFecha[2];
                    int parte1int = 0;
                    int parte2int = 0;
                    int parte3int = 0;
                    parte1int = Integer.parseInt(ParteDia);
                    parte2int = Integer.parseInt(ParteMes);
                    parte3int = Integer.parseInt(ParteAños);
                    if(ParteDia.length() != 2 || ParteMes.length() != 2 || ParteAños.length() != 4){
                            JOptionPane.showMessageDialog(null,"Error en Fecha de Nacimiento \nError en el formato.");  
                        } else {
                            if(parte1int != 00){
                              if(parte1int > 0 && parte1int <= 31){
                                if(parte2int > 0 && parte2int <= 12){
                                   if(parte3int > 1800 && parte3int < 2022){
                                     validandoFecha = true;
                                    } else {
                                    JOptionPane.showMessageDialog(null,"Error en Fecha de Nacimiento \nEl año debe estar entre 1800 y 2022");
                                    validandoFecha = false;   
                                    }
                                } else{
                                    JOptionPane.showMessageDialog(null,"Error en Fecha de Nacimiento \n El nes debe estar entre 1 y 12");
                                    validandoFecha = false;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null,"Error en Fecha de Nacimiento \nEl día debe estar entre entre 1 y 31");
                                validandoFecha = false;}
                            } else {
                            JOptionPane.showMessageDialog(null,"Error en Fecha DE Nacimiento \nDía debe estar entre 1 y 31");
                                validandoFecha = false;
                            }
                    }
                    if(validandoFecha){
                    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                    Date FechaDate = null;
                    try {
                        FechaDate = formatoFecha.parse(botonTexto1.getText());
                    } catch (ParseException ex) {
                        Logger.getLogger(RegistroPersona.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    java.sql.Date FechaNacimiento = new java.sql.Date(FechaDate.getTime());

                    try {
                         modificarDatos.updatePersonBirthday(idPersona, FechaNacimiento);
                         JOptionPane.showMessageDialog(null,"Fecha de nacimiento modificada!"); 
                         botonTexto1.setText(null);
                    } catch (SQLException ex) {
                        Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
                        }
                     } else {
                        JOptionPane.showMessageDialog(null,"Error!\nFecha no actualizada!"); 
                    }
            } 
        }
         /*   
        if(Modificar == "Foto"){
            try {
                modificarDatos.escribeImagenEnBBDD(idPersona,mImagen);
                JOptionPane.showMessageDialog(null,"Imagen Modificado!");
                botonFotoSeleccionada.setText(null);
            } catch (SQLException ex) {
                Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        */
        if(Modificar == "Teléfono"){
            boolean validandoTelefono = false;
            String TelefonoViejo;
            TelefonoViejo = comboBoxGeneral.getSelectedItem().toString();
            String TelefonoTipo;
            TelefonoTipo = comBoxTipoNimero.getSelectedItem().toString();
            int telefonoNumeroViejo = 0;
            telefonoNumeroViejo = Integer.parseInt(comboBoxGeneral.getSelectedItem().toString());
            int idTelefono = 0;
            String nuevoNumeroTelefono;
            if(botonTexto3.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"No se ha modificado nada. Campos vacios!");
            } else{
                if(botonTexto3.getText().toString().length() != 8){ 
                    JOptionPane.showMessageDialog(null,"No se ha modificado nada. El nuevo número debe tener 8 digitos!");
                } else{ 
                    nuevoNumeroTelefono = botonTexto3.getText().toString();
                    try {
                        idTelefono = modificarDatos.getIDPhone(telefonoNumeroViejo);
                    } catch (SQLException ex) {
                        Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        modificarDatos.updatePhoneDescription(idTelefono, TelefonoTipo);
                        modificarDatos.updatePhoneNumber(idTelefono,nuevoNumeroTelefono);
                        validandoTelefono = true;
                    } catch (SQLException ex) {
                        Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
                        validandoTelefono = false;
                    }
                }
            }
            if(validandoTelefono){
                int idPersonaTelefono = 0;
                try {
                     idPersonaTelefono = modificarDatos.getPersonID(primerNombre,segundoNombre,primerApellido,segundoApellido);
                 } catch (SQLException ex) {
                     Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
                 }
                comboBoxGeneral.setVisible(false);
                comboBoxGeneral.removeAllItems();
                try {
                    modificarDatos.getPhoneNumber(comboBoxGeneral,idPersonaTelefono);
                } catch (SQLException ex) {
                    Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
                }
                comboBoxGeneral.setVisible(true);
                JOptionPane.showMessageDialog(null,"Teléfono modificado!");
                
            }
        }
        if(Modificar == "Email"){
          boolean validandoCorreo = false;
            String nuevoEmail;
            nuevoEmail = botonTexto1.getText().toString();
            int IdEmailCode = 0;
            if(botonTexto1.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"No se ha modificado nada. Campos vacios!");
            } else {
                try {
                    IdEmailCode = modificarDatos.getEmailID(idPersona);
                } catch (SQLException ex) {
                    Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
                }
                Pattern pattern = Pattern.compile("^[_a-z-A-Z0-9-]+(\\.[_a-z0-9-]+)*@" + 
                    "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$");
                Matcher mather = pattern.matcher(botonTexto1.getText().toString());
                if (mather.find()) {
                    validandoCorreo = true;
                    try {
                        modificarDatos.updateEmailDirection(IdEmailCode, nuevoEmail);
                        validandoCorreo = true;
                    } catch (SQLException ex) {
                        Logger.getLogger(RegistroPersona.class.getName()).log(Level.SEVERE, null, ex);
                        validandoCorreo = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null,"El email inválido."); 
                }
                if(validandoCorreo){
                    botonTexto1.setText(null);
                    JOptionPane.showMessageDialog(null,"Email Modificado."); 
                }
            } 
            }
     
        botonPersonas.setVisible(false);
        botonPersonas.removeAllItems();
        try {
            modificarDatos.getPerson(botonPersonas);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        botonPersonas.setVisible(true);
 
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarActionPerformed
        String opcionSeleccionada = botonOpcionModificar.getSelectedItem().toString();
        if(opcionSeleccionada == "Nombre"){
            titulo1.setVisible(false);
            titulo1.setText("Seleccione el dato que desea modificar");
            titulo1.setVisible(true);
            comboBoxNombres.setVisible(true);
            botonTexto3.setVisible(true);
            botonModificar.setEnabled(true);
            //Apagar ComboBox
            comboBoxGeneral.setVisible(false);
            botonFotoSeleccionada.setVisible(false);
            botonSeleccionarFoto.setVisible(false);
            botonTexto1.setVisible(false);
            tituloTipoTelefono.setVisible(false);
            comBoxTipoNimero.setVisible(false);
            

        }
        if(opcionSeleccionada == "Genero"){
             titulo1.setVisible(false);
             titulo1.setText("Seleccione el nuevo genero");
             titulo1.setVisible(true);
             comboBoxGeneral.setVisible(false);
             comboBoxGeneral.removeAllItems();
            try {
                modificarDatos.getGender(comboBoxGeneral);
            } catch (SQLException ex) {
                Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
            comboBoxGeneral.setVisible(true);
            botonModificar.setEnabled(true);
           
            //Apagar Botones y Texto
            botonTexto1.setVisible(false);
            botonTexto3.setVisible(false);
            botonFotoSeleccionada.setVisible(false);
            botonSeleccionarFoto.setVisible(false);
            comboBoxNombres.setVisible(false);
            tituloTipoTelefono.setVisible(false);
            comBoxTipoNimero.setVisible(false);
        }
        if(opcionSeleccionada == "Distrito"){
            
             titulo1.setVisible(false);
             titulo1.setText("Seleccione el nuevo distrito");
             titulo1.setVisible(true);
             comboBoxGeneral.setVisible(false);
             comboBoxGeneral.removeAllItems();
            try {
                modificarDatos.getDistrict(comboBoxGeneral);
            } catch (SQLException ex) {
                Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
            comboBoxGeneral.setVisible(true);
            botonModificar.setEnabled(true);

            //Apagar Botones y Texto
            botonTexto1.setVisible(false);
            botonTexto3.setVisible(false);
            botonFotoSeleccionada.setVisible(false);
            botonSeleccionarFoto.setVisible(false);
            comboBoxNombres.setVisible(false);
            tituloTipoTelefono.setVisible(false);
            comBoxTipoNimero.setVisible(false);
        }
        if(opcionSeleccionada == "Fecha de nacimiento"){
             titulo1.setVisible(false);
             titulo1.setText("Formato fecha nacimiento DD/MM/YYYY");
             titulo1.setVisible(true);
             botonModificar.setEnabled(true);
             botonTexto1.setVisible(true);
             botonTexto1.setEnabled(true);
             //Activar boton principal modifcar
            // Apagar Botones y texto
            botonTexto3.setVisible(false);
            botonFotoSeleccionada.setVisible(false);
             botonSeleccionarFoto.setVisible(false);
            // Apagar Combobox
            comboBoxGeneral.setVisible(false);
            comboBoxNombres.setVisible(false);
            tituloTipoTelefono.setVisible(false);
            comBoxTipoNimero.setVisible(false);
            }
        if(opcionSeleccionada == "Foto"){
             botonModificar.setEnabled(false);
             botonFotoSeleccionada.setVisible(true);
             botonSeleccionarFoto.setVisible(true);
            // Apagar Botones y texto
            titulo1.setVisible(false);
            botonTexto1.setVisible(false);
            botonTexto3.setVisible(false);
            // Apagar Combobox
            comboBoxGeneral.setVisible(false);
            comboBoxNombres.setVisible(false);
            tituloTipoTelefono.setVisible(false);
            comBoxTipoNimero.setVisible(false);
        }
        if(opcionSeleccionada == "Teléfono"){
            String[] nombreCompletoM;
            String pNombreM;
            String sNombreM;
            String pApellidoM;
            String sApellidoM;
            String PersonaElegidaTelefono;
            PersonaElegidaTelefono = (String) botonPersonas.getSelectedItem();
            nombreCompletoM = PersonaElegidaTelefono.split(" ");
            pNombreM =  nombreCompletoM[0]; 
            sNombreM = nombreCompletoM[1];
            pApellidoM = nombreCompletoM[2];
            sApellidoM = nombreCompletoM[3];

           int idPersonaTelefonoV = 0;
           try {
                idPersonaTelefonoV = modificarDatos.getPersonID(pNombreM,sNombreM,pApellidoM,sApellidoM);
            } catch (SQLException ex) {
                Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
            titulo1.setVisible(false);
            titulo1.setText("Seleccione el teléfono a modificar");
            titulo1.setVisible(true);
            tituloTipoTelefono.setVisible(true);
            comBoxTipoNimero.setVisible(true);
            botonModificar.setEnabled(true);
            botonTexto3.setVisible(true);
            comboBoxGeneral.setVisible(false);
            comboBoxGeneral.removeAllItems();
            try {
                modificarDatos.getPhoneNumber(comboBoxGeneral,idPersonaTelefonoV);
            } catch (SQLException ex) {
                Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
            comboBoxGeneral.setVisible(true);
            //Apagar ComboBox
            comboBoxNombres.setVisible(false);
            botonTexto1.setVisible(false);
            botonFotoSeleccionada.setVisible(false);
            botonSeleccionarFoto.setVisible(false);
  
        }
        if(opcionSeleccionada == "Email"){
            titulo1.setVisible(false);
            titulo1.setText("Digite el nuevo email");
            titulo1.setVisible(true);
            botonTexto1.setVisible(true);
            botonModificar.setEnabled(true);
            // Apagar
            comboBoxGeneral.setVisible(false);
            botonFotoSeleccionada.setVisible(false);
            comboBoxNombres.setVisible(false);
            tituloTipoTelefono.setVisible(false);
            comBoxTipoNimero.setVisible(false);
            botonSeleccionarFoto.setVisible(false);
            botonTexto3.setVisible(false);
            
        }
    }//GEN-LAST:event_botonSeleccionarActionPerformed

    private void comboBoxGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxGeneralActionPerformed

    }//GEN-LAST:event_comboBoxGeneralActionPerformed

    private void botonSeleccionarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarFotoActionPerformed
        String Ruta = "";
        JFileChooser fotoSeleccionada = new JFileChooser();
        FileNameExtensionFilter filtradoFormatos = new FileNameExtensionFilter("JGP, PNG", "jpg", "png");
        fotoSeleccionada.setFileFilter(filtradoFormatos);
        
        int respuestaFoto = fotoSeleccionada.showOpenDialog(this);
        
        if (respuestaFoto == JFileChooser.APPROVE_OPTION) {
            
            Ruta = fotoSeleccionada.getSelectedFile().getPath();
            mImagen = new ImageIcon(Ruta).getImage();
            fotoSelect = new ImageIcon(mImagen.getScaledInstance(botonFotoSeleccionada.getWidth(), botonFotoSeleccionada.getHeight(), Image.SCALE_SMOOTH));
            botonFotoSeleccionada.setIcon(fotoSelect);
            
            
            botonModificar.setEnabled(true);
        }
        
    }//GEN-LAST:event_botonSeleccionarFotoActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
    this.dispose();
    AdminSetup ventaAdminSetup = null;
        try {
            ventaAdminSetup = new AdminSetup(this,true, modificarDatos);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
    ventaAdminSetup.setVisible(true); 
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDatosActionPerformed
    Tablas tablas = null;
        try {
            tablas = new Tablas(this,true,modificarDatos);
        } catch (SQLException ex) {
            Logger.getLogger(RegistroPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablas.setVisible(true);
    }//GEN-LAST:event_botonDatosActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarPersona dialog = new ModificarPersona(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDatos;
    private javax.swing.JLabel botonFotoSeleccionada;
    private javax.swing.JButton botonModificar;
    private javax.swing.JComboBox<String> botonOpcionModificar;
    private javax.swing.JComboBox<String> botonPersonas;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonSeleccionar;
    private javax.swing.JButton botonSeleccionarFoto;
    private javax.swing.JTextField botonTexto1;
    private javax.swing.JTextField botonTexto3;
    private javax.swing.JComboBox<String> comBoxTipoNimero;
    private javax.swing.JComboBox<String> comboBoxGeneral;
    private javax.swing.JComboBox<String> comboBoxNombres;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel tituloTipoTelefono;
    // End of variables declaration//GEN-END:variables
}
