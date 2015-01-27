package com.example.user.sandwiches;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends ActionBarActivity {
    private Button btnPlcOrdr;
    public final String  parameter = "VALUE";
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlcOrdr = (Button) findViewById(R.id.btnPlace);

        btnPlcOrdr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle(getResources().getString(R.string.confirmtitle));
                alertDialogBuilder
                        .setMessage( getResources().getString(R.string.confirmquestion))
                        .setCancelable(false)
                        .setPositiveButton(getResources().getString(R.string.yes), new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                CheckBox chk1 = (CheckBox) findViewById(R.id.chkBacon);
                                CheckBox chk2 = (CheckBox) findViewById(R.id.chkCheese);
                                CheckBox chk3 = (CheckBox) findViewById(R.id.chkLettuce);
                                CheckBox chk4 = (CheckBox) findViewById(R.id.chkOnion);
                                CheckBox chk5 = (CheckBox) findViewById(R.id.chkPepperoni);
                                CheckBox chk6 = (CheckBox) findViewById(R.id.chkTomato);
                                CheckBox chk7 = (CheckBox) findViewById(R.id.chkTurkey);

                                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rgpBreadOptions);
                                int selectedId = radioGroup.getCheckedRadioButtonId();
                                RadioButton radioButton = (RadioButton) findViewById(selectedId);

                                Intent intent = new Intent(getBaseContext(), MainActivity2.class);
                                int k =0;
                                intent.putExtra(parameter + k++, chk1.getText().toString());
                                intent.putExtra(parameter + k++, chk2.getText().toString());
                                intent.putExtra(parameter + k++, chk3.getText().toString());
                                intent.putExtra(parameter + k++, chk4.getText().toString());
                                intent.putExtra(parameter + k++, chk5.getText().toString());
                                intent.putExtra(parameter + k++, chk6.getText().toString());
                                intent.putExtra(parameter + k++, chk7.getText().toString());
                                intent.putExtra(parameter + k++, radioButton.getText().toString());
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton(getResources().getString(R.string.no), new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
