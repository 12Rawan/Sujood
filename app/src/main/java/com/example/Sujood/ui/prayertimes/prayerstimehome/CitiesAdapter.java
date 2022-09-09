package com.example.Sujood.ui.prayertimes.prayerstimehome;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Sujood.R;
import com.example.Sujood.data.pojo.City;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.ViewHolder> {


    private List<City> cities;
    private List<City> originalCities;
    private OnClick onClick;

    public CitiesAdapter(List<City> cities, OnClick onClick) {
        this.cities = cities;
        this.onClick = onClick;
        originalCities = new ArrayList<>(cities);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.spinner_city, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(cities.get(position));
    }

    @Override
    public int getItemCount() {
        return cities == null ? 0 : cities.size();
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
        notifyDataSetChanged();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void filter(String s) {
        if (s == null || s.isEmpty()) {
            setCities(originalCities);
        } else {
            setCities(originalCities
                    .stream()
                    .filter(city -> city.getCountry().contains(s) || city.getName().contains(s))
                    .collect(Collectors.toCollection(ArrayList::new)));
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView cityText;
        private final TextView countryCodeText;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cityText = itemView.findViewById(R.id.city);
            countryCodeText = itemView.findViewById(R.id.country_code);
        }

        public void bind(City city) {
            cityText.setText(city.getName());
            countryCodeText.setText(city.getCountry());
            itemView.setOnClickListener((v) -> onClick.onClick(city));
        }
    }

    public interface OnClick {
        void onClick(City city);
    }

}
