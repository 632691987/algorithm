CAS = Compare And Switch

AtomicInteger 只所以能够不需要synchronized 也能保证线程安全是因为它的核心是使用 Unsafe 类，通过
直接操作 native 方法，调用内存偏移地址，获得该对象在内存中的真实value

CAS 就是通过比较要更新的值与真实值一致的时候才修改，否则反复循环地获取，知道要比较的值跟实际值一致为止


CAS的缺点
如果获取的值一直不是最新的，就会导致循环时间长，加大开销。
只能够保证一个值的操作。
引出了 ABA 问题 --> 原子引用更新，意思是说，两个线程同时获取该值。但是其中一个线程，假设，只需运行2秒，而另外一个
线程需要20秒。那么在这20秒内，第一个线程修改了两次，从 value = 123, 到 value = 456, 最后又修改 value = 123
这时候第二条线程运行完毕并且检查，发现好像什么都没有变化，然后就去修改这个value 值