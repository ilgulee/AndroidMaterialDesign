package ilgulee.com.materialdesignset;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.item1_id){
            Toast.makeText(getApplicationContext(),"item1 is selected",Toast.LENGTH_SHORT).show();
        }else if(id==R.id.item2_id){
            Toast.makeText(getApplicationContext(),"item2 is selected",Toast.LENGTH_SHORT).show();
        }else if(id==R.id.item3_id){
            Toast.makeText(getApplicationContext(),"item3 is selected",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
