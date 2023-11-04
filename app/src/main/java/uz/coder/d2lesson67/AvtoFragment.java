package uz.coder.d2lesson67;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AvtoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AvtoFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private AvtoModel mParam1;

    public AvtoFragment() {
        // Required empty public constructor
    }

   
    public static AvtoFragment newInstance(AvtoModel avtoModel) {
        AvtoFragment fragment = new AvtoFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PARAM1, avtoModel);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = (AvtoModel) getArguments().getSerializable(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_avto, container, false);
    }
}