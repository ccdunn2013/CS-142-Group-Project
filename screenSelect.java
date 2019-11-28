import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class screenSelect extends JFrame implements ActionListener{
        private int gamestate = 0;
        String[] places = {"Store","Plot"};
        JComboBox Travel =  new JComboBox(places);
        public screenSelect(){
            setLayout(new FlowLayout());
            setSize(200,100);
            setTitle("Travel Selection");


            Travel.setSelectedIndex(0);
            Travel.addActionListener(this);
            add(Travel);
            setUndecorated(true);
            getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        }



        public void actionPerformed (ActionEvent e){
            if (e.getSource()  == Travel){
                JComboBox cb = (JComboBox)e.getSource();
                String msg = (String)cb.getSelectedItem();
                switch(msg){
                    case "Store":Start.gameState = 1;
                    break;
                    case "Plot":Start.gameState = 0;
                    
                    break;


                }


            }

        }


        }





