package com.sreedwish.brainsaitask.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import com.sreedwish.brainsaitask.R;
import com.sreedwish.brainsaitask.databinding.ActivityMainBinding;


public class LoginActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        context = this;

        init();
    }

    private void init(){

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = binding.edtEmail.getText().toString();
                String password = binding.edtPassword.getText().toString();

                if (!isValidEmail(email)){
                    Toast.makeText(context,getString(R.string.msg_enter_valid_email),Toast.LENGTH_SHORT).show();
                    return;
                }


                if (TextUtils.isEmpty(password)){
                    Toast.makeText(context,getString(R.string.msg_enter_password),Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = new Intent(context,Setup.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK );
                startActivity(intent);


            }
        });

    }

    private boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

}
