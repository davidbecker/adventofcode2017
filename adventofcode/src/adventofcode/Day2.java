package adventofcode;

import java.util.ArrayList;
import java.util.List;

public class Day2 implements IDaySolution{

	public static final String PUZZLE_INPUT = "62	1649	1731	76	51	1295	349	719	52	1984	2015	2171	981	1809	181	1715\r\n"
			+ "161	99	1506	1658	84	78	533	242	1685	86	107	1548	670	960	1641	610\r\n"
			+ "95	2420	2404	2293	542	2107	2198	121	109	209	2759	1373	1446	905	1837	111\r\n"
			+ "552	186	751	527	696	164	114	530	558	307	252	200	481	142	205	479\r\n"
			+ "581	1344	994	1413	120	112	656	1315	1249	193	1411	1280	110	103	74	1007\r\n"
			+ "2536	5252	159	179	4701	1264	1400	2313	4237	161	142	4336	1061	3987	2268	4669\r\n"
			+ "3270	1026	381	185	293	3520	1705	1610	3302	628	3420	524	3172	244	295	39\r\n"
			+ "4142	1835	4137	3821	3730	2094	468	141	150	3982	147	4271	1741	2039	4410	179\r\n"
			+ "1796	83	2039	1252	84	1641	2165	1218	1936	335	1807	2268	66	102	1977	2445\r\n"
			+ "96	65	201	275	257	282	233	60	57	200	216	134	72	105	81	212\r\n"
			+ "3218	5576	5616	5253	178	3317	6147	5973	2424	274	4878	234	200	4781	5372	276\r\n"
			+ "4171	2436	134	3705	3831	3952	2603	115	660	125	610	152	4517	587	1554	619\r\n"
			+ "2970	128	2877	1565	1001	167	254	2672	59	473	2086	181	1305	162	1663	2918\r\n"
			+ "271	348	229	278	981	1785	2290	516	473	2037	737	2291	2521	1494	1121	244\r\n"
			+ "2208	2236	1451	621	1937	1952	865	61	1934	49	1510	50	1767	59	194	1344\r\n"
			+ "94	2312	2397	333	1192	106	2713	2351	2650	2663	703	157	89	510	1824	125";

	@Override
	public String getSolution() {
		return String.valueOf(getChecksup(PUZZLE_INPUT));
	}
	
	public static int getChecksup(String input) {
		List<String> splitRows = splitRows(input);
		int checksum = 0;
		for (String row : splitRows) {
			checksum += getRowDifference(row);
		}
		return checksum;
	}

	public static List<String> splitRows(String input) {
		return splitString(input, "\r\n");
	}

	public static int getRowDifference(String input) {
		int min = -1, max = -1;
		List<Integer> rowValues = getRowValues(input);
		for (Integer current : rowValues) {
			if (current < min || min == -1) {
				min = current;
			}
			if (current > max || max == -1) {
				max = current;
			}
		}
		return max - min;
	}
	
	public static List<Integer> getRowValues(String input) {
		List<Integer> result = new ArrayList<Integer>();
		// replace tabs with space
		List<String> splitString = splitString(input.replace("\t", " "), " ");
		for (String string : splitString) {
			result.add(Integer.valueOf(string));
		}
		return result;
	}

	private static List<String> splitString(String input, String splitSequence) {
		List<String> result = new ArrayList<String>();
		int lastIndex = 0;
		int newIndex = 0;
		while (true) {
			newIndex = input.indexOf(splitSequence, lastIndex);
			if (newIndex == -1) {
				result.add(input.substring(lastIndex, input.length()));
				break;
			}
			result.add(input.substring(lastIndex, newIndex));
			lastIndex = newIndex + splitSequence.length();
		}
		return result;
	}

	

}