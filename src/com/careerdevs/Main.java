package com.careerdevs;

import com.careerdevs.interm.Classes.Browser;
import com.careerdevs.interm.Classes.Employee;
import com.careerdevs.interm.Classes.TextBox;

public class Main {

    public static void main(String[] args) {
        //Intro-----------------------------
        //DataTypes.main();
        //ControlFlow.main();
        //CleanCoding.main();
        //Debugging.main();
        //Interm----------------------------
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
//--------------------------------------------------
        var employee = new Employee(50_000);

        int wage = employee.calculateWage();
        System.out.println(wage);

        //-------------------------------
        var browser = new Browser();

    }

}
