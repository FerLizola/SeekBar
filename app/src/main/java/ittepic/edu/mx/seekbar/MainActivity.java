package ittepic.edu.mx.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    SeekBar skb_num;
    TextView txt_res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        skb_num= (SeekBar) findViewById(R.id.skbNum);
        txt_res=(TextView) findViewById(R.id.textView2);
        skb_num.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txt_res.setText("Resultado:");
                int num = skb_num.getProgress();

                for(int a=0;a<10;a++){
                    txt_res.setText(txt_res.getText()+"\n"+num+" x "+a+" = "+(a*num));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
