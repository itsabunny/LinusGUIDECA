import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ground extends JFrame {

    private JTextField insertNameBox;
    private JButton buttonEnterName;
    private JTextPane HeptathlonText;
    private JTextPane textHep100mHurdles;
    private JTextPane textHepHighJump;
    private JTextPane textHepShotPut;
    private JTextPane textHep200m;
    private JTextPane textHepLongJump;
    private JTextPane textHepJavelinThrow;
    private JTextPane textHep800m;
    private JTextField scoreHep100mHurdles;
    private JTextField scoreHepHighJump;
    private JTextField scoreHepShotPut;
    private JTextField scoreHep200m;
    private JTextField scoreHepLongJump;
    private JTextField scoreHepJavelinThrow;
    private JTextField scoreHep800m;
    private JTextPane DecathlonText;
    private JTextPane textDeca100m;
    private JTextPane textDecaLongJump;
    private JTextPane textDecaShotPut;
    private JTextPane textDecaHighJump;
    private JTextPane textDeca400m;
    private JTextPane textDeca110mHurdles;
    private JTextPane textDecaDiscusThrow;
    private JTextPane textDecaPoleVault;
    private JTextPane textDecaJavelinThrow;
    private JTextPane textDeca1500m;
    private JTextField scoreDeca100m;
    private JTextField scoreDecaLongJump;
    private JTextField scoreDecaShotPut;
    private JTextField scoreDecaHighJump;
    private JTextField scoreDeca400m;
    private JTextField scoreDeca110mHurdles;
    private JTextField scoreDecaDiscusThrow;
    private JTextField scoreDecaPoleVault;
    private JTextField scoreDecaJavelinThrow;
    private JTextField scoreDeca1500m;
    private JTextPane pleaseInsertCompetitorsNameTextPane;
    private JTextPane totalPointsText;
    private JTextField totalPointsBox;
    private JPanel GroundPanel;
    private JButton buttonCalculate;
    private JButton buttonEraseScore;
    private JTextField scoreHep100mHurdlesPoints;
    private JTextField scoreDeca100mPoints;
    private JTextField scoreHepHighJumpPoints;
    private JTextField scoreDecaLongJumpPoints;
    private JTextField scoreHepShotPutPoints;
    private JTextField scoreDecaShotPutPoints;
    private JTextField scoreHep200mPoints;
    private JTextField scoreDecaHighJumpPoints;
    private JTextField scoreHepLongJumpPoints;
    private JTextField scoreDeca400mPoints;
    private JTextField scoreHepJavelinThrowPoints;
    private JTextField scoreDeca110mHurdlesPoints;
    private JTextField scoreHep800mPoints;
    private JTextField scoreDecaDiscusThrowPoints;
    private JTextField scoreDecaPoleVaultPoints;
    private JTextField scoreDecaJavelinThrowPoints;
    private JTextField scoreDeca1500mPoints;

    public Ground () {
        setContentPane(GroundPanel);
        setTitle("Heptathlon and Decathlon GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 1700);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
        buttonEnterName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String competitorsName = insertNameBox.getText();
                JOptionPane.showMessageDialog(Ground.this, "Hello " + competitorsName + ", good luck today! Your name is now saved in the database.");
            }
        });
        scoreHep100mHurdles.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateScore();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateScore();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Not used for plain text documents
            }

            private void updateScore() {
                String scoreString = scoreHep100mHurdles.getText();
                double score = 0;
                try {
                    score = Double.parseDouble(scoreString);
                } catch (NumberFormatException ex) {
                    // Ignore invalid scores
                }
                double points = score / 2;
                scoreHep100mHurdlesPoints.setText(String.format("%.2f", points));
            }
        });
    }

    public static void main(String[] args) {
        new Ground();
    }
}
