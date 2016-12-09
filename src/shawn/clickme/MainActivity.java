/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shawn.clickme;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
/**
 *
 * @author Spartacus Rex
 */
public class MainActivity extends Activity {

	private Button toggle;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        // ToDo add your GUI initialization code here
        setContentView(R.layout.main);
		init();	

    }
	public void init(){
		initToggle();
	
	}
	public void initToggle(){
		toggle=(Button)findViewById(R.id.toggle);
		toggle.setTag(new Integer(0));
		toggle.setText("hello click");
		toggle.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Integer myTag=(Integer)toggle.getTag();
				if(myTag.equals(0)){
					toggle.setTag(new Integer(1));
					toggle.setText("Y");
				}else{
					toggle.setTag(new Integer(0));
					toggle.setText("X");
				}
			}
		});

	}
}
