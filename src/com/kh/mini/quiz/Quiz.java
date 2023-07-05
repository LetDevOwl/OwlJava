package com.kh.mini.quiz;

public class Quiz {
	public String[] quizArrs;
	public String[] choiceArrs;
	public int[] answerSheetArrs;
	private int[] answer;
	// 전체퀴즈 저장
	// 1 ~ 60 4지선다 (1 ~ 20 : html, 21 ~ 40 : oracle, 41 ~ 60 : java)
	// 61 ~ 120 O/X (61 ~ 80 : html, 81 ~ 100 : oracle, 101 ~ 120 : java)

	public Quiz() {
		quizArrs = new String[120];
		// html 4지선다 문제
		quizArrs[0] = "4지선다 html문제1";
		quizArrs[1] = "4지선다 html문제2";
		quizArrs[2] = "4지선다 html문제3";
		quizArrs[3] = "4지선다 html문제4";
		quizArrs[4] = "4지선다 html문제5";
		quizArrs[5] = "4지선다 html문제6";
		quizArrs[6] = "4지선다 html문제7";
		quizArrs[7] = "4지선다 html문제8";
		quizArrs[8] = "4지선다 html문제9";
		quizArrs[9] = "4지선다 html문제10";
		quizArrs[10] = "4지선다 html문제11";
		quizArrs[11] = "4지선다 html문제12";
		quizArrs[12] = "4지선다 html문제13";
		quizArrs[13] = "4지선다 html문제14";
		quizArrs[14] = "4지선다 html문제15";
		quizArrs[15] = "4지선다 html문제16";
		quizArrs[16] = "4지선다 html문제17";
		quizArrs[17] = "4지선다 html문제18";
		quizArrs[18] = "4지선다 html문제19";
		quizArrs[19] = "4지선다 html문제20";
		// oracle 4지선다 문제
		quizArrs[20] = "4지선다 oracle문제1";
		quizArrs[21] = "4지선다 oracle문제2";
		quizArrs[22] = "4지선다 oracle문제3";
		quizArrs[23] = "4지선다 oracle문제4";
		quizArrs[24] = "4지선다 oracle문제5";
		quizArrs[25] = "4지선다 oracle문제6";
		quizArrs[26] = "4지선다 oracle문제7";
		quizArrs[27] = "4지선다 oracle문제8";
		quizArrs[28] = "4지선다 oracle문제9";
		quizArrs[29] = "4지선다 oracle문제10";
		quizArrs[30] = "4지선다 oracle문제11";
		quizArrs[31] = "4지선다 oracle문제12";
		quizArrs[32] = "4지선다 oracle문제13";
		quizArrs[33] = "4지선다 oracle문제14";
		quizArrs[34] = "4지선다 oracle문제15";
		quizArrs[35] = "4지선다 oracle문제16";
		quizArrs[36] = "4지선다 oracle문제17";
		quizArrs[37] = "4지선다 oracle문제18";
		quizArrs[38] = "4지선다 oracle문제19";
		quizArrs[39] = "4지선다 oracle문제20";
		// java 4지선다 문제
		quizArrs[40] = "4지선다 java문제1";
		quizArrs[41] = "4지선다 java문제2";
		quizArrs[42] = "4지선다 java문제3";
		quizArrs[43] = "4지선다 java문제4";
		quizArrs[44] = "4지선다 java문제5";
		quizArrs[45] = "4지선다 java문제6";
		quizArrs[46] = "4지선다 java문제7";
		quizArrs[47] = "4지선다 java문제8";
		quizArrs[48] = "4지선다 java문제9";
		quizArrs[49] = "4지선다 java문제10";
		quizArrs[50] = "4지선다 java문제11";
		quizArrs[51] = "4지선다 java문제12";
		quizArrs[52] = "4지선다 java문제13";
		quizArrs[53] = "4지선다 java문제14";
		quizArrs[54] = "4지선다 java문제15";
		quizArrs[55] = "4지선다 java문제16";
		quizArrs[56] = "4지선다 java문제17";
		quizArrs[57] = "4지선다 java문제18";
		quizArrs[58] = "4지선다 java문제19";
		quizArrs[59] = "4지선다 java문제20";
		// html OX 문제
		quizArrs[60] = "OX html문제1";
		quizArrs[61] = "OX html문제2";
		quizArrs[62] = "OX html문제3";
		quizArrs[63] = "OX html문제4";
		quizArrs[64] = "OX html문제5";
		quizArrs[65] = "OX html문제6";
		quizArrs[66] = "OX html문제7";
		quizArrs[67] = "OX html문제8";
		quizArrs[68] = "OX html문제9";
		quizArrs[69] = "OX html문제10";
		quizArrs[70] = "OX html문제11";
		quizArrs[71] = "OX html문제12";
		quizArrs[72] = "OX html문제13";
		quizArrs[73] = "OX html문제14";
		quizArrs[74] = "OX html문제15";
		quizArrs[75] = "OX html문제16";
		quizArrs[76] = "OX html문제17";
		quizArrs[77] = "OX html문제18";
		quizArrs[78] = "OX html문제19";
		quizArrs[79] = "OX html문제20";
		// oracle OX 문제
		quizArrs[80] = "OX oracle문제1";
		quizArrs[81] = "OX oracle문제2";
		quizArrs[82] = "OX oracle문제3";
		quizArrs[83] = "OX oracle문제4";
		quizArrs[84] = "OX oracle문제5";
		quizArrs[85] = "OX oracle문제6";
		quizArrs[86] = "OX oracle문제7";
		quizArrs[87] = "OX oracle문제8";
		quizArrs[88] = "OX oracle문제9";
		quizArrs[89] = "OX oracle문제10";
		quizArrs[90] = "OX oracle문제11";
		quizArrs[91] = "OX oracle문제12";
		quizArrs[92] = "OX oracle문제13";
		quizArrs[93] = "OX oracle문제14";
		quizArrs[94] = "OX oracle문제15";
		quizArrs[95] = "OX oracle문제16";
		quizArrs[96] = "OX oracle문제17";
		quizArrs[97] = "OX oracle문제18";
		quizArrs[98] = "OX oracle문제19";
		quizArrs[99] = "OX oracle문제20";
		// java OX 문제
		quizArrs[100] = "OX java문제1";
		quizArrs[101] = "OX java문제2";
		quizArrs[102] = "OX java문제3";
		quizArrs[103] = "OX java문제4";
		quizArrs[104] = "OX java문제5";
		quizArrs[105] = "OX java문제6";
		quizArrs[106] = "OX java문제7";
		quizArrs[107] = "OX java문제8";
		quizArrs[108] = "OX java문제9";
		quizArrs[109] = "OX java문제10";
		quizArrs[110] = "OX java문제11";
		quizArrs[111] = "OX java문제12";
		quizArrs[112] = "OX java문제13";
		quizArrs[113] = "OX java문제14";
		quizArrs[114] = "OX java문제15";
		quizArrs[115] = "OX java문제16";
		quizArrs[116] = "OX java문제17";
		quizArrs[117] = "OX java문제18";
		quizArrs[118] = "OX java문제19";
		quizArrs[119] = "OX java문제20";
		
		choiceArrs = new String[60];
		// html 4지선다 보기
		choiceArrs[0] = "1.a 2.b 3.c 4.d";
		choiceArrs[1] = "1.a 2.b 3.c 4.d";
		choiceArrs[2] = "1.a 2.b 3.c 4.d";
		choiceArrs[3] = "1.a 2.b 3.c 4.d";
		choiceArrs[4] = "1.a 2.b 3.c 4.d";
		choiceArrs[5] = "1.a 2.b 3.c 4.d";
		choiceArrs[6] = "1.a 2.b 3.c 4.d";
		choiceArrs[7] = "1.a 2.b 3.c 4.d";
		choiceArrs[8] = "1.a 2.b 3.c 4.d";
		choiceArrs[9] = "1.a 2.b 3.c 4.d";
		choiceArrs[10] = "1.a 2.b 3.c 4.d";
		choiceArrs[11] = "1.a 2.b 3.c 4.d";
		choiceArrs[12] = "1.a 2.b 3.c 4.d";
		choiceArrs[13] = "1.a 2.b 3.c 4.d";
		choiceArrs[14] = "1.a 2.b 3.c 4.d";
		choiceArrs[15] = "1.a 2.b 3.c 4.d";
		choiceArrs[16] = "1.a 2.b 3.c 4.d";
		choiceArrs[17] = "1.a 2.b 3.c 4.d";
		choiceArrs[18] = "1.a 2.b 3.c 4.d";
		choiceArrs[19] = "1.a 2.b 3.c 4.d";
		// oracle 4지선다 보기
		choiceArrs[20] = "1.a 2.b 3.c 4.d";
		choiceArrs[21] = "1.a 2.b 3.c 4.d";
		choiceArrs[22] = "1.a 2.b 3.c 4.d";
		choiceArrs[23] = "1.a 2.b 3.c 4.d";
		choiceArrs[24] = "1.a 2.b 3.c 4.d";
		choiceArrs[25] = "1.a 2.b 3.c 4.d";
		choiceArrs[26] = "1.a 2.b 3.c 4.d";
		choiceArrs[27] = "1.a 2.b 3.c 4.d";
		choiceArrs[28] = "1.a 2.b 3.c 4.d";
		choiceArrs[29] = "1.a 2.b 3.c 4.d";
		choiceArrs[30] = "1.a 2.b 3.c 4.d";
		choiceArrs[31] = "1.a 2.b 3.c 4.d";
		choiceArrs[32] = "1.a 2.b 3.c 4.d";
		choiceArrs[33] = "1.a 2.b 3.c 4.d";
		choiceArrs[34] = "1.a 2.b 3.c 4.d";
		choiceArrs[35] = "1.a 2.b 3.c 4.d";
		choiceArrs[36] = "1.a 2.b 3.c 4.d";
		choiceArrs[37] = "1.a 2.b 3.c 4.d";
		choiceArrs[38] = "1.a 2.b 3.c 4.d";
		choiceArrs[39] = "1.a 2.b 3.c 4.d";
		// java 4지선다 보기
		choiceArrs[40] = "1.a 2.b 3.c 4.d";
		choiceArrs[41] = "1.a 2.b 3.c 4.d";
		choiceArrs[42] = "1.a 2.b 3.c 4.d";
		choiceArrs[43] = "1.a 2.b 3.c 4.d";
		choiceArrs[44] = "1.a 2.b 3.c 4.d";
		choiceArrs[45] = "1.a 2.b 3.c 4.d";
		choiceArrs[46] = "1.a 2.b 3.c 4.d";
		choiceArrs[47] = "1.a 2.b 3.c 4.d";
		choiceArrs[48] = "1.a 2.b 3.c 4.d";
		choiceArrs[49] = "1.a 2.b 3.c 4.d";
		choiceArrs[50] = "1.a 2.b 3.c 4.d";
		choiceArrs[51] = "1.a 2.b 3.c 4.d";
		choiceArrs[52] = "1.a 2.b 3.c 4.d";
		choiceArrs[53] = "1.a 2.b 3.c 4.d";
		choiceArrs[54] = "1.a 2.b 3.c 4.d";
		choiceArrs[55] = "1.a 2.b 3.c 4.d";
		choiceArrs[56] = "1.a 2.b 3.c 4.d";
		choiceArrs[57] = "1.a 2.b 3.c 4.d";
		choiceArrs[58] = "1.a 2.b 3.c 4.d";
		choiceArrs[59] = "1.a 2.b 3.c 4.d";
		
		answerSheetArrs = new int[120];
		// html 4지선다 정답
		answerSheetArrs[0] = 1;
		answerSheetArrs[1] = 1;
		answerSheetArrs[2] = 1;
		answerSheetArrs[3] = 1;
		answerSheetArrs[4] = 1;
		answerSheetArrs[5] = 1;
		answerSheetArrs[6] = 1;
		answerSheetArrs[7] = 1;
		answerSheetArrs[8] = 1;
		answerSheetArrs[9] = 1;
		answerSheetArrs[10] = 1;
		answerSheetArrs[11] = 1;
		answerSheetArrs[12] = 1;
		answerSheetArrs[13] = 1;
		answerSheetArrs[14] = 1;
		answerSheetArrs[15] = 1;
		answerSheetArrs[16] = 1;
		answerSheetArrs[17] = 1;
		answerSheetArrs[18] = 1;
		answerSheetArrs[19] = 1;
		// oracle 4지선다 정답
		answerSheetArrs[20] = 2;
		answerSheetArrs[21] = 2;
		answerSheetArrs[22] = 2;
		answerSheetArrs[23] = 2;
		answerSheetArrs[24] = 2;
		answerSheetArrs[25] = 2;
		answerSheetArrs[26] = 2;
		answerSheetArrs[27] = 2;
		answerSheetArrs[28] = 2;
		answerSheetArrs[29] = 2;
		answerSheetArrs[30] = 2;
		answerSheetArrs[31] = 2;
		answerSheetArrs[32] = 2;
		answerSheetArrs[33] = 2;
		answerSheetArrs[34] = 2;
		answerSheetArrs[35] = 2;
		answerSheetArrs[36] = 2;
		answerSheetArrs[37] = 2;
		answerSheetArrs[38] = 2;
		answerSheetArrs[39] = 2;
		// java 4지선다 정답
		answerSheetArrs[40] = 3;
		answerSheetArrs[41] = 3;
		answerSheetArrs[42] = 3;
		answerSheetArrs[43] = 3;
		answerSheetArrs[44] = 3;
		answerSheetArrs[45] = 3;
		answerSheetArrs[46] = 3;
		answerSheetArrs[47] = 3;
		answerSheetArrs[48] = 3;
		answerSheetArrs[49] = 3;
		answerSheetArrs[50] = 3;
		answerSheetArrs[51] = 3;
		answerSheetArrs[52] = 3;
		answerSheetArrs[53] = 3;
		answerSheetArrs[54] = 3;
		answerSheetArrs[55] = 3;
		answerSheetArrs[56] = 3;
		answerSheetArrs[57] = 3;
		answerSheetArrs[58] = 3;
		answerSheetArrs[59] = 3;
		// html OX 문제
		answerSheetArrs[60] = 1;
		answerSheetArrs[61] = 1;
		answerSheetArrs[62] = 1;
		answerSheetArrs[63] = 1;
		answerSheetArrs[64] = 1;
		answerSheetArrs[65] = 1;
		answerSheetArrs[66] = 1;
		answerSheetArrs[67] = 1;
		answerSheetArrs[68] = 1;
		answerSheetArrs[69] = 1;
		answerSheetArrs[70] = 1;
		answerSheetArrs[71] = 1;
		answerSheetArrs[72] = 1;
		answerSheetArrs[73] = 1;
		answerSheetArrs[74] = 1;
		answerSheetArrs[75] = 1;
		answerSheetArrs[76] = 1;
		answerSheetArrs[77] = 1;
		answerSheetArrs[78] = 1;
		answerSheetArrs[79] = 1;
		// oracle OX 문제
		answerSheetArrs[80] = 1;
		answerSheetArrs[81] = 1;
		answerSheetArrs[82] = 1;
		answerSheetArrs[83] = 1;
		answerSheetArrs[84] = 1;
		answerSheetArrs[85] = 1;
		answerSheetArrs[86] = 1;
		answerSheetArrs[87] = 1;
		answerSheetArrs[88] = 1;
		answerSheetArrs[89] = 1;
		answerSheetArrs[90] = 2;
		answerSheetArrs[91] = 2;
		answerSheetArrs[92] = 2;
		answerSheetArrs[93] = 2;
		answerSheetArrs[94] = 2;
		answerSheetArrs[95] = 2;
		answerSheetArrs[96] = 2;
		answerSheetArrs[97] = 2;
		answerSheetArrs[98] = 2;
		answerSheetArrs[99] = 2;
		// java OX 문제
		answerSheetArrs[100] = 2;
		answerSheetArrs[101] = 2;
		answerSheetArrs[102] = 2;
		answerSheetArrs[103] = 2;
		answerSheetArrs[104] = 2;
		answerSheetArrs[105] = 2;
		answerSheetArrs[106] = 2;
		answerSheetArrs[107] = 2;
		answerSheetArrs[108] = 2;
		answerSheetArrs[109] = 2;
		answerSheetArrs[110] = 2;
		answerSheetArrs[111] = 2;
		answerSheetArrs[112] = 2;
		answerSheetArrs[113] = 2;
		answerSheetArrs[114] = 2;
		answerSheetArrs[115] = 2;
		answerSheetArrs[116] = 2;
		answerSheetArrs[117] = 2;
		answerSheetArrs[118] = 2;
		answerSheetArrs[119] = 2;
	}

	public int[] getAnswer() {
		return answer;
	}

	public void setAnswer(int[] answer) {
		this.answer = answer;
	}


}
