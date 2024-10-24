package com.example.quanlyphongban;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DepartmentAdapter extends BaseAdapter {
    private List<Department> departmentList;
    private LayoutInflater inflater;

    public DepartmentAdapter(Context context, List<Department> departmentList) {
        this.departmentList = departmentList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return departmentList.size();
    }

    @Override
    public Object getItem(int position) {
        return departmentList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_department, parent, false);
        }

        Department department = departmentList.get(position);

        ImageView avatarImageView = convertView.findViewById(R.id.departmentImageView);
        TextView nameTextView = convertView.findViewById(R.id.departmentNameTextView);

        // Set data into views
        avatarImageView.setImageResource(department.getAvatarResId());
        nameTextView.setText(department.getDepartmentName());

        return convertView;
    }
}