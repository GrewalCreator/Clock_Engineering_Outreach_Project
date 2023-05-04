import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    // Define Objects as Class members (Identity of the Object)
    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock Program"); // Window (Frame) title
        this.setLayout(new FlowLayout());  // layout the Frame should follow for all components
        this.setSize(400,200); // size of window
        this.setResizable(false);  // can the window size be changed (set to false)

        timeFormat = new SimpleDateFormat("hh:mm:ss a");      // Format for the time
        dayFormat = new SimpleDateFormat("EEEE");             // Format for the Day
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");  // Format for the Date

        timeLabel = new JLabel();                                        // Create a New Label Object
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));


        // Add the objects created to the frame
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        // Call the setTime Function
        setTime();
    }

    public void setTime() {
        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}