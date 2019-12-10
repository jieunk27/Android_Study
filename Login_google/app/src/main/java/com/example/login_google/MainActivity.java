package com.example.login_google;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        Button b0 = findViewById(R.id.buttonCall);
        b0.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("MissingPermission")
            public void onClick(View v) {

                Context c = v.getContext();
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:16612642"));

                try {
                    c.startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Button b1 = findViewById(R.id.buttonWeb1);
        b1.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("MissingPermission")
            public void onClick(View v) {

                Context c = v.getContext();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.noiseinfo.or.kr"));

                try {
                    c.startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Button b2 = findViewById(R.id.buttonWeb2);
        b2.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("MissingPermission")
            public void onClick(View v) {

                Context c = v.getContext();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.noiseinfo.or.kr"));

                try {
                    c.startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Button b3 = findViewById(R.id.buttonWeb3);
        b3.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("MissingPermission")
            public void onClick(View v) {

                Context c = v.getContext();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.noiseinfo.or.kr"));

                try {
                    c.startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}

//package com.example.login_google;
//
//        import android.content.Intent;
//        import android.support.annotation.NonNull;
//        import android.support.v7.app.AppCompatActivity;
//        import android.os.Bundle;
//        import android.view.View;
//        import android.widget.Toast;
//
//        import com.google.android.gms.auth.api.Auth;
//        import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
//        import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
//        import com.google.android.gms.auth.api.signin.GoogleSignInResult;
//        import com.google.android.gms.common.ConnectionResult;
//        import com.google.android.gms.common.SignInButton;
//        import com.google.android.gms.common.api.GoogleApiClient;
//        import com.google.android.gms.tasks.OnCompleteListener;
//        import com.google.android.gms.tasks.Task;
//        import com.google.firebase.auth.AuthCredential;
//        import com.google.firebase.auth.AuthResult;
//        import com.google.firebase.auth.FirebaseAuth;
//        import com.google.firebase.auth.GoogleAuthProvider;
//
//public class MainActivity extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener{
//    SignInButton Google_Login;
//    private static final int RC_SIGN_IN = 100;
//    private FirebaseAuth mAuth;
//    private GoogleApiClient mGoogleApiClient;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        //      Intent intent = new Intent(this, CallActivity.class);
////        startActivity(intent);
//        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//                .requestIdToken(getString(R.string.default_web_client_id))
//                .requestEmail()
//                .build();
//        mGoogleApiClient = new GoogleApiClient.Builder(this)
//                .enableAutoManage(this, this)
//                .addApi(Auth.GOOGLE_SIGN_IN_API,gso)
//                .build();
//        mAuth = FirebaseAuth.getInstance();
//        Google_Login = findViewById(R.id.Google_Login);
//        Google_Login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
//                startActivityForResult(signInIntent,RC_SIGN_IN);
//            }
//        });
//    }
//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == RC_SIGN_IN) {
//            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
//            if (result.isSuccess()) {
//                GoogleSignInAccount account = result.getSignInAccount();
//                firebaseAuthWithGoogle(account);
//            }
//            else{
//            }
//        }
//    }
//    private void firebaseAuthWithGoogle(GoogleSignInAccount acct){
//        AuthCredential credential = GoogleAuthProvider.getCredential(acct.getIdToken(),null);
//        mAuth.signInWithCredential(credential)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if(!task.isSuccessful()){
//                            Toast.makeText(MainActivity.this, "인증 실패", Toast.LENGTH_SHORT).show();
//                        }else{
//                            Toast.makeText(MainActivity.this, "구글 로그인 인증 성공", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
//    }
//    @Override
//    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
//    }
//}