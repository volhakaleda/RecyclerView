package nyc.c4q.recyclerviewbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class BookReviewActivity extends AppCompatActivity{

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_review);

        Intent b= getIntent();
        Bundle m = b.getExtras();
        int resId = m.getInt("img");

        imageView = (ImageView) findViewById(R.id.book_image);
        imageView.setImageResource(resId);
    }

}
