package sg.edu.rp.c346.task1a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

public class WallPaperReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
//        Task 1a
//        Toast.makeText(context,"You have changed the wallpaper" ,Toast.LENGTH_LONG).show();

        //Task 1b
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
        int pos = sharedPref.getInt("id", R.id.radioButtonGood);
        if (pos == R.id.radioButtonGood){
            Toast my_toast = Toast.makeText(context,R.string.good ,Toast.LENGTH_LONG);
            my_toast.show();
        } else {
            Toast my_toast = Toast.makeText(context,R.string.bad ,Toast.LENGTH_LONG);
            my_toast.show();
        }
    }
}
