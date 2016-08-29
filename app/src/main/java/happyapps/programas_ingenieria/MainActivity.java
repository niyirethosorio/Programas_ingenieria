package happyapps.programas_ingenieria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView=(ExpandableListView)findViewById(R.id.exp_listview);
        List<String> Headings=new ArrayList<String>();
        List<String> L1=new ArrayList<String>();
        List<String> L2=new ArrayList<String>();
        List<String> L3=new ArrayList<String>();
        List<String> L4=new ArrayList<String>();

        HashMap<String,List<String>> childList= new HashMap<String,List<String>>();

        String headings_items[]=getResources().getStringArray(R.array.header_titles);
        String l1[]=getResources().getStringArray(R.array.h1_items);
        String l2[]=getResources().getStringArray(R.array.h2_items);
        String l3[]=getResources().getStringArray(R.array.h3_items);
        String l4[]=getResources().getStringArray(R.array.h4_items);


        for (String title: headings_items){
            Headings.add(title);
        }
        for (String title: l1){
            L1.add(title);
        }
        for (String title: l2){
            L2.add(title);
        }
        for (String title: l3){
            L3.add(title);
        }

        for (String title: l4){
            L4.add(title);
        }
        childList.put(Headings.get(0),L1);
        childList.put(Headings.get(1),L2);
        childList.put(Headings.get(2),L3);
        childList.put(Headings.get(3),L4);
        
        MyAdapter myAdapter= new MyAdapter(this,Headings,childList);
        expandableListView.setAdapter(myAdapter);

    }
}