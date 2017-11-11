package nyc.c4q.recyclerviewbook.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import nyc.c4q.recyclerviewbook.BookReviewActivity;
import nyc.c4q.recyclerviewbook.R;
import nyc.c4q.recyclerviewbook.model.Book;


public class BookViewHolder extends RecyclerView.ViewHolder {

    private TextView title;
    private TextView author;
    private TextView year;
    private Button reviewButton;

    public BookViewHolder(final View itemView) {
        super(itemView);

        title = (TextView) itemView.findViewById(R.id.book_title_textview);
        author = (TextView) itemView.findViewById(R.id.book_author_textview);
        year = (TextView) itemView.findViewById(R.id.book_year_textview);
        reviewButton = (Button) itemView.findViewById(R.id.review_button);

    }

    public void onBind(final Book book) {
        title.setText("Title:" + book.getTitle());
        author.setText("Author" + book.getAuthor());
        year.setText("Year:" + book.getYear());

        reviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle b = new Bundle();
                b.putInt("img",book.getResId());

                Intent intent = new Intent(itemView.getContext(), BookReviewActivity.class);
                intent.putExtras(b);

                itemView.getContext().startActivity(intent);

//                Intent intent1 = new Intent(itemView.getContext(), BookReviewActivity1.class);
//                itemView.getContext().startActivity(intent1);
            }
        });
    }

}
