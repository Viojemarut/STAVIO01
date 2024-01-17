import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

public class SimpleCRUDApp extends JFrame {
    private JTextField txtID, txtName, txtAge;

    public SimpleCRUDApp() {
        super("Simple CRUD App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        txtID = new JTextField(10);
        txtName = new JTextField(20);
        txtAge = new JTextField(5);

        JButton btnCreate = new JButton("Create");
        JButton btnRead = new JButton("Read");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");

        setLayout(new GridLayout(5, 2));
        add(new JLabel("ID:"));
        add(txtID);
        add(new JLabel("Name:"));
        add(txtName);
        add(new JLabel("Age:"));
        add(txtAge);
        add(btnCreate);
        add(btnRead);
        add(btnUpdate);
        add(btnDelete);

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        btnCreate.addActionListener(e -> createRecord());
        btnRead.addActionListener(e -> readRecord());
        btnUpdate.addActionListener(e -> updateRecord());
        btnDelete.addActionListener(e -> deleteRecord());
    }

    // Metode CRUD dan koneksi database di sini...

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleCRUDApp().setVisible(true));
    }
}

