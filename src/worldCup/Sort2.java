package worldCup;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2 {
	public String sort(Team a[]) {
		Arrays.sort(a, new c());

		for (int m = 0; m < 4; m++) {
			for (int j = 1; j < 4; j++) {
				if (a[j - 1].gettolscore() == a[j].gettolscore())
					Arrays.sort(a, new d());
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (a[j - 1].gettolnum() == a[j].gettolnum())
					Arrays.sort(a, new e());
			}

		}
		String s = new String();
		for (int i = 0; i < 2; i++) {
			s += "出线队伍：" + a[i].getname() + " " + "积分:" + a[i].gettolscore() + " " + "净胜球数:" + a[i].gettolnum() + " "
					+ "总进球数:" + a[i].getallnum() + "\n";
			System.out.println("出线队伍：" + a[i].getname() + " " + "积分:" + a[i].gettolscore() + " " + "净胜球数:"
					+ a[i].gettolnum() + " " + "总进球数:" + a[i].getallnum());
		}
		return s;
	}

	class c implements Comparator<Team> {

		public int compare(Team arg0, Team arg1) {
			return arg1.gettolscore() - arg0.gettolscore();
		}
	}

	class d implements Comparator<Team> {
		public int compare(Team arg0, Team arg1) {
			return arg1.gettolnum() - arg0.gettolnum();
		}
	}

	class e implements Comparator<Team> {
		public int compare(Team arg0, Team arg1) {
			return arg1.getallnum() - arg0.getallnum();
		}
	}
}
