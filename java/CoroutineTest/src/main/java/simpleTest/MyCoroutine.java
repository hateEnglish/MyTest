package simpleTest;

import com.offbynull.coroutines.user.Continuation;
import com.offbynull.coroutines.user.Coroutine;

public final class MyCoroutine implements Coroutine {
	
	public static int x = 0;
	
	public void run(Continuation c) throws Exception {
		// TODO Auto-generated method stub
    	System.out.println("started");
        for (int i = 0; i < 10; i++) {
            echo(c, i);
        }
	}



	private void echo(Continuation c, int x) {
        System.out.println(x);
        System.out.println("Mcx="+MyCoroutine.x);
        c.suspend();
    }

}
