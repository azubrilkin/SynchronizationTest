import java.util.concurrent.*;

/**
 * Created by azubrilkin on 6/2/2016.
 */
// Broken! - How long would you expect this program to run?
public class StopThread
{

    private static int mCounter;

  public  static void main(String[] params) throws InterruptedException, ExecutionException {
      ExecutorService executorService = Executors.newSingleThreadExecutor();

      final int [] array = new int[] {1, 2, 3, 4, 5, 6};

      Future<Integer> res = executorService.submit(AsyncCalculator.calculateArraySumm(array));

      Integer ress = res.get();

      System.out.print(ress);


      executorService.shutdown();

  }
}
