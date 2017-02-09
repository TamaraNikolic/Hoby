package com.hobyles.hobyles;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by Alen on 9/1/2016.
 */
public class Database {
    /*
    private static final String TABLE_NAME = "CVTable";


    private static final String ID = "id";

    private static final String NAME = "ime";
    private static final String SURNAME = "priimek";
    private static final String PHONE = "telefon";
    private static final String EMAIL = "email";
    private static final String DATE = "datum";

    private static final String AGE = "starost";
    private static final String GENDER = "pol";
    private static final String PLACE = "trgovina";
    private static final String ARTICAL = "artical";


    private Context mContext;
    private CvDatabaseHelper mDbHelper;
    private SQLiteDatabase mDb;

    public Database(Context context) {
        this.mContext = context;
        this.mDbHelper = new CvDatabaseHelper(context);
        this.mDb = mDbHelper.getWritableDatabase();

    }

    public void closeDataBase() {
        if (mDb != null) {
            mDb.close();
        }
    }

    public void insertRecord(Record itemRecord) {
        ContentValues values = new ContentValues();
        values.put(NAME, itemRecord.getName());
        values.put(SURNAME, itemRecord.getPriimek());
        values.put(PHONE, itemRecord.getTelefon());
        values.put(DATE, itemRecord.getDatum());
        values.put(EMAIL, itemRecord.getEmail());
        values.put(AGE, itemRecord.getStarost());
        values.put(GENDER, itemRecord.getPol());
        values.put(PLACE, itemRecord.getTrgovina());
        values.put(ARTICAL, itemRecord.getSegment_artiklov());

        mDb.insert(TABLE_NAME, null, values);//vraca id pa moze da se stavi da vraca long umesto void pa return  return  mDb.insert(TABLE_NAME_CV,"",values)

    }


    public ArrayList<Record> getList_Id() {
        ArrayList<Record> list = new ArrayList<>();

        String[] projection = {ID, NAME, SURNAME, PHONE, EMAIL, AGE, GENDER, PLACE, ARTICAL, DATE};

        Cursor c = mDb.query(TABLE_NAME, projection, null, null, null, null, ID + " ASC");

        if (c != null) {

            if (c.moveToFirst()) {
                c.moveToFirst();
                do {
                    Record dataCv = new Record();
                    dataCv.setName(c.getString(c.getColumnIndex(NAME)));
                    dataCv.setPriimek(c.getString(c.getColumnIndex(SURNAME)));
                    dataCv.setDatum(c.getString(c.getColumnIndex(DATE)));
                    dataCv.setTelefon(c.getString(c.getColumnIndex(PHONE)));
                    dataCv.setEmail(c.getString(c.getColumnIndex(EMAIL)));
                    dataCv.setStarost(c.getString(c.getColumnIndex(AGE)));
                    dataCv.setPol(c.getString(c.getColumnIndex(GENDER)));
                    dataCv.setTrgovina(c.getString(c.getColumnIndex(PLACE)));
                    dataCv.setSegment_artiklov(c.getString(c.getColumnIndex(ARTICAL)));



                    list.add(dataCv);
                }
                while (c.moveToNext());
            }
        }
        return list;
    }


    public boolean updatedetails(long rowId, String name) {
        ContentValues args = new ContentValues();
        args.put(ID, rowId);
        args.put(NAME, name);
        int i = mDb.update(TABLE_NAME, args, ID + "=" + rowId, null);
        return i > 0;
    }

    public class CvDatabaseHelper extends SQLiteOpenHelper {

        private static final String DATABASE_NAME = "DatabaseHoby.db";
        private static final int DATABASE_VERSION = 23;


        private String CREATE_TABLE_CV_SQL = "CREATE TABLE " + TABLE_NAME +
                " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                NAME + " TEXT," +
                SURNAME + " TEXT," +
                PHONE + " TEXT," +
                EMAIL + " TEXT, " +
                AGE + " TEXT," +
                GENDER + " TEXT," +
                PLACE + " TEXT," +
                ARTICAL + " TEXT, " +
                DATE + " TEXT);";
        private String DELETE_TABLE_SQL = "DROP TABLE IF EXISTS " + TABLE_NAME;

        public CvDatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);

        }

        @Override
        public void onCreate(SQLiteDatabase db) {

            db.execSQL(CREATE_TABLE_CV_SQL);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL(DELETE_TABLE_SQL);
            onCreate(db);

        }


    }*/
}
