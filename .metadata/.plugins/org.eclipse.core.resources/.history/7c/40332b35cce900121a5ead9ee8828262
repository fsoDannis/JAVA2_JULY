package com.dannis.java2_july;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
 
public class ListViewAdapter extends BaseAdapter {
 
    // Declare Variables
    Context mContext;
    LayoutInflater inflater;
    private List<Consultant> Consultantlist = null;
    private ArrayList<Consultant> arraylist;
 
    public ListViewAdapter(Context context,
            List<Consultant> Consultantlist) {
        mContext = context;
        this.Consultantlist = Consultantlist;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<Consultant>();
        this.arraylist.addAll(Consultantlist);
    }
 
    public class ViewHolder {
        TextView teamMembers;
        TextView Name;
        TextView Email;
    }
 
    @Override
    public int getCount() {
        return Consultantlist.size();
    }
 
    @Override
    public Consultant getItem(int position) {
        return Consultantlist.get(position);
    }
 
    @Override
    public long getItemId(int position) {
        return position;
    }
 
    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.listview_item, null);
            // Locate the TextViews in listview_item.xml
            holder.teamMembers = (TextView) view.findViewById(R.id.teamMembers);
            holder.Name = (TextView) view.findViewById(R.id.Name);
            holder.Email = (TextView) view.findViewById(R.id.Email);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // Set the results into TextViews
        holder.teamMembers.setText(Consultantlist.get(position).getteamMembers());
        holder.Name.setText(Consultantlist.get(position).getName());
        holder.Email.setText(Consultantlist.get(position)
                .getEmail());
 
        // Listen for ListView Item Click
        view.setOnClickListener(new OnClickListener() {
 
            @Override
            public void onClick(View arg0) {
                // Send single item click data to SingleItemView Class
                Intent intent = new Intent(mContext, SingleItemView.class);
                // Pass all data teamMembers
                intent.putExtra("teamMembers",
                        (Consultantlist.get(position).getteamMembers()));
                // Pass all data Name
                intent.putExtra("Name",
                        (Consultantlist.get(position).getName()));
                // Pass all data Email
                intent.putExtra("Email",
                        (Consultantlist.get(position).getEmail()));
                // Start SingleItemView Class
                mContext.startActivity(intent);
            }
        });
 
        return view;
    }
}