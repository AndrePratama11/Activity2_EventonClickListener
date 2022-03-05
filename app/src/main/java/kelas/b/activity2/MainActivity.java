package kelas.b.activity2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk Button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan komponen button pada layout
        btnLogin=findViewById(R.id.btSignIn);

        //Menghubungkan variabel edEmail dengan komponen button pada layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edPassword dengan komponen button pada layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnlogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                //menyimpan input user user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda: "+nama+" dan Password anda: "+password+"", Toast.LENGTH_LONG);

                //membuat variabel toast dengan menambah variabel login sukses, password salah, email salah, email dan password salah
                Toast u = Toast.makeText(getApplicationContext(),
                        "Login Sukses",Toast.LENGTH_LONG);
                Toast v = Toast.makeText(getApplicationContext(),
                        "Email Salah",Toast.LENGTH_LONG);
                Toast w = Toast.makeText(getApplicationContext(),
                        "Password salah",Toast.LENGTH_LONG);
                Toast x = Toast.makeText(getApplicationContext(),
                        "Email dan Password Salah",Toast.LENGTH_LONG);

                //menampilkan toast
                t.show();
                u.show();
                v.show();
                w.show();
                x.show();
            }
        });
    }
}