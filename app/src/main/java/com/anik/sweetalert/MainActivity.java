package com.anik.sweetalert;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.gitonway.lee.niftymodaldialogeffects.lib.NiftyDialogBuilder;

import static com.gitonway.lee.niftymodaldialogeffects.lib.Effectstype.Fliph;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    NiftyDialogBuilder dialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick=(Button)findViewById(R.id.btn_click);

        dialogBuilder=NiftyDialogBuilder.getInstance(this);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialogBuilder
                        .withTitle("Modal Dialog")
                        .withMessage("This is a modal Dialog.")
                        .withEffect(Fliph)
                        .withDialogColor("#3F51B5") //use color code for dialog
                        .withIcon(getResources().getDrawable(R.mipmap.ic_launcher_round))
                        .withButton1Text("OK")
                        .withButton2Text("Cancel")
                        .setButton1Click(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(v.getContext(), "OK", Toast.LENGTH_SHORT).show();
                                dialogBuilder.dismiss();
                            }
                        })
                        .setButton2Click(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(v.getContext(),"Cancel",Toast.LENGTH_SHORT).show();
                                dialogBuilder.dismiss();
                            }
                        })
                        .show();
            }
        });

    }
}
