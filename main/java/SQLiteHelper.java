import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

/**
 * Created by ACER on 15/03/2018.
 */

public class SQLiteHelper extends SQLiteOpenHelper {
    public SQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public void queryData(String sql){
        SQLiteDatabase database=getWritableDatabase();
        database.execSQL(sql);
    }
    public void insertData(String name,String price,byte[] image){
        SQLiteDatabase database =getWritableDatabase();
        String sql="INSERT INTO FOOD VALUES (NULL,?,?,?)";

        SQLiteStatement sqLiteStatement=database.compileStatement(sql);
        sqLiteStatement.clearBindings();

        sqLiteStatement.bindString(1,name);
        sqLiteStatement.bindString(1,price);
        sqLiteStatement.bindBlob(3,image);

        sqLiteStatement.executeInsert();
    }

    public Cursor getData(String sql){
        SQLiteDatabase database =getReadableDatabase();
        return database.rawQuery(sql,null);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
