package com.example.gsmdata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerView_Cofig {
    private Context mContext;
    private BooksAdapter mBookAdapter;
    public void setConfig(RecyclerView recyclerView,Context context,List<ReadData> books,List<String> keys){
      mContext=context;
      mBookAdapter=new BooksAdapter(books,keys);
      recyclerView.setLayoutManager(new LinearLayoutManager(context));
      recyclerView.setAdapter(mBookAdapter);
    }

    class  BookItermView extends RecyclerView.ViewHolder{
        private TextView mHumidity;
        private TextView mTemperature;
        private TextView mLocation;
        private TextView mLocation2;
        private TextView mGabegeLevel;

        private String key;

        public  BookItermView(ViewGroup parent){
            super(LayoutInflater.from(mContext).inflate(R.layout.binview,parent,false));

            mHumidity=(TextView)itemView.findViewById(R.id.Humidity);
            mTemperature=(TextView)itemView.findViewById(R.id.Temperature);
            mLocation=(TextView)itemView.findViewById(R.id.Location);
            mLocation2=(TextView)itemView.findViewById(R.id.location);
            mGabegeLevel=(TextView)itemView.findViewById(R.id.GabageLevel);

        }
        public  void bind(ReadData book, String key){
            mHumidity.setText(book.getHumidity());
            mTemperature.setText(book.getTemperature());
            mLocation.setText(book.getLocation());
            mLocation2.setText(book.getLocation2());
            mGabegeLevel.setText(book.getGabegeLEvel());
            this.key=key;
        }
    }

    class  BooksAdapter extends RecyclerView.Adapter<BookItermView>{
        private List<ReadData> mBookList;
        private List<String> mKeys;

        public BooksAdapter(List<ReadData> mBookList, List<String> mKeys) {
            this.mBookList = mBookList;
            this.mKeys = mKeys;
        }

        public BooksAdapter() {
            super();
        }

        @NonNull
        @Override
        public BookItermView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new BookItermView(parent);
        }

        @Override
        public void onBindViewHolder(@NonNull BookItermView holder, int position) {
            holder.bind(mBookList.get(position),mKeys.get(position));
        }

        @Override
        public int getItemCount() {
            return mBookList.size();
        }
    }
}
