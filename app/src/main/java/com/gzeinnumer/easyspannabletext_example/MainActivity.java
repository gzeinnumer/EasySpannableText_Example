package com.gzeinnumer.easyspannabletext_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

import com.gzeinnumer.est.SpannableBuilder;
import com.gzeinnumer.est.SpannableCallBack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noOnClick();
    }

    private void noOnClick() {
        TextView textView = findViewById(R.id.tv);

        int sizeInDp = 21;
        int color = ContextCompat.getColor(this, R.color.purple_500);

        CharSequence sequence = new SpannableBuilder(getApplicationContext())
                .text(Typeface.NORMAL, "text\n")
                .textColor(Typeface.BOLD, "textColor\n", color)
                .textSize(Typeface.ITALIC, "textSize\n", sizeInDp)
                .textSizeColor(Typeface.BOLD_ITALIC, "textSizeColor\n", sizeInDp, color)
                .build();
        textView.setText(sequence);
//        textView.setText(sequence, TextView.BufferType.SPANNABLE);
    }
}