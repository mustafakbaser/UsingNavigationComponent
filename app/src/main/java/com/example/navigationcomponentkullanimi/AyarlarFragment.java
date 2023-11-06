package com.example.navigationcomponentkullanimi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponentkullanimi.databinding.FragmentAyarlarBinding;

public class AyarlarFragment extends Fragment {
    // View Binding
    private FragmentAyarlarBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAyarlarBinding.inflate(inflater, container, false);

        binding.buttonButtonSheet.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.bottomSheetGecis);
        });

        return binding.getRoot();
    }
}