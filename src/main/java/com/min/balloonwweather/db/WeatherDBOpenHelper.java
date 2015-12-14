package com.min.balloonwweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2015/11/28.
 */
public class WeatherDBOpenHelper extends SQLiteOpenHelper{

    public static final String CREATE_PROVINCE="create table Province(" +
            "id integer primary key autoincrement, " +
            "province_code text, " +
            "province_name text)";

    public static final String CREATE_CITY="create table City(" +
            "id integer primary key autoincrement, " +
            "city_code text, " +
            "city_name text, " +
            "province_id integer)";

    public static final String CREATE_COUNTY="create table County(" +
            "id integer primary key autoincrement, " +
            "county_code text, " +
            "county_name text, " +
            "city_id integer)";

    public WeatherDBOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}