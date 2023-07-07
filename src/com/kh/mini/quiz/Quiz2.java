package com.kh.mini.quiz;

public class Quiz2 {
	private String quizContent;
	private String choiceArrs;
	private int answerSheet;
	// 전체퀴즈 저장
	// 1 ~ 60 4지선다 (1 ~ 20 : html, 21 ~ 40 : oracle, 41 ~ 60 : java)
	// 61 ~ 120 O/X (61 ~ 80 : html, 81 ~ 100 : oracle, 101 ~ 120 : java)

	public Quiz2() {
	}

	public Quiz2(String quizContent, String choiceArrs, int answerSheet) {
		this.setQuizContent(quizContent);
		this.setChoiceArrs(choiceArrs);
		this.setAnswerSheet(answerSheet);
	}

	// getter
	public String getQuizContent() {
		return quizContent;
	}

	public String getChoiceArrs() {
		return choiceArrs;
	}

	public int getAnswerSheet() {
		return answerSheet;
	}

	// setter
	public void setQuizContent(String quizContent) {
		this.quizContent = quizContent;
	}

	public void setChoiceArrs(String choiceArrs) {
		this.choiceArrs = choiceArrs;
	}

	public void setAnswerSheet(int answerSheet) {
		this.answerSheet = answerSheet;
	}

}
