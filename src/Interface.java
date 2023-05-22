import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JButton eliminarPorIDButton;
    private JTextField textField1;
    private JButton eliminarPorNombreButton;
    private JTextField textField2;
    private JTextField textField3;
    private JButton buscarPorIDButton;
    private JButton buscarPorNombreButton;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField7;
    private JTextField textField8;
    private JButton añadirButton;
    private JTextArea textArea1;
    private JButton calcularButton;
    private JTextField textField6;
    private JTextArea textArea2;
    private JButton quemarButton;
    private JTextArea textArea3;


    private Biblioteca l= new Biblioteca();
    public Interface() {

        super ("Biblioteca");
        setContentPane(panel1);

        añadirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(l.CrearLibros(Integer.parseInt(textField8.getText()),textField5.getText(),textField7.getText())){
                    JOptionPane.showMessageDialog(null,"Se ha creado el libro con exito");
                }else{
                    JOptionPane.showMessageDialog(null, "No se puede crear el libro");
                }





            }
        });
        eliminarPorIDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l.EliminarID(Integer.parseInt(textField1.getText()))){
                    textField2.setText("Se elimino con exito");
                }else{
                    textField2.setText("No se encontró el libro");
                }
            }
        });


        eliminarPorNombreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l.EliminarNombre(textField1.getText())){
                    textField2.setText("Se elimino con exito");
                }else{
                    textField2.setText("No se encontró el libro");
                }
            }
        });
        buscarPorNombreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if(l.BuscarNombre(textField3.getText())!=null){
                textField4.setText("Se ha encontrado el libro");
                textArea1.setText(l.BuscarNombre(textField3.getText()).toString());
            }else{
                textField4.setText("No se encontró el libro");
            }
            }
        });
        buscarPorIDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              if(l.BusquedaBinaria(Integer.parseInt(textField3.getText()))!=-1){
                  textField4.setText("Se ha encontrado el libro");
                  textArea1.setText(l.buscarlibro(Integer.parseInt(textField3.getText())).toString());
              }else{
                  textField4.setText("No se encontró el libro");
              }
            }
        });
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField6.setText(String.valueOf(l.Sumalibros(l.getLibros(),l.getLibros().size()-1)));
                textArea2.setText(l.getLibros().toString());
            }
        });
        quemarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.CrearLibros(15,"Hola","Dylan");
                l.CrearLibros(17,"Progra","Dereck");
                l.CrearLibros(23,"Mate","Alejandro");
                l.CrearLibros(75,"So","Daniel");
                l.CrearLibros(80,"Edo","Mauro");

                textArea3.setText(l.getLibros().toString());

            }
        });
    }
}
