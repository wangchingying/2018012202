package com.cyw.a2018012202;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Student on 2018/1/22.
 */

public class MyHelper extends SQLiteOpenHelper {
    final static String DB_NAME = "student.sqlite";
    final static int VERSION = 1;
    public MyHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    //第一次執行這個程式時會自己新增資料庫如下
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE \"students\" ( `_id` INTEGER, `name` TEXT, `score` INTEGER, PRIMARY KEY(`_id`) )");
    }

    //若不同版本,則更新內容不同,寫在這
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
