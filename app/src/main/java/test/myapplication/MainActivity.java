package test.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendToActivity(View view) {
        String inputText = ((EditText) findViewById(R.id.inputText)).getText().toString();

        i = new Intent(this, Main2Activity.class);
        i.putExtra("key",inputText);
        startActivityForResult(i, 300);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 300 && resultCode==RESULT_OK) {
            Toast.makeText(MainActivity.this, data.getStringExtra("resKey"), Toast.LENGTH_SHORT).show();
        }
    }
}

