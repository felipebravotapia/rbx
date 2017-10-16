package ubox.etec.com.rumbox;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MiBottomSheetDialogFragment extends BottomSheetDialogFragment {

    static MiBottomSheetDialogFragment newInstance() {
        return new MiBottomSheetDialogFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bs_dialog_fragment, container, false);

        String distancia = getArguments().getString("distancia");
        TextView distanciatxt = (TextView) v.findViewById(R.id.txt_distance);
        distanciatxt.setText("Distancia Total: "+distancia+"");


        return v;
    }
}
