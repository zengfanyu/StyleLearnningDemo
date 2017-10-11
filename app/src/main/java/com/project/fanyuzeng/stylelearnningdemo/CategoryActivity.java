package com.project.fanyuzeng.stylelearnningdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by fanyuzeng on 2017/10/11.
 * Function:
 */

public class CategoryActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_category);

        Button shapeLabelBtn = (Button) findViewById(R.id.id_btn_shape);
        shapeLabelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, ShapeLabelActivity.class);
                startActivity(intent);
            }
        });
        Button selectorLabelBtn = (Button) findViewById(R.id.id_btn_selector);
        selectorLabelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, SelectorLabelActivit.class);
                startActivity(intent);
            }
        });
    }
}
