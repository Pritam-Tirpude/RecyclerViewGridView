package com.example.pritam.recyclerviewgridview;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Pritam on 2/12/2018.
 */

public class Items implements Parcelable {

    private String mTitle;
    private Drawable mImage;

    public Items(String mTitle, Drawable mImage) {
        this.mTitle = mTitle;
        this.mImage = mImage;
    }


    protected Items(Parcel in) {
        mTitle = in.readString();
    }

    public static final Creator<Items> CREATOR = new Creator<Items>() {
        @Override
        public Items createFromParcel(Parcel in) {
            return new Items(in);
        }

        @Override
        public Items[] newArray(int size) {
            return new Items[size];
        }
    };

    public String getmTitle() {
        return mTitle;
    }

    public Drawable getmImage() {
        return mImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mTitle);
    }
}
