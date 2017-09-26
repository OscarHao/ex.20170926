import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame{
    private Button btnAdd=new Button("Add");
    private Button btnSub=new Button("Sub");
    private Label lab1=new Label(">_<");
    private int count=0,labX=50,labY=50;
    private Timer t1;
    public MainFrame(){
        initComp();
    }
    private void initComp(){
        this.setBounds(100,100,500,400);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                super.windowClosing(windowEvent);
                System.exit(0);
            }
        });
        this.setLayout(null);
        lab1.setBounds(labX,labY,120,30);
        this.add(lab1);
        btnAdd.setBounds(100,100,100,30);
        this.add(btnAdd);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame.this.setTitle(Integer.toString(++count));
                t1.start();
            }
        });



        btnSub.setBounds(200,100,100,30);
        this.add(btnSub);
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame.this.setTitle(Integer.toString(--count));
            }
        });
            t1=new Timer(500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    labX+= 15;
                    lab1.setLocation(labX,labY);
                }
            });



    }

}
