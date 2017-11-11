package nyc.c4q.recyclerviewbook;

import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.recyclerviewbook.controller.BookAdapter;
import nyc.c4q.recyclerviewbook.model.Book;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView bookRecyclerView = (RecyclerView) findViewById(R.id.book_recyclerview);

        List<Book> books = new ArrayList<>();
        books.add(new Book("Master & Margarita", "M.Bulgakov", 1967, R.drawable.master));
        books.add(new Book("Anna Karenina", "L.Tolstoy", 1877, R.drawable.anna));
        books.add(new Book("Animal Farm", "G.Owrell", 1945, R.drawable.animal));
        books.add(new Book("The Picture of Dorian Gray", "O.Wilde", 1890, R.drawable.dorian));
        books.add(new Book("War & Peace", "L.Tolstoy", 1867, R.drawable.war));
        books.add(new Book("Crime & Punishment", "F.Dostoyevski", 1866, R.drawable.crime));
        books.add(new Book("Sense & Sensibility", "J.Austen", 1811, R.drawable.sense));

        BookAdapter bookAdapter = new BookAdapter(books);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL, false);

        bookRecyclerView.setAdapter(bookAdapter);
        bookRecyclerView.setLayoutManager(linearLayoutManager);

    }
}
