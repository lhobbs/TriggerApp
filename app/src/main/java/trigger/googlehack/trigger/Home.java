package trigger.googlehack.trigger;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;


public class Home extends MainActivity {

    static TextView currPost;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String currentPost = "Default Post";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            currentPost = extras.getString("myPost");
        }
        currPost = (TextView) findViewById(R.id.textView);
        currPost.setText(currentPost);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        //getMenuInflater().inflate(R.menu.home, menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home, menu);
        return super.onCreateOptionsMenu(menu);
        //return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.new_post){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    /** Called when the user clicks the view button */
    public void  details(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Details.class);
        startActivity(intent);
    }

    /** Called when the user clicks the ignore button */
    public void  ignore(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    /** Called when the user clicks the add button */
    public void  newPost(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Add.class);
        intent.putExtra("myPost", "A New Post");
        startActivity(intent);
    }

}
