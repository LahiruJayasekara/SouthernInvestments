package com.android.mlpj.southerninvestments;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CustomerListAdapter extends RecyclerView.Adapter<CustomerListAdapter.ViewHolder>{
    private List<CustomerDetails> mCustomerDetails;
    private Context mContext;

    public CustomerListAdapter(List<CustomerDetails> customerDetails, Context context) {
        this.mCustomerDetails = customerDetails;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.customer_card,parent,false);
        return new ViewHolder(v);


    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Name.setText(mCustomerDetails.get(position).getName());
        holder.Email.setText(mCustomerDetails.get(position).getEmail());
        holder.Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Clicked", Toast.LENGTH_LONG).
                        show();
            }
        });
    }



    @Override
    public int getItemCount() {
        return  mCustomerDetails.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
      public   TextView Name;
      public   TextView Email;
      public   CardView Card;

        public ViewHolder(View itemView) {
            super(itemView);

            Name              = itemView.findViewById(R.id.head);
            Email             = itemView.findViewById(R.id.description);
            Card              = itemView.findViewById(R.id.card);
        }
    }

    public void upDateList(List<CustomerDetails> list){
        mCustomerDetails = new ArrayList<>();
        mCustomerDetails.addAll(list);
        notifyDataSetChanged();
}
}
