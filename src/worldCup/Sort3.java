package worldCup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import worldCup.Sort2.d;
import worldCup.Sort2.e;

//score;进球数
//tolscore;积分
//allnum;总进球数
//tolnum;总净胜球数
public class Sort3 {
	public String sort(Team a[]) {
		ArrayList<Team> listA = new ArrayList<Team>();
		for (int i = 0; i < 4; i++)
			listA.add(a[i]);// 给ListA集合对象中添加元素
		Collections.sort(listA, new c());//
		for (int m = 0; m < 4; m++) {
			for (int j = 1; j < 4; j++) {
				if (a[j - 1].gettolscore() == a[j].gettolscore())
					Collections.sort(listA, new d());
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (a[j - 1].gettolnum() == a[j].gettolnum())
					Collections.sort(listA, new e());
				// Arrays.sort(a,new e());
			}
		}
		String s = new String();
		for (int i = 0; i < 4; i++) {
			s += "出线队伍：" + listA.get(i).getname() + " " + "积分:" + listA.get(i).gettolscore() + " " + "净胜球数:"
					+ listA.get(i).gettolnum() + " " + "总进球数:" + listA.get(i).getallnum() + "\n";
			System.out.println("出线队伍：" + listA.get(i).getname() + " " + "积分:" + listA.get(i).gettolscore() + " "
					+ "净胜球数:" + listA.get(i).gettolnum() + " " + "总进球数:" + listA.get(i).getallnum());
		}
		return s;
	}

	class c implements Comparator<Team> {
		public int compare(Team a0, Team a1) // 抽象参数
		{
			return a1.gettolscore() - a0.gettolscore();
		}

	}

	class d implements Comparator<Team> {
		public int compare(Team a0, Team a1) {
			return a1.gettolnum() - a0.gettolnum();
		}
	}

	class e implements Comparator<Team> {

		public int compare(Team a0, Team a1) {

			return a1.getallnum() - a0.getallnum();
		}
	}
}
