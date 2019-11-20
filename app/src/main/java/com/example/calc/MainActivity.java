package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText2;
    private TextView textView;
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText  = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView  = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);


        Intent intent = new Intent(this, MyClass.class);
        String l = intent.getStringExtra("login");
        String p = i.getStr
        intent.putExtra("login", "Stupid");
        startActivity(intent);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Объявим числовые переменные
                double a,b,c;

                //Считаем с editText и editText2 текстовые значения
                String S1 = editText.getText().toString();
                String S2 = editText2.getText().toString();

                //Преобразуем текстовые переменные в числовые значения
                a = Double.parseDouble(S1);
                b = Double.parseDouble(S2);

                //Проведем с числовыми переменными нужные действия
                c = a + b;

                //Преобразуем ответ в число
                String S = Double.toString(c);

                //Выведем текст в textView
                textView.setText(S);

            }
        });
    }
}
