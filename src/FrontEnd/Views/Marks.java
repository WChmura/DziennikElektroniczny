package FrontEnd.Views;

import Common.UserType;
import Database.DbMark;
import FrontEnd.Page;
import com.sun.deploy.panel.JavaPanel;

import javax.swing.*;
import java.awt.*;

public class Marks extends Page {

    @Override
    public void createGUI() {
        addPanel();
        DbMark[] marks = model.getMockMarks();
        int numOfSubject=5;
        JPanel subjectsPanel = new JPanel();
        subjectsPanel.setLayout(new GridLayout(numOfSubject,1));
        for(int i=0;i<numOfSubject;i++){
            JPanel subjectPanel = new JPanel();
            subjectPanel.setSize(mainContent.getWidth(),50);
            JLabel label = new JLabel("Przedmiot: "+i);
            subjectPanel.add(label);
            for(int j =0;j<marks.length;j++){
                if(marks[j].getSubjectID()==i){
                    JButton markButton = new JButton();
                }
            }
            subjectsPanel.add(subjectPanel);
        }
        mainContent.add(subjectsPanel);
    }
    private void configureMarkButton(){

    }
}
