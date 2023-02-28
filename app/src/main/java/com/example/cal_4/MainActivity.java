package com.example.cal_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);
    }

    private void updateText(String strToAdd){
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(0, cursorPos);
        if(getString(R.string.display).equals(display.getText().toString())){
            display.setText(strToAdd);
            display.setSelection(cursorPos + 1);
        }else{
            display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
            display.setSelection(cursorPos + 1);
        }

    }

    public void button_zero(View view){
        updateText("0");
    }
    public void button_one(View view){
        updateText("1");
    }
    public void button_two(View view){
        updateText("2");
    }
    public void button_tree(View view){
        updateText("3");
    }
    public void button_four(View view){
        updateText("4");
    }
    public void button_five(View view){
        updateText("5");
    }
    public void button_six(View view){
        updateText("6");
    }
    public void button_eight(View view){
        updateText("8");
    }
    public void button_seven(View view){
        updateText("7");
    }
    public void button_nine(View view){
        updateText("9");
    }
    public void button_backspace(View view){
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();

        if(cursorPos != 0 && textLen != 0){
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursorPos -1, cursorPos, "");
            display.setText(selection);
            display.setSelection(cursorPos -1);
        }
    }
    public void button_clear(View view){
        display.setText("0");
    }
    public void button_clear2(View view){
        display.setText("0");
    }
    /*public void button_exponent(View view){
        updateText("0");
    }*/
    public void button_divide(View view){
        updateText("÷");
    }
    public void button_multiply(View view){
        updateText("×");
    }
    public void button_add(View view){
        updateText("+");
    }
    public void button_subtract(View view){
        updateText("-");
    }
    public void button_plusMinus(View view){

    }
    /*public void button_point(View view){
        updateText(".");
    }*/
    public void button_equals(View view){

    }
    public void button_virgul(View view){
        updateText(",");
    }
    public void button_percent(View view){

    }
    public void button_reverse(View view){

    }
    public void button_square(View view){

    }
    public void button_squareroot(View view){

    }

}