package com.hobyles.hobyles;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Patterns;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

public class MainActivity extends Activity {
public static String URL="https://hobyles-d7b5c.firebaseio.com/";
    public Database mDatabase;

    
    private EditText tvIme;
    private EditText tvPrezime;
    private  EditText tvTelefon;
    private  EditText tvEmail;

    private TextView tvgodine25;
    private TextView tvgodine35;
    private TextView tvgodine45;
    private TextView tvgodine55;
    private TextView tvgodine56;

    private  TextView tvTrgovina1;
    private  TextView tvTrgovina2;
    private  TextView tvTrgovina3;
    private  TextView tvTrgovina4;
    private  TextView tvTrgovina5;

    private  TextView tvArtikal1;
    private  TextView tvArtikal2;
    private  TextView tvArtikal3;


    private TextView tvZenski;
    private TextView tvMuski;

    private RelativeLayout root;

    private Button button;
    private Button button2;

    public String godine;
    public String mesto;
    public String artikli;
    public String pol;
    private ImageView mIvLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        initComponents();
        addListneres();
    }

    public static void hideSoftKeyboard(Activity activity) {
        InputMethodManager inputMethodManager =
                (InputMethodManager) activity.getSystemService(
                        Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(
                activity.getCurrentFocus().getWindowToken(), 0);
    }
    private boolean isValidEmail(String email) {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        return pattern.matcher(email).matches();
    }

    private void initComponents() {
        Firebase.setAndroidContext(this);

        root= (RelativeLayout) findViewById(R.id.root);
        tvIme=(EditText)findViewById(R.id.textViewIme);
        tvPrezime=(EditText)findViewById(R.id.textViewPrezime);
        tvTelefon=(EditText)findViewById(R.id.textViewTelefon);
        tvEmail=(EditText)findViewById(R.id.textViewEmail);

        mIvLogo=(ImageView)findViewById(R.id.imageView);

        tvgodine25=(TextView)findViewById(R.id.textViewGodine1);
        tvgodine35=(TextView)findViewById(R.id.textViewGodine2);
        tvgodine45=(TextView)findViewById(R.id.textViewGdoine3);
        tvgodine55=(TextView)findViewById(R.id.textViewGodine4);
        tvgodine56=(TextView)findViewById(R.id.textViewGodine5);

        tvTrgovina1=(TextView)findViewById(R.id.textViewMesto1);
        tvTrgovina2=(TextView)findViewById(R.id.textViewMesto2);
        tvTrgovina3=(TextView)findViewById(R.id.textViewMesto3);
        tvTrgovina4=(TextView)findViewById(R.id.textViewMesto4);
        tvTrgovina5=(TextView)findViewById(R.id.textViewMesto5);

        tvArtikal1=(TextView)findViewById(R.id.textViewOpcija1);
        tvArtikal2=(TextView)findViewById(R.id.textViewOpcija2);
        tvArtikal3=(TextView)findViewById(R.id.textViewOpcija3);

        tvZenski=(TextView)findViewById(R.id.textViewYenski);
        tvMuski=(TextView)findViewById(R.id.textViewMoski);

        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
    }

    private void addListneres() {
mIvLogo.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

        //AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();

        // Setting Dialog Title
        alertDialog.setTitle("PASSWORD");

        // Setting Dialog Message
        alertDialog.setMessage("Enter Password");
        final EditText input = new EditText(getApplicationContext());
        input.setTextColor(Color.BLACK);
        alertDialog.setView(input);

        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.logohoby);

        // Setting Positive "Yes" Button
        alertDialog.setPositiveButton("YES",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int which) {
                       if(input.getText().toString().equalsIgnoreCase("1995")) {
                        Intent callGPSSettingIntent = getPackageManager().getLaunchIntentForPackage("com.carp.HomeManager");
                        startActivity(callGPSSettingIntent);
                    }

                    }
                });
        // Setting Negative "NO" Button
        alertDialog.setNegativeButton("NO",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Write your code here to execute after dialog
                        dialog.cancel();
                    }
                });

        // closed

        // Showing Alert Message
        alertDialog.show();
    }

});
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideSoftKeyboard(MainActivity.this);
            }
        });
        tvgodine25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                godine=tvgodine25.getText().toString();
                tvgodine25.setTextColor(getResources().getColor(R.color.orange_color));
                tvgodine35.setTextColor(getResources().getColor(R.color.color_text));
                tvgodine45.setTextColor(getResources().getColor(R.color.color_text));
                tvgodine55.setTextColor(getResources().getColor(R.color.color_text));
                tvgodine56.setTextColor(getResources().getColor(R.color.color_text));
                hideSoftKeyboard(MainActivity.this);

            }
        });
        tvgodine35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                godine=tvgodine35.getText().toString();
                tvgodine35.setTextColor(getResources().getColor(R.color.orange_color));
                tvgodine25.setTextColor(getResources().getColor(R.color.color_text));
                tvgodine45.setTextColor(getResources().getColor(R.color.color_text));
                tvgodine55.setTextColor(getResources().getColor(R.color.color_text));
                tvgodine56.setTextColor(getResources().getColor(R.color.color_text));
                hideSoftKeyboard(MainActivity.this);
            }
        });
        tvgodine45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                godine=tvgodine45.getText().toString();
                hideSoftKeyboard(MainActivity.this);
                tvgodine45.setTextColor(getResources().getColor(R.color.orange_color));
                tvgodine35.setTextColor(getResources().getColor(R.color.color_text));
                tvgodine25.setTextColor(getResources().getColor(R.color.color_text));
                tvgodine55.setTextColor(getResources().getColor(R.color.color_text));
                tvgodine56.setTextColor(getResources().getColor(R.color.color_text));
            }
        });
        tvgodine55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                godine=tvgodine55.getText().toString();
                hideSoftKeyboard(MainActivity.this);
                tvgodine55.setTextColor(getResources().getColor(R.color.orange_color));
                tvgodine35.setTextColor(getResources().getColor(R.color.color_text));
                tvgodine45.setTextColor(getResources().getColor(R.color.color_text));
                tvgodine25.setTextColor(getResources().getColor(R.color.color_text));
                tvgodine56.setTextColor(getResources().getColor(R.color.color_text));
            }
        });
        tvgodine56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                godine=tvgodine56.getText().toString();
                hideSoftKeyboard(MainActivity.this);
                tvgodine56.setTextColor(getResources().getColor(R.color.orange_color));
                tvgodine35.setTextColor(getResources().getColor(R.color.color_text));
                tvgodine45.setTextColor(getResources().getColor(R.color.color_text));
                tvgodine55.setTextColor(getResources().getColor(R.color.color_text));
                tvgodine25.setTextColor(getResources().getColor(R.color.color_text));
            }
        });

        tvTrgovina1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesto="Škofja Vas";
                tvTrgovina1.setTextColor(getResources().getColor(R.color.orange_color));
                tvTrgovina2.setTextColor(getResources().getColor(R.color.color_text));
                tvTrgovina3.setTextColor(getResources().getColor(R.color.color_text));
                tvTrgovina4.setTextColor(getResources().getColor(R.color.color_text));
                tvTrgovina5.setTextColor(getResources().getColor(R.color.color_text));
                hideSoftKeyboard(MainActivity.this);
            }
        });

        tvTrgovina2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesto="Maribor";
                tvTrgovina2.setTextColor(getResources().getColor(R.color.orange_color));
                tvTrgovina1.setTextColor(getResources().getColor(R.color.color_text));
                tvTrgovina3.setTextColor(getResources().getColor(R.color.color_text));
                tvTrgovina4.setTextColor(getResources().getColor(R.color.color_text));
                tvTrgovina5.setTextColor(getResources().getColor(R.color.color_text));
                hideSoftKeyboard(MainActivity.this);
            }
        });

        tvTrgovina3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesto="Slovenske Konjice";
                tvTrgovina3.setTextColor(getResources().getColor(R.color.orange_color));
                tvTrgovina2.setTextColor(getResources().getColor(R.color.color_text));
                tvTrgovina1.setTextColor(getResources().getColor(R.color.color_text));
                tvTrgovina4.setTextColor(getResources().getColor(R.color.color_text));
                tvTrgovina5.setTextColor(getResources().getColor(R.color.color_text));
                hideSoftKeyboard(MainActivity.this);
            }
        });
        tvTrgovina4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesto="Nazarje";
                tvTrgovina4.setTextColor(getResources().getColor(R.color.orange_color));
                tvTrgovina2.setTextColor(getResources().getColor(R.color.color_text));
                tvTrgovina3.setTextColor(getResources().getColor(R.color.color_text));
                tvTrgovina1.setTextColor(getResources().getColor(R.color.color_text));
                tvTrgovina5.setTextColor(getResources().getColor(R.color.color_text));
                hideSoftKeyboard(MainActivity.this);
            }

        });
        tvTrgovina5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesto="Šmarje pri Jelšah";
                tvTrgovina5.setTextColor(getResources().getColor(R.color.orange_color));
                tvTrgovina2.setTextColor(getResources().getColor(R.color.color_text));
                tvTrgovina3.setTextColor(getResources().getColor(R.color.color_text));
                tvTrgovina4.setTextColor(getResources().getColor(R.color.color_text));
                tvTrgovina1.setTextColor(getResources().getColor(R.color.color_text));
                hideSoftKeyboard(MainActivity.this);
            }
        });
        tvArtikal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                artikli="Novo pohištvo";
                tvArtikal1.setTextColor(getResources().getColor(R.color.orange_color));
                tvArtikal2.setTextColor(getResources().getColor(R.color.color_text));
                tvArtikal3.setTextColor(getResources().getColor(R.color.color_text));
                hideSoftKeyboard(MainActivity.this);
            }
        });
        tvArtikal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                artikli="Repromaterial za obnovo starega pohištva";
                tvArtikal2.setTextColor(getResources().getColor(R.color.orange_color));
                tvArtikal3.setTextColor(getResources().getColor(R.color.color_text));
                tvArtikal1.setTextColor(getResources().getColor(R.color.color_text));
                hideSoftKeyboard(MainActivity.this);
            }
        });
        tvArtikal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                artikli="Repromaterial za izdelavo novega pohištva";
                tvArtikal3.setTextColor(getResources().getColor(R.color.orange_color));
                tvArtikal2.setTextColor(getResources().getColor(R.color.color_text));
                tvArtikal1.setTextColor(getResources().getColor(R.color.color_text));
                hideSoftKeyboard(MainActivity.this);
            }
        });
        tvZenski.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pol=tvZenski.getText().toString();
                tvZenski.setTextColor(getResources().getColor(R.color.orange_color));
                tvMuski.setTextColor(getResources().getColor(R.color.color_text));
                hideSoftKeyboard(MainActivity.this);
            }
        });
        tvMuski.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pol=tvMuski.getText().toString();
                tvMuski.setTextColor(getResources().getColor(R.color.orange_color));
                tvZenski.setTextColor(getResources().getColor(R.color.color_text));
                hideSoftKeyboard(MainActivity.this);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideSoftKeyboard(MainActivity.this);
                if(!tvIme.getText().toString().equals("")) {
                    if (!tvPrezime.getText().toString().equals("")) {
                        if(!tvEmail.getText().toString().equals("")) {
                            if(isValidEmail(tvEmail.getText().toString())) {
                        Firebase ref = new Firebase(URL);
                        Record record = new Record();
                                record.ime = tvIme.getText().toString();
                        record.priimek = tvPrezime.getText().toString();
                        record.email = tvEmail.getText().toString();
                        record.telefon = tvTelefon.getText().toString();
                        record.pol = pol;
                        record.trgovina = mesto;
                        record.segment_artiklov = artikli;
                        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss", Locale.UK);
                        String time = sdf.format(new Date());
                        record.datum = time;
                                record.starost=godine;


                        ref.child(record.datum + " " + record.ime + " " + record.priimek).setValue(record);
                        Toast.makeText(getApplicationContext(), "Posredovano", Toast.LENGTH_SHORT).show();
                                finish();
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    }
                      else  {
                                Toast.makeText(getApplicationContext(), "Niste vnesli pravilen e-mail", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else  {
                            Toast.makeText(getApplicationContext(), "Niste vnesli potrebnih podatkov", Toast.LENGTH_SHORT).show();
                        } }else  {
                        Toast.makeText(getApplicationContext(), "Niste vnesli potrebnih podatkov", Toast.LENGTH_SHORT).show();
                    }}else  {
                    Toast.makeText(getApplicationContext(), "Niste vnesli potrebnih podatkov", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideSoftKeyboard(MainActivity.this);
                finish();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {

    }


}
