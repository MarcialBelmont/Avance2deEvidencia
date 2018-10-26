package com.example.marci.evidencia_avance2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class db extends SQLiteOpenHelper {
    public db(Context context) {
        super(context, "user.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table ListadeCURP(codigodeverificacion text, primerapellido text, segundoapellido text, nombre text, genero text, fechadenacimiento text, entidadfederativa text)");
    }

    public void agregarCURPNuevo(db db, String toString, String getText, String code, String name, String genre, String date, String state){
        SQLiteDatabase sq = db.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("codigodeverificacion", code);
        values.put("primerapelliddo", name);
        values.put("segundoapellido", name);
        values.put("nombre", name);
        values.put("genero", genre);
        values.put("fechadenacimiento", date);
        values.put("entidadfederativa", state);
        sq.insert("PersonasconCURP",null,values);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
