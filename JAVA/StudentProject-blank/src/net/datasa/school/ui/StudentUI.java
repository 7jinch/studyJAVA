package net.datasa.school.ui;

import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.List;

import net.datasa.school.exceptionhanler.ExceptionHanler; // 에러 핸들링
import net.datasa.school.service.StudentService; // 학생 객체 메서드
import net.datasa.school.vo.Student; // 학생 클래스

public class StudentUI {
	Scanner sc = new Scanner(System.in);
	StudentService service = new StudentService();

	public StudentUI() throws ExceptionHanler {
		String choice;
		while (true) {
			menu();
			choice = sc.next();
			System.out.println();
			switch (choice) {
			case "1": // 학생 등록
				studentAdd();
				break;
			case "2": // 특정 학생 정보 조회
				selectByNum();
				break;
			case "3": // 전체 학생 정보 조회
				selectAll();
				break;
			case "4": // 학생 성적 수정
				updateStudent();
				break;
			case "5": // 학생 전학
				deleteStudent();
				break;
			case "0": // 프로그램 종료
				System.err.println("☆★☆★☆★프로그램을 종료합니다.☆★☆★☆★");
				return;
			default:
				System.out.println("* 메뉴에 있는 번호를 고르세요.");
			}
		}
	}

	private void menu() {
		System.out.println("<< 학생 성적 관리 >>");
		System.out.println("  1. 학생 등록");
		System.out.println("  2. 학생 정보 조회(1명)");
		System.out.println("  3. 학생 전체 조회");
		System.out.println("  4. 학생 성적 수정");
		System.out.println("  5. 학생 전학");
		System.out.println("  0. 프로그램 종료");
		System.out.println("======================");
		System.out.print("  선택 > ");
	}

	// 학생 등록
	private void studentAdd() throws ExceptionHanler {
		System.out.println("< 학생 등록 >");

		System.out.print("학생 이름: ");
		String name = sc.next();

		int kor = 0;
		int eng = 0;
		int math = 0;
		try {
			System.out.print("국어 점수: ");
			kor = sc.nextInt();
			System.out.print("영어 점수: ");
			eng = sc.nextInt();
			System.out.print("수학 점수: ");
			math = sc.nextInt();
			
			if (kor > 100 || eng > 100 || math > 100)
				throw new ExceptionHanler("점수가 100점을 초과했어요.");
			else if (kor < 0 || eng < 0 || math < 0)
				throw new ExceptionHanler("점수가 0점을 미만입니다.");
			
		} catch (InputMismatchException e) {
			System.err.println("숫자를 입력해 주세요!");
			sc.nextLine(); // 메모리 버퍼에 남아있는 enter 키를 없애기
			return;
		} catch (ExceptionHanler e) {
			System.err.println(e.getMessage() + " 정확히 입력해 주세요\n");
			sc.nextLine(); // 메모리 버퍼에 남아있는 enter 키를 없애기
			return;
		}



		Student student = new Student(name, kor, eng, math); // 학생 객체 생성하기
		service.addStudent(student); // 학생 추가하기
		System.out.println("* 학생 등록 성공!\n");
	}

	// 학생 정보 조회(1명)
	private void selectByNum() {
		System.out.println("< 학생 정보 조회(1명) >");

		int code = 0;

		try {
			System.out.print("> 검색할 학생의 학번을 입력하세요:  ");
			code = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("숫자를 입력해 주세요!");
			sc.nextLine(); // 메모리 버퍼에 남아있는 enter 키를 없애기
			return;
		}

		Student student = service.selectByStuNum(code); // 학생 객체를 검색해서 가져옴

		if (student == null) {
			System.err.println("* 해당 학번의 학생이 존재하지 않습니다.\n");
			return;
		}
		System.out.println(student + "\n"); // 학생 출력하기

	}

	// 학생 전체 조회
	private void selectAll() {
		System.out.println("< 학생 전체 조회 >");
		List<Student> list = service.selectAll(); // 전체 학생 조회하기

		if (list.isEmpty()) { // 리스트에 요소가 없다면
			System.out.println("* 현재 학생이 존재하지 않습니다.\n");
			return;
		}
		for (Student s : list) {
			System.out.println(s + "\n"); // 전체 학생 출력하기
		}

	}

	// 학생 성적 수정
	private void updateStudent() throws ExceptionHanler {
		System.out.println("< 학생 성적 수정 >");

		int stdNum = 0;

		try {
			System.out.print("수정할 학생의 학번: ");
			stdNum = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("숫자를 입력해 주세요!");
			sc.nextLine(); // 메모리 버퍼에 남아있는 enter 키를 없애기
			return;
		}

		Student student = service.selectByStuNum(stdNum); // 학생 객체를 검색해서 가져옴

		if (student == null) {
			System.err.println("* 해당 학번의 학생이 존재하지 않습니다.\n");
			return;
		}

		System.out.println(student + "\n"); // 학생 정보 출력하기

		int kor = 0;
		int eng = 0;
		int math = 0;

		try {
			System.out.print("국어 점수: ");
			kor = sc.nextInt();
			System.out.print("영어 점수: ");
			eng = sc.nextInt();
			System.out.print("수학 점수: ");
			math = sc.nextInt();
			
			if (kor > 100 || eng > 100 || math > 100)
				throw new ExceptionHanler("점수가 100점을 초과했어요.");
			else if (kor < 0 || eng < 0 || math < 0)
				throw new ExceptionHanler("점수가 0점을 미만입니다.");
			
		} catch (InputMismatchException e) {
			System.err.println("숫자를 입력해 주세요!");
			sc.nextLine(); // 메모리 버퍼에 남아있는 enter 키를 없애기
			return;
		} catch (ExceptionHanler e) {
			System.err.println(e.getMessage() + " 정확히 입력해 주세요\n");
			sc.nextLine(); // 메모리 버퍼에 남아있는 enter 키를 없애기
			return;
		}

		student.modifyScore(kor, eng, math);
		System.out.println(student);
		System.err.println("* 학생 정보 수정 완료!\n");
	}

	// 학생 전학
	private void deleteStudent() {
		System.out.println("< 학생 전학 >");

		int stdNum = 0;

		try {
			System.out.print("전학 갈 학생의 학번:  ");
			stdNum = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("숫자를 입력해 주세요!");
			sc.nextLine(); // 메모리 버퍼에 남아있는 enter 키를 없애기
			return;
		}

		Student student = service.selectByStuNum(stdNum); // 학생 객체를 검색해서 가져옴

		if (student == null) {
			System.err.println("* 해당 학번의 학생이 존재하지 않습니다.\n");
			return;
		}

		System.out.println(student + "\n"); // 학생 출력하기

		System.err.print("정말 학생 정보를 삭제하시겠어요? (Y / N): ");
		String answer = sc.next();

		if (answer.equals("Y") || answer.equals("y")) {
			service.deleteStudent(student); // 리스트에서 학생 객체 삭제하기
			System.err.println("* 학생 정보 삭제 완료...\n");
			return;
		}
		System.out.println("* 전학 처리가 취소되었습니다.\n");
	}
}
