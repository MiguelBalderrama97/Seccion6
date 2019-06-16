package com.example.miguel.mymail.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.miguel.mymail.Models.Email;
import com.example.miguel.mymail.R;

import java.util.List;

public class EmailAdapter extends BaseAdapter {

    private Context context;
    private List<Email> emails;
    private int layout;

    public EmailAdapter(Context context, List<Email> emails, int layout) {
        this.context = context;
        this.emails = emails;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return emails.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Email currentMail = emails.get(position);

        TextView txtLetter, txtTitle, txtMsg;

        String title, msg;

        if(convertView == null){
            LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
            convertView = layoutInflater.inflate(layout, parent, false);
        }

        txtLetter = convertView.findViewById(R.id.txtLetterItem);
        txtMsg = convertView.findViewById(R.id.txtMsgItem);
        txtTitle = convertView.findViewById(R.id.txtTitleItem);

        title = currentMail.getsSubject();
        msg = currentMail.getsMsg();

        txtLetter.setText(currentMail.getsSender().charAt(0)+"");
        txtLetter.setBackgroundColor(currentMail.getiColor());

        if(title.length() >= 40){
            txtTitle.setText(title.substring(0,39)+"...");
        }else{
            txtTitle.setText(title);
        }

        if(msg.length() >= 80){
            txtMsg.setText(msg.substring(0,79)+"...");
        }else{
            txtMsg.setText(msg);
        }

        return convertView;
    }
}
