package a6br.quizapp3;

import android.database.sqlite.SQLiteDatabase;

public class question {
    private Integer id;
    private String questionText;
    private String wrongAnswerOne;
    private String wrongAnswerTwo;
    private String wrongAnswerThree;
    private String rightAnswer;
    private String category;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getWrongAnswerOne() {
        return wrongAnswerOne;
    }

    public void setWrongAnswerOne(String wrongAnswerOne) {
        this.wrongAnswerOne = wrongAnswerOne;
    }

    public String getWrongAnswerTwo() {
        return wrongAnswerTwo;
    }

    public void setWrongAnswerTwo(String wrongAnswerTwo) {
        this.wrongAnswerTwo = wrongAnswerTwo;
    }

    public String getWrongAnswerThree() {
        return wrongAnswerThree;
    }

    public void setWrongAnswerThree(String wrongAnswerThree) {
        this.wrongAnswerThree = wrongAnswerThree;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public question(String questionText, String wrongAnswerOne, String wrongAnswerTwo, String wrongAnswerThree, String rightAnswer, String category) {
        this.questionText = questionText;
        this.wrongAnswerOne = wrongAnswerOne;
        this.wrongAnswerTwo = wrongAnswerTwo;
        this.wrongAnswerThree = wrongAnswerThree;
        this.rightAnswer = rightAnswer;
        this.category = category;
    }
}


