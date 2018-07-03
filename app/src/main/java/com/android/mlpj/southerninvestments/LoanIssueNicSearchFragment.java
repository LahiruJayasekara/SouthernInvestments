package com.android.mlpj.southerninvestments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoanIssueNicSearchFragment extends Fragment {

    private Button mBtnIssueLoan;

    public LoanIssueNicSearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_loan_issue_nic_search, container, false);

        mBtnIssueLoan = view.findViewById(R.id.btn_issue_loan);
        mBtnIssueLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new LoanIssueFragment();
                FragmentManager fragmentManager = getFragmentManager();

                fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit();

            }
        });
        return view;
    }

}
