
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de vezes que será mostrado"));
        String frase = JOptionPane.showInputDialog("Digite a frasea ser mostrada");
        for(int i=1;i<=n;i=i+1){
            System.out.println( frase);
        }                
    }
}