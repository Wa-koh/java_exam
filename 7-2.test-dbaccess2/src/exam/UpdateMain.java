package exam;

import dao.MemberDao;
import dto.Member;

/**
 * update()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class UpdateMain {
	public static void main(String[] args) {

		MemberDao dao = new MemberDao();

		Member member = new Member();
		member.setName("ジロー");
		member.setAge(100);
		member.setDepId(2);
		member.setId(2);
		dao.update(member);
		System.out.println("update終了");
	}
}
