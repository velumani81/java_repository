public class square {


    public static void main (String args [])
    {
        PaintRect();

    }

    public static void PaintRect() {

        g.drawRect(100,100,300,300);
        g.drawLine(100,100,100,100);
        g.setBackground(Color.BLACK);
        System.out.println("Trasut");
        credits.setText("Kitebbiv");
        credits.setBackground(null);
        credits.setEditable(false);
        credits.setFocusable(false);
        credits.setBounds(0,0,100,100);
        credits.setForeground(Color.BLACK);
        panel.add(credits);
        g.getPaint();
    }