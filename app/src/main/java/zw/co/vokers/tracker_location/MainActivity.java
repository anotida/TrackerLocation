package zw.co.vokers.tracker_location;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button startTrackingBtn = findViewById(R.id.startTrackingBtn);
        final Button viewLocationBtn = findViewById(R.id.viewLocationBtn);

        final TextView viewlocationText = findViewById(R.id.locationsText);

        startTrackingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("View", "Start tracking location ...");
                Toast toast = Toast.makeText(v.getContext(), "Start tracking location.", Toast.LENGTH_SHORT);
                toast.show();

            }
        });
        viewLocationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("View", "View tracking location ...");
                Toast toast = Toast.makeText(v.getContext(), "+9023902340290, -430430940940349000", Toast.LENGTH_LONG);
                toast.show();
                viewlocationText.setText("+9023902340290, -430430940940349000");

            }
        });
    }
}
