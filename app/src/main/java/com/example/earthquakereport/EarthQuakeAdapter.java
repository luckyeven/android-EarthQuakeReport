package com.example.earthquakereport;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EarthQuakeAdapter extends ArrayAdapter<EarthQuake> {
    public EarthQuakeAdapter(@NonNull Activity context, @NonNull ArrayList earthQuake) {
        super(context, 0, earthQuake);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_view, parent, false);
        }
        EarthQuake currentEarthQuake = getItem(position);
        TextView quantity = (TextView) listItemView.findViewById(R.id.quantity);
        String formattedMagnitude = formatMagnitude(currentEarthQuake.getmMagnitude());
        quantity.setText(formattedMagnitude);

        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(currentEarthQuake.getmLocation());

        TextView time = (TextView) listItemView.findViewById(R.id.mTime);
        Date dateObject = new Date(currentEarthQuake.getmTime());
        String formattedTime = formatTime(dateObject);
        time.setText(formattedTime);
        return listItemView;
    }

    public String formatMagnitude(double magnitude) {
        DecimalFormat magnitudeFormat = new DecimalFormat("0.0");
        return magnitudeFormat.format(magnitude);
    }

    public String formatTime(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);

    }
}
