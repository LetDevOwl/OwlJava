package com.kh.mini.quiz;

public class Quiz {
	public String[] quizArrs;
	// 전체퀴즈 저장
	// 1 ~ 60 4지선다 (1 ~ 20 : html, 21 ~ 40 : oracle, 41 ~ 60 : java)
	// 61 ~ 120 O/X (61 ~ 80 : html, 81 ~ 100 : oracle, 101 ~ 120 : java)

	public Quiz() {
		quizArrs = new String[120];
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
	}

}
