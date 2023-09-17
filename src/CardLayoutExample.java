//
//import javax.swing.*;
//import java.awt.*;
//
//public class BorderLayoutExample {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Ejemplo de BorderLayout");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel panel = new JPanel();
//        panel.setLayout(new BorderLayout());
//
//        JButton btnNorte = new JButton("Norte");
//        JButton btnSur = new JButton("Sur");
//        JButton btnEste = new JButton("Este");
//        JButton btnOeste = new JButton("Oeste");
//        JButton btnCentro = new JButton("Centro");
//
//        panel.add(btnNorte, BorderLayout.NORTH);
//        panel.add(btnSur, BorderLayout.SOUTH);
//        panel.add(btnEste, BorderLayout.EAST);
//        panel.add(btnOeste, BorderLayout.WEST);
//        panel.add(btnCentro, BorderLayout.CENTER);
//
//        frame.add(panel);
//        frame.setSize(300, 200);
//        frame.setVisible(true);
//    }
//}



//import javax.swing.*;
//import java.awt.*;
//
//public class FlowLayoutExample {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Ejemplo de FlowLayout");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel panel = new JPanel();
//        panel.setLayout(new FlowLayout()); // FlowLayout horizontal por defecto
//
//        JButton btn1 = new JButton("Botón 1");
//        JButton btn2 = new JButton("Botón 2");
//        JButton btn3 = new JButton("Botón 3");
//
//        panel.add(btn1);
//        panel.add(btn2);
//        panel.add(btn3);
//
//        frame.add(panel);
//        frame.setSize(300, 100); // Tamaño suficiente para acomodar los botones en una fila
//        frame.setVisible(true);
//    }
//}




//import javax.swing.*;
//import java.awt.*;
//
//public class GridLayoutExample {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Ejemplo de GridLayout");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel panel = new JPanel();
//        panel.setLayout(new GridLayout(3, 3)); // GridLayout con 3 filas y 3 columnas
//
//        for (int i = 1; i <= 9; i++) {
//            JButton btn = new JButton("Botón " + i);
//            panel.add(btn);
//        }
//
//        frame.add(panel);
//        frame.setSize(300, 300); // Tamaño suficiente para mostrar la cuadrícula
//        frame.setVisible(true);
//    }
//}




//import javax.swing.*;
//import java.awt.*;
//
//public class GridBagLayoutExample {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Ejemplo de GridBagLayout");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel panel = new JPanel();
//        panel.setLayout(new GridBagLayout());
//
//        GridBagConstraints constraints = new GridBagConstraints();
//
//        JButton btn1 = new JButton("Botón 1");
//        constraints.gridx = 0;
//        constraints.gridy = 0;
//        panel.add(btn1, constraints);
//
//        JButton btn2 = new JButton("Botón 2");
//        constraints.gridx = 1;
//        constraints.gridy = 0;
//        panel.add(btn2, constraints);
//
//        JButton btn3 = new JButton("Botón 3");
//        constraints.gridx = 0;
//        constraints.gridy = 1;
//        constraints.gridwidth = 2; // Ocupa dos columnas
//        panel.add(btn3, constraints);
//
//        frame.add(panel);
//        frame.setSize(300, 200);
//        frame.setVisible(true);
//    }
//}




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de CardLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel cardPanel = new JPanel();
        CardLayout cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        JButton card1Button = new JButton("Tarjeta 1");
        JButton card2Button = new JButton("Tarjeta 2");
        JButton card3Button = new JButton("Tarjeta 3");

        JPanel card1 = new JPanel();
        JPanel card2 = new JPanel();
        JPanel card3 = new JPanel();

        card1.add(new JLabel("Contenido de la Tarjeta 1"));
        card2.add(new JLabel("Contenido de la Tarjeta 2"));
        card3.add(new JLabel("Contenido de la Tarjeta 3"));

        cardPanel.add(card1, "Tarjeta 1");
        cardPanel.add(card2, "Tarjeta 2");
        cardPanel.add(card3, "Tarjeta 3");

        card1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Tarjeta 1");
            }
        });

        card2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Tarjeta 2");
            }
        });

        card3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Tarjeta 3");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(card1Button);
        buttonPanel.add(card2Button);
        buttonPanel.add(card3Button);

        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}



