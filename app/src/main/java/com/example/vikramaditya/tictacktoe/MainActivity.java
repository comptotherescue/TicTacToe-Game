package com.example.vikramaditya.tictacktoe;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends ActionBarActivity {


    Button[] b;
    TextView t;
    String usr="x";
    int val[][];
    int ck[][];
    boolean play,won;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val=new int[3][3];
        ck=new int[3][3];
        b=new Button[11];
        play=true;
        won=false;
        b[1]=(Button)findViewById(R.id.b1);
        b[2]=(Button)findViewById(R.id.b2);
        b[3]=(Button)findViewById(R.id.b3);
        b[4]=(Button)findViewById(R.id.b4);
        b[5]=(Button)findViewById(R.id.b5);
        b[6]=(Button)findViewById(R.id.b6);
        b[7]=(Button)findViewById(R.id.b7);
        b[8]=(Button)findViewById(R.id.b8);
        b[9]=(Button)findViewById(R.id.b9);
        b[10]=(Button)findViewById(R.id.b10);
        t=(TextView)findViewById(R.id.t2);
        init();

        b[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (play == true) {
                    for (int i = 1; i < 10; i++) {
                        b[i].setText("");
                        b[i].setEnabled(true);
                    }
                    init();
                    t.setText("");
                    won=false;
                }
            }
        });
        b[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(play==true) {
                    ck[0][0] = 1;
                    val[0][0]=-2;
                    b[1].setText(usr);
                    reval(0, 0);
                    b[1].setEnabled(false);
                    checkwinner();
                    myturn();
                }
            }
        });
        b[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(play==true) {
                    ck[0][1] = 1;
                    val[0][1]=-2;
                    b[2].setText(usr);
                    reval(0, 1);
                    b[2].setEnabled(false);
                    checkwinner();
                    myturn();
                }
            }
        });
        b[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(play==true) {
                    ck[0][2] = 1;
                    val[0][2]=-2;
                    b[3].setText(usr);
                    reval(0, 2);
                    b[3].setEnabled(false);
                    checkwinner();
                    myturn();
                }
            }
        });
        b[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(play==true) {
                    ck[1][0] = 1;
                    val[1][0]=-2;
                    b[4].setText(usr);
                    reval(1, 0);
                    b[4].setEnabled(false);
                    checkwinner();
                    myturn();
                }
            }
        });
        b[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(play==true) {
                    ck[1][1] = 1;
                    val[1][1]=-2;
                    b[5].setText(usr);
                    reval(1, 1);
                    b[5].setEnabled(false);
                    checkwinner();
                    myturn();
                }
            }
        });
        b[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(play==true) {
                    ck[1][2] = 1;
                    val[1][2]=-2;
                    b[6].setText(usr);
                    reval(1, 2);
                    b[6].setEnabled(false);
                    checkwinner();
                    myturn();
            }
            }
        });
        b[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(play==true) {
                    ck[2][0] = 1;
                    val[2][0]=-2;
                    b[7].setText(usr);
                    reval(2, 0);
                    b[7].setEnabled(false);
                    checkwinner();
                    myturn();
                }
            }
        });
        b[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(play==true) {
                    ck[2][1] = 1;
                    val[2][1]=-2;
                    b[8].setText(usr);
                    reval(2, 1);
                    b[8].setEnabled(false);
                    checkwinner();
                    myturn();
                }
            }
        });
        b[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(play==true) {
                    ck[2][2] = 1;
                    val[2][2]=-2;
                    b[9].setText(usr);
                    reval(2, 2);
                    b[9].setEnabled(false);
                    checkwinner();
                    myturn();
                }
            }

        });

    }

    private void checkwinner() {
        play=false;
        if(ck[0][0]==1&&ck[0][1]==1&&ck[0][2]==1){
            t.setText("X is the winner!!");
            disable();
        }
        else if(ck[1][0]==1&&ck[1][1]==1&&ck[1][2]==1){
                 t.setText("X is the winner!!");
            disable();
        }
        else if(ck[2][0]==1&&ck[2][1]==1&&ck[2][2]==1){
            t.setText("X is the winner!!");
            disable();
        }
        else if(ck[0][0]==1&&ck[1][0]==1&&ck[2][0]==1){
            t.setText("X is the winner!!");
            disable();
        }
        else if(ck[0][1]==1&&ck[1][1]==1&&ck[2][1]==1){
            t.setText("X is the winner!!");
            disable();
        }
        else if(ck[0][2]==1&&ck[1][2]==1&&ck[2][2]==1){
            t.setText("X is the winner!!");
            disable();
        }
        else if(ck[0][0]==1&&ck[1][1]==1&&ck[2][2]==1){
            t.setText("X is the winner!!");
            disable();
        }
        else if(ck[0][2]==1&&ck[1][1]==1&&ck[2][0]==1){
            t.setText("X is the winner!!");
            disable();
        }
        if(ck[0][0]==2&&ck[0][1]==2&&ck[0][2]==2){
            t.setText("O is the winner!!");
            disable();
        }
        else if(ck[1][0]==2&&ck[1][1]==2&&ck[1][2]==2){
            t.setText("O is the winner!!");
            disable();
        }
        else if(ck[2][0]==2&&ck[2][1]==2&&ck[2][2]==2){
            t.setText("O is the winner!!");
            disable();
        }
        else if(ck[0][0]==2&&ck[1][0]==2&&ck[2][0]==2){
            t.setText("O is the winner!!");
            disable();
        }
        else if(ck[0][1]==2&&ck[1][1]==2&&ck[2][1]==2){
            t.setText("O is the winner!!");
            disable();
        }
        else if(ck[0][2]==2&&ck[1][2]==2&&ck[2][2]==2){
            t.setText("O is the winner!!");
            disable();
        }
        else if(ck[0][0]==2&&ck[1][1]==2&&ck[2][2]==2){
            t.setText("O is the winner!!");
            disable();
        }
        else if(ck[0][2] ==2&&ck[1][1]==2&&ck[2][0]==2){
            t.setText("O is the winner!!");
            disable();

        }
        if(draw()==1){
            t.setText("Its a draw!!");
        }
        play=true;
    }

    private void disable() {
        for(int i=1;i<10;i++){
            b[i].setEnabled(false);
        }
        won=true;
    }

    private int draw() {
        int n=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(ck[i][j]!=0){
                    n++;
                }
            }
        }

        if(n==9){
            return 1;
        }
        else{
            return 0;
        }
    }

    private void myturn() {
        if (won==false) {
            play = false;
            int num = -2, x = 0, y = 0;
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (ck[i][j] != 1 && ck[i][j] != 2) {
                        if (val[i][j] > num) {
                            num = val[i][j];
                            x = i;
                            y = j;
                            list1.clear();
                            list2.clear();
                        } else if (val[i][j] == num) {
                            list1.add(i);
                            list2.add(j);
                        }
                    }
                }
            }
            if (list1.size() != 0) {
                if (val[x][y] <= val[((int) list1.get(0))][((int) list2.get(0))]) {
                    int size = list1.size();
                    Random r = new Random();
                    int rand = r.nextInt(size);
                    x = (int) list1.get(rand);
                    y = (int) list2.get(rand);
                }
            }
            int but = x * 3 + y + 1;
            b[but].setText("O");
            b[but].setEnabled(false);
            ck[x][y] = 2;
            val[x][y] = -2;
            list1.clear();
            list2.clear();
            reval(x, y);
            play = true;
            checkwinner();
        }
    }

    private void reval(int x,int y) {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(ck[i][j]==0){
                    if((Math.abs((x-i))<=1)&&(Math.abs(y-j)<=1)){
                        val[i][j]+=1;
                    }
                }
            }
        }
        if((ck[0][0]==1)&&(ck[0][1]==1)){
            if(val[0][2]!=-2) {
                val[0][2] += 4;
            }
        }
        if((ck[1][0]==1)&&(ck[1][1]==1)){
            if(val[1][2]!=-2) {
                val[1][2] += 4;
            }
        }
        if((ck[2][0]==1)&&(ck[2][1]==1)){
            if(val[2][2]!=-2) {
                val[2][2] += 4;
            }
        }
        if((ck[0][0]==1)&&(ck[0][2]==1)){

            if(val[0][1]!=-2) {
                val[0][1]+=4;
            }
        }
        if((ck[1][0]==1)&&(ck[1][2]==1)){
            if(val[1][1]!=-2) {
                val[1][1]+=4;
            }
        }
        if((ck[2][0]==1)&&(ck[2][2]==1)){
            if(val[2][1]!=-2) {
                val[2][1]+=4;
            }
        }
        if((ck[0][1]==1)&&(ck[0][2]==1)){
            if(val[0][0]!=-2) {
                val[0][0]+=4;
            }
        }
        if((ck[1][1]==1)&&(ck[1][2]==1)){
            if(val[1][0]!=-2) {
                val[1][0]+=4;
            }
        }
        if((ck[0][1]==1)&&(ck[0][2]==1)){
            if(val[2][0]!=-2) {
                val[2][0]+=4;
            }
        }
        if((ck[0][0]==1)&&(ck[1][1]==1)){
            if(val[2][2]!=-2) {
                val[2][2]+=4;
            }
        }
        if((ck[1][1]==1)&&(ck[2][2]==1)){
            if(val[0][0]!=-2) {
                val[0][0]+=4;
            }
        }
        if((ck[0][0]==1)&&(ck[2][2]==1)){
            if(val[1][1]!=-2) {
                val[1][1]+=4;
            }
        }
        if((ck[0][2]==1)&&(ck[1][1]==1)){
            if(val[2][0]!=-2) {
                val[2][0]+=4;
            }
        }
        if((ck[1][1]==1)&&(ck[2][0]==1)){
            if(val[0][2]!=-2) {
                val[0][2]+=4;
            }
        }
        if((ck[0][2]==1)&&(ck[2][0]==1)){
            if(val[1][1]!=-2) {
                val[1][1]+=4;
            }
        }
        if((ck[0][0]==1)&&(ck[1][0]==1)){
            if(val[2][0]!=-2) {
                val[2][0]+=4;
            }
        }
        if((ck[0][0]==1)&&(ck[2][0]==1)){
            if(val[1][0]!=-2) {
                val[1][0]+=4;
            }
        }
        if((ck[1][0]==1)&&(ck[2][0]==1)){
            if(val[0][0]!=-2) {
                val[0][0]+=4;
            }
        }
        //
        if((ck[0][1]==1)&&(ck[1][1]==1)){
            if(val[2][1]!=-2) {
                val[2][1]+=4;
            }
        }
        if((ck[0][1]==1)&&(ck[2][1]==1)){
            if(val[1][1]!=-2) {
                val[1][1]+=4;
            }
        }
        if((ck[1][1]==1)&&(ck[2][1]==1)){
            if(val[0][1]!=-2) {
                val[0][1]+=4;
            }
        }
        ///
        if((ck[0][2]==1)&&(ck[1][2]==1)){
            if(val[2][2]!=-2) {
                val[2][2]=+4;
            }
        }
        if((ck[0][2]==1)&&(ck[2][2]==1)){
            if(val[1][2]!=-2) {
                val[1][2]+=4;
            }
        }
        if((ck[1][2]==1)&&(ck[2][2]==1)){
            if(val[0][2]!=-2) {
                val[0][2]+=4;
            }
        }
        /////////////////////////////
        if((ck[0][0]==2)&&(ck[0][1]==2)){
            if(val[0][2]!=-2) {
                val[0][2]+=11;
            }
        }
        if((ck[1][0]==2)&&(ck[1][1]==2)){
            if(val[1][2]!=-2) {
                val[1][2]+=11;
            }
        }
        if((ck[2][0]==2)&&(ck[2][1]==2)){
            if(val[2][2]!=-2) {
                val[2][2]+=11;
            }
        }
        if((ck[0][0]==2)&&(ck[0][2]==2)){
            if(val[0][1]!=-2) {
                val[0][1]+=11;
            }
        }
        if((ck[1][0]==2)&&(ck[1][2]==2)){
            if(val[1][1]!=-2) {
                val[1][1]+=11;
            }
        }
        if((ck[2][0]==2)&&(ck[2][2]==2)){
            if(val[2][1]!=-2) {
                val[2][1]+=11;
            }
        }
        if((ck[0][1]==2)&&(ck[0][2]==2)){
            if(val[0][0]!=-2) {
                val[0][0]+=11;
            }
        }
        if((ck[1][1]==2)&&(ck[1][2]==2)){
            if(val[1][0]!=-2) {
                val[1][0]+=11;
            }
        }
        if((ck[0][1]==2)&&(ck[0][2]==2)){
            if(val[2][0]!=-2) {
                val[2][0]+=11;
            }
        }
        if((ck[0][0]==2)&&(ck[1][1]==2)){
            if(val[2][2]!=-2) {
                val[2][2]+=11;
            }
        }
        if((ck[1][1]==2)&&(ck[2][2]==2)){
            if(val[0][0]!=-2) {
                val[0][0]+=11;
            }
        }
        if((ck[0][0]==2)&&(ck[2][2]==2)){
            if(val[1][1]!=-2) {
                val[1][1]+=11;
            }
        }
        if((ck[0][2]==2)&&(ck[1][1]==2)){
            if(val[2][0]!=-2) {
                val[2][0]+=11;
            }
        }
        if((ck[1][1]==2)&&(ck[2][0]==2)){
            if(val[0][2]!=-2) {
                val[0][2]+=11;
            }
        }
        if((ck[0][2]==2)&&(ck[2][0]==2)){
            if(val[1][1]!=-2) {
                val[1][1]+=11;
            }
        }
        ///
        if((ck[0][0]==2)&&(ck[1][0]==2)){
            if(val[2][0]!=-2) {
                val[2][0]+=11;
            }
        }
        if((ck[0][0]==2)&&(ck[2][0]==2)){
            if(val[1][0]!=-2) {
                val[1][0]+=11;
            }
        }
        if((ck[1][0]==2)&&(ck[2][0]==2)){
            if(val[0][0]!=-2) {
                val[0][0]+=11;
            }
        }
        //
        if((ck[0][1]==2)&&(ck[1][1]==2)){
            if(val[2][1]!=-2) {
                val[2][1]+=11;
            }
        }
        if((ck[0][1]==2)&&(ck[2][1]==2)){
            if(val[1][1]!=-2) {
                val[1][1]+=11;
            }
        }
        if((ck[1][1]==2)&&(ck[2][1]==2)){
            if(val[0][1]!=-2) {
                val[0][1]+=11;
            }
        }
        ///
        if((ck[0][2]==2)&&(ck[1][2]==2)){
            if(val[2][2]!=-2) {
                val[2][2]+=11;
            }
        }
        if((ck[0][2]==2)&&(ck[2][2]==2)){
            if(val[1][2]!=-2) {
                val[1][2]+=11;
            }
        }
        if((ck[1][2]==2)&&(ck[2][2]==2)){
            if(val[0][2]!=-2) {
                val[0][2]+=11;
            }
        }
        /////////////////////////////
        for(int i=0;i<3;i++){
            System.out.println("\n");
            for(int j=0;j<3;j++){
                System.out.println(val[i][j]);
            }
        }
    }


    private void init() {
        val[0][0]=1;
        val[0][1]=-1;
        val[0][2]=1;
        val[1][0]=-1;
        val[1][1]=2;
        val[1][2]=-1;
        val[2][0]=1;
        val[2][1]=-1;
        val[2][2]=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ck[i][j]=0;
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
