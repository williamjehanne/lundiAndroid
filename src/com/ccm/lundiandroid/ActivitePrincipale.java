package com.ccm.lundiandroid;

import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivitePrincipale extends Activity {

	private TextView leTextView;
	private Button leBouton;
	private Date laDate = new Date();
	
	View.OnClickListener leBoutonListener; 
    
	public void afficher_bla(View v) {
			leTextView.setText("blaaa");
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite_principale);
        
        leTextView = (TextView) findViewById(R.id.textView3);
        leBouton = (Button) findViewById(R.id.button1);
			
		leBoutonListener = new View.OnClickListener() {	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				leTextView.setText("Bloop");
				reactionAuClickBouton();
			}

			private void reactionAuClickBouton() {
				// TODO Auto-generated method stub
				laDate.setTime(System.currentTimeMillis());
				leTextView.setText(
						laDate.getHours()+"H"+
						laDate.getMinutes()+"Min"+
						laDate.getSeconds()+"s");
			}
			
			
		};
		leBouton.setOnClickListener(leBoutonListener);
    }
}
