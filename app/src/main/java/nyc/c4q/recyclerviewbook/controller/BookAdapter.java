package nyc.c4q.recyclerviewbook.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.recyclerviewbook.model.Book;
import nyc.c4q.recyclerviewbook.R;
import nyc.c4q.recyclerviewbook.view.BookViewHolder;


public class BookAdapter extends RecyclerView.Adapter<BookViewHolder> {


    private List<Book> bookList;

    public BookAdapter(List<Book> bookList) {
        this.bookList = bookList;

    }
    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_itemview, parent, false);
        return new BookViewHolder(childView);    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position) {
        Book book = bookList.get(position);

        holder.onBind(book);
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }
}
