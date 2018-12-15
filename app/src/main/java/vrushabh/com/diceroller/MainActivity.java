package vrushabh.com.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewdicy;
    private ImageView imageViewdicy2;
    private Button diceButton;
    private Random myRandomNumber=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewdicy =findViewById(R.id.imageView);
        imageViewdicy2 =findViewById(R.id.imageView2);
        diceButton = findViewById(R.id.button);
        diceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollOurDice();
            }
        });
    }
    private void rollOurDice(){
        int myRanNumber = myRandomNumber.nextInt(6)+1;
          switch (myRanNumber){
              case 1:
                  imageViewdicy.setImageResource(R.drawable.dice1);
                  imageViewdicy2.setImageResource(R.drawable.dice1);
                  break;
              case 2:
                  imageViewdicy.setImageResource(R.drawable.dice2);
                  imageViewdicy2.setImageResource(R.drawable.dice2);

                  break;
              case 3:
                  imageViewdicy.setImageResource(R.drawable.dice3);
                  imageViewdicy2.setImageResource(R.drawable.dice3);
                  break;
              case 4:
                  imageViewdicy.setImageResource(R.drawable.dice4);
                  imageViewdicy2.setImageResource(R.drawable.dice4);
                  break;
              case 5:
                  imageViewdicy.setImageResource(R.drawable.dice5);
                  imageViewdicy2.setImageResource(R.drawable.dice5);
                  break;
              case 6:
                  imageViewdicy.setImageResource(R.drawable.dice6);
                  imageViewdicy2.setImageResource(R.drawable.dice6);
                  break;




          }




    }


}
