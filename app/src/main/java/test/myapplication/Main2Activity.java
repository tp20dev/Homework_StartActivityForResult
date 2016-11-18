package test.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        i = getIntent();
        Toast.makeText(this, i.getStringExtra("key"), Toast.LENGTH_SHORT).show();
    }

    public void sendResult(View view) {
        i.putExtra("resKey", ((EditText) findViewById(R.id.inputText)).getText().toString());
        setResult(RESULT_OK, i);
        finish();
    }

}
