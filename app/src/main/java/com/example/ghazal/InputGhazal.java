package com.example.ghazal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class InputGhazal extends AppCompatActivity {
    TextInputEditText t1;
    TextView t2,t3,t4,t5,t6,t7,t8,t9,t10;
    TextView t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22;
    String c,d,e;
    double z;
    int backpress = 0;
    private long pressedTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_ghazal);


        //get and set text
        t1=(TextInputEditText) findViewById(R.id.gett);
        t2=(TextView) findViewById(R.id.sett);
        t3=(TextView) findViewById(R.id.acc);
        t4=(TextView) findViewById(R.id.acc1);
        t5=(TextView) findViewById(R.id.acc2);
        t6=(TextView) findViewById(R.id.acc3);
        t7=(TextView) findViewById(R.id.acc4);
        t8=(TextView) findViewById(R.id.acc5);
        t9=(TextView) findViewById(R.id.acc6);
        t10=(TextView) findViewById(R.id.acc7);
        t11=(TextView) findViewById(R.id.acc8);
        t12=(TextView) findViewById(R.id.acc9);
        t13=(TextView) findViewById(R.id.acc10);
        t14=(TextView) findViewById(R.id.acc11);
        t15=(TextView) findViewById(R.id.acc12);
        t16=(TextView) findViewById(R.id.acc13);
        t17=(TextView) findViewById(R.id.acc14);
        t18=(TextView) findViewById(R.id.acc15);
        t19=(TextView) findViewById(R.id.acc16);
        t20=(TextView) findViewById(R.id.acc17);
        t21=(TextView) findViewById(R.id.acc18);


        Button b1=(Button) findViewById(R.id.but);
        Button b2=(Button) findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(InputGhazal.this,MainActivity.class);
                startActivity(i2);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String t=t1.getText().toString();
                System.out.println(t);
                t2.setText(check());
                t3.setText(String.valueOf(compareStringsPercentage(c,"122122122122"))+"%");
                t4.setText(String.valueOf(compareStringsPercentage(c,"212212212212"))+"%");
                t5.setText(String.valueOf(compareStringsPercentage(c,"2212221222122212"))+"%");
                t6.setText(String.valueOf(compareStringsPercentage(c,"1222122212221222"))+"%");
                t7.setText(String.valueOf(compareStringsPercentage(c,"212221222122212"))+"%");
                t8.setText(String.valueOf(compareStringsPercentage(c,"11212112121121211212"))+"%");
                t9.setText(String.valueOf(compareStringsPercentage(c,"12112121121211212112"))+"%");
                t10.setText(String.valueOf(compareStringsPercentage(c,"12212221221222"))+"%");
                t11.setText(String.valueOf(compareStringsPercentage(c,"21222122122212"))+"%");
                t12.setText(String.valueOf(compareStringsPercentage(c,"22122122212212"))+"%");
                t13.setText(String.valueOf(compareStringsPercentage(c,"1222212212222122"))+"%");
                t14.setText(String.valueOf(compareStringsPercentage(c,"2221221222212212"))+"%");
                t15.setText(String.valueOf(compareStringsPercentage(c,"2212212222122122"))+"%"); //13
                t16.setText(String.valueOf(compareStringsPercentage(c,"2212222122122221"))+"%");
                t17.setText(String.valueOf(compareStringsPercentage(c,"221222122221"))+"%");  //15
                t18.setText(String.valueOf(compareStringsPercentage(c,"212221222212"))+"%");
                t19.setText(String.valueOf(compareStringsPercentage(c,"122212222122"))+"%");
                t20.setText(String.valueOf(compareStringsPercentage(c,"212222122122"))+"%");
                t21.setText(String.valueOf(compareStringsPercentage(c,"212212221222"))+"%");

            }
        });
    }
    public String check(){
        Map<Integer, String> indexOfChand = new HashMap<Integer, String>();
        Map<Integer, String> lagastring = new HashMap<Integer, String>();
        indexOfChand.put(1, "મુતકારિબ");
        lagastring.put(1, "122122122122");
        indexOfChand.put(2, "મુતદારિક");
        lagastring.put(2, "212212212212");
        indexOfChand.put(3, "રજઝ");
        lagastring.put(3, "2212221222122212");
        indexOfChand.put(4, "હઝજ");
        lagastring.put(4, "1222122212221222");
        indexOfChand.put(5, "રમલ");
        lagastring.put(5, "212221222122212");
        indexOfChand.put(6, "કામિલ");
        lagastring.put(6, "11212112121121211212");
        indexOfChand.put(7, "વાફિર");
        lagastring.put(7, "12112121121211212112");
        indexOfChand.put(8, "વાફિર");
        lagastring.put(8, "12212221221222");
        indexOfChand.put(9, "મદીદ");
        lagastring.put(9, "21222122122212");
        indexOfChand.put(10, "બસીત");
        lagastring.put(10, "22122122212212");
        indexOfChand.put(11, "મઝારિઅ");
        lagastring.put(11, "1222212212222122");
        indexOfChand.put(12, "મુક્તઝિબ");
        lagastring.put(12, "2221221222212212");
        indexOfChand.put(13, "મુજતસ");
        lagastring.put(13, "2212212222122122");
        indexOfChand.put(14, "મનસરિહ");
        lagastring.put(14, "2212222122122221");
        indexOfChand.put(15, "સરીઅ");
        lagastring.put(15, "221222122221");
        indexOfChand.put(16, "જદીદ");
        lagastring.put(16, "212221222212");
        indexOfChand.put(17, "કરીબ");
        lagastring.put(17, "122212222122");
        indexOfChand.put(18, "ખફીફ");
        lagastring.put(18, "212222122122");
        indexOfChand.put(19, "મશાકિલ");
        lagastring.put(19, "212212221222");
        String output = "";
        String s = t1.getText().toString();
        String[] arr = s.split(" ");
            for (String gg : arr) {
                Stack<Character> stack = new Stack<Character>();
                char top, below;
                for (int i = gg.length() - 1; i >= 0; i--) {
                    stack.push(gg.charAt(i));
                }
                while (stack.size()!=0) {
                    if (stack.size() == 1) {
                        output += "1";
                        stack.pop();
                    } else {
                        top = stack.pop();   // taking next single letter
                        String tops = new String(Character.toString(top));
                        int topcodepooint = tops.codePointAt(0);
                        below = stack.pop(); // taking second letter usully matra
                        String bots = new String(Character.toString(below));
                        int botcodepooint = bots.codePointAt(0);
                        if (topcodepooint >= 2709 && topcodepooint <= 2745 && botcodepooint >= 2709 && botcodepooint <= 2745) { // ye agar simple letter ho to
                            output += "1";  // in this case both first and second are simple letter see same range of byte code
                            stack.push(below);
                        }else if(topcodepooint==2693||topcodepooint==2695||topcodepooint==2697){ //aa aa ae nu che
                            output += "1";
                            stack.push(below);
                        }else if(topcodepooint==2694||topcodepooint==2696||topcodepooint==2698||topcodepooint==2699||topcodepooint==2784||topcodepooint==2701||topcodepooint==2703||topcodepooint==2704||topcodepooint==2705||topcodepooint==2707||topcodepooint==2708){ //aa aa ae nu che
                            output += "2";
                            stack.push(below);
                        }else if(botcodepooint==2751||botcodepooint==2753){ // ki ku nu che dual code is considered
                            output += "1";
                        }else{
                            output+="2";  // this is for rest case
                        }
                    }
                }
//            output += "*";   // desi debugging and easy reading ability
            }

            int resindex=0;
            for (Map.Entry<Integer,String > e : lagastring.entrySet()){   // t iterate over map
                if (e.getValue().equals(output)){
                    System.out.println("match found");
                    resindex=e.getKey();
                    break;
                }
            }
           // c= Integer.toString(resindex);
           System.out.println(output);
            c= output;
            d = lagastring.get(resindex);
            System.out.println(d);;
           // System.out.println(resindex);
           // System.out.println(indexOfChand.get(resindex));
            return indexOfChand.get(resindex);
    }

    public static int compareStringsPercentage(String s1, String s2) {
        int percentage = 0;

        int total = 0;
        int fullMatch = 0;
        // Check for each character at same location
        total += charMatch(s1, s2);
        fullMatch += charMatch(s1, s1);

        // Calc percentage
        percentage = (int) Math.round(total / (fullMatch / 100.0));
        System.out.println(percentage);
        return (percentage);
    }
    private static int charMatch(String s1, String s2) {
        char[] as1 = s1.toCharArray();
        char[] as2 = s2.toCharArray();
        int match = 0;
        for (int i = 0; i < as1.length; i++) {
            char c = as1[i];
            if (i < as2.length) {
                if (as2[i] == c) {
                    match++;
                }
            }
        }
        return match;
    }
    public void onBackPressed(){
        moveTaskToBack(false);
        if (pressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }
}