package worldCup;

public class Sort1 {
	public String sort(Team a[]) {
		// score;进球数
		// tolscore;积分
		// allnum;总进球数
		// tolnum;总净胜球数
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (a[j - 1].gettolscore() < a[j].gettolscore())// a[0]<a[1]
				{
					String na = a[j].getname();// na=a[1]
					a[j].setname(a[j - 1].getname());// a[1]=a[0]
					a[j - 1].setname(na);// a[0]=na
					int q1 = a[j].gettolscore();
					a[j].settolscore(a[j - 1].gettolscore());// a[1]=a[0]
					a[j - 1].settolscore(q1);
					int q2 = a[j].gettolnum();
					a[j].settolnum((a[j - 1].gettolnum()));
					a[j - 1].settolnum(q2);
					int q3 = a[j].getallnum();
					a[j].setallnum((a[j - 1].getallnum()));
					a[j - 1].setallnum(q3);
				}
				if (a[j - 1].gettolscore() == a[j].gettolscore()) {
					if (a[j - 1].gettolnum() < a[j].gettolnum()) {
						String na = a[j].getname();
						a[j].setname(a[j - 1].getname());
						a[j - 1].setname(na);
						int q1 = a[j].gettolscore();
						a[j].settolscore(a[j - 1].gettolscore());
						a[j - 1].settolscore(q1);
						int q2 = a[j].gettolnum();
						a[j].settolnum((a[j - 1].gettolnum()));
						a[j - 1].settolnum(q2);
						int q3 = a[j].getallnum();
						a[j].setallnum((a[j - 1].getallnum()));
						a[j - 1].setallnum(q3);
					}

				}
				if (a[j - 1].gettolnum() == a[j].gettolnum()) {
					if (a[j - 1].getallnum() < a[j].getallnum()) {
						String na = a[j].getname();
						a[j].setname(a[j - 1].getname());
						a[j - 1].setname(na);
						int q1 = a[j].gettolscore();
						a[j].settolscore(a[j - 1].gettolscore());
						a[j - 1].settolscore(q1);
						int q2 = a[j].gettolnum();
						a[j].settolnum((a[j - 1].gettolnum()));
						a[j - 1].settolnum(q2);
						int q3 = a[j].getallnum();
						a[j].setallnum((a[j - 1].getallnum()));
						a[j - 1].setallnum(q3);
					}
				}

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
}
