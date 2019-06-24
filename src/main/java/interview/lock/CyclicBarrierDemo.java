package interview.lock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * cyclicBarrier 就是它动完了，其他线程才动
 * @author gzhang
 *
 */
public class CyclicBarrierDemo {
	public static void main(String[] args) {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> {
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("=================");
		});

		for (int i = 0; i < 7; i++) {
			new Thread(() -> {
				try {
					cyclicBarrier.await();// 完成cyclicBarrier 后才运行
					System.out.println(Thread.currentThread().getName() + " about to finish");
				} catch (InterruptedException | BrokenBarrierException e) {
					e.printStackTrace();
				}
			}, String.valueOf(i)).start();
		}
	}

}