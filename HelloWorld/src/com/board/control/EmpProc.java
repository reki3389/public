package com.board.control;

import java.util.List;
import java.util.Scanner;
import com.board.impl.EmployeeServiveImpl;
import com.board.model.Board;
import com.board.model.Employee;
import com.board.model.EmployeeService;

public class EmpProc {

	Scanner sc = new Scanner(System.in);
	EmployeeService service = new EmployeeServiveImpl();

	public void execute() {
		while (true) {
			
			login_check();
			
			System.out.println("메뉴선택하세요.");
			System.out.println("1.작성 2.단건조회 3.전체조회 4.변경 5.삭제 9.종료");
			int menu = 0;
			try {
				menu = sc.nextInt();
				sc.hasNextLine();
			} catch (Exception e) {
				System.out.println("정상적인 메뉴를 선택해주세요.");
			}
			sc.nextLine();
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				updateBoard();
			} else if (menu == 5) {
				deleteBoard();
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}

	private void login_check() {
		while(true) {
			System.out.println("id 입력.");
			String id = sc.nextLine();
			System.out.println("passwd 입력.");
			String passwd = sc.nextLine();
			
			
			if(id.equals("user1") && passwd.equals("1234")) {
				System.out.println("방문자1님 환영합니다.");
				break;
			}else {
				System.out.println("id, paswd 입력.");
			}
		}
		
	}

	public void writeBoard() {
		System.out.println("직원등록.");
		System.out.println("직원번호 입력.");
		int empID = sc.nextInt();
		sc.nextLine();
		System.out.println("이름을 입력하세요.");
		String firstName = sc.nextLine();
		System.out.println("성을 입력하세요.");
		String lastName = sc.nextLine();
		System.out.println("email을 입력하세요.");
		String email = sc.nextLine();
		System.out.println("입사일을 입력하세요. ");
		String hireDate = sc.nextLine();
		System.out.println("급여 입력하세요. ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("jobId를 입력하세요. ");
		String jobId = sc.nextLine();

		Employee emp = new Employee();
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setSalary(salary);
		emp.setEmail(email); // 2010/10/05 포맷이나 2010-10-05포맷으로 진행
		emp.setJobId(jobId);
		emp.setHireDate(hireDate);
		service.insertEmployee(emp);

	}

	public void getBoard() {
		System.out.println("한건조회.");
		System.out.print("조회할 사원번호를 입력 하세요 : ");
		int empNo = sc.nextInt();
		Employee emp = service.getEmployee(empNo);
		System.out.println(emp);

	}

	public void getBoardList() {
		System.out.println("전체직원조회.");
		List<Employee> employees = service.getEmpList();
		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}

	public void updateBoard() {
		System.out.println("수정할 글 번호: ");
		int boardNo = 0;
		try {
			boardNo = sc.nextInt();
			sc.hasNextLine();
		} catch (Exception e) {
			System.out.println("정확한 수정글 번호를 입력하세요.");
			sc.hasNextLine();
		}
		sc.nextLine();
		System.out.println("변경할 제목: ");
		String title = null;
		try {
			title = sc.nextLine();
			sc.hasNextLine();
		} catch (Exception e) {
			System.out.println("정확한 변경할 제목을 입력하세요.");
		}
		sc.nextLine();
		System.out.println("변경할 내용: ");
		String content = null;
		try {
			content = sc.nextLine();
			sc.hasNextLine();
		} catch (Exception e) {
			System.out.println("정확한 변경 내용을 작성하세요.");
		}
		sc.nextLine();
		System.out.println("변경할 이름: ");
		String writer = null;
		try {
			writer = sc.nextLine();
			sc.hasNextLine();
		} catch (Exception e) {
			System.out.println("정확한 변경할 이름을 입력하세요.");
		}
		sc.nextLine();
		Board board1 = new Board(boardNo, title, content, writer);
		// service.updateBoard(board1, boardAry);
	}

	public void deleteBoard() {
		System.out.println("어떤 사원번호를 삭제 합니까?");
		int empId = sc.nextInt();
		service.deleteEmployee(empId);

	}
}