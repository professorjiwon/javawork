package _01_thread;

public class T07_GroupThread {

	public static void main(String[] args) {
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		String groupName = main.getName();
		System.out.println(groupName);
		
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		
		ThreadGroup subGrp1 = new ThreadGroup(grp1, "SubGroup1");
		
		grp1.setMaxPriority(9);
		
		Runnable r = new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		// 생성자 Thread(ThreadGroup tg, Runnable r, String name)
		Thread th1 = new Thread(grp1, r, "th1");
		Thread th2 = new Thread(subGrp1, r, "subTh2");
		Thread th3 = new Thread(grp2, r, "th3");
		
		th1.start();
		th2.start();
		th3.start();
		
		
		System.out.println("List of ThreadGroup : ");
		main.list();
		
		System.out.println();
		System.out.println("Active ThreadGroup의 갯수 : " + main.activeGroupCount());
		System.out.println("Active Thread의 갯수 : " + main.activeCount());
	}
}
