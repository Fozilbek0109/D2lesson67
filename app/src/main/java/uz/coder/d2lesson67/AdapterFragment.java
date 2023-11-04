package uz.coder.d2lesson67;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class AdapterFragment extends FragmentStateAdapter {

   private List<AvtoModel> avtoModels;

    public AdapterFragment(@NonNull FragmentActivity fragmentActivity, List<AvtoModel> avtoModels) {
        super(fragmentActivity);
        this.avtoModels = avtoModels;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return AvtoFragment.newInstance(avtoModels.get(position));
    }

    @Override
    public int getItemCount() {
        return avtoModels.size();
    }
}
