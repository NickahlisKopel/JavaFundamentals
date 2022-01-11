package com.careerdevs;

import com.careerdevs.interm.Employee;
import com.careerdevs.interm.TextBox;
import com.careerdevs.intro.CleanCoding;
import com.careerdevs.intro.ControlFlow;
import com.careerdevs.intro.DataTypes;
import com.careerdevs.intro.Debugging;

import java.util.Locale;

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
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }

}
