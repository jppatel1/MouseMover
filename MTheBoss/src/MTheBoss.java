import java.awt.*;


class MTheBoss{

    public static void main(String[] args) throws Exception{
        Robot mTheBoss = new Robot();
        while(true){

            // Time after which mouse moves
            //currently it moves the mouse ever 20 seconds
            mTheBoss.delay(1000 * 20 );

            //get the dimension of the screen
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

            Point p = MouseInfo.getPointerInfo().getLocation();

            // moves mouse location to 1px so that if you work with this app on it will not annoy you
            mTheBoss.mouseMove((int) ((p.x+1)%screenSize.getWidth()),p.y);
        }
    }
}