package comsci.sanoman.myfristapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by SaNoMan on 23/2/2560.
 */
//activivty นี้สร้างเพื่อทำ layout เสมือนเพื่อนำไปแสดงผลบนหน้า activivty นี้
public class MyAdepter extends BaseAdapter {
    //Expilcit
    private Context context;
    private int[]ints;
    private String[] titleStrings, detailStrings;

    public MyAdepter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }



    @Override
    public int getCount() {
        return ints.length;
    }//ใช้นับจำนวนข้อมูล

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.my_listview, parent, false);
        //Initial view ทำให้จาวารู้จักกันก่อน
        ImageView imageView= (ImageView) view.findViewById(R.id.imvicon);
        TextView titleTextView = (TextView) view.findViewById(R.id.txtTitle);
        TextView detailTextView = (TextView) view.findViewById(R.id.txtDetailLiv);
        //Show View
        imageView.setImageResource(ints[position]);
        titleTextView.setText(titleStrings[position]);
        detailTextView.setText(detailStrings[position]);
        return view;
    }//ทำหน้าที่รับจำนวนข้อมูลแล้วแสดงผลทางหน้าแอ็บ
}//main class
