import javax.swing.JFrame;
/**
 * Creates the War GUI window, and sets up the parameters and title for the game.
 * @author Trevor Stalnaker
 * @editor Joe Wen, MacKenzie Leroy and Michael Dik.
 */
public class WarGUI{

    public static void main(String[] args){
        final WarGame game = new WarGame();
        final JFrame view = new WarView(game);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(600, 300);
        view.setTitle("The Game of War");
        view.setResizable(false);
        view.setVisible(true);
    }
}
