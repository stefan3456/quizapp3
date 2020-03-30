package a6br.quizapp3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "questionManager";
    private static final String TABLE_QUESTIONS = "questions";
    private static final String KEY_QUESTION_ID = "questionId";
    private static final String KEY_QUESTION_TEXT = "questionText";
    private static final String KEY_WRONG_ANSWER_ONE = "wrongAnswerOne";
    private static final String KEY_WRONG_ANSWER_TWO = "wrongAnswerTwo";
    private static final String KEY_WRONG_ANSWER_THREE = "wrongAnswerThree";
    private static final String KEY_RIGHT_ANSWER = "rightAnswer";
    private static final String KEY_CATEGORY = "category";

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String Create_QUESTIONS_TABLE = "CREATE TABLE " + TABLE_QUESTIONS + "("
                + KEY_QUESTION_ID + " INTEGER AUTO_INCREMENT PRIMARY KEY,"
                + KEY_QUESTION_TEXT + " TEXT,"
                + KEY_WRONG_ANSWER_ONE + " TEXT,"
                + KEY_WRONG_ANSWER_TWO + " TEXT,"
                + KEY_WRONG_ANSWER_THREE + " TEXT,"
                + KEY_RIGHT_ANSWER + " TEXT,"
                + KEY_CATEGORY + " TEXT" + ")";
        db.execSQL(Create_QUESTIONS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUESTIONS);

        onCreate(db);
    }

    void addQuestion(question question){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_QUESTION_TEXT, question.getQuestionText());
        values.put(KEY_WRONG_ANSWER_ONE, question.getWrongAnswerOne());
        values.put(KEY_WRONG_ANSWER_TWO, question.getWrongAnswerTwo());
        values.put(KEY_WRONG_ANSWER_THREE, question.getWrongAnswerThree());
        values.put(KEY_RIGHT_ANSWER, question.getRightAnswer());
        values.put(KEY_CATEGORY, question.getCategory());

        db.insert(TABLE_QUESTIONS, null, values);
        db.close();
    }

    question getQuestion(int id){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_QUESTIONS, new String[] {KEY_QUESTION_ID, KEY_QUESTION_TEXT, KEY_WRONG_ANSWER_ONE, KEY_WRONG_ANSWER_TWO, KEY_WRONG_ANSWER_THREE, KEY_RIGHT_ANSWER, KEY_CATEGORY}, KEY_QUESTION_ID + "=?",
                new String[]{String.valueOf(id)}, null, null, null, null);
        if(cursor != null){
            cursor.moveToFirst();
        }

        question question = new question(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6));

        return question;
    }

    public List<question> getAllQuestions(){
        List<question> questionList = new ArrayList<> ();

        String selectQuery = "SELECT *FROM" + TABLE_QUESTIONS;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if(cursor.moveToFirst()){
            do {
                question newQuestion = new question(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6));
            } while (cursor.moveToNext());

        }

        return questionList;

    }
}
