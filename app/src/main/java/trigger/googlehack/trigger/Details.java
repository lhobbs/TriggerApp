package trigger.googlehack.trigger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;
import java.util.List;
import android.widget.ListView;


public class Details extends Activity {
    // Initialize the array
    String[] commentsArray = { "This is a comment", "So is this" };

    // Declare the UI components
    private ListView listView;

    private ArrayAdapter arrayAdapter;

    /** Called when the activity is first created.*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        listView = (ListView) findViewById(R.id.list);

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, commentsArray);

        listView.setAdapter(arrayAdapter);
    }
/*
    // Initialize the array
    List<String> commentList = new ArrayList<String>();

    private ExpandableListView listView;
    private ExpandableListAdapter newAdapter;

    /** Called when the activity is first created.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        commentList.add("This is a comment");
        commentList.add("So is this");

        listView = (ExpandableListView) findViewById(R.id.expandList);

        newAdapter = new ExpandableListAdapter(this, android.R.layout.simple_list_item_1, commentList);

        listView.setAdapter(newAdapter);

    }*/

    public void commentBox(View view){


    }
    public void newComment(String comment){
        comment = " ";
        //commentsArray.append(comment);
        Intent intent = new Intent(this, Details.class);
        startActivity(intent);
    }

}
