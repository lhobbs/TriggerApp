package trigger.googlehack.trigger;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;


public class Details extends Activity {

    // Initialize the array
    String[] commentsArray = { "This is a comment", "So is this" };

    // Declare the UI components
    private ListView listView;

    private ArrayAdapter arrayAdapter;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        listView = (ListView) findViewById(R.id.list);

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, commentsArray);

        listView.setAdapter(arrayAdapter);
    }

    public void newComment(){


    }
}
