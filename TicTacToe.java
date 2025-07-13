import java.awt.*;
import java.awt.event.*;

// Main class extending Frame and implementing ActionListener
class TicTacToe extends Frame implements ActionListener {

    // Declare buttons for the 3x3 grid
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    // Constructor to initialize UI
    TicTacToe() {
        // Set font for buttons
        Font f = new Font("Brush Script MT", Font.BOLD, 25);
        setFont(f);

        // Absolute layout
        setLayout(null);

        // Initialize buttons and place them on the frame

        b1 = new Button();
        b1.setSize(100, 100);
        b1.setLocation(100, 100);
        add(b1);

        b2 = new Button();
        b2.setSize(100, 100);
        b2.setLocation(200, 100);
        add(b2);

        b3 = new Button();
        b3.setSize(100, 100);
        b3.setLocation(300, 100);
        add(b3);

        b4 = new Button();
        b4.setSize(100, 100);
        b4.setLocation(100, 200);
        add(b4);

        b5 = new Button();
        b5.setSize(100, 100);
        b5.setLocation(200, 200);
        add(b5);

        b6 = new Button();
        b6.setSize(100, 100);
        b6.setLocation(300, 200);
        add(b6);

        b7 = new Button();
        b7.setSize(100, 100);
        b7.setLocation(100, 300);
        add(b7);

        b8 = new Button();
        b8.setSize(100, 100);
        b8.setLocation(200, 300);
        add(b8);

        b9 = new Button();
        b9.setSize(100, 100);
        b9.setLocation(300, 300);
        add(b9);

        // Register ActionListeners for all buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        // Set labels (X or O) based on source (not alternating turn in this version)

        if (e.getSource() == b1) {
            b1.setLabel("X");
        }
        if (e.getSource() == b2) {
            b2.setLabel("O");
        }
        if (e.getSource() == b3) {
            b3.setLabel("X");
        }
        if (e.getSource() == b4) {
            b4.setLabel("O");
        }
        if (e.getSource() == b5) {
            b5.setLabel("X");
        }
        if (e.getSource() == b6) {
            b6.setLabel("O");
        }
        if (e.getSource() == b7) {
            b7.setLabel("X");
        }
        if (e.getSource() == b8) {
            b8.setLabel("O");
        }
        if (e.getSource() == b9) {
            b9.setLabel("X");
        }
    }

    // Main method
    public static void main(String[] args) {
        TicTacToe frame = new TicTacToe();
        frame.setTitle("Tic Tac Toe Game");
        frame.setSize(500, 500);
        frame.setLocation(200, 100);
        frame.setVisible(true);
    }
}
