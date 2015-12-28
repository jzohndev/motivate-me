package com.github.jzohndev.catalogs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jzohn on 12/28/2015.
 */
public class MealDatabaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "meals.db";
    public static final String TABLE_NAME = "meal_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "CALORIES";
    public static final String COL_3 = "TOTAL_FAT";
    public static final String COL_4 = "SAT_FAT";
    public static final String COL_5 = "CHOLESTEROL";
    public static final String COL_6 = "SODIUM";
    public static final String COL_7 = "CARBS";
    public static final String COL_8 = "FIBER";
    public static final String COL_9 = "SUBER";
    public static final String COL_10 = "PROTEIN";
    public static final String COL_11 = "VITAMIN A";
    public static final String COL_12 = "VITAMIN C";
    public static final String COL_13 = "CALCIUM";
    public static final String COL_14 = "IRON";



    private String databaseName = "";
    private String tableName = "";

    public MealDatabaseHelper(Context context, String databaseName, String tableName){
        super(context, databaseName, null, 1);
        databaseName = this.databaseName;
        tableName = this.tableName;
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + tableName + " (ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NAME TEXT, " +
                "CALORIES INTEGER, " +
                "TOTAL_FAT INTEGER, " +
                "SAT_FAT INTEGER, " +
                "CHOLESTEROL INTEGER, " +
                "SODIUM INTEGER, " +
                "CARBS INTEGER, " +
                "FIBER INTEGER, " +
                "SUBER INTEGER, " +
                "PROTEIN INTEGER, " +
                "VITAMIN A INTEGER, " +
                "VITAMIN C INTEGER, " +
                "CALCIUM INTEGER, " +
                "IRON INTEGER)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + tableName);
        onCreate(db);
    }

    public boolean createMeal(String name, String calories, String totalFat,
                              String satFat, String chol, String sodium,
                              String carbs, String sugar, String protein,
                              String vitaminA, String vitaminC, String calcium, String iron){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, name);
        contentValues.put(COL_3, calories);
        contentValues.put(COL_4, totalFat);
        contentValues.put(COL_5, satFat);
        contentValues.put(COL_6, chol);
        contentValues.put(COL_7, sodium);
        contentValues.put(COL_8, carbs);
        contentValues.put(COL_9, sugar);
        contentValues.put(COL_10, protein);
        contentValues.put(COL_11, vitaminA);
        contentValues.put(COL_12, vitaminC);
        contentValues.put(COL_13, calcium);
        contentValues.put(COL_14, iron);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if(result == -1) {
            return false;
        }else return true;
    }

    public Cursor getAllMeals(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
        return res;
    }

    public boolean updateMeal(String id, String name, String calories, String totalFat,
                              String satFat, String chol, String sodium,
                              String carbs, String sugar, String protein,
                              String vitaminA, String vitaminC, String calcium, String iron){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, id);
        contentValues.put(COL_2, name);
        contentValues.put(COL_3, calories);
        contentValues.put(COL_4, totalFat);
        contentValues.put(COL_5, satFat);
        contentValues.put(COL_6, chol);
        contentValues.put(COL_7, sodium);
        contentValues.put(COL_8, carbs);
        contentValues.put(COL_9, sugar);
        contentValues.put(COL_10, protein);
        contentValues.put(COL_11, vitaminA);
        contentValues.put(COL_12, vitaminC);
        contentValues.put(COL_13, calcium);
        contentValues.put(COL_14, iron);
        db.update(TABLE_NAME, contentValues, "ID = ?", new String [] {id});
        return true;
    }

    public int deleteMeal(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ?", new String[] {id});
    }
}
