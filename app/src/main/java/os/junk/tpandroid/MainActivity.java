package os.junk.tpandroid;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
@OptionsMenu(R.menu.menu_main)
public class MainActivity extends AppCompatActivity {
    @ViewById(R.id.toolbar)
    Toolbar toolbar;
    @ViewById(R.id.fab)
    FloatingActionButton fab;

    @Click(R.id.fab)
    void onFabClick(View view){
        // TODO Handle click
    }

    @OptionsItem(R.id.action_settings)
    boolean onSettingClick(){
        Log.d(MAIN_ACTIVITY_LOG, "Settings Click");
        return true;
    }

    @AfterViews
    void init(){
        setSupportActionBar(toolbar);
    }


    private static final String MAIN_ACTIVITY_LOG = "MainActivity";
}
