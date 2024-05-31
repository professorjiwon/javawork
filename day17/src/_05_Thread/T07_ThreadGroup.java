package _05_Thread;

public class T07_ThreadGroup {

	public static void main(String[] args) {
		ThreadGroup groupName = Thread.currentThread().getThreadGroup();
		System.out.println(groupName.getName());
		
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		ThreadGroup subGrp1 = new ThreadGroup(grp1,"SubGroup1");
		
		Runnable r = new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		// Thread(ThreadGroup tg, Runnable r, String name)
		Thread th1 = new Thread(grp1, r, "th1");
		Thread th2 = new Thread(subGrp1, r, "th2");
		Thread th3 = new Thread(grp2, r, "th3");
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println("List of ThreadGroup : " + groupName.getName());
		System.out.println("Active ThreadGroup : " + groupName.activeGroupCount());
		System.out.println("Active Thread : " + groupName.activeCount());
		groupName.list();
	}

}
