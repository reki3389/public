package com.board.control;

import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardDBServiceImpl;
import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBProc {
	Scanner sc = new Scanner(System.in);
	BoardDBService service = new BoardDBServiceImpl();

	String loginId = null;
	String loginPasswd = null;

	public void execute() {
		loginCheck();

		while (true) {
			int menu = 0;
			System.out.println("1.게시글 작성 | 2.게시글리스트 | 3.한건조회&댓글작성 | 4.게시글수정 | 5.삭제 | 9.종료");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoardList();
			} else if (menu == 3) {
				getBoard();
			} else if (menu == 4) {
				updateBoard();
			} else if (menu == 5) {
				deleteBoard();
			} else if (menu == 9) {
				System.out.println("프로그램을 종료 합니다.");
				break;
			}
		}
		System.out.println("종료");
	}

	public void getBoard() {
		System.out.println("조회할 글번호:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		// ---원본글
		BoardDB board = service.getBoard(boardNo);
//		System.out.println(board);
		if (board != null) {
			System.out.println("---------[원본글]---------");
			System.out.println("제목: " + board.getTitle());
			System.out.println("내용: " + board.getContent());
			System.out.println("작성자: " + board.getWriter());
			System.out.println("작성일자: " + board.getCreationDate());
			// ---댓글
			List<BoardDB> list = service.getReply(boardNo);
			if (list.size() > 0) {
				System.out.println("---------[댓글]----------");
				for (BoardDB brd : list) {
					System.out.println(
							"-> " + brd.getBoardNo() + " | " + brd.getContent() + " | " + brd.getCreationDate());
				}
				System.out.println("--------------------------");
			} else {
				System.out.println(" [댓글]이 없습니다.");
			}
			System.out.println("1.댓글작성 2.이전메뉴");
			int subMenu = 0;
			subMenu = sc.nextInt();
			sc.nextLine();
			if (subMenu == 1) {
				System.out.println("댓글 제목 입력 : ");
				String replytitle = sc.nextLine();
				System.out.println("댓글 입력 : ");
				String reply = sc.nextLine();
				BoardDB board1 = new BoardDB();
				board1.setTitle(replytitle);
				board1.setContent(reply);
				board1.setOrigNo(board.getBoardNo());
				board1.setWriter(loginId);
				service.insertReply(board1);

			} else {
				return;
			}
		} else {
			System.out.println("없는 글 번호입니다.");
			return;
		}
	}

	public void getBoardList() {
		List<BoardDB> boards = service.getBoardList();
		for (BoardDB list : boards) {
			System.out.println(list);
		}

	}

	public void loginCheck() {
		while (true) {
			System.out.println("id를 입력 : ");
			String id = sc.nextLine();
			System.out.println("passwd를 입력 : ");
			String passwd = sc.nextLine();
			String name = service.loginCheck(id, passwd);
			if (name != null) {
				System.out.println(name + "님 환영합니다");
				loginId = id;
				loginPasswd = passwd;
				break;
			} else {
				System.out.println("아이디와 비밀번호를 다시 입력 하세요  : ");

			}
		}
	}

	public void writeBoard() {

		System.out.println("제목을 입력하세요.");
		String title = sc.nextLine();
		System.out.println("내용을 입력하세요.");
		String content = sc.nextLine();
		BoardDB board = new BoardDB();
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(loginId);
		service.insertBoard(board);
	}

	public void deleteBoard() {
		BoardDB board = new BoardDB();
		System.out.println("어떤 게시글을 삭제할까요? :");
		int boardNo = sc.nextInt();
		sc.nextLine();
		board.setBoardNo(boardNo);
		board.setOrigNo(board.getBoardNo());
		
		BoardDB bd = service.getBoard(boardNo);
		if (bd == null) {
			System.out.println("게시글이 아닙니다.");
			return;
		} else if (bd != null && loginId.equals(bd.getWriter())) {
			service.deleteBoard(board);
			
		} else {
			System.out.println("게시글 주인이 아닙니다.");
			return;
		}
	}

	public void updateBoard() {
		System.out.println("어떤 게시글을 수정할까요? :");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("수정할 제목을 적어주세요 : ");
		String title = sc.nextLine();
		System.out.println("수정할 내용을 적어주세요 : ");
		String content = sc.nextLine();
		BoardDB board = new BoardDB();
		board.setBoardNo(boardNo);
		board.setTitle(title);
		board.setContent(content);
		// 작성자와 현재 로그인 사용자의 일치 하는 구문을 작성 한 후 확인 되면 밑의 코드로 넘어가는거 확인
		BoardDB bd = service.getBoard(boardNo);

		if (bd == null) {
			System.out.println("없는 게시글 입니다.");
		} else if (loginId.equals(bd.getWriter())) {
			service.updateBoard(board);
			System.out.println("수정되었습니다.");
		} else {
			System.out.println("게시글 주인이 아닙니다.");
		}
	}
}
