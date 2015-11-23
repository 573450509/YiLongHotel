package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.qf.yilonghotel.R;


public class OrderFragment extends Fragment {
    private ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.order_fragment, null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        listView = (ListView)view.findViewById(R.id.fragment_order_listview);

    }
}
