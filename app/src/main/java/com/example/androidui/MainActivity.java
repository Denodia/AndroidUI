package com.example.androidui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    LinearLayout hideLayout;
    TextView tvGraddenSaladPrice,tvIncrement,tvCartValue
            ,tvDecrement,greenSaladTotal,tvCartTotal,
            tvDecrementCaesar,tvIncrementCaesar,tvCartCaesar,tvCaesarTotal,
            tvDecrementTuna,tvIncrementTuna,tvCartTuna,tvTunaTotal,
           tvDecrementChicken,tvIncrementChicken,tvCartChicken,tvChickenTotal,tvCart;
    private int cartValue=0;
    private int cartValue1=0;
    private int cartValue2=0;
    private int cartValue3=0;
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvGraddenSaladPrice=findViewById(R.id.text_cart_garden_salad_price);
        tvIncrement=(TextView)findViewById(R.id.tv_increment);
        tvCartValue=(TextView)findViewById(R.id.tv_cart_value);
        tvDecrement=(TextView)findViewById(R.id.tv_decrement) ;
        greenSaladTotal=(TextView)findViewById(R.id.tv_green_salad_total) ;
        tvCartTotal=(TextView)findViewById(R.id.tv_cart_total) ;
        tvDecrementCaesar=(TextView)findViewById(R.id.tv_decrement1);
        tvIncrementCaesar=(TextView)findViewById(R.id.tv_increment1);
        tvCartCaesar=(TextView)findViewById(R.id.tv_cart_value1);
        tvCaesarTotal=(TextView)findViewById(R.id.tv_caesar_salad_total);
        tvDecrementTuna=(TextView)findViewById(R.id.tv_decrement2);
        tvIncrementTuna=(TextView)findViewById(R.id.tv_increment2);
        tvCartTuna=(TextView)findViewById(R.id.tv_cart_value2);
        tvTunaTotal=(TextView)findViewById(R.id.tv_tuna_total);
        tvDecrementChicken=(TextView)findViewById(R.id.tv_decrement3);
        tvIncrementChicken=(TextView)findViewById(R.id.tv_increment3);
        tvCartChicken=(TextView)findViewById(R.id.tv_cart_value3);
        tvChickenTotal=(TextView)findViewById(R.id.tv_chicken_total);
        tvCart=(TextView)findViewById(R.id.tv_cart);
        hideLayout=(LinearLayout)findViewById(R.id.hide_layout);




        tvCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count==0) {
                    hideLayout = (LinearLayout) findViewById(R.id.hide_layout);
                    hideLayout.setVisibility(View.GONE);
                    count=1;
                }
                else{
                    hideLayout = (LinearLayout) findViewById(R.id.hide_layout);
                    hideLayout.setVisibility(View.VISIBLE);
                    count=0;
                }
            }
        });


        tvIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartValue=cartValue+1;
                String cartval=Integer.toString(cartValue);
                tvCartValue.setText(cartval);
                int value=cartValue*8;
                int carttotal=Integer.parseInt(tvCartTotal.getText().toString());
                greenSaladTotal.setText(Integer.toString(value));
                tvCartTotal.setText(Integer.toString(carttotal+8));
                if(0<Integer.parseInt(tvCartValue.getText().toString())){
                    tvDecrement.setVisibility(View.VISIBLE);
                }
            }
        });

        tvDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartValue=cartValue-1;
                String cartval=Integer.toString(cartValue);
                tvCartValue.setText(cartval);

                int value=cartValue*8;
                greenSaladTotal.setText(Integer.toString(value));
                int carttotal=Integer.parseInt(tvCartTotal.getText().toString());
                tvCartTotal.setText(Integer.toString(carttotal-8));
                if(0==Integer.parseInt(tvCartValue.getText().toString())){
                    tvDecrement.setVisibility(View.GONE);
                }
            }
        });



        tvIncrementCaesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartValue1=cartValue1+1;
                String cartval=Integer.toString(cartValue1);
                tvCartCaesar.setText(cartval);
                int value=cartValue1*9;
                int carttotal=Integer.parseInt(tvCartTotal.getText().toString());
                tvCaesarTotal.setText(Integer.toString(value));
                tvCartTotal.setText(Integer.toString(carttotal+9));
                if(0<Integer.parseInt(tvCartCaesar.getText().toString())){
                    tvDecrementCaesar.setVisibility(View.VISIBLE);
                }
            }
        });

        tvDecrementCaesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartValue1=cartValue1-1;
                String cartval=Integer.toString(cartValue1);
                tvCartCaesar.setText(cartval);
                int value=cartValue1*9;
                tvCaesarTotal.setText(Integer.toString(value));
                int carttotal=Integer.parseInt(tvCartTotal.getText().toString());
                tvCartTotal.setText(Integer.toString(carttotal-9));
                if(0==Integer.parseInt(tvCartCaesar.getText().toString())){
                    tvDecrementCaesar.setVisibility(View.GONE);
                }
            }
        });

        tvIncrementTuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartValue2=cartValue2+1;
                String cartval=Integer.toString(cartValue2);
                tvCartTuna.setText(cartval);
                int value=cartValue2*15;
                int carttotal=Integer.parseInt(tvCartTotal.getText().toString());
                tvTunaTotal.setText(Integer.toString(value));
                tvCartTotal.setText(Integer.toString(carttotal+15));
                if(0<Integer.parseInt(tvCartTuna.getText().toString())){
                    tvDecrementTuna.setVisibility(View.VISIBLE);
                }
            }
        });

        tvDecrementTuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartValue2=cartValue2-1;
                String cartval=Integer.toString(cartValue2);
                tvCartTuna.setText(cartval);
                int value=cartValue2*15;
                tvTunaTotal.setText(Integer.toString(value));
                int carttotal=Integer.parseInt(tvCartTotal.getText().toString());
                tvCartTotal.setText(Integer.toString(carttotal-15));
                if(0==Integer.parseInt(tvCartTuna.getText().toString())){
                    tvDecrementTuna.setVisibility(View.GONE);
                }
            }
        });


        tvIncrementChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartValue3=cartValue3+1;
                String cartval=Integer.toString(cartValue3);
                tvCartChicken.setText(cartval);
                int value=cartValue3*16;
                int carttotal=Integer.parseInt(tvCartTotal.getText().toString());
                tvChickenTotal.setText(Integer.toString(value));
                tvCartTotal.setText(Integer.toString(carttotal+16));
                if(0<Integer.parseInt(tvCartChicken.getText().toString())){
                    tvDecrementChicken.setVisibility(View.VISIBLE);
                }
            }
        });

        tvDecrementChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartValue3=cartValue3-1;
                String cartval=Integer.toString(cartValue3);
                tvCartChicken.setText(cartval);
                int value=cartValue3*16;
                tvChickenTotal.setText(Integer.toString(value));
                int carttotal=Integer.parseInt(tvCartTotal.getText().toString());
                tvCartTotal.setText(Integer.toString(carttotal-16));
                if(0==Integer.parseInt(tvCartChicken.getText().toString())){
                    tvDecrementChicken.setVisibility(View.GONE);
                }
            }
        });
    }
}
