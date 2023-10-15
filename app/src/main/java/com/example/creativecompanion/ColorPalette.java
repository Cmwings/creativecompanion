package com.example.creativecompanion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import yuku.ambilwarna.AmbilWarnaDialog;

public class ColorPalette extends AppCompatActivity {

    //this color wheel is was originally designed by ambilwarna
    //the library was found in the Android Library bible

    private TextView gfgTextView;


    private View mColorPreview;


    private int mDefaultColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_palette);


        gfgTextView = findViewById(R.id.gfg_heading);


        Button mPickColorButton = findViewById(R.id.pick_color_button);
        Button mSetColorButton = findViewById(R.id.set_color_button);


        mColorPreview = findViewById(R.id.preview_selected_color);


        mDefaultColor = 0;


        mPickColorButton.setOnClickListener(
                v -> openColorPickerDialogue());


        mSetColorButton.setOnClickListener(
                v -> gfgTextView.setTextColor(mDefaultColor));}

    public void openColorPickerDialogue() {

        final AmbilWarnaDialog colorPickerDialogue = new AmbilWarnaDialog(this, mDefaultColor,
                new AmbilWarnaDialog.OnAmbilWarnaListener() {
                    @Override
                    public void onCancel(AmbilWarnaDialog dialog) {
                    }

                    @Override
                    public void onOk(AmbilWarnaDialog dialog, int color) {
                        mDefaultColor = color;

                        mColorPreview.setBackgroundColor(mDefaultColor);
                    }
                });
        colorPickerDialogue.show();
    }
}