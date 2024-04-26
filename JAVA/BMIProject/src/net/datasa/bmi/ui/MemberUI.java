package net.datasa.bmi.ui;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import net.datasa.bmi.service.MemberService;
import net.datasa.bmi.vo.Member;

public class MemberUI {
	Scanner sc = new Scanner(System.in);
	MemberService service = new MemberService();

	public MemberUI() {
		System.err.println("☆★☆★☆★프로그램 시작☆★☆★☆★\n\n");

		String choice;

		while (true) {
			menu();
			choice = sc.next();
			System.out.println("\n");

			switch (choice) {
			case "1": { // 회원 등록
				addMember();
				break;
			}
			case "2": { // 특정 회원 조회
				selectByCode();
				break;
			}
			case "3": { // 전체 회원 조회
				selectAll();
				break;
			}
			case "4": { // 회원 정보 수정
				updateMember();
				break;
			}
			case "5": { // 회원 탈퇴
				deleteMember();
				break;
			}
			case "0": {
				System.err.println("☆★☆★☆★프로그램 종료☆★☆★☆★");
				return;
			}
			default:
				System.out.println("\n\n※메뉴의 번호를 고르세요.\n\n");
			}
		}
	}

	private void menu() {
		System.out.println("<<<<< 회원 BMI 관리 >>>>>");
		System.out.println("   1. 회원 등록");
		System.out.println("   2. 회원 정보 조회(1명)");
		System.out.println("   3. 회원 정보 조회(전체)");
		System.out.println("   4. 회원 정보 수정");
		System.out.println("   5. 회원 탈퇴");
		System.out.println("   0. 프로그램 종료");
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.print("선택 > ");
	}

	// 회원 등록 메서드
	private void addMember() {
		System.out.println("<< 회원 등록 >>");

		System.out.print("이름을 입력하세요: ");
		String name = sc.next();

		Double height = 0.0;
		Double weight = 0.0;
		try {
			System.out.print("키를 입력하세요: ");		
			height = sc.nextDouble();
			System.out.print("몸무게를 입력하세요: ");
			weight = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.err.println("키나 몸무게에 숫자를 입력하세요.\n\n");
			sc.nextLine(); // 메모리 버퍼에 남아있는 enter 키를 없애기
			return;
		}

		Member member = new Member(name, height, weight);
		service.addMember(member);
		System.out.println("* 회원 등록 성공!\n\n");
	}

	// 특정 회원 검색 메서드
	private void selectByCode() {
		System.out.println("<< 회원 정보 조회(1명) >>");
		System.out.print("검색할 회원의 코드 > ");
		int code = sc.nextInt();
		Member member = service.selectByCode(code);
		if (member == null) {
			System.out.println("* 해당 코드의 회원이 존재하지 않습니다.\n\n");
			return;
		}
		System.out.println(member);
	}

	// 전체 회원 검색 메서드
	private void selectAll() {
		System.out.println("<< 회원 정보 조회(전체) >>");
		List<Member> list = service.selectAll();
		if(list.isEmpty()) {
			System.out.println("* 등록된 회원이 없어요.\n\n");
			return;
		}
		for (Member m : list) {
			System.out.println(m);
		}
	}

	// 회원 정보 수정 메서드
	private void updateMember() {
		System.out.println("<< 회원 정보 수정 >>");
		System.out.print("수정할 회원의 코드 > ");
		int code = sc.nextInt();
		Member member = service.selectByCode(code);
		
		if (member == null) {
			System.err.println("* 해당 코드의 회원이 존재하지 않습니다.\n\n");
			return;
		}
		System.out.println(member);
		
		Double height = 0.0;
		Double weight = 0.0;
		try {
			System.out.print("키를 입력하세요: ");		
			height = sc.nextDouble();
			System.out.print("몸무게를 입력하세요: ");
			weight = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.err.println("키나 몸무게에 숫자를 입력하세요.\n\n");
			sc.nextLine(); // 메모리 버퍼에 남아있는 enter 키를 없애기
			return;
		}

		member.modifyMemberInfo(height, weight);
		System.out.println();
		System.out.println(member);
		System.err.println("* 회원 정보 수정 완료\n\n");
	}

	// 회원 탈퇴 메서드
	private void deleteMember() {
		System.out.println("<< 회원 탈퇴 >>");
		System.out.print("탈퇴할 회원의 코드 > ");
		int code = sc.nextInt();
		Member member = service.selectByCode(code);

		if (member == null) {
			System.err.println("* 해당 코드의 회원이 존재하지 않습니다.\n\n");
			return;
		}
		System.err.print("정말 탈되하시겠어요? (Y / N): ");
		String answer = sc.next();

		if (answer.equals("Y") || answer.equals("y")) {
			service.deleteMember(member);
			System.err.println("* 회원 정보 탈퇴 완료\n\n");
			return;
		}
		System.out.println("* 탈퇴를 취소합니다.");
	}
}
