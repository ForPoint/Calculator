package com.open_open.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,
            button0,button_add,button_sub,button_mul,button_div,button_point,button,
            button_del,button_left,button_right,button_ac;
    TextView textView1,textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the key
        button = (Button)findViewById(R.id.button);
        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        button_point = (Button)findViewById(R.id.button_point);
        button_add = (Button)findViewById(R.id.button_add);
        button_sub = (Button)findViewById(R.id.button_sub);
        button_mul = (Button)findViewById(R.id.button_mul);
        button_div = (Button)findViewById(R.id.button_div);
        button_del = (Button)findViewById(R.id.button_del);
        button_left = (Button)findViewById(R.id.buttonleft);
        button_right = (Button)findViewById(R.id.buttonright);
        button_ac = (Button)findViewById(R.id.button_ac);
        textView1 = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        //use the key


        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if(c != ')')
                {
                    if (check(equation))
                    {
                        equation += '0';
                    }
                    else
                    {
                        equation = "0";
                    }
                }
                textView2.setText(equation);
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if(c != ')')
                if (check(equation))
                {
                    equation += '1';
                }
                else
                {
                    equation = "1";
                }
                textView2.setText(equation);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if(c != ')')
                if (check(equation))
                {
                    equation += '2';
                }
                else
                {
                    equation = "2";
                }
                textView2.setText(equation);
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if(c != ')')
                if (check(equation))
                {
                    equation += '3';
                }
                else
                {
                    equation = "3";
                }
                textView2.setText(equation);
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if(c != ')')
                if (check(equation))
                {
                    equation += '4';
                }
                else
                {
                    equation = "4";
                }
                textView2.setText(equation);
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if(c != ')')
                if (check(equation))
                {
                    equation += '5';
                }
                else
                {
                    equation = "5";
                }
                textView2.setText(equation);
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if(c != ')')
                if (check(equation))
                {
                    equation += '6';
                }
                else
                {
                    equation = "6";
                }
                textView2.setText(equation);
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if(c != ')')
                if (check(equation))
                {
                    equation += '7';
                }
                else
                {
                    equation = "7";
                }
                textView2.setText(equation);
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if(c != ')')
                if (check(equation))
                {
                    equation += '8';
                }
                else
                {
                    equation = "8";
                }
                textView2.setText(equation);
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if(c != ')')
                if (check(equation))
                {
                    equation += '9';
                }
                else
                {
                    equation = "9";
                }
                textView2.setText(equation);
            }
        });
        button_add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if ((c == '0'||c == '1'||c == '2'||c == '3'||c == '4'||c == '5'||c == '6'||c == '7'
                        ||c == '8'||c == '9'||c == ')')&&equation.length()>0)
                {
                    equation += '+';
                    textView2.setText(equation);
                }
            }
        });
        button_sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (c != '.')
                {
                    if (check(equation))
                    {
                        equation += '-';
                    }
                    else
                    {
                        equation = "-";
                    }
                }

                textView2.setText(equation);
            }
        });
        button_mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if ((c == '0'||c == '1'||c == '2'||c == '3'||c == '4'||c == '5'||c == '6'||c == '7'
                        ||c == '8'||c == '9'||c == ')')&&equation.length()>0)
                {
                    equation += '*';
                    textView2.setText(equation);
                }
            }
        });
        button_div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if ((c == '0'||c == '1'||c == '2'||c == '3'||c == '4'||c == '5'||c == '6'||c == '7'
                        ||c == '8'||c == '9'||c == ')')&&equation.length()>0)
                {
                    equation += '/';
                    textView2.setText(equation);
                }
            }
        });
        button_point.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (c == '0'||c == '1'||c == '2'||c == '3'||c == '4'||c == '5'||c == '6'||c == '7'||
                c == '8'||c == '9')
                {
                    if (check(equation))
                    {
                        equation += '.';
                    }
                    else
                    {
                        equation = ".";
                    }
                }

                textView2.setText(equation);
            }
        });
        button_left.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (check(equation) ) {
                    if (c == '+'||c == '-'||c == '*'||c == '/')
                        equation += '(';
                } else {
                    equation = "(";
                }

                textView2.setText(equation);
            }
        });
        button_right.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = textView2.getText().toString();
                char c = getLastChar(equation);
                if (checkleft(equation)&&(c == '0'||c == '1'||c == '2'||c == '3'||c == '4'||c == '5'||c == '6'||c == '7'||
                        c == '8'||c == '9'))
                {
                    equation += ')';
                }

                textView2.setText(equation);
            }
        });
        button_ac.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String equation = "0";
                textView2.setText(equation);
            }
        });
        button_del.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v) {
            String equation = textView2.getText().toString();
                if (equation.length()>=1)
                    equation = equation.substring(0,equation.length()-1);
            textView2.setText(equation);
        }
    });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //整理式子，不对报error
                //正确返回式子
                String equation = textView2.getText().toString();
                if (checkEqu(equation))
                {
                    //根据式子输出答案

                }
                else
                {
                    textView1.setText("ERROR");
                }
            }
        });
    }

    //function
    public double calculator (String equation)
    {
        char[] equ = equation.toCharArray();
        String num = null;
        int number = 0;
        for (int i = 0;i<equ.length;i++)
        {
            if (equ[i] == '0'||equ[i] == '1'||equ[i] == '2'||equ[i] == '3'||equ[i] == '4'||equ[i] == '5'||equ[i] == '6'||
                    equ[i] == '7'||equ[i] == '8'||equ[i] == '9')
            {
                num += equ[i];
                while(equ[i+1] == '0'||equ[i+1] == '1'||equ[i+1] == '2'||equ[i+1] == '3'||equ[i+1] == '4'
                        ||equ[i+1] == '5'||equ[i+1] == '6'||equ[i+1] == '7'||equ[i+1] == '8'||equ[i+1] == '9'
                        ||equ[i+1] == '.')
                {
                    num+=equ[i+1];
                    i++;
                }
                i--;
                number = Integer.parseInt(num);
                //number入栈
            }
        }
        return 0.1;
    }
    public boolean checkEqu(String equation)
    {
        //检查括号的匹配
        int i = calculate(equation,"(");
        int j = calculate(equation,")");
        if (i!=j){
            return false;}
        //检查
        return true;
    }
    public int calculate(String str,String substr){
        int ch = 0;
        int j = 0;
        String str1;
        for(int i=0;i<=str.length();i++){
            if ((j = str.indexOf(substr))!=-1)
            ch++;
            str1 = str.substring(j+1, str.length());
            str = str1;
        }
        return ch;
    }
    public boolean check(String str)
    {
        if(str.length()==1) {
            if (str == "(" || str == ")" || str == "-") {
                return true;
            } else {
                int z = Integer.parseInt(str);
                if (z == 0)
                    return false;
            }
        }
        return true;
    }
    public char getLastChar(String equation)
    {
        String i = "";
        char c ;
        if (equation.length()<=1)
            i = equation;
        else
            i = equation.substring(equation.length()-1,equation.length());
        c = i.charAt(0);
        return c;
    }
    public boolean checkleft(String equation)
    {

            int i=equation.indexOf("(");
            if (i!=-1) {
                return true;
            }
            else {
                return false;
            }

    //    return false;
    }
}
