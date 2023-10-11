package np.edu.scst;
import javax.swing.*;

public class jMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JMenu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);


        frame.setJMenuBar(menuBar);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
