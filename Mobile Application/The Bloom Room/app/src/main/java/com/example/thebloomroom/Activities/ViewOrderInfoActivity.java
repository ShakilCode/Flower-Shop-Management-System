package com.example.thebloomroom.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.thebloomroom.R;

public class ViewOrderInfoActivity extends AppCompatActivity {

    TextView textViewProductId, textViewCategoryName, textViewProductName, textViewQuantity, textViewDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_order_info);

        textViewProductId = (TextView) findViewById(R.id.tv_VP_ProductId);
        textViewCategoryName = (TextView) findViewById(R.id.tv_VP_CategoryName);
        textViewProductName = (TextView) findViewById(R.id.tv_VP_ProductName);
        textViewQuantity = (TextView) findViewById(R.id.tv_VP_Quantity);
        textViewDate = (TextView) findViewById(R.id.tv_VP_Date);
        Intent intent = this.getIntent();

        textViewProductId.setText("Product Id: " + intent.getStringExtra("ProductID"));
        textViewCategoryName.setText("Category Name: " + intent.getStringExtra("CategoryName"));
        textViewProductName.setText("Product Name: " + intent.getStringExtra("ProductName"));
        textViewQuantity.setText("Quantity: " + intent.getStringExtra("Quantity"));
        textViewDate.setText("Date is: " + intent.getStringExtra("Date"));
    }
}