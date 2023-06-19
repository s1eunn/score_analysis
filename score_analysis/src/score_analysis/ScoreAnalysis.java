package score_analysis;

import java.util.Scanner; 

public class ScoreAnalysis {

	private static Scanner sc = new Scanner(System.in);
	private static int studentNum = 0;
	private static int[] scores ;
	
	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			int num = sc.nextInt();
			
			if(num==1) {
				studentNum();
			}
			else if(num==2) {
				scoreRecord();
			}
			else if(num==3) {
				scoreList();
			}
			else if(num==4) {
				analysis();
			}
			else {
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}
	
	//1. 학생 수
	private static void studentNum() {
		System.out.print("학생 수> ");
		int stNum = sc.nextInt();
		studentNum = stNum;
	}
	//2. 점수 입력
	private static void scoreRecord() {
		scores = new int [studentNum];
		for(int i=0;i<scores.length;i++) {
			System.out.print("score["+i+"]> ");
			scores[i] = sc.nextInt();
		}
	}
	//3. 점수 리스트
	private static void scoreList() {
		for(int i=0;i<studentNum;i++) {
			System.out.println("scores["+i+"]: "+scores[i]);
		}
	}
	//4. 분석(최고점수, 평균점수)
	private static void analysis() {
		int max = scores[0];
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			if(max<scores[i]) {
				max = scores[i];
			}
		}
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		double avg = (double) sum/scores.length;
		System.out.println("최고 점수: "+max);
		System.out.println("평균 점수: "+avg);
		
	}
	
}
